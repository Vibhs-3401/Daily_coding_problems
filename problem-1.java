import java.util.*;

class Problem_1 {
    
    public static boolean check_add(List<Integer> ary, int k) {
        for (int i=0; i<ary.size()-1; i++) {
            for (int j=1; j<ary.size(); j++) {
                if (ary.get(i)+ ary.get(j) == k) {
                    return true;
                }
            }
        }   
        return false;
    } 
    
    public static void main(String[] args) {
        List<Integer> ary = new ArrayList<>();
        ary.add(10);
        ary.add(15);
        ary.add(5);
        ary.add(7);
        
        int k = 17;
        
        boolean ans = check_add(ary, k);
        
        System.out.println(ans);
        
    }
}
