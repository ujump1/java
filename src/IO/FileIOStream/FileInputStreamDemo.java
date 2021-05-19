package IO.FileIOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream学习
 */
public class FileInputStreamDemo {

	// 根据path来读取文件
	public String readFile(String path){
		String result = "";
		FileInputStream fileInputStream = null;
		try {
			// 1.根据path路径实例化一个输入流的对象
			fileInputStream = new FileInputStream(path);
			// 2. 返回这个输入流中可以被读的剩下的bytes字节的估计值
			int size = fileInputStream.available();
			// 3. 根据输入流中的字节数创建byte数组；
			byte[] bytes = new byte[size];
			// 4.读取数据
			fileInputStream.read(bytes);
			//5.根据获取到的Byte数组新建一个字符串，然后输出；
			result = new String(bytes);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("文件未找到");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("文件读取失败");
		}finally {
			if ( fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	public static void main(String args[]){
		String path = "D:\\Idea Projects\\mygit\\java\\src\\IO\\file1.txt";
		FileInputStreamDemo fileInputStreamDemo = new FileInputStreamDemo();
		String file  = fileInputStreamDemo.readFile(path);
		System.out.println("读取到的文件内容为\n"+file);
	}
}
