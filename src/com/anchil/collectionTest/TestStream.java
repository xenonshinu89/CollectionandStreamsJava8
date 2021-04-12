package com.anchil.collectionTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {
	
	public static void main(String args[]) throws IOException {
		
		System.out.println(Files.lines(Paths.get("src/com/anchil/collectionTest/DemoFile.txt"))
				.filter(line -> line.contains("tessa"))
				.map(line -> line.replaceAll("=", ""))
				.collect(Collectors.toList()));
		
	}

}
