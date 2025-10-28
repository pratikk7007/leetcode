class Solution {
    public String removeOuterParentheses(String s) {
        if (s.equals("")) {
            return s;
        }

        int x = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                if (x > 0) sb.append(ch);
                x++;  
            } else {
                x--;  
                if (x > 0) sb.append(ch);
            }
        }

        return sb.toString();
    }
}
