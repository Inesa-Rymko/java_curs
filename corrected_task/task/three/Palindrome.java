package task.three;

public class Palindrome {

	public static void main(String [] args){				
        Palindrome sl = new Palindrome();
        if ( sl.isPalindrome("catac")){
            System.out.println("Palindrome");
            }
        else {
            System.out.println("Not Palindrome");
        }   
            }
    public boolean isPalindrome(String world){
        int i = world.length()-1;
        int j=0;
        while(i > j) {
            if(world.charAt(i) != world.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }

}
