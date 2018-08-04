/*
 * A class that gives all the names in the given directory
 */
package com.cg.lambda.file;

import java.io.File;
import java.util.Scanner;

public class FileFilter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Taking the path of a folder from the user
		System.out.println("Enter file path");
		String path = new String(scanner.nextLine());
		
		File dir = new File(path);
		
		//the entire file is checked and sub-directories are displayed
		File subDirectory[] = dir.listFiles(File::isDirectory);
		for (File file : subDirectory) {
			System.out.println(file.getName());
		}
	}
}
