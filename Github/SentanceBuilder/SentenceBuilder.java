
/**
 * Write a description of class SentacneBuilder here.
 *
 * @author (Stephanie)
 * @version (09/20/19)
 */
public class SentenceBuilder
{
    // instance variables - replace the example below with your own
    private String[] nouns = new String[] {"cat", "dog", "monkey", "he", "she", "polar bear", "baboon", "fish", "horse", "cow"};
    private String[] verbs = new String[] {"hides", "runs", "leaps", "falls", "dies", "climbs", "avoids", "hears", "leaves", "agrees"};
    private String[] adjectives = new String[] {"small", "tiny", "bumpy", "huge", "tall", "short", "smooth", "giant", "fuzzy", "wide" };
    private String[] determiners = new String[] {"this", "that", "those", "these", "theirs", "hers", "his", "this", "our", "yours"};
    private String[] adverbs = new String[] {"quietly", "peacefully", "carefully", "quickly", "rapidly", "slowly", "secretly", "painfully", "cheerfully"};
    /**
     * Constructor for objects of class SentanceBuilder
     */
    public SentenceBuilder()
    {
        
    }
    public String getNounPhrase()
    {
     return  determiners[ (int) (Math.random() * determiners.length)] + " " + adjectives[ (int) (Math.random() * adjectives.length)] + " " +  nouns[ (int) (Math.random() * nouns.length)];
    }
    
    }   

