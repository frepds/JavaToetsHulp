package ToetsHulp.Theorie.Juni14_2022.Antwoorden.Antwoorden;// puntentelling: elke klasse met een fout: 1 punt aftrek
// fouten kunnen zijn:
// - abstract mist/had aanwezig moeten zijn
// - klasse had interface moeten zijn (of andersom)
// - extends mist of verkeerde klasse wordt ge-extend
// - verkeerde lijst met te implementeren klasses
// - methode afwezig die aanwezig had moeten zijn (of andersom)
// - methode heeft verkeerde signatuur

public interface HeeftAartsvijand {

    // interface methode: geen body.
    int kwetsbaar(boolean x);

    int kwetsbaar(int y);
}
