import java.util.HashSet;
import java.util.LinkedHashSet;
public class firstNoRepeat
{
	public static void main(String[] args) {
		if (args[0] != null) {
			System.out.println(firstNoRepeat(args[0].toCharArray()));
		}
		else{
			System.out.println(firstNoRepeat("google".toCharArray()));
		}
	}
	public static char firstNoRepeat(char[] chars)
	{
	    HashSet<Character> trackSet = new HashSet<Character>();
	    LinkedHashSet<Character> firstSet = new LinkedHashSet<Character>();
	    for (char charecter : chars) {
	        if(trackSet.add(charecter)){
	        	firstSet.add(charecter);
	        }
	        else{
	        	firstSet.remove(charecter);
	        }
	    }
	    return firstSet.iterator().next();
	}
}