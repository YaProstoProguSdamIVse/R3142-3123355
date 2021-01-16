public enum Adjectives {
    // горы
    HIGH("высокие "),
    SNOWY("заснеженные "),
    GLOOMY("мрачные "),
    GENTLE("пологие "),
    FORMIDABLE("грозные "),
    // породы
    NUDE("обнаженный "),
    LIGHT("легкий "),
    // картина
    MYSTERIOUS("загадочные "),
    // конструкции
    CORRECT("геометрически правильные "),
    STRANGE("странные ");

    private String name;

    Adjectives(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
