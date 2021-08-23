import java.util.*;
import java.io.*;

class Main{
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    int c = Integer.parseInt(br.readLine());
    int result = a*b*c;
    int arr[] = new int[(int)Math.log10(result)+1];
    int count = 0;

    for(int i=0; i<arr.length; i++){
      arr[i] = result % 10;
      result /= 10;
    }

    for(int x=0; x<10; x++) {
      for(int y=0; y<arr.length; y++) {
        if(x==arr[y]) count++;
      }
      bw.write(count+"\n");
      count = 0;
    }
    
    bw.flush();
    br.close();
    bw.close();
  }
}
