package task.five;
public class Text {
	
	public static int substringCount(String s, String world) {
	        int result = 0;
	          for (int i = 0; i < s.length(); i++) {
	            if (s.substring(i, i + world.length()).equalsIgnoreCase(world)) {
	                result++;
	                i += world.length();
	            }
	        }
	        return result;
	    }
	 
	    public static void main(String[] args) {
	        String s = "privetteb emoimiRiv jhfhgriv.";
	        String world = "riv";
	        System.out.println(substringCount(s, world));
	    }
	
	}
	


