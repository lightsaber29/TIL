import java.util.*;
import java.io.*;

class Main{
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    String str[] = (br.readLine()).split(" ");
    int arr[] = new int[N];
    int M = 0;
    double sum = 0;
    double result = 0;

    for(int i=0; i<N; i++) {
      arr[i] = Integer.parseInt(str[i]);
    }

    M = arr[0];
    for(int j=1; j<N; j++) {
      if(M-arr[j] < 0) {
        M = arr[j];
      }
    }

    for(int z=0; z<N; z++) {
      sum += (double)arr[z]/M*100;
    }

    bw.write((sum/N) + "\n");
    bw.flush();

    br.close();
    bw.close();

  }
}
