public enum PercussionInstrument {
    KICKBASS("Bass", "boom-boom"), TOMTOM("TomTom", "bumpa-bumpa"), SNARE("Snare", "rat-a-tat"), CYMBOL("Cymbol", "crash");

    private String friendlyName;
    private String sound;

    PercussionInstrument(String friendlyName, String sound) {
        this.friendlyName = friendlyName;
        this.sound = sound;
    }

    public String getFriendlyName() {
        return friendlyName;
    }

    public String getSound() {
        return sound;
    }

    @Override
    public String toString(){
        return friendlyName + " goes " + sound;
    }
}
