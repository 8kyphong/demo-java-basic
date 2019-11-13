import java.util.ArrayList;
import java.util.List;

public class TruongHoc {

	// Attributes
	List<SinhVien> dssv;

	public List<SinhVien> getDssv() {
		return dssv;
	}

	public void setDssv(List<SinhVien> dssv) {
		this.dssv = dssv;
	}

	// Constructors
	public TruongHoc() {
		this.dssv = new ArrayList<SinhVien>();
	}

	// others methods
	public void themSinhVien(SinhVien sv) {
		this.dssv.add(sv);
	}

	public void xuatThongTinhSV() {
		for (SinhVien sv : this.dssv) {
			sv.xuatThongTin();
		}
	}

	public void xuatThongTinSV(List<SinhVien> list) {
		for (SinhVien sv : list) {
			sv.xuatThongTin();
		}
	}

	public void tinhDTB() {
		for (SinhVien sv : this.dssv) {
			sv.tinhDiemTB();
		}
	}

	public void xepLoai() {
		for (SinhVien sv : this.dssv) {
			sv.xepLoai();
		}
	}

	public List<SinhVien> timSVDTBCaoNhat() {
		List<SinhVien> list = null;
		if (this.dssv.size() > 0) { // checl DSSV da co sv hay chua

			list = new ArrayList<SinhVien>(); // khoi tao ds cac sinh vien co dtb cao nhat bang nhau

			// tim sv cao diem nhat
			SinhVien svMax = this.dssv.get(0);
			for (SinhVien sv : this.dssv) {
				if (svMax.getDiemTB() < sv.getDiemTB()) {
					svMax = sv;
				}
			}

			// tim ds cac sv co diem TB cao nhat bang nhau
			for (SinhVien sv : this.dssv) {
				if (svMax.getDiemTB() == sv.getDiemTB()) {
					list.add(sv);
				}
			}

		}
		return list;
	}

	public List<SinhVien> timDSSVYeu() {
		List<SinhVien> list = null;
		if (this.dssv.size() > 0) {
			list = new ArrayList<SinhVien>();
			for (SinhVien sv : this.dssv) {
				if (sv.getDiemTB() < 5) {
					list.add(sv);
				}
			}
		}
		return list;
	}

	public SinhVien timSVTheoTen(String ten) {
		SinhVien kq = null;
		for (SinhVien sv : this.dssv) {
			if (sv.getTenSV().equals(ten)) {
				kq = sv;
				break;
			}
		}
		return kq;
	}

	// xóa sv hay dùng boolean, xóa thành công là true
	public SinhVien timSVTheoMa(int ma) {
		SinhVien kq = null;
		for (SinhVien sv : this.dssv) {
			if (sv.getMaSV() == ma) {
				kq = sv;
				break;
			}
		}
		return kq;
	}

	public boolean xoaSinhVien(int ma) {
		boolean kq = false;
		SinhVien sv = timSVTheoMa(ma);
		if (sv != null) {
			this.dssv.remove(sv);
			kq = true;
		}
		return kq;
	}
}
