package com.github.java.recursion;

import java.io.File;

public class DelCatalog {
	private String path;

	public DelCatalog(String path) {
		super();
		this.path = path;

	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void delFolder(File dir) {
		if (dir.isDirectory()) {
			String[] children = dir.list();
			for (int i = 0; i < children.length; i++) {
				File f = new File(dir, children[i]);
				delFolder(f);
			}
			dir.delete();
		} else
			dir.delete();
	}

}
