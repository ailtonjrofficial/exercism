public class JedliksToyCar {
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    private int meters = 0;
    
    public String distanceDisplay() {
       return "Driven " + meters + " meters";
    }

    private int battery = 100;
    
    public String batteryDisplay() {
       if(battery == 0){
           return "Battery empty";
       }
        return "Battery at " + battery + "%";
    }
    
    public void drive() {
        if(battery > 0){
            meters += 20;
            battery --;
        }
    }
}
