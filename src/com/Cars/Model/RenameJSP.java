package com.Cars.Model;

import java.io.File;

public class RenameJSP {
	public static void main(String[] args) {
		File dir=new File("D:\\JavaeeProjects\\Cars\\WebContent");
		
		File[] files=dir.listFiles();
		for(File f:files) {
			if(f.isFile())
			{
				String lastname=f.getName().substring(0,f.getName().lastIndexOf("."));
				f.renameTo(new File(dir,lastname+".jsp"));
			}
		}
	}

}
