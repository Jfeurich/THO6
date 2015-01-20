package nl.hu.tho6.translator;

import nl.hu.tho6.translator.dictionary.Dictionary;
import nl.hu.tho6.translator.dictionary.exception.DictionaryNotFoundException;
import nl.hu.tho6.translator.dictionary.exception.TranslationNotFoundException;
import nl.hu.tho6.translator.filesystem.FileSystemFacade;
import nl.hu.tho6.translator.filesystem.types.impl.XMLFileSystem;

import java.util.ArrayList;
import java.util.List;

public class Translator {
    private static Translator ourInstance = new Translator();
    private static List<Dictionary> dictionaries;

    public static Translator getInstance() {
        return ourInstance;
    }

    private Translator() {
        dictionaries = new ArrayList<Dictionary>();
        init();
    }

    //alleen zolang we nog geen listener hebben
    private void init() {
        FileSystemFacade fs = new FileSystemFacade(new XMLFileSystem());
        try {
            addDictionary(fs.readDictionary("plsql"));
        } catch (DictionaryNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void addDictionary(Dictionary dictionary) {
        //checken of dictionary param null is
        if (!(dictionary == null)) {
            dictionaries.add(dictionary);
        }
    }

    private Dictionary selectDictionary(String language) {
        Dictionary currentDictionary = null;
        //loop door lijst met dictionaries
        for (Dictionary dictionary : dictionaries) {
            //als talen gelijk zijn set current dictionary
            if (dictionary.getLanguage().equals(language)) {
                currentDictionary = dictionary;
            }
        }
        return currentDictionary;
    }

    public String getTranslationForElement(String element, String language) {
        Dictionary currentDictionary = selectDictionary(language);
        String translatedElement = "";
        try {
            //translation ophalen van het element
            translatedElement = currentDictionary.getTranslationStringForElement(element);
        } catch (TranslationNotFoundException e) {
            e.printStackTrace();
        }
        return translatedElement;
    }
}