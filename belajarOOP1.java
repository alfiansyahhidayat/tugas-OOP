public class belajarOOP1 {

  // class tanpa construktor / class polos
class bahan{
  String dataString;
  int dataInt;
}

// class menggunakan construktor 
class Mahasiswa{
      String nama;
      String Nim;
      String Prodi;
      int angkatan;
  Mahasiswa(){
    System.out.println("ini adalah konstruktor");

}
 }
    

    public static void main(String[] args) throws Exception {

      Mahasiswa mahasiswa1= 
      new Mahasiswa();


        }
}
