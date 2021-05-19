package IO.File;

import java.io.File;
import java.io.FilenameFilter;

/**
 *  FileNameFilter
 */
public class FileNameFilterDemo implements FilenameFilter {
	@Override
	public boolean accept(File dir, String name) {
		// 不要file1.txt
		if(name.equals("file1.txt")){
			return false;
		}
		return true;
	}
}
