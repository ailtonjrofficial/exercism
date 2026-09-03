public class LogLine {
    private final String logLine;
    public LogLine (String logLine){
        this.logLine = logLine;
    }
    public LogLevel getLogLevel() {
        String logUpper = this.logLine.toUpperCase();
        StringBuilder sig = new StringBuilder();
        boolean col = false;
        for (int i = 0 ; i < logUpper.length(); i++){
            char c = logUpper.charAt(i);
            if (c == ']'){
                break;
            }
            if (col){
                sig.append(c);
            }
            if (c == '['){
                col = true;
            }
        }
        return switch (sig.toString()) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }
    public String getOutputForShortLog() {
        boolean fra = false;
        StringBuilder men = new StringBuilder();
        for ( int i = 0 ; i < logLine.length() ; i++){
            if (fra){
                men.append(logLine.charAt(i));
            }
            if( logLine.charAt(i) == ':'){
                fra = true;
            }
        }
        return getLogLevel().getEncodedLevel() + ":" + men.toString().trim();
    }
}
