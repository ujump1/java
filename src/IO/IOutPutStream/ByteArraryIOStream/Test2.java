package IO.IOutPutStream.ByteArraryIOStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) {

		String mes = "你好,world" ;
		byte[] b = mes.getBytes() ;

		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream() ;
		try {
			byteArrayOutputStream.write( b );

			FileOutputStream fileOutputStream = new FileOutputStream( new File( "F:/123.txt" ) ) ;

			byteArrayOutputStream.writeTo( fileOutputStream ) ;

			fileOutputStream.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				byteArrayOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
