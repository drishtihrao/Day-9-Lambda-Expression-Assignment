/*
 * A class that takes an array of file objects and sorts it
 * After sorting, the directories are listed first
 * All the files in the folder are listed after the directory
 */
package com.cg.lambda.file.sort;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class FileAndDirectorySort {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<File> files = new ArrayList<>();

		// taking the main directory path from the user
		System.out.println("Enter directory name along with the path");
		String path = scanner.nextLine();

		File dir = new File(path);
		File file[] = dir.listFiles();

		files.addAll(Arrays.asList(file));
		Predicate<File> findDirectories = (fileInList) -> fileInList.isDirectory();
		
		//displaying all the directories in the folder
		System.out.println("\nDirectories in sorted order");
		files.stream().filter(findDirectories).sorted().forEach(System.out::println);
		
		//displaying all the files in the folder
		System.out.println("\nFiles in sorted order\n");
		files.stream().filter(findDirectories.negate()).sorted().forEach(System.out::println);
		scanner.close();
	}
}
