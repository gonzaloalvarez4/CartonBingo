/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartonbingo;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class main {
     public static void main(String[] args) {
         CartonBingo bingo=new CartonBingo(15);
         List<Integer> nums= bingo.getCarton();
         for(int i=0;i<nums.size();i++){
             System.out.println(nums.get(i));}
    }
    
}
