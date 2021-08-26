import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String str[] = new String[Integer.parseInt(br.readLine())];
    int count = 0;
    int sum = 0;
    int result[] = new int[str.length];

    for(int i=0; i<str.length; i++) {
      str[i] = br.readLine();
    }

    for(int j=0; j<str.length; j++) {
      sum = 0;
      count = 0;
      for(int i=0; i<str[j].length(); i++) {
        if(str[j].charAt(i) == 79) {
          count++;
          sum += count;
        }
        else {
          count = 0;
        }
      }
      result[j] = sum;
      bw.write(result[j] + "\n");
    }

    bw.flush();
    br.close();
    bw.close();
  }
}
