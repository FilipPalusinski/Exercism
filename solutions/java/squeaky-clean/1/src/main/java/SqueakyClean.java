class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder result = new StringBuilder();
        boolean nextUpper = false;

        for (int i = 0; i < identifier.length(); i++) {
            char ch = identifier.charAt(i);
            
            if (ch == '-') {
                nextUpper = true;
            } else if (ch == ' ') {
                result.append('_');
                
            } else {
                switch (ch) {
                    case '4': ch = 'a'; break;
                    case '3': ch = 'e'; break;
                    case '0': ch = 'o'; break;
                    case '1': ch = 'l'; break;
                    case '7': ch = 't'; break;
                }
                if (!Character.isLetter(ch)) {
                continue;
                }
                
                if (nextUpper) {
                    result.append(Character.toUpperCase(ch));
                    nextUpper = false;
                } else {
                    result.append(ch);
                }
            }
        }
        return result.toString();
    }
}
