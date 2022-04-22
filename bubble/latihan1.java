public class latihan1 {
    public static <T extends Comparable<? super T>> void
   bubbleSort(T[]arr){
    int i, j;
    T temp;
    for(i=0 ; i<arr.length-1; i++){
    for(j=0 ; j<arr.length-i-1; j++){
    if(arr[j].compareTo(arr[j+1])<0){
    temp = arr[j+1];
    arr[j+1] = arr[j];
    arr[j]= temp;
    }
    }
    } 
  }


  public static <T> void tampil(T data[]) {
  for (T objek : data) {
  System.out.print(objek + " ");
  }
  System.out.println("");
  }
  public static void main(String[] args) {
 
  Integer data[] = new Integer[10];
  for(int a=0 ; a<data.length ; a++){
  data[a]= (int)(Math.random()*13+1);
  }
  long awal = System.currentTimeMillis();
  bubbleSort(data);
  long sisaWaktu = System.currentTimeMillis() - awal;
  tampil(data);
  System.out.println("Waktu " + sisaWaktu);
  }
 } 
 
