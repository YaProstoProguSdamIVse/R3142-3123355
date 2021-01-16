public enum IntroductoryWords {
    PROBABLY("Скорее всего, "),
    HOWEVER("Впрочем, ");

    private String name;

    IntroductoryWords(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}