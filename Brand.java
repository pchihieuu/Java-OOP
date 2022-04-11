package Buoi6_ThayHuy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Brand {
    public static String inputString(String gb) throws IOException {
		String kt="";
		//---Khai báo luồng dữ liệu & bộ đệm
		InputStreamReader s1 = new InputStreamReader(System.in);
		BufferedReader bat = new BufferedReader(s1);
		//---Thông báo và đọc dữ liệu
		System.out.print(gb);
		kt = bat.readLine();
		return kt;
	}
	/**
	 * Phương thức phục vụ cho việc nhập dữ liệu số thực từ bàn phím
	 * @param gb Số thực thông báo hướng dẫn người dùng nhập dữ liệu
	 * @return Các số thực đã nhập
	 * @throws IOException
	 */ 
	public static long inputLong(String gb) throws IOException {
		long kt=0;
		String a = inputString(gb);
		kt=Long.parseLong(a);
		return kt;
	}
	/**
	 * Phương thức phục vụ cho việc nhập dữ liệu số nguyên từ bàn phím
	 * @param gb Số nguyên thoonng báo hướng dẫn người dùng nhập dữ liệu
	 * @return Các số nguyên đã nhập
	 * @throws IOException
	 */
	public static int toInt(String gb) throws IOException {
		int  kt=0;
		String a = inputString(gb);
		kt=Integer.parseInt(a);
		return kt;
	}
	public static double inputDouble(String gb) throws IOException {
		double  kt=0;
		String s = inputString(gb);
		kt=Double.parseDouble(s);
		return kt;
	}


    
}
