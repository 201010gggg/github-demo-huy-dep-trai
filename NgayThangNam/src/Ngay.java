
public class Ngay {
	private int ngay;

    // Hàm thiết lập không tham số
    public Ngay() {
        this.ngay = 1;
    }

    // Hàm thiết lập có tham số
    public Ngay(int ngay) {
        this.ngay = ngay;
    }

    // Phương thức nhập ngày
    public void nhap(int ngay) {
        this.ngay = ngay;
    }

    // Phương thức xuất ngày
    public void xuat() {
        System.out.println("Ngày: " + ngay);
    }

}
