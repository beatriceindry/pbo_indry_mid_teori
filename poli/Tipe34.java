import java.util.Scanner;
class Tipe34 extends Parent {
	void tampil34() {
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
}