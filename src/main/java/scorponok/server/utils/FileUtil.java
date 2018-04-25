package scorponok.server.utils;

import java.io.*;
import java.util.UUID;

/**
 * 类描述：文件工具类
 * 
 */ 

public class FileUtil {

	/*
	 * 获取唯一的文件名
	 */
	public static String getUniqueFileName(){
		return UUID.randomUUID().toString().replaceAll("-", "") ;
	}
	
	/*
	 * 验证是否是文件
	 */
	public static boolean isFile(String fileName){
		if( !checkFileName(fileName)) {
			return false;
		}
		return new File(fileName).isFile();
	}
	
	/*
	 * 获取文件名后缀
	 */
	public static String getFileExt(String fileName){
		if( !checkFileName(fileName)) {
			return "";
		}
		return fileName.substring(fileName.lastIndexOf(".")+1, fileName.length());
	}
	
	/*
	 * 获取文件大小
	 */
	public static long getFileSize(String fileName){
		if( !checkFileName(fileName)) {
			return 0L;
		}
		long lSize = 0L;
		try{
			File file = new File(fileName);
			if (file.exists()) {
				if (file.isFile() && file.canRead()) {
					lSize = file.length();
				} else {
					lSize = -1;
		        }
		    } else {
		          lSize = 0;
		    }
	    } catch (Exception e) {
	         lSize = -1;
	    }
	    return lSize;
	}
	
	/*
	 * 检验文件名
	 */
	private static boolean checkFileName(String fileName){
		if( fileName == null || fileName.equals("") || fileName.lastIndexOf(".") == -1){
			return false;
		}
		return true;
	}
	
	/*
	 * 创建文件
	 */
	public static boolean createFile(String fileName) {
		if( !checkFileName(fileName)) {
			return false;
		}
        File file = new File(fileName);
        if(file.exists()) {
            return false;
        }
        if (file.getName().endsWith(File.separator)) {
            return false;
        }
        //判断目标文件所在的目录是否存在
        if(!file.getParentFile().exists()) {
            //如果目标文件所在的目录不存在，则创建父目录
            if(!file.getParentFile().mkdirs()) {
                return false;
            }
        }
        //创建目标文件
        try {
            if (file.createNewFile()) {
                return true;
            } else {
                return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
   
	/*
	 *  复制文件
	 */
	public static boolean copyFile(String srcFileName, String destFileName) {  
		if( !checkFileName(srcFileName)) {
			return false;
		}
        File srcFile = new File(srcFileName);  
        // 判断源文件是否存在  
        if (!srcFile.exists()) {  
            return false;  
        } else if (!srcFile.isFile()) {  
            return false;  
        }  
  
        // 判断目标文件是否存在  
        if ( !createFile(destFileName) ) {
        	return false;
        }
  
        // 复制文件  
        int byteRead = 0;
        InputStream in = null;  
        OutputStream out = null;
        try { 
    	    in = new FileInputStream(srcFile);  
            out = new FileOutputStream(destFileName);  
            byte[] buffer = new byte[1024]; 
            while ((byteRead = in.read(buffer)) != -1) {  
                out.write(buffer, 0, byteRead);  
            }  
            return true;  
        } catch (FileNotFoundException e) { 
        	e.printStackTrace();
            return false;  
        } catch (IOException e) {  
        	e.printStackTrace();
            return false;  
        }  finally {  
            try {  
                if (out != null)  
                    out.close();  
                if (in != null)  
                    in.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
   
	/*
	 * 删除文件
	 */
	public static boolean deleteFile(String fileName) {
		boolean isSuccess = true;
        try {
        	File file = new File(fileName);
            if (file.exists()) {
            	isSuccess = file.delete();
           }

	    } catch (Exception e) {
	    	isSuccess = false;
	    }

	    return isSuccess;
    }
   
	public static void writeFile(String file, InputStream in) throws IOException {
		byte[] buff = new byte[4096];
		int offset = 0;
		FileOutputStream out = new FileOutputStream(file);
		try {
			while ((offset = in.read(buff)) != -1) {
				out.write(buff, 0, offset);
			}
			out.flush();
		} finally {
			out.close();
		}

	}

	public static boolean writeFile(File file, byte[] bytes) {
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(file);
			out.write(bytes);
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			try {
				if (out != null) {
					out.flush();
					out.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

   
}
