import java.util.Scanner;
class Tipe40 extends Parent {
	void tampil40() {
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
}