package abc;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 //  thông tin sinh viên:
		String 	name;
		int id;
		String cmnd;
		String nameclass;
		float dtb;
		
		name = "Pham Minh Vu";
		id = 2060090;
		cmnd = "1919921890";
		nameclass= "HueIC";
		dtb = 9.5f;
		System.out.println("họ va ten"+ name);
		System.out.println("ID ="+ id);
		System.out.println("NameClass ="+nameclass);
		
		name = "Tran Đắc Ga";
		id = 2060091;
		cmnd = "1901564565";
		nameclass= "HueIC";
		dtb = 9.8f;
		System.out.println("họ va ten"+ name);
		System.out.println("ID ="+ id);
		System.out.println("NameClass ="+nameclass);
		
		// thông tin công nhân:
		String namecongnhan;
		String diachi;
		String sdt;
		float hsl;
		 
		namecongnhan = "Pham Minh Vu";
		diachi = "50b Trieu Quang Phuc";
		sdt = "0328088002";
		hsl = 2.5f;
		
		System.out.println("họ va ten"+ namecongnhan);
		System.out.println("ADDRESS ="+ diachi);
		System.out.println("DT ="+ sdt);
		
		namecongnhan = "Tran Đac Ga";
		diachi = "thuathienhue";
		sdt = "0367036579";
		hsl = 3.9f;
		
		System.out.println("họ va ten"+ namecongnhan);
		System.out.println("ADDRESS ="+ diachi);
		System.out.println("DT ="+ sdt);
		
		// thông tin car:
		String namecar;
		String hang;
		String gia;
		String color;
		
		namecar = "YZF-R3";
		hang = "Yamaha";
		gia = "129.000.000";
		color = "silver green";
		
		System.out.println("Tên xe :" + namecar);
		System.out.println("Hãng :" + hang);
		System.out.println("Giá :" + gia);
		System.out.println("Màu :" +color);
		
		namecar = "XDS RS700 ";
		hang = "Nhật Bản";
		gia = "61.090.000";
		color = "Dark Blue";
		
		System.out.println("Tên xe :" + namecar);
		System.out.println("Hãng :" + hang);
		System.out.println("Giá :" + gia);
		System.out.println("Màu :" +color);
		
		
		
		
		
		

	}

}
