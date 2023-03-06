public enum StringedInstrument {
    GUITAR("Guitar", 6, false), BASS("Bass", 4, false), VIOLIN("Violin", 4, true),
    HARP("Harp", 47, false);

    private String friendlyName;
    private int string;
    private boolean bowed;

    private StringedInstrument(String friendlyName, int string, boolean bowed) {
        this.friendlyName = friendlyName;
        this.string = string;
        this.bowed = bowed;
    }

    public int getString() {
        return string;
    }

    public boolean isBowed() {
        return bowed;
    }

    @Override
    public String toString() {
        return friendlyName;
    }
}
