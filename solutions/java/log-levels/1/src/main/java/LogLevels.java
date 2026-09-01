public class LogLevels {
    
    public static String message(String logLine) {
        int twoPoint = logLine.indexOf(":");
        String separator = logLine.substring(twoPoint + 1);
        return separator.trim();
    }

    public static String logLevel(String logLine) {
        int firstkey = logLine.indexOf("[");
        int lastKey = logLine.indexOf("]");
        String separatorTwo = logLine.substring(firstkey + 1, lastKey);
        return separatorTwo.toLowerCase();
    }

    public static String reformat(String logLine) {
        int otherFirstkey = logLine.indexOf("[");
        int otherLastKey = logLine.indexOf("]");
        int otherTwoPoints = logLine.indexOf(":");
        String separatorThree = logLine.substring(otherFirstkey + 1, otherLastKey);
        String separatorFour = logLine.substring(otherTwoPoints + 1);
        String message = separatorFour.trim() + " (" + separatorThree.toLowerCase() + ")";
        return message;
        
    }
}
