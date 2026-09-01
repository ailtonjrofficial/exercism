class ProductionRemoteControlCar implements RemoteControlCar,  Comparable<ProductionRemoteControlCar>{

    private int units;
    private int numberOfVictories;

    public void drive() {
        this.units += 10;
    }

    public int getDistanceTravelled() {
        return units;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar other){
        return Integer.compare(other.getNumberOfVictories(), this.numberOfVictories);
    }
}
