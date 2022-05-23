package KeThua;

import java.util.Scanner;

public class GiaoVien extends NhanSu {
    private String monDay;
    private float heSL;

    public void nhapGV(){
        super.nhapNS();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mon day: ");
        monDay = sc.nextLine();
        System.out.print("Nhap he so luong: ");
        heSL = sc.nextFloat();
    }

    public void xuatGV(){
        super.xuatNS();
        System.out.printf("%15s %7.1f",monDay, heSL);
    }

    public float tinhLuong(){
        return heSL * 15000000;
    }

}
