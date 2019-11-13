

import java.util.Scanner;
public class SinhVien {

	// Attributes or data member
	private int maSV;
	private String tenSV;
	private String email;
	private String noiSinh;
	private String diaChi;
	private float toan;
	private float ly;
	private float hoa;
	private float diemTB;
	public float getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(float _diemTB) {
		this.diemTB = _diemTB;
	}

	private String loai;

	// Get, set method
	public int getMaSV() {
		return this.maSV;
	}

	public void setMaSV(int _ma) {
		this.maSV = _ma;
	}

	public String getTenSV() {
		return this.tenSV;
	}

	public void setTenSV(String _ten) {
		this.tenSV = _ten;
	}

	public String getemail() {
		return this.email;
	}

	public void setemail(String _mail) {
		this.email = _mail;
	}

	public String getnoiSinh() {
		return this.noiSinh;
	}

	public void setnoiSinh(String _sinh) {
		this.noiSinh = _sinh;
	}

	public String getdiaChi() {
		return this.diaChi;
	}

	public void setdiaChi(String _dchi) {
		this.diaChi = _dchi;
	}

	// toan
	public float gettoan() {
		return this.toan;
	}

	public void settoan(float _toan) {
		this.toan = _toan;
	}

	// ly
	public float getly() {
		return this.ly;
	}

	public void setly(float _ly) {
		this.ly = _ly;
	}

	// hoa1
	public float gethoa() {
		return this.hoa;
	}

	public void sethoa(float _hoa) {
		this.hoa = _hoa;
	}

	public String loai() {
		return this.loai();
	}

	// Constructors
	public SinhVien() {

	}

	// dua toan bo du lieu bang tham so
	public SinhVien(int _ma, String _ten, String _email, String _noiSinh, String _diaChi, float _toan, float _ly,
			float _hoa) {
		this.maSV = _ma;
		this.tenSV = _ten;
		this.email = _email;
		this.noiSinh = _noiSinh;
		this.diaChi = _diaChi;
		this.toan = _toan;
		this.ly = _ly;
		this.hoa = _hoa;
	}
	
	public void nhapSinhVien() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap ma sv: ");
		this.maSV = Integer.parseInt(scan.nextLine());
		System.out.println("Nhap ten: ");
		this.tenSV = scan.nextLine();
		System.out.println("Nhap email: ");
		this.email = scan.nextLine();
		System.out.println("Nhap noi sinh: ");
		this.noiSinh = scan.nextLine();
		System.out.println("Nhap dia chi: ");
		this.diaChi = scan.nextLine();

		System.out.println("Nhap diem toan: ");
		this.toan = Float.parseFloat(scan.nextLine());
		
		System.out.println("Nhap diem ly: ");
		this.ly = Float.parseFloat(scan.nextLine());
		
		System.out.println("Nhap diem toan: ");
		this.hoa = Float.parseFloat(scan.nextLine());
		
	}

	// other methods
	public void xuatThongTin() {
		System.out.println("Sinh vien - Ma: " + this.maSV + ", ten: " + this.tenSV + "Email: " + this.email
				+ ". Dia chi: " + this.diaChi + ", toan: " + this.toan + ", ly: " + this.ly + ", hoa: " + this.hoa
				+ "diem trung binh: " + this.diemTB + ", xep loai: " + this.loai);
	}

	
	// trung binh
	public void tinhDiemTB() {
		this.diemTB = (this.toan + this.ly + this.hoa) / 3;
	}

	// Xep loai
	public void xepLoai() {
		if (this.diemTB >= 9) {
			this.loai = "Xuat sac";
		} else if (this.diemTB >= 8 && this.diemTB < 9) {
			this.loai = "Gioi";
		} else if (this.diemTB >= 7 && this.diemTB < 8) {
			this.loai = "Kha";
		} else if (this.diemTB >= 6 && this.diemTB < 7) {
			this.loai = "TB-Kha";
		} else if (this.diemTB >= 5 && this.diemTB < 6) {
			this.loai = "TB";
		} else {
			this.loai = "Yeu";
		}

	}
}
