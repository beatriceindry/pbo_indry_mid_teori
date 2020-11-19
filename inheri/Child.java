import java.util.Scanner;
class Child extends Parent {
	void tampill() {
	System.out.print("Pilihan = ");
	pilihan = input.nextInt();
	if (pilihan == 31) {
		biayabeban=100000;
		System.out.println("Biaya Beban = Rp.100.000");
		System.out.print("Masukkan Jumlah Meteran Pemakaian = ");
		jumlah = input.nextInt();
		total = jumlah * biayabeban;
		System.out.println("Total harga = " +total);
		System.out.print("Masukkan Bayaran = ");
		bayar = input.nextInt();
		kembalian = bayar-total;
	}
	else
	if (pilihan == 32) {
		biayabeban=125000;
		System.out.println("Biaya Beban = Rp.125.000");
		System.out.print("Masukkan Jumlah Meteran Pemakaian = ");
		jumlah = input.nextInt();
		total = jumlah * biayabeban;
		System.out.println("Total harga = " +total);
		System.out.print("Masukkan Bayaran = ");
		bayar = input.nextInt();
		kembalian = bayar-total;
	}
	else
	if (pilihan == 33) {
		biayabeban = 450000;
		System.out.println("Biaya Beban = Rp.450.000");
		System.out.print("Masukkan Jumlah Meteran Pemakaian = ");
		jumlah = input.nextInt();
		total = jumlah * biayabeban;
		System.out.println("Total harga = " +total);
		System.out.print("Masukkan Bayaran = ");
		bayar = input.nextInt();
		kembalian = bayar-total;
	}
	else
	if (pilihan == 34) {
		biayabeban=480000;
		System.out.println("Biaya Beban = Rp.480.000");
		System.out.print("Masukkan Jumlah Meteran Pemakaian = ");
		jumlah = input.nextInt();
		total = jumlah * biayabeban;
		System.out.println("Total harga = " +total);
		System.out.print("Masukkan Bayaran = ");
		bayar = input.nextInt();
		kembalian = bayar-total;
	}
	else
	if (pilihan == 35) {
		biayabeban=500000;
		System.out.println("Biaya Beban = Rp.500.000");
		System.out.print("Masukkan Jumlah Meteran Pemakaian = ");
		jumlah = input.nextInt();
		total = jumlah * biayabeban;
		System.out.println("Total harga = " +total);
		System.out.print("Masukkan Bayaran = ");
		bayar = input.nextInt();
		kembalian = bayar-total;
	}
	else
	if (pilihan == 40) {
		biayabeban=550000;
		System.out.println("Biaya Beban = Rp.550.000");
		System.out.print("Masukkan Jumlah Meteran Pemakaian = ");
		jumlah = input.nextInt();
		total = jumlah * biayabeban;
		System.out.println("Total harga = " +total);
		System.out.print("Masukkan Bayaran = ");
		bayar = input.nextInt();
		kembalian = bayar-total; 
	}
	else {
		System.out.println("Pilihan yang anda masukkan salah! Silahkan masukkan pilihan yang benar");
		}
	
	}
}