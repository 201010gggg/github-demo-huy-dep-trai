import java.util.Scanner;

public class HINHCHUNHAT {
	private double chieuDai;
    private double chieuRong;

    // Hàm thiết lập không tham số
    public HINHCHUNHAT () {
        this.chieuDai = 0.0;
        this.chieuRong = 0.0;
    }

    // Hàm thiết lập có tham số
    public HINHCHUNHAT (double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    // Phương thức nhập thông tin chiều dài và chiều rộng từ bàn phím
    public void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài hình chữ nhật: ");
        chieuDai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        chieuRong = scanner.nextDouble();
    }

    // Phương thức xuất thông tin chiều dài và chiều rộng
    public void xuat() {
        System.out.println("Chiều dài: " + chieuDai);
        System.out.println("Chiều rộng: " + chieuRong);
    }

    // Phương thức tính diện tích hình chữ nhật
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    // Phương thức tính chu vi hình chữ nhật
    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }

}
