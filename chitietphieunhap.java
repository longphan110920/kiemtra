package ktrabai2;
import java.util.Scanner;
public class chitietphieunhap extends phieunhap {
	String maSP;
	String tenSP;
	int soluong;
	String hanSD;
	Scanner sc1 = new Scanner(System.in);
	public void nhapThongTin() {
		System.out.println("Nhap ma sp:");
		maSP = sc1.next();
		System.out.println("Nhap ten sp:");
		tenSP = sc1.next();
		System.out.println("Nap so luong:");
		soluong = sc1.nextInt();
		System.out.println("Nhap han su dung:");
		hanSD = sc1.next();
	}
	
	public void inThongTin() {
		System.out.println("Ma sp:" + maSP);
		System.out.println("Ten SP:" + ten SP);
		System.out.println("So luong:" + soluong);
		System.out.println("Han sudung:" + hanSD);
	}
}
