package IO.IOutPutStream.ByteArraryIOStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Test1 {
	
	public static void main(String[] args) {
		
		String mes = "hello,world" ;
		byte[] b = mes.getBytes() ;
		
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream( b ) ;
		int result = -1  ;

		while( ( result = byteArrayInputStream.read() ) != -1){
			System.out.println( (char) result );
		}
		
		try {
			byteArrayInputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
