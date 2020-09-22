
package arsipku2;

public class Arsipku2 implements Biodata, Nilai {

    public static void main(String[] args) {
      Arsipku2 ps = new Arsipku2();
        ps.Biodata();
        ps.nama();
        ps.tempatLahir();
        ps.hobi();
        ps.Nilai();
        ps.agama();
        ps.BahasaIndonesia();
        ps.matematika();
    }
    public void Biodata (){
        System.out.println("Biodata");
    }
    public void nama () {
        System.out.println("Nama            : Siti Nur Kholifah");
    }
    public void tempatLahir () {
        System.out.println("Tempat Lahir    : Jember");
    }
    public void hobi () {
        System.out.println("Hobi            : Membaca WP");
    }
    public void Nilai () {
        System.out.println("Nilai");
    }
    public void agama () {
        System.out.println("Agama            : 85");
    }
    public void BahasaIndonesia () {
        System.out.println("Bahasa Indonesia : 90");
    }
    public void matematika (){
        System.out.println("Matematika       : 80");
    }
}
