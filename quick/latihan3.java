class Mahasiswa implements Comparable<Mahasiswa> {
  private String nrp;
  private String nama;
  public Mahasiswa(String nrp, String nama){
      this.nrp = nrp;
      this.nama = nama;
  }
  public String getNrp(){
      return nrp;
  }
  public String getNama(){
      return nama;
  }
  public int compareTo(Mahasiswa o){
      Mahasiswa mahasiswa = (Mahasiswa) o;
      return this.nrp.compareTo(mahasiswa.nrp);
  }
  @Override
  public String toString(){
      return ("nrp : " + nrp + "\tnama : " + nama + "\n");
  }
}

class latihan3 {
  public static <T extends Comparable <? super T>>
  int Partition (T[]arr, int p, int r) {
      int i, j;
      T pivot, temp;
      pivot = arr[p];
      i = p;
      j = r;
      while (i <= j){
          while (pivot.compareTo(arr[j]) < 0)
              j--;
          while (pivot.compareTo(arr[i]) > 0)
              i++;
          if (i < j){
              temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
              j--;
              i++;
          }
          else
              return j;
      }
      return j;
  }
  private static <T extends Comparable<? super T>> void
  QuickSort(T[]arr, int p, int r){
      int q;
      if (p<r){
          q=Partition(arr, p, r);
          QuickSort(arr, p, q);
          QuickSort(arr, q+1, r);
      }
  }
  private static <T> void tampil(T data[]){
      for (T objek : data){
          System.out.print(objek + " ");
      }
      System.out.println("");
  }
  public static void main(String[] args){
      Mahasiswa data[] = {new Mahasiswa("02", "Ferdy"),
              new Mahasiswa("01", "Agiss"),
              new Mahasiswa("03", "Anis"),
              new Mahasiswa("04", "Ismi")};
      long awal = System.currentTimeMillis();
      QuickSort(data, 0, data.length-1);
      tampil(data);
      long sisaWaktu = System.currentTimeMillis() - awal;
      System.out.println("Waktu " + sisaWaktu);
  }
}