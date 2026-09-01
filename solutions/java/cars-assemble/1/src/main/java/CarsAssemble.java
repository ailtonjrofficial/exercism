public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double prdCar = 221;
        if(speed <= 4){
            return speed * prdCar * 1.0;
        } else if(speed <= 8){
            return speed * prdCar * 0.9;
        } else if(speed == 9){
            return speed * prdCar * 0.8;
        } else if(speed == 10){
            return speed * prdCar * 0.77;
        } else{
            return 0.0;
        }
    };

    public int workingItemsPerMinute(int speed) {
        double prdCarPerHour = productionRatePerHour(speed);
        return (int) (prdCarPerHour / 60);
    }
}
