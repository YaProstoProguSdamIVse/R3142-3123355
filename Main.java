public class Main {
    public static void main(String[] args) {

        Humans I = new Humans("Я", 25, Humans.Male.MALE, Humans.Pronoun.I, false);
        Humans Danforth = new Humans("Денфорт", 21, Humans.Male.MALE, Humans.Pronoun.HE, true);
        Humans Lake = new Humans("Лэйк", 40, Humans.Male.MALE, Humans.Pronoun.HE, false);
        Humans We = new Humans("Мы",0000, Humans.Male.UNKNOWN, Humans.Pronoun.WE, true);
        Machine plane = new Machine(Machine.Type.PLANE, "R3142", 6600);
        Rocks quartzite = new Rocks("архейский кварцит ","порода ", Rocks.Age.ANCIENT, Rocks.PhysicalState.WEATHERED, Rocks.Occurrence.RARE, Adjectives.NUDE, Adjectives.LIGHT);
        Glacier glacier = new Glacier("льды", Glacier.Age.ETERNAL, Adjectives.NUDE);
        Constructions constructions = new Constructions("конструкции ", Adjectives.CORRECT, "кубы, пещеры и крепостные валы");

        Peaks peaks1 = new Peaks("вершина горы1", "вершина ", Mountains.Part.PEAKS, Adjectives.GLOOMY);
        Humans.Pronoun.WE.approaching(peaks1);
        SnowLine snowLine1 = new SnowLine("снежная линия горы1", "снежная линия", Mountains.Part.SNOWLINE, Adjectives.SNOWY);  //getType
        peaks1.darkened(Adjectives.FORMIDABLE, snowLine1);
        snowLine1.separating(quartzite, glacier);
        Humans.Pronoun.WE.notice(Humans.Pronoun.WE, Frequency.MORE);
        Hillside hillside = new Hillside("горные склоны1", "горные склоны ", Mountains.Part.PEAKS, Adjectives.CORRECT);
        constructions.clenched(hillside, constructions);
        We.remember(We, Frequency.ONCEAGAIN);
        Paintings paintings = new Paintings("Николя Рерих", "азиатская серия", Adjectives.MYSTERIOUS);
        paintings.info(paintings);
        quartzite.conformity(quartzite, true,Sourse.DESCRIPTION, Lake);
        Giants giants = new Giants("гиганты1","гиганты ", Mountains.Part.SYNONYMS, Adjectives.HIGH);
        giants.towered(IntroductoryWords.PROBABLY, Frequency.SIMILAR, "HERE", "ANCIENT"); //скорей всего эти гиганты точно так же высились здесь и в исключительно давние времена.
        constructions.imagination(We, Frequency.RATHER, constructions);
        Danforth.pilot(Danforth, plane);
        I.considered(I, Instruments.BINOCULARS);
        I.click(Instruments.AERIALCAMERA, Frequency.ASOFTEN);
        I.replace(Danforth, Frequency.SOMETIMES);
        I.toenable(Danforth);
        Danforth.considered(Danforth, Instruments.BINOCULARS);
        I.pilotingDuration(IntroductoryWords.HOWEVER, I);
        //Humans.Pronoun.WE.understood(Humans.Pronoun.WE);
        We.understood(We);
        constructions.consists(Adjectives.STRANGE, constructions, "MOSTLY", quartzite);
        Rocks.Occurrence.RARE.around(Rocks.Occurrence.RARE);

    }
}

// Приближаясь к мрачным вершинам, грозно темневшим над снежной линией, отделявшей обнаженную породу от вечных льдов, мы замечали все большее количество прилепившихся к горным склонам геометрически правильных конструкций и в очередной раз вспоминали загадочные картины Николая Рериха из его азиатской серии.
// Вид выветрившихся древних пород полностью соответствовал описаниям Лейка: скорей всего эти гиганты точно так же высились здесь и в исключительно давние времена.
// Волновали и дразнили наше воображение скорее уж все эти правильной формы кубы, пещеры и крепостные валы.
// Денфорт вел самолет, а я рассматривал их в бинокль, то и дело щелкая аэрокамерой и иногда замещая у руля своего товарища, чтобы дать и ему возможность полюбоваться в бинокль на все эти диковины.
// Впрочем, ненадолго, ибо мое искусство пилотирования оставляло желать лучшего.
// Мы уже поняли, что странные композиции состояли по большей части из легкого архейского кварцита, которого больше нигде вокруг не было.
