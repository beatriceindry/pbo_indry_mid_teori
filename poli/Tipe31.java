import java.util.Scanner;
class Tipe31 extends Parent {
	void tampil31() {
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
}