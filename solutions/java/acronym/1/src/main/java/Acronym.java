class Acronym {
    String phrase;
    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        char space = ' ';
        char dash = '-';
        char underscore = '_';
        String acronym = "" + phrase.charAt(0);
        boolean saveNextChar = false;
        for (int i = 0; i < phrase.length(); i++) {
            char letter = phrase.charAt(i);
            if (saveNextChar) {
                if(letter != space && letter != underscore && letter != dash) {
                     acronym = acronym + letter;
                }
                saveNextChar = false;
            }
            if (letter == space || letter == dash || letter == underscore) {
                saveNextChar = true;
            }
          
        }
        return acronym.toUpperCase();
    }

}
