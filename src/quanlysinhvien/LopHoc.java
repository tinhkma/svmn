/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;

import java.util.ArrayList;

/**
 *
 * @author xuant
 */
public class LopHoc {
    private ArrayList<SinhVien> sinhViens;
    private int siSoLop;
    private String tenLop;

    public LopHoc() {
    }

    public LopHoc(ArrayList<SinhVien> sinhViens, int siSoLop, String tenLop) {
        this.sinhViens = sinhViens;
        this.siSoLop = siSoLop;
        this.tenLop = tenLop;
    }

    public ArrayList<SinhVien> getSinhViens() {
        return sinhViens;
    }

    public void setSinhViens(ArrayList<SinhVien> sinhViens) {
        this.sinhViens = sinhViens;
    }

    public int getSiSoLop() {
        return siSoLop;
    }

    public void setSiSoLop(int siSoLop) {
        this.siSoLop = siSoLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }
}
