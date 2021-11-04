//5/ Check if a given key is in the hashmap
import java.util.*; 
class Main {
  public static void main(String[] args) {
    HashMap<String, Integer> hash = new HashMap<String, Integer>();
    hash.put("Jonh", 9);
    hash.put("Elly", 20);
    hash.put("Bill", 15);
    hash.put("Emily",40);
    System.out.println(hash);
    for(String i: hash.keySet())
    {
      if(i=="Jonh")
      {
        System.out.print("Jonh" + " value " + hash.get(i));
      }
    }
  }
}