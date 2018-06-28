/* -------------------------------------------------------------------------- */
/* - lucene-oxygen - custom indexer and searcher                            - */
/* - Copyright (C) 2018  <https://github.com/louiscyphre>,                  - */
/* -                     <https://github.com/TegraMorgan>,                  - */
/* -                     University of Haifa                                - */
/* -                                                                        - */
/* - This program is free software: you can redistribute it and/or modify   - */
/* - it under the terms of the GNU General Public License as published by   - */
/* - the Free Software Foundation, either version 3 of the License, or      - */
/* - (at your option) any later version.                                    - */
/* -                                                                        - */
/* - This program is distributed in the hope that it will be useful,        - */
/* - but WITHOUT ANY WARRANTY; without even the implied warranty of         - */
/* - MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the          - */
/* - GNU General Public License for more details.                           - */
/* -                                                                        - */
/* - You should have received a copy of the GNU General Public License      - */
/* - along with this program.  If not, see <http://www.gnu.org/licenses/>.  - */
/* -------------------------------------------------------------------------- */
/* - File:                   Constants.java
/* - Created by:             <https://github.com/louiscyphre>               - */
/* - Creation date and time: 14:45 29.05.2018                               - */
/* -------------------------------------------------------------------------- */
package oxygen;

import org.apache.lucene.analysis.CharArraySet;

import java.util.Arrays;
import java.util.List;

public class Constants {
    public static final CharArraySet OXYGEN_STOP_SET;

    private static final List<String> stopWords;

    /**
     * Stopword list
     */
    static {
        stopWords = Arrays.asList(
                "a", "able", "about", "above", "abst", "accordance", "according", "accordingly", "across", "act",
                "actually", "added", "adj", "affected", "affecting", "affects", "after", "afterwards", "again",
                "against", "ah", "all", "almost", "alone", "along", "already", "also", "although", "always", "am",
                "among", "amongst", "an", "and", "announce", "another", "any", "anybody", "anyhow", "anymore",
                "anyone", "anything", "anyway", "anyways", "anywhere", "apparently", "approximately", "are", "aren",
                "arent", "arise", "around", "as", "aside", "ask", "asking", "at", "auth", "available", "away",
                "awfully", "b", "back", "be", "became", "because", "become", "becomes", "becoming", "been", "before",
                "beforehand", "begin", "beginning", "beginnings", "begins", "behind", "being", "believe", "below",
                "beside", "besides", "between", "beyond", "biol", "both", "brief", "briefly", "but", "by", "c",
                "ca", "came", "can", "cannot", "can't", "cause", "causes", "certain", "certainly", "co", "com",
                "come", "comes", "contain", "containing", "contains", "could", "couldnt", "d", "date", "did",
                "didn't", "different", "do", "does", "doesn't", "doing", "done", "don't", "down", "downwards",
                "due", "during", "e", "each", "ed", "edu", "effect", "eg", "eight", "eighty", "either", "else",
                "elsewhere", "end", "ending", "enough", "especially", "et", "et-al", "etc", "even", "ever",
                "every", "everybody", "everyone", "everything", "everywhere", "ex", "except", "f", "far", "few",
                "ff", "fifth", "first", "five", "fix", "followed", "following", "follows", "for", "former",
                "formerly", "forth", "found", "four", "from", "further", "furthermore", "g", "gave", "get",
                "gets", "getting", "give", "given", "gives", "giving", "go", "goes", "gone", "got", "gotten",
                "h", "had", "happens", "hardly", "has", "hasn't", "have", "haven't", "having", "he", "hed",
                "hence", "her", "here", "hereafter", "hereby", "herein", "heres", "hereupon", "hers",
                "herself", "hes", "hi", "hid", "him", "himself", "his", "hither", "home", "how", "howbeit",
                "however", "hundred", "i", "id", "ie", "if", "i'll", "im", "immediate", "immediately",
                "importance", "important", "in", "inc", "indeed", "index", "information", "instead", "into",
                "invention", "inward", "is", "isn't", "it", "itd", "it'll", "its", "itself", "i've",
                "j", "just", "k", "keep", "keeps", "kept", "kg", "km", "know", "known", "knows", "l", "largely",
                "last", "lately", "later", "latter", "latterly", "least", "less", "lest", "let", "lets",
                "like", "liked", "likely", "line", "little", "'ll", "look", "looking", "looks", "ltd", "m",
                "made", "mainly", "make", "makes", "many", "may", "maybe", "me", "mean", "means", "meantime",
                "meanwhile", "merely", "mg", "might", "million", "miss", "ml", "more", "moreover", "most",
                "mostly", "mr", "mrs", "much", "mug", "must", "my", "myself", "n", "na", "name", "namely",
                "nay", "nd", "near", "nearly", "necessarily", "necessary", "need", "needs", "neither", "never",
                "nevertheless", "new", "next", "nine", "ninety", "no", "nobody", "non", "none", "nonetheless",
                "noone", "nor", "normally", "nos", "not", "noted", "nothing", "now", "nowhere", "o", "obtain",
                "obtained", "obviously", "of", "off", "often", "oh", "ok", "okay", "old", "omitted", "on",
                "once", "one", "ones", "only", "onto", "or", "ord", "other", "others", "otherwise", "ought",
                "our", "ours", "ourselves", "out", "outside", "over", "overall", "owing", "own", "p", "page",
                "pages", "part", "particular", "particularly", "past", "per", "perhaps", "placed", "please",
                "plus", "poorly", "possible", "possibly", "potentially", "pp", "predominantly", "present",
                "previously", "primarily", "probably", "promptly", "proud", "provides", "put", "q", "que",
                "quickly", "quite", "qv", "r", "ran", "rather", "rd", "re", "readily", "really", "recent",
                "recently", "ref", "refs", "regarding", "regardless", "regards", "related", "relatively",
                "respectively", "resulted", "resulting", "results", "right", "run", "s", "said", "say",
                "same", "saw", "say", "saying", "says", "sec", "section", "see", "seeing", "seem", "seemed",
                "seeming", "seems", "seen", "self", "selves", "sent", "seven", "several", "shall", "she",
                "shed", "she'll", "shes", "should", "shouldn't", "show", "showed", "shown", "showns", "shows",
                "significant", "significantly", "similar", "similarly", "since", "six", "slightly", "so",
                "some", "somebody", "somehow", "someone", "somethan", "something", "sometime", "sometimes",
                "somewhat", "somewhere", "soon", "sorry", "specifically", "specified", "specify", "specifying",
                "still", "stop", "strongly", "sub", "substantially", "successfully", "such", "sufficiently",
                "suggest", "sup", "sure", "tell", "what", "when", "you", "your", "yours"
        );

        final CharArraySet stopSet = new CharArraySet(stopWords, false);
        OXYGEN_STOP_SET = CharArraySet.unmodifiableSet(stopSet);
    }

    /**
     * List of Oxygen stopwords
     *
     * @return const list
     */
    static public List<String> getStopWords() {
        return stopWords;
    }
}
