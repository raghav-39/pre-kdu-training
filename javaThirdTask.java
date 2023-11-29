import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.io.*;
 
public class javaThirdTask {
  public static void main(String[] args) throws IOException {
 
    File file = new File("1.txt");
    Scanner input = new Scanner(file); 
    ArrayList<String>arr = new ArrayList<>();
 
    int count = 0;
    while (input.hasNext()) {
      String word  = input.next();
    
        arr.add(word);
      
    }
    
    HashMap<String,Integer>mpp2 = new HashMap<>();
    
    for(int i=0 ;i<arr.size() ;i++){
        // System.out.println(arr.get(i));
        String temp = arr.get(i);
        String temp2 = "";
        for(int j=0 ;j<temp.length() ;j++){
            if(temp.charAt(j)==','){
                break;
            }
            temp2 = temp2 + temp.charAt(j);
            
            
        }
        // System.out.println(temp2);
        if(mpp2.containsKey(temp2))
        {
            mpp2.put(temp2, mpp2.get(temp2)+1);
        }
        else
        {
            mpp2.put(temp2, 1);
        }        
    }
 
    // using priority queue
     PriorityQueue<String> pq=new PriorityQueue<>((a,b)->mpp2.get(b)-mpp2.get(a));
        pq.addAll(mpp2.keySet());    

        int count1 = 0;
        while(!pq.isEmpty() && count1<3){
            System.out.println(pq.remove());
            count1++;
        }
  }
}