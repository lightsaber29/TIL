import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int [] arr = new int[9];

    for(int i=0; i<9; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }

    int max = arr[0];
    int index = 1;

    for(int j=0; j<arr.length; j++) {
      if(arr[j] > max) {
        max = arr[j];
        index = j+1;
      }
    }

    bw.write(max+"\n"+index);
    bw.flush();

    br.close();
    bw.close();
  }
}
