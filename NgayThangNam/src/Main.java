
public class Main {

	public static void main(String[] args) {
		 // Tạo các đối tượng Ngay, Thang, Nam
        Ngay ngay = new Ngay(5);
        Thang thang = new Thang(10);
        Nam nam = new Nam(2022);

        // Xuất thông tin
        ngay.xuat();
        thang.xuat();
        nam.xuat();

	}

}
