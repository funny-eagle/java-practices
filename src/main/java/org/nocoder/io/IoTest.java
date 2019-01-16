package org.nocoder.io;

import java.io.*;

/**
 * @author jason
 * @date 18/5/6.
 */
public class IoTest {
	public static void main(String[] args) {
		File file = new File("src/main/resources/peppa-pig.txt");
		readByteStreamTest(file);
		readCharacterStreamTest(file);
		writeByteStreamTest(file);
		fileWriterTest(file);
		bufferedWriterTest(file);
	}

	/**
	 * 从文件读取内容 byte stream 字节流 FileInputStream FileOutputStream
	 */
	public static void readByteStreamTest(File file) {
		// TWR
		try (FileInputStream fis = new FileInputStream(file)) {
			byte[] buff = new byte[1024];
			int length;
			while ((length = fis.read(buff)) > 0) {
				System.out.println(new String(buff));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 从文件读取内容 character stream 字符流 FileReader FileWriter BufferedReader PrintWriter
	 */
	public static void readCharacterStreamTest(File file) {
		try (FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader)) {

			String str;
			while ((str = bufferedReader.readLine()) != null) {
				System.out.println(str);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	/**
	 * FileOutputStream将内容写到文件
	 */
	public static void writeByteStreamTest(File file) {
		try (FileOutputStream fos = new FileOutputStream(file, true)) {
			fos.write("\nHello, World!".getBytes());
			fos.write("\n你好,小猪佩琪".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * FileWriter 将内容写到文件
	 */
	public static void fileWriterTest(File file) {
		try (FileWriter fileWriter = new FileWriter(file, true)) {
			fileWriter.write("\nfileWriter");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * BufferedWriter 将内容写到文件
	 */
	public static void bufferedWriterTest(File file) {
		try (FileWriter fileWriter = new FileWriter(file, true);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
			bufferedWriter.write("\nbufferedWriter");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
