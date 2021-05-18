package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStream学习
 */
public class FileOutputStreamDemo {

	// 文件路径和内容来写入文件
	public Boolean writeFile(String path, String content){
		Boolean success = false;
		FileOutputStream fileOutputStream = null;
		try {
			// 1、根据文件路径创建输出流
			fileOutputStream = new FileOutputStream(path);
			// 2.将String转换为Byte
			byte[] bytes =content.getBytes();
			// 3.写入文件
			fileOutputStream.write(bytes);
			success =true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("文件名不能为空");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("写入文件失败");
		}finally {
			if(fileOutputStream!=null){
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return success;
	}

	// 根据文件路径来复制文件（读出来再写就行了,当然直接用byte就行)
	public Boolean copyFile(String sourcePath, String targetPath){
		Boolean success = false;
		FileInputStream fileInputStream =null;
		FileOutputStream fileOutputStream = null;
		try {
			// 1.根据路径获取输入流
			fileInputStream = new FileInputStream(sourcePath);
			// 2、根据文件路径创建输出流
			fileOutputStream = new FileOutputStream(targetPath);
			// 3.遍历读取并写入
			int len = 0;
			// 一次读取1024，防止文件过大造成溢出
			byte[] bys = new byte[1024];
			while ((len = fileInputStream.read(bys)) != -1) {
				fileOutputStream.write(bys,0,len);
			}
			success =true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("文件不存在或文件名不能为空");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("读/写入文件失败");
		}finally {
			if(fileInputStream!=null){
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fileOutputStream!=null){
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return success;
	}


	public static void main(String args[]){
		// 写文件
		String path = "D:\\Idea Projects\\mygit\\java\\src\\IO\\file2.txt";
		//要写入的内容
		String content = "今天是2021/5/18,天气很好";
		FileOutputStreamDemo fileOutputStreamDemo = new FileOutputStreamDemo();
		Boolean success  = fileOutputStreamDemo.writeFile(path,content);
		System.out.println("写入文件"+success);
		// 最后是复制文件
		String sourcePath = "D:\\Idea Projects\\mygit\\java\\src\\IO\\file2.txt";
		String targetPath = "D:\\Idea Projects\\mygit\\java\\src\\IO\\file3.txt";
		success = fileOutputStreamDemo.copyFile(sourcePath,targetPath);
		System.out.println("复制文件"+success);
	}
}
