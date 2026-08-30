class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();
        boolean dpsKebab = false;
        for(int i = 0; i < identifier.length(); i++){
            char vowels = identifier.charAt(i);
            if(vowels == '4'){
                sb.append('a');
            } else if(vowels == '3'){
                sb.append('e');
            } else if(vowels == '0'){
                sb.append('o');
            } else if (vowels == '1'){
                sb.append('l');
            } else if (vowels == '7'){
                sb.append('t');
            } else if (vowels == ' '){
                sb.append('_');
            } else if (vowels == '-'){
                dpsKebab = true;
            } else if (Character.isLetter(vowels)){
                if(dpsKebab){
                    sb.append(Character.toUpperCase(vowels));
                    dpsKebab = false;
                } else {
                    sb.append(vowels);
                }
            }
        }
        return sb.toString();
    }
}
