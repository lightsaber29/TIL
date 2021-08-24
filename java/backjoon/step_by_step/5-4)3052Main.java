import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int arr[] = new int[10];
    int count = 0;
    boolean flag = false;

    for(int i=0; i<10; i++) {
      arr[i] = Integer.parseInt(br.readLine()) % 42;
    }

    for(int x=0; x<10; x++) {
      for(int y=x+1; y<10; y++) {
        if(arr[x] == arr[y]) {
          flag = true;
        }
      }
      if(flag==false)
        count++;
      else
        flag=false;
    }

    bw.write(count+"\n");
    bw.flush();
  }
}
