package util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileUtils {

	public static void copyInputStreamToFile(InputStream inputStream, File file) {
		try {
			BufferedInputStream in=null;
			BufferedOutputStream out=null;
			in=new BufferedInputStream(inputStream);
			out=new BufferedOutputStream(new FileOutputStream(file));
			int len=-1;
			byte[] b=new byte[1024];
			while((len=in.read(b))!=-1){
			    out.write(b,0,len);
			}
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
