/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;

/**
 *
 * @author xuant
 */
public class SinhVien {
    private String hoTen;
    private String mssv;
    private float diemHp;
    private float diemQt;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String mssv, float diemHp, float diemQt) {
        this.hoTen = hoTen;
        this.mssv = mssv;
        this.diemHp = diemHp;
        this.diemQt = diemQt;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public float getDiemHp() {
        return diemHp;
    }

    public void setDiemHp(float diemHp) {
        this.diemHp = diemHp;
    }

    public float getDiemQt() {
        return diemQt;
    }

    public void setDiemQt(float diemQt) {
        this.diemQt = diemQt;
    }

    @Override
    public String toString() {
        return hoTen + " / "
                + mssv + " / "
                + diemHp + " / "
                + diemQt + " / " + diemTrungBinh(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public float diemTrungBinh() {
        return (float)((diemQt*0.3) + (diemHp*0.7));
    }
    
}
