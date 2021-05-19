package IO.File;

import java.io.File;
import java.io.FileFilter;

/**
 * FileFilter学习
 */
public class FileFilterDemo implements FileFilter {
	@Override
	public boolean accept(File pathname) {
		// 不要文件夹
		if(pathname.isDirectory()) {
			return false;
		}
		return true;
	}


}
