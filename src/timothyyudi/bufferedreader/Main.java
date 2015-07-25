package timothyyudi.bufferedreader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	static String txtURI;
	static int intBuf=0;
	static char cBuf;
	static char[] cBuf2;
	static String sBuf;
	static long algoStart, algoEnd, timeFragment, timeTotal = 0;
	static String output_Home, output_processTimeRead1, output_processTimeRead2;
	
	public static void main(String[] args) { // arg[0] = num of characters to be processed at once. arg[1] = file name. 
//		txtURI = args[0];
		txtURI = "C:\\Java AhoCorasick\\Asset\\red1.3.txt";
		output_Home = "C:\\Java AhoCorasick\\2Char results\\";
		output_processTimeRead1 = output_Home+"2CharConvert_1.txt";
		output_processTimeRead2 = output_Home+"2CharConvert_2.txt";
		
		switch (args[0]) {
		case "1":
			algoStart = System.nanoTime();
			try {
				File file = new File(txtURI);
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				bufferedReader.readLine();
				while ((intBuf = bufferedReader.read()) != -1) {
					sBuf = String.valueOf((char)intBuf);
//					System.out.println(sBuf);
				}
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			algoEnd = System.nanoTime();
			timeTotal = algoEnd-algoStart;
			
			PrintWriter processTimerWriter1;
			try {
				processTimerWriter1 = new PrintWriter(new BufferedWriter(new FileWriter(output_processTimeRead1, true)));
				processTimerWriter1.println(""+timeTotal);
			    processTimerWriter1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		
		case "2":
			cBuf2 = new char[2];
			
			algoStart = System.nanoTime();
			try {
				File file = new File(txtURI);
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				bufferedReader.readLine();
				while (bufferedReader.read(cBuf2, 0, 2) != -1) {
					sBuf = String.copyValueOf(cBuf2);
//					System.out.println(sBuf);
				}
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			algoEnd = System.nanoTime();
			timeTotal = algoEnd-algoStart;
			
			PrintWriter processTimerWriter2;
			try {
				processTimerWriter2 = new PrintWriter(new BufferedWriter(new FileWriter(output_processTimeRead2, true)));
				processTimerWriter2.println(""+timeTotal);
			    processTimerWriter2.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		
		default:
			break;
		}
		
		System.gc();
	}

}
