import java.util.Scanner;
class Tipe33 extends Parent {
	void tampil33() {
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
}