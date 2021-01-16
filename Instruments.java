public enum Instruments {
    BINOCULARS("в биноколь "),
    AERIALCAMERA("аэрокамерой ");

    private String type;

    Instruments(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
