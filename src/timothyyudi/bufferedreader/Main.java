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
	static char[] cBuf2, cBuf3, cBuf4;
	static String sBuf;
	static long algoStart, algoEnd, timeFragment, timeTotal = 0;
	static String output_Home, output_processTimeRead1, output_processTimeRead2, output_processTimeRead3, output_processTimeRead4;
	
	public static void main(String[] args) { // arg[0] = num of characters to be processed at once. arg[1] = file name. 
//		txtURI = args[0];
		txtURI = "C:\\Java AhoCorasick\\Asset\\red1.3.txt";
		output_Home = "C:\\Java AhoCorasick\\BufferedReader results\\";
		output_processTimeRead1 = output_Home+"BufferedReader_Results 1.txt";
		output_processTimeRead2 = output_Home+"BufferedReader_Results 2.txt";
		output_processTimeRead3 = output_Home+"BufferedReader_Results 3.txt";
		output_processTimeRead4 = output_Home+"BufferedReader_Results 4.txt";
		
		switch (args[0]) {
		case "1":
			algoStart = System.nanoTime();
			try {
				File file = new File(txtURI);
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
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
		
		case "3":
			cBuf3 = new char[3];
			
			algoStart = System.nanoTime();
			try {
				File file = new File(txtURI);
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				while (bufferedReader.read(cBuf3, 0, 3) != -1) {
					sBuf = String.copyValueOf(cBuf3);
//					System.out.println(sBuf);
				}
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			algoEnd = System.nanoTime();
			timeTotal = algoEnd-algoStart;
			
			PrintWriter processTimerWriter3;
			try {
				processTimerWriter3 = new PrintWriter(new BufferedWriter(new FileWriter(output_processTimeRead3, true)));
				processTimerWriter3.println(""+timeTotal);
			    processTimerWriter3.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
			
		case "4":
			cBuf4 = new char[4];
			
			algoStart = System.nanoTime();
			try {
				File file = new File(txtURI);
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				while (bufferedReader.read(cBuf4, 0, 4) != -1) {
					sBuf = String.copyValueOf(cBuf4);
//					System.out.println(sBuf);
				}
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			algoEnd = System.nanoTime();
			timeTotal = algoEnd-algoStart;
			
			PrintWriter processTimerWriter4;
			try {
				processTimerWriter4 = new PrintWriter(new BufferedWriter(new FileWriter(output_processTimeRead4, true)));
				processTimerWriter4.println(""+timeTotal);
			    processTimerWriter4.close();
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
