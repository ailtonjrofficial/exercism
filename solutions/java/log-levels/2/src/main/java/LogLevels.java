public class LogLevels {
    public static String message(String logLine) {
        int pts = logLine.indexOf(":");
        String msg = logLine.substring(pts + 1);
        return msg.trim();
    }

    public static String logLevel(String logLine) {
        int firstkey = logLine.indexOf("[");
        int lastKey = logLine.indexOf("]");
        String msg = logLine.substring(firstkey + 1, lastKey);
        return msg.toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";        
    }
}
