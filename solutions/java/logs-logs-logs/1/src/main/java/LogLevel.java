public enum LogLevel {
    TRACE ("TRC", 1),
    DEBUG ("DBG", 2),
    INFO ("INF", 4),
    WARNING ("WRN", 5),
    ERROR ("ERR", 6),
    FATAL ("FTL", 42),
    UNKNOWN ("UNK", 0);

    private final String log;

    private final int encodedLevel;

    LogLevel (String log, int encodedLevel){
        this.log = log;
        this.encodedLevel =  encodedLevel;
    }
    public String logLevel(){
        return this.log;
    }
    public int getEncodedLevel(){
        return this.encodedLevel;
    }
}