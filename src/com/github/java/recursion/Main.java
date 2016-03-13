package com.github.java.recursion;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		String path="/home/yana/Folder";
		DelCatalog dir=new DelCatalog(path);
		File folder=new File(path);
		dir.delFolder(folder);

	}

}
