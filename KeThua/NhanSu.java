package KeThua;

import java.util.Scanner;

public class NhanSu {
    private String hoTen, gioiTinh, diaChi;
    private int tuoi;

    public void nhapNS(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap ho ten: ");
        hoTen = sc.nextLine();

        System.out.print("Nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = sc.nextInt();
    }

    public void xuatNS(){
        System.out.printf("\n%15s %5d %7s %15s", hoTen, tuoi, gioiTinh, diaChi);
    }
}
