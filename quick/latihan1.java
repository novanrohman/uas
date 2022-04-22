class latihan1 {
  public static <T extends Comparable <? super T>>
  int Partition (T[]arr, int p, int r) {
      int i, j;
      T pivot, temp;
      pivot = arr[p];
      i = p;
      j = r;
      while (i <= j){
          while (pivot.compareTo(arr[j]) > 0)
              j--;
          while (pivot.compareTo(arr[i]) < 0)
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
  System.out.println("=== QuickSort secara Descending ===");
  System.out.println("=== Data sebelum diurutkan ===");
  Integer data[] = new Integer[10];
  for (int a=0; a< data.length; a++){
      data[a]= (int) (Math.random() * 13 + 1);
  }
  tampil(data);
  long awal = System.currentTimeMillis();
  QuickSort(data,0, data.length - 1);
  long sisaWaktu = System.currentTimeMillis() - awal;
  System.out.println("\n=== Data sesudah diurutkan ===");
  tampil(data);
  System.out.println("Waktu " + sisaWaktu );
  }
}