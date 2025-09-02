package practice3.bikeproject;

public class MountainBike extends Bike implements MountainParts {
    private String suspension, type;
    private int frameSize;

    public MountainBike() {
        this("Bull Horn", "Hardtail", "Maxxis", "dropper", 27, "RockShox XC32", "Pro", 19);
    }

    public MountainBike(String handleBars, String frame, String tyres, String seatType, int numGears,
                        String suspension, String type, int frameSize) {
        super(handleBars, frame, tyres, seatType, numGears);
        this.suspension = suspension;
        this.type = type;
        this.frameSize = frameSize;
    }

    @Override
    public String getSuspension() {
        return suspension;
    }

    @Override
    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("This mountain bike is a " + this.type + " bike and has a " + this.suspension + " suspension and a frame size of " + this.frameSize + "inches.");

    }
}
