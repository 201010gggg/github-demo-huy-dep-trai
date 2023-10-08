import java.util.Scanner;

public class HINHCHUNHAT2 {
	 private double chieuDai;
	    private double chieuRong;

	    public HINHCHUNHAT2(double chieuDai, double chieuRong) {
	        this.chieuDai = chieuDai;
	        this.chieuRong = chieuRong;
	    }

	    public void nhapHinhChuNhat() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập chiều dài: ");
	        this.chieuDai = scanner.nextDouble();
	        System.out.print("Nhập chiều rộng: ");
	        this.chieuRong = scanner.nextDouble();
	    }

	    public void xuatHinhChuNhat() {
	        System.out.println("Chiều dài: " + this.chieuDai);
	        System.out.println("Chiều rộng: " + this.chieuRong);
	    }

	    public double tinhDienTich() {
	        return this.chieuDai * this.chieuRong;
	    }

	    public double tinhChuVi() {
	        return 2 * (this.chieuDai + this.chieuRong);
	    }

}
