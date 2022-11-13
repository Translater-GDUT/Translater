public interface Translator {

    /*
     * 翻译word
     */
    String translate(String word);

    int TRANSLATOR_TYPE = 200;

    void setFrom(String from);
    void setTo(String to);
}
