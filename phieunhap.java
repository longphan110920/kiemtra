package ktrabai2;
import java.util.Scanner;
public class phieunhap {
	String maPhieuNhap;
	String ngayNhap;
	String tenNV;
	Scanner sc = new Scanner(System.in);
	public void nhapThongTin() {
		System.out.println("Nhap ma phieu nhap:");
		maPhieuNhap = sc.next();
		System.out.println("Nhap ngay nhap:");
		ngayNhap = sc.next();
		System.out.println("Nhap ten NV:");
		tenNV = sc.next();
	}
	public void xuatThongTin() {
		System.out.println("Ma phieu nhap:" + maPhieuNhap);
		System.out.println("Ngay nhap:" + ngayNhap);
		System.out.println("Ten NV:" + tenNV);
	}
}
