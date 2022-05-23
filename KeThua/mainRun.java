package KeThua;

import java.util.ArrayList;
import java.util.Scanner;

public class mainRun {
    public static void main(String[] args) {
        ArrayList<HocSinh> lstHS;
        ArrayList<GiaoVien> lstGV;
        int soHS, soGV;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so HS: ");
        soHS = sc.nextInt();
        lstHS = new ArrayList<HocSinh>();

        for(int i=0; i<soHS; i++){
            HocSinh hs = new HocSinh();
            hs.nhapHS();
            lstHS.add(hs);
        }

        System.out.print("Nhap so GV: ");
        soGV = sc.nextInt();
        lstGV = new ArrayList<GiaoVien>();

        for(int i=0; i<soGV; i++){
            GiaoVien gv = new GiaoVien();
            gv.nhapGV();
            lstGV.add(gv);
        }

        System.out.print("\nDanh sach hoc sinh \n");
        for(HocSinh hs: lstHS){
            hs.xuatHS();
        }
        System.out.print("\n\nDanh sach giao vien \n");
        for(GiaoVien gv: lstGV){
            gv.xuatGV();
        }
    }
}
