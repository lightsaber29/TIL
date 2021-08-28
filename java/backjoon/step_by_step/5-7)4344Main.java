import java.util.*;
import java.io.*;

class Main {
  
  public static double getAverage(String str) {

    String numbers[] = str.split(" ");
    int grades[] = new int [Integer.parseInt(numbers[0])];
    int sum = 0;
    double avg = 0.0;
    int count = 0;

    for(int i=0; i<grades.length; i++) {
      grades[i] = Integer.parseInt(numbers[i+1]);
      sum += grades[i];
    }

    avg = (double)sum/grades.length;

    for(int i=0; i<grades.length; i++) {
      if((grades[i] - avg) > 0) {
        count++;
      }
    }

    return (double)count/(grades.length) * 100; 
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String students[] = new String [ Integer.parseInt(br.readLine()) ];

    for(int i=0; i<students.length; i++) {
      students[i] = br.readLine();
      bw.write( String.format("%.3f", getAverage(students[i])) + "%\n"); 
    }

    bw.flush();

    br.close();
    bw.close();
  }
}
