package IO.BufferedIOStream;

import java.io.*;

/**
 *  BufferedInputStream学习，多了一个缓冲，就有可能减少和内核空间交互次数
 */
public class BufferedIOStreamDemo {

	/**
	 * 复制文件
	 *
	 * @param oldFile
	 * @param newFile
	 */
	public  void copyFile(File oldFile, File newFile) {
		InputStream inputStream = null;
		BufferedInputStream bufferedInputStream = null;

		OutputStream outputStream = null;
		BufferedOutputStream bufferedOutputStream = null;

		try {
			inputStream = new FileInputStream(oldFile);
			bufferedInputStream = new BufferedInputStream(inputStream);

			outputStream = new FileOutputStream(newFile);
			bufferedOutputStream = new BufferedOutputStream(outputStream);

			byte[] b = new byte[1024];   //代表一次最多读取1KB的内容

			int length = 0; //代表实际读取的字节数
			while ((length = bufferedInputStream.read(b)) != -1) {
				//length 代表实际读取的字节数
				bufferedOutputStream.write(b, 0, length);
			}
			//缓冲区的内容写入到文件
			bufferedOutputStream.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 只用关闭外层，会自动关闭里面的
			if (bufferedOutputStream != null) {
				try {
					bufferedOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bufferedInputStream != null) {
				try {
					bufferedInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedIOStreamDemo bufferedIOStreamDemo = new BufferedIOStreamDemo();
		String filePath = "D:\\Idea Projects\\mygit\\java\\src\\IO\\file1.txt" ;
		String filePath2 = "D:\\Idea Projects\\mygit\\java\\src\\IO\\file3.txt" ;
		File file = new File( filePath ) ;
		File file2 = new File( filePath2 ) ;
		bufferedIOStreamDemo.copyFile( file , file2 );

	}
}
