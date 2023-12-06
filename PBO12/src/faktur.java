import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class faktur extends dataPembelian {   // inheritance kelas data pembelian

    @Override
    public void isidata() {
        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);

        System.out.print("masukkan nomor faktur     : ");
        nofaktur = scanStr.nextLine();

        System.out.print("masukkan kode barang      : ");
        kodeBarang = scanStr.nextLine();

        System.out.print("masukkan nama pelanggan   : ");
        namaPelanggan = scanStr.nextLine();

        System.out.print("masukkan alamat pelanggan : ");
        alamat = scanStr.nextLine();

        System.out.print("masukkan nomor HP         : ");
        noHP = scanStr.nextLine();

        System.out.print("masukkan nama barang      : ");
        namaBarang = scanStr.nextLine();

        System.out.print("masukkan harga barang     : ");
        try {
            hargaBarang = scanInt.nextInt(); // handlingException
            if (hargaBarang > 10000) {
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            System.out.println("nilai tidak valid, nilai lebih dari 10000");
        }

        System.out.print("masukkan jumlah beli      : ");
        try {
            jumlahBeli = scanInt.nextInt(); // handlingException
            if (jumlahBeli > 10000) {
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            System.out.println("nilai tidak valid, nilai lebih dari 10000");
        }

        totalBayar = hargaBarang * jumlahBeli;
        scanInt.close();
        scanStr.close();
    }

    @Override
    public void cetakFaktur() {
        Date hariPesan = new Date();
        SimpleDateFormat tgl = new SimpleDateFormat("E dd/MM/yyyy");  // membuat objek untuk menampilkan tanggal
        SimpleDateFormat wkt = new SimpleDateFormat("hh:mm:ss zzzz");  // membuat objek untuk menampilkan waktu

        System.out.println("\n\t\t" + NamaToko.toUpperCase());   // uppercasse untuk nama toko
        System.out.println("tanggal\t\t: " + tgl.format(hariPesan));   // method date untuk menampilkan tanggal
        System.out.println("jam\t\t: " + wkt.format(hariPesan));   // method date untuk menampilkan waktu
        System.out.println("==============================================");
        System.out.println("\n\t     " + StrukPelanggan.toUpperCase());   // uppercase untuk data pelanggan
        System.out.println("\t    ----------------");
        System.out.println("nama pelanggan\t: " + namaPelanggan.toUpperCase());   // uppercase untuk nama pelanggan
        System.out.println("nomor HP\t: " + noHP);
        System.out.println("alamat\t\t: " + alamat);
        System.out.println("==============================================");
        System.out.println("\n\t   " + StrukPelanggan2.toUpperCase());   // uppercasse untuk data pembelian barang
        System.out.println("\t  ------------------------");
        System.out.println("nomor faktur\t: " + nofaktur);
        System.out.println("kode barang\t: " + kodeBarang);
        System.out.println("nama barang\t: " + namaBarang.toLowerCase());   // lowercase untuk nama barang
        System.out.println("harga barang\t: " + hargaBarang);
        System.out.println("jumlah beli\t: " + jumlahBeli);
        System.out.println("total bayar\t: " + totalBayar);
        System.out.println("===============================================");
        System.out.println(" Muhammad Raihan Alghifari dan hilmi teman baikku");
    }

}
