/*Hello*/
import java.util.Scanner;

public class DIEM {
    private double x;
    private double y;
    
    // Hàm thiết lập không tham số
    public DIEM() {
        this.x = 0.0;
        this.y = 0.0;
    }

    // Constructor để khởi tạo một đối tượng Diem với tọa độ x và y
    public DIEM(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}


    // Phương thức nhập tọa độ x và y từ bàn phím
    public void nhapDiem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tọa độ x: ");
        this.x = scanner.nextDouble();
        System.out.print("Nhập tọa độ y: ");
        this.y = scanner.nextDouble();
    }

    // Phương thức xuất tọa độ của điểm
    public void xuatDiem() {
        System.out.println("Tọa độ của điểm: (" + this.x + ", " + this.y + ")");
    }

    // Phương thức di chuyển điểm theo các tham số x' và y'
    public void diChuyen(double xPrime, double yPrime) {
        this.x += xPrime;
        this.y += yPrime;
    }

	
 
}
