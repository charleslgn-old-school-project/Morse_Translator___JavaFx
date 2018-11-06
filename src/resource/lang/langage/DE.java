package resource.lang.langage;

import resource.lang.Lang;

public class DE extends Lang {

    @Override
    protected String[] getBoutonName() {
        String chooseFile       = "Datei Wählen";
        String translate        = "Übersetzen";
        String playTranslate    = "Übersetzung abspielen";
        String export           = "Export";
        String newTranslate     = "Neu Übersetzung";
        String restart          = "Wieder beginnen";

        return new String[] {chooseFile, translate, playTranslate,
                export, newTranslate, restart};
    }

    @Override
    protected String[] getTitleName() {
        String languageToMorse  = "Deutsch zu Morse";
        String languageToL33t   = "Deutsch zu L33t";
        String morseToLanguage  = "Morse zu Deutsch";
        String directTranslate  = "Live-Übersetzung";

        return new String[] {languageToMorse, languageToL33t,
                morseToLanguage, directTranslate};
    }

    @Override
    protected String[] getLabel() {
        String writeRoman  = "Schreiben Sie in Deutsch";
        String writeMorse  = "Schreiben Sie in Morse";
        String welcome     = "Wilkommen";
        String title       = "Übersetzer";

        return new String[] {writeRoman, writeMorse, welcome, title};
    }

    @Override
    protected String[] getPopUp() {
        String chooseFileTrad  = "Wählen Sie ein Datei";
        String chooseFileExport= "Wählen Sie ein Rekord, wo zu exportieren";



        String popUpSuccesTittle    = "Erfolg";
        String popUpSuccesName      = "Export";
        String popUpSuccesDesc      = "Die Übersetzung ist exportieren";

        String popUpErrorTittle     = "Fehler";
        String popUpErrorName       = "Dateipfad";
        String popUpErrorDescTrad   = "Erst Wählen Sie die Datei";
        String popUpErrorDescExport = "Überprüfen Sie, dass ein übersetzung gemacht wird";

        String popUpErrorNoFileSelected = "Vérifiez qu'un fichier a été sélectionné";
        String popUpErrorPlayTrad = "Vérifiez que la traduction a un résultat";

        return new String[] {chooseFileTrad, chooseFileExport, popUpSuccesTittle, popUpSuccesName,
                popUpSuccesDesc, popUpErrorTittle, popUpErrorName, popUpErrorDescTrad, popUpErrorDescExport,
                popUpErrorNoFileSelected, popUpErrorPlayTrad};
    }
}
