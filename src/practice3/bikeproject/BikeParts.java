package practice3.bikeproject;

public interface BikeParts {
    String MANUFACTURER_NAME = "Oracle Cycles";

    String getManufacturer();

    String getHandleBars();

    void setHandleBars(String handleBars);

    String getFrame();

    void setFrame(String frame);

    String getTyres();

    void setTyres(String tyres);

    String getSeatType();

    void setSeatType(String seatType);

    int getNumGears();

    void setNumGears(int numGears);
}
