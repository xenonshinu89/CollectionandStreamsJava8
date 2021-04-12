package com.anchil.collectionTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URL;
import java.util.Set;
import java.util.TreeSet;

public class FileReadWrite {

	static FileReadWrite frw=new FileReadWrite();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file_name="DemoFile.txt";
		try {
			frw.readand_write_file(file_name);
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

	private  void readand_write_file(String file_name) throws Exception{

		
		URL url = getClass().getResource(file_name);
		File file = new File(url.getPath());
		//InputStream input = getClass().getResourceAsStream("ListStopWords.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		File f=new File("OutputFile.txt");
		System.out.println(f.getAbsolutePath());
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		Set<String> removeDuplicate=new TreeSet<String>();
		
		String s_line=null;
		while((s_line=br.readLine())!=null)
		{
			removeDuplicate.add(s_line);
		}
		for(String nonDuplicateString:removeDuplicate) {
			bw.write(nonDuplicateString+"\n");
		}
		
		bw.close();
		br.close();
		
	}

}
