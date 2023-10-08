
public class Main {

	public static void main(String[] args) {
		 // Tạo một đối tượng HinhChuNhat và nhập chiều dài và chiều rộng từ bàn phím
		HINHCHUNHAT hinhChuNhat = new HINHCHUNHAT();
        hinhChuNhat.nhap();

        // Xuất thông tin chiều dài, chiều rộng, diện tích và chu vi hình chữ nhật
        System.out.println("Thông tin hình chữ nhật:");
        hinhChuNhat.xuat();
        System.out.println("Diện tích hình chữ nhật: " + hinhChuNhat.tinhDienTich());
        System.out.println("Chu vi hình chữ nhật: " + hinhChuNhat.tinhChuVi());
        
        

	}

}
