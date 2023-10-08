import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 // Tạo một đối tượng Diem và nhập tọa độ từ bàn phím
//        DIEM diem = new DIEM();
//        diem.nhapDiem();
//
//        // Xuất thông tin tọa độ và di chuyển điểm
//        System.out.println("Thông tin điểm:");
//        diem.xuatDiem();
//
//        System.out.print("Nhập delta x: ");
//        double deltaX = new Scanner(System.in).nextDouble();
//        System.out.print("Nhập delta y: ");
//        double deltaY = new Scanner(System.in).nextDouble();
//
//        diem.diChuyen(deltaX, deltaY);
//
//        System.out.println("Sau khi di chuyển:");
//        diem.xuatDiem();
        ///////////////////////////
        
        Scanner scanner = new Scanner(System.in);
        DIEM diem = new DIEM();

        diem.nhapDiem();
        System.out.println("Thông tin điểm:");
        diem.xuatDiem();

        System.out.print("Nhập giá trị x' để di chuyển điểm: ");
        double xPrime = scanner.nextDouble();
        System.out.print("Nhập giá trị y' để di chuyển điểm: ");
        double yPrime = scanner.nextDouble();
        diem.diChuyen(xPrime, yPrime);
        
        System.out.println("Sau khi di chuyển:");
        diem.xuatDiem();
        

	}

}
