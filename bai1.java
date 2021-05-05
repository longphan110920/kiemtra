package ktrabai1;
import java.util.Scanner;
public class bai1 {
	String maNCC;
	String tenNCC;
	String diachi;
	Scanner sc = new Scanner(System.in);
	public void nhapThongTin() {
		System.out.println("Nhap ma nha cung cap:");
		maNCC = sc.next();
		System.out.println("Nhap ten nha cung cap:");
		tenNCC = sc.next();
		System.out.println("Nhap dia chi:");
		diachi = sc.next();
	}
	public void xuatThongTin() {
		System.out.println("Ma nha cung cap:" + maNCC);
		System.out.println("Ten nha cung cap:" + tenNCC);
		System.out.println("Dia chi:" + diachi);
	}
}

