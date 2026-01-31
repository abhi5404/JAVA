package Recursions;
import java.util.Scanner;
public class GenerateParanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        generate(n,0,0,"");
        sc.close();
        System.out.println();

    }
    public static void generate(int n , int l , int r , String s ){
     
        if (r ==n ){ // base 
            System.out.println(s);
            return ;
        }
        if (l<n) generate(n,l+1,r,s+"(");
        if (r<l) generate(n,l,r+1,s+")");
        
}

}










// leetcode : 22

// class Solution {
//     public void generate(int n , int l , int r , String s , List<String> ans){
//         if (r ==n ){ // base 
//             ans.add(s);
//             return ;
//         }
//         if (l<n) generate(n,l+1,r,s+"(",ans);
//         if (r<l) generate(n,l,r+1,s+")",ans);
//     }
//     public List<String> generateParenthesis(int n) {
//         List<String> ans= new ArrayList<>();
//         generate(n,0,0,"",ans);
//         return ans;
//     }
// }