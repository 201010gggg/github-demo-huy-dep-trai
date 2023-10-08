
public class Thang {
	 private int thang;

	    // Hàm thiết lập không tham số
	    public Thang() {
	        this.thang = 1;
	    }

	    // Hàm thiết lập có tham số
	    public Thang(int thang) {
	        this.thang = thang;
	    }

	    // Phương thức nhập tháng
	    public void nhap(int thang) {
	        this.thang = thang;
	    }

	    // Phương thức xuất tháng
	    public void xuat() {
	        System.out.println("Tháng: " + thang);
	    }

}
