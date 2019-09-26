
/**
 * Write a description of class SentacneBuilder here.
 *
 * @author (Stephanie)
 * @version (09/20/19)
 */
public class SentenceBuilder
{
    
    private String[] nouns = new String[] {"cat", "dog", "monkey", "he", "she", "polar bear", "baboon", "fish", "horse", "cow"};
    private String[] verbs = new String[] {"hides", "runs", "leaps", "falls", "dies", "climbs", "avoids", "hears", "leaves", "agrees"};
    private String[] adjectives = new String[] {"small", "tiny", "bumpy", "huge", "tall", "short", "smooth", "giant", "fuzzy", "wide" };
    private String[] determiners = new String[] {"this", "that", "those", "these", "theirs", "hers", "his", "this", "our", "yours"};
    private String[] adverbs = new String[] {"quietly", "peacefully", "carefully", "quickly", "rapidly", "slowly", "secretly", "painfully", "cheerfully"};
    private String[] prepositions = new String[] {"above", "across", "between", "below", "after", "around", "at"};
    private String mainString;
    public void loadSentences(){
    mainString = nouns[ (int) (Math.random() * nouns.length)] + " " + verbs[ (int) (Math.random() * verbs.length)] + " " + preposition[ (int) (Math.random() * preposition.length)]; 
    }
    
    public String getSentence(){
        return mainString;
    }
    
    public String getNounPhrase()
    {
     mainString = determiners[ (int) (Math.random() * determiners.length)] + " " + adjectives[ (int) (Math.random() * adjectives.length)] + " " +  nouns[ (int) (Math.random() * nouns.length)];
    }
    
    }   
    public String getPrepositionalPhrase(){
     mainString = prepositions[ (int) (Math.random() * prepositions.length)] + " " + determiners[ (int) (Math.random() * determiners.length)] + " " + adjectives[ (int) (Math.random() * adjectives.length)] + " " + nouns[ (int) (Math.random() * nouns.length)];
            preposition + determiner + adjective + noun
    }
                                                                                               
    public String getVerbPhrase(){
        mainString = adverbs[ (int) (Math.random() * adverbs.length)] + " " + verbs[ (int) (Math.random() * verbs.length)];
    }

    public String getRandomNoun(){
        mainString = nouns[ (int) (Math.random() * nouns.length)]
    }
    public String getRandomVerb(){
         mainString = verbs[ (int) (Math.random() * verbs.length)];
    }
    
    public String getRandomAdjective(){
         mainString = adjectives[ (int) (Math.random() * adjectives.length)];
    }

    public String getRandomAdverb(){
         mainString = adverbs[ (int) (Math.random() * adverbs.length)];
    }

    public String getRandomDeterminer(){
        mainString = determiners[ (int) (Math.random() * determiners.length)]
    }

    public String getRandomPreposition(){
        mainString = prepositions[ (int) (Math.random() * prepositions.length)]
    }


