package KeThua;

import java.util.Scanner;

public class HocSinh extends NhanSu {
    private String lop;
    private float diemToan, diemVan;

    public void nhapHS(){
        super.nhapNS();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap lop: ");
        lop = sc.nextLine();
        System.out.print("Nhap diem toan: ");
        diemToan = sc.nextFloat();
        System.out.print("Nhap diem van: ");
        diemVan = sc.nextFloat();
    }

    public void xuatHS(){
        super.xuatNS();
        System.out.printf("%10s %7.1f %7.1f", lop, diemToan, diemVan);
    }

    public float tinhDTB(){
        return (diemVan + diemToan) / 2;
    }
}
