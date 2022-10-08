package assignment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        News n = new News(1,"AA","BB","CC","DD");
        n.RateList[0]=5;
        n.RateList[1]=8;
        n.RateList[2]=8;
        n.Calculate();
        n.Display();
    }

    public static void main2(String[] args){
        PhoneBook pb = new PhoneBook();
        pb.insertPhone("Nam","0987654321");
        pb.insertPhone("Nam","0987654321");
        pb.insertPhone("Nam","0987654322");
        pb.insertPhone("Nam","0987654321");
        pb.insertPhone("Tuan Anh","0987654321");
        pb.insertPhone("Dung","0987654321");
        System.out.println(pb.PhoneList.size());
        pb.updatePhone("Tuan Anh","0987654321","1234567633");

        PhoneNumber p = pb.searchPhone("Nam");
        if(p != null){
            System.out.println(p.getName());
        }else{
            System.out.println("Not found");
        }

        pb.sort();
        for(PhoneNumber pn: pb.PhoneList){
            System.out.println(pn.getName());
        }
    }

    public static void main3(String[] args){
        KhachHangVN a = new KhachHangVN(1,"Nguyen Van An","2022-09-22",219,"Cá nhân");
        KhachHangNN b = new KhachHangNN(2,"Donal Trump","2022-09-21",156,"US");
        System.out.println(a.thanhTien());
        System.out.println(b.thanhTien());

        KhachHang kh = (KhachHang) new KhachHangVN(2,"Nguyen Van B","2022-09-22",100,"Cá nhân");
        System.out.println(kh.thanhTien());

        KhachHangVN khvn = (KhachHangVN)kh;
        System.out.println(khvn.thanhTien());
    }

    public static void mainold2(String[] args){
        Account myAccount = new Account(1,"Trịnh Quang Hòa",1000000);
        Scanner sc = new Scanner(System.in);
        System.out.println("NHap so tien muon rut:");
        int x = sc.nextInt();
        if(myAccount.debit(x)){
            System.out.println("Rut thanh cong "+x);
        }else{
            System.out.println("So du tai khoan khong du hoac nhap sai so tien");
        }

        Account nam = new Account(2,"Cao Hoàng Nam",10000);
        System.out.println("NHap so tien can chuyen khoan:");
        int y = sc.nextInt();
        if(myAccount.tranferTo(nam,y)){
            System.out.println("Chuyen thanh cong sang tai khoan "+nam.getName());
        }else{
            System.out.println("Chuyen khoan that bai");
        }
    }

    public static void mainOld(String[] args){
        Scanner sc = new Scanner(System.in);
        //int x = sc.nextInt();// <=> scanf("%d",&x);
        PhanSo f1 = new PhanSo();
        int ts = sc.nextInt();
        f1.setTuSo(ts);
        f1.setMauSo(sc.nextInt());
        f1.inPhanSo();

        PhanSo f2= new PhanSo();
        f2.setTuSo(sc.nextInt());
        f2.setMauSo(sc.nextInt());
        f2.inPhanSo();

        PhanSo t = f1.add(f2);
        t.rutGon();
        t.inPhanSo();
    }
}