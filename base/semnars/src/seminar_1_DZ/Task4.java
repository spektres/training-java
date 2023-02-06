public class Task4 {
    public static void main(String[] args) {
        
        String s = "A man, a plan, a canal: Panama";
        
        if (s == null)
            System.out.println("false");
        
        char c_ary[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for (char c : c_ary) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }

        System.out.println(sb.toString().equalsIgnoreCase(sb.reverse().toString()));
    }
}
