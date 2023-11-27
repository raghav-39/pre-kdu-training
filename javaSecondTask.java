import java.util.*;
public class javaSecondTask {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        ArrayList<String>arr = new ArrayList<String>();
        HashMap<String,Integer>mpp = new HashMap<>();
        HashSet<String>set = new HashSet<String>();

        for(int i=0 ;i<5 ;i++){
            String str1 = obj.nextLine();
            arr.add(str1);
        }

        System.out.println("The arraylist that we have created is ");
        for(int i=0 ;i<arr.size() ;i++){
            String word = arr.get(i);
            set.add(word);
            if(mpp.containsKey(word)){
                mpp.put(word,mpp.get(word)+1);
            }
            else{
                mpp.put(word,1);
            }

        }

        // iterating the list set and the map
        System.out.println("List Contains:");
        for(int i=0 ;i<arr.size() ;i++){
            System.out.println(arr.get(i));
        }

        System.out.println("\nset contains");
        for(String itr1 : set){
            System.out.println(itr1 + " ");
        }

        System.out.println("\nmap Contains");

        for(String itr:mpp.keySet()){
            int val = mpp.get(itr);
            System.out.println("Word = " + itr + ", Frequency =  " + val);
        }
        



    }
}
