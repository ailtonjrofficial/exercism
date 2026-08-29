
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int [] birdsPerDay = {0, 2, 5, 3, 7, 8, 4};
        return birdsPerDay;
    }

    public int getToday() {
        int birdWatcher = birdsPerDay.length - 1;
        return birdsPerDay[birdWatcher];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        int count = 0;
        for (int i = 0; i < birdsPerDay.length; i++){
            if (birdsPerDay[i] == 0){
                return true;
            }
        }return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        int limit = Math.min(numberOfDays, birdsPerDay.length);
        for (int i = 0; i < limit; i++){
                count += birdsPerDay[i];
        } return count;            
    }

    public int getBusyDays() {
        int count = 0;
        for (int i = 0; i < birdsPerDay.length; i++){
                if(birdsPerDay[i] >= 5){
                    count ++;
            };
        } return count;
    }
}
