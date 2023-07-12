public class Main {
    public static void main(String[] args) {
 
        Buku buku1 = new Buku("B001", "Pemrograman Java");
        Buku buku2 = new Buku("B002", "Pemrograman C++");
        BukuLuar buku3 = new BukuLuar("B003", "Harry Potter");
 
        Petugas petugas1 = new Petugas("Alex", "P001");
        Peminjam peminjam1 = new Mahasiswa();
        Peminjam peminjam2 = new Mahasiswa();
        peminjam1.setNamaPeminjam("Budi");
        peminjam1.setKodePeminjam("M001");
        peminjam2.setNamaPeminjam("Arya");
        peminjam2.setKodePeminjam("M001");
        
        peminjam1.doLogin();
        peminjam2.doLogin();
        
        try{
        Peminjaman peminjaman1 = new Peminjaman(peminjam1, petugas1, buku1);
 
        System.out.println("Peminjaman: " + peminjaman1.getPeminjam().getNamaPeminjam());
        System.out.println("Petugas: " + peminjaman1.getPetugas().getNamaPetugas());
        System.out.println("Buku: " + peminjaman1.getBuku().getnamabuku());
        System.out.println("Nama Buku: " + peminjaman1.getBuku().getnamabuku() );
        Denda denda1 = new Denda(peminjaman1, 7);
       
        System.out.println("Tagihan denda: " + denda1.getTagihan());

        System.out.println("=== Denda Ditambahkan! ===");
        peminjam1.addAntiDenda();

        System.out.println("===================================>");

        Peminjaman peminjaman2 = new Peminjaman(peminjam2, petugas1, buku3);
        
        System.out.println("Peminjaman: " + peminjaman2.getPeminjam().getNamaPeminjam());
        System.out.println("Petugas: " + peminjaman2.getPetugas().getNamaPetugas());
        System.out.println("Buku: " + peminjaman2.getBuku().getnamabuku());
        System.out.println("Nama Buku: " + peminjaman2.getBuku().getnamabuku() );
        Denda denda2 = new Denda(peminjaman2, 5);
        System.out.println("Tagihan denda: " + denda2.getTagihan());

        System.out.println("=== Denda Dihapus! ===");
        peminjam2.removeAntiDenda();
        System.out.println("Tagihan denda: " + denda2.getHapusDenda());
    } catch (Exception e) {
        System.out.println("terjadi kesalahan: " + e.getMessage());
        } finally {
            System.out.println("Pemograman Telah Selesai");
 }
 
 }
}