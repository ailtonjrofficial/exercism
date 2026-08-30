class NeedForSpeed {
    public int speed;
    public int metters;
    public int battery = 100;
    public int batteryDrain;
    public String msg;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
        return metters;
    }

    public void drive() {
       if(battery < batteryDrain){
           this.msg = "Sem bateria, favor carregar";
        } else{
           this.metters += speed;
           this.battery -= batteryDrain;
        }        
    }

    public static NeedForSpeed nitro() {
        return new  NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int metters;
    RaceTrack(int distance) {
        this.metters = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return (100 / car.batteryDrain) * car.speed >= this.metters;    
    }
}
