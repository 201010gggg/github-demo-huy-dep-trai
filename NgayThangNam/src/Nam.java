
public class Nam {
	private int nam;

    // Hàm thiết lập không tham số
    public Nam() {
        this.nam = 2023;
    }

    // Hàm thiết lập có tham số
    public Nam(int nam) {
        this.nam = nam;
    }

    // Phương thức nhập năm
    public void nhap(int nam) {
        this.nam = nam;
    }

    // Phương thức xuất năm
    public void xuat() {
        System.out.println("Năm: " + nam);
    }

}
