package com.prediction.convert;


import java.io.*;

public class MovieDataConvert {
	public static void main(String args[]) throws IOException{
	BufferedReader br = new BufferedReader(new FileReader("data/u.data"));
	BufferedWriter bw = new BufferedWriter(new FileWriter("data/movies.csv"));
	
	String line;
	while((line = br.readLine())!= null){
		String[] values = line.split("\\t", -1);
		bw.write(values[0] + "," + values[1] + "," + values[2] + "\n");
	}
	br.close();
	bw.close();
	}
}
