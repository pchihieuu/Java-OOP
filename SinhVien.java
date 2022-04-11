package Buoi6_ThayHuy;
import java.io.IOException;
public class SinhVien {
    private int maSv;
	private String hoTen;
	private boolean gioiTinh;
	private String soDt;
	private double diemTk;
	public SinhVien() {
		this.maSv = 0;
		this.hoTen = " ";
		this.gioiTinh = true;;
		this.soDt = " ";
		this.diemTk = 0.0;
	}
	public int getMaSv() {
		return maSv;
	}
	public void setMaSv(int maSv) {
		this.maSv = maSv;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public boolean getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getSoDt() {
		return soDt;
	}
	public void setSoDt(String soDt) {
		this.soDt = soDt;
	}
	public double getDiemTk() {
		return diemTk;
	}
	public void setDiemTk(double diemTk) {
		this.diemTk = diemTk;
	}
	public SinhVien(SinhVien x) {
		this.setMaSv(x.getMaSv());
		this.setHoTen(x.getHoTen());
		this.setGioiTinh(x.getGioiTinh());
		this.setSoDt(x.getSoDt());
		this.setDiemTk(x.getDiemTk());	
	}
	public SinhVien(int maSv,String hoTen,boolean gioiTinh,String soDt,double diemTk) {
		this.maSv = maSv;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.soDt = soDt;
		this.diemTk = diemTk;
	}
	public void nhapDl() throws IOException {
		this.maSv = Brand.toInt("Nhập mã số sinh viên: ");
		this.hoTen = Brand.inputString("Nhập họ tên: ");
		this.gioiTinh = Brand.inputString("Giới tính [Nam-Nu]").equalsIgnoreCase("Nam");
		this.soDt = Brand.inputString("Nhập số điện thoại: ");
		this.diemTk=Brand.inputDouble("Nhập điểm TK: ");
	}
	public String thongTin() {
		return String.format("| %5d | %19s | %9s | %12s | %10f | %11s | %15s |",
            this.maSv,this.hoTen,(this.gioiTinh?"Nam":"Nu"),this.soDt,this.diemTk,this.xepLoai(),this.xetYeuCau());
    }
	public String xepLoai() {
		return(this.diemTk<=10 && this.diemTk>=8.5?"Giỏi" :
            (this.diemTk<8.5 && this.diemTk>=6.5?"Khá":(this.diemTk<6.5 && this.diemTk>=5.0?" Trung bình " : "Không đạt")));	
	}
	public boolean datYeuCau() {
		if(this.diemTk>=5)
			return true;
		else
			return false;
	}
	public String xetYeuCau() {
		return(datYeuCau()?"Đạt Yêu Cầu":"Không Đạt");
	}
    
}
