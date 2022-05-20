
package cartonbingo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class CartonBingo {
   private ArrayList<Integer> numeros;

    public CartonBingo(int max){
        Random rdn= new Random();
        numeros=new ArrayList<>(max);
        HashSet<Integer> carton= new HashSet();
        
        while(numeros.size()<max){
        int x = rdn.nextInt(90) +1;
        
        if(!carton.contains(x)){
        carton.add(x);
        numeros.add(x);
        }
        }
    }
    
    
    public List<Integer> getCarton(){
    return numeros;}
    }

 
    

   

