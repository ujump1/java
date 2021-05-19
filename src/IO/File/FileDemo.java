package IO.File;

import java.io.File;

/**
 * File类学习
 */
public class FileDemo {

	public static void main(String args[]){
		// 1. file.list() ， file.listFiles()
		String filePath = "D:\\Idea Projects\\mygit\\java\\src\\IO" ;
		File file = new File( filePath ) ;
		//file.mkdir() ;

		String[] names = file.list() ;
		for( int i = 0 ; i < names.length ; i++ ){
			System.out.println( "names: " +names[i]);
		}
		// 过滤
		String[] filteredNames = file.list(new FileNameFilterDemo()) ;
		for( int i = 0 ; i < filteredNames.length ; i++ ){
			System.out.println( "names: " +filteredNames[i]);
		}

		File[] files = file.listFiles() ;
		for( int i = 0 ; i < files.length ; i++ ){
			System.out.println( "files: "+ files[i].getAbsolutePath() );
		}
		// 过滤
		File[] filteredFiles = file.listFiles(new FileFilterDemo()) ;
		for( int i = 0 ; i < filteredFiles.length ; i++ ){
			System.out.println( "files: "+ filteredFiles[i].getAbsolutePath() );
		}

	}
}
