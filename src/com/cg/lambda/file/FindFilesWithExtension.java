/*
 * A class to search for all the files with the user requested extension, in a particular path
 */
package com.cg.lambda.file;

import java.io.File;
import java.util.Scanner;

public class FindFilesWithExtension {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		// taking the file path as an input from the user
		System.out.println("Enter file path");
		String paths = new String(scanner.nextLine());

		// creating a new file as per the path given by the user
		File dir = new File(paths);

		// taking the extension to search as an input from the user
		System.out.println("Enter extension to search");
		String extension = new String(scanner.nextLine());

		// searching all the files with extension asked by the user
		File files[] = dir.listFiles((d, name) -> name.endsWith(extension));

		// printing the file list with required extension
		for (File file : files) {
			System.out.println(file);
		}
	}
}