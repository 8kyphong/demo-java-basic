
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OOP_SINHVIEN {

	public static void main(String[] args) {
		thucHien();
	}

	private static void inMenu() {
		System.out.println("Vui long chon de thuc hien");
		System.out.println("1: nhap sv moi");
		System.out.println("2: xuat toan bo sv");
		System.out.println("3: tb cao nhat");

		System.out.println("4: sv yeu");
		System.out.println("5: tim theo ten");
		System.out.println("6: Tim sv theo ma sv");
		System.out.println("0: dung chuong trinh");
	}

	private static void thucHien() {
		Scanner scan = new Scanner(System.in);

		TruongHoc truong = new TruongHoc();

		boolean dangThucHien = true;
		do {
			inMenu();
			SinhVien sv;
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
			// nhap sinh vien
			{
				sv = new SinhVien();
				sv.nhapSinhVien();
				truong.themSinhVien(sv);
			}
				break;
			case 2:
				// xuat toan bo sinh vien
				truong.tinhDTB();
				truong.xepLoai();
				truong.xuatThongTinhSV();
				break;
			case 3: {
				truong.tinhDTB();
				List<SinhVien> list = truong.timSVDTBCaoNhat();
				if (list != null) {
					truong.xuatThongTinSV(list);
				}
			}
				break;
			case 4: {
				truong.tinhDTB();
				List<SinhVien> list = truong.timDSSVYeu();
				if (list != null) {
					truong.xuatThongTinSV(list);
				}
			}
			case 5: {
				System.out.println("Nháº­p tÃªn cáº§n tÃ¬m: ");
				String ten = scan.nextLine();
				SinhVien sinhVien = truong.timSVTheoTen(ten);
				if(sinhVien != null) {
					sinhVien.tinhDiemTB();
					sinhVien.xepLoai();
					sinhVien.xuatThongTin();
				}
			} break;
			case 6: {
				System.out.println("Tim sinh vien theo ma sinh vien");
				System.out.print("Nhap ma: ");
				int ma = Integer.parseInt(scan.nextLine());
				SinhVien maSV = truong.timSVTheoMa(ma);
				
			}
			case 0:
				dangThucHien = false;
				break;
			}
		} while (dangThucHien);
	}
}
