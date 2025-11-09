import java.util.List;
import java.util.Set;
import java.util.HashSet;


class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> newCollectionCards = new HashSet<>();
        cards.size();
        for(String card : cards) {    
            newCollectionCards.add(card);
        }
        return newCollectionCards;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean tradeIsPossible = false;
        if(myCollection.isEmpty() || theirCollection.isEmpty()){
            return tradeIsPossible;
        } else {
            for(String card1 : myCollection) {
                if(!theirCollection.contains(card1)) {
                    for(String card2 : theirCollection) {
                        if(!myCollection.contains(card2)) {
                            tradeIsPossible = true;
                            break;
                        }
                    }
                }
            }
        }
        return tradeIsPossible;
    }

      static Set<String> commonCards(List<Set<String>> collections) {
        if (collections.isEmpty()) {
            return Set.of();
        }

        Set<String> common = new HashSet<>(collections.get(0));

        for (Set<String> set : collections) {
            common.retainAll(set);
        }

        return common;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        if (collections.isEmpty()) {
            return Set.of();
        }

        Set<String> allElements = new HashSet<>(collections.get(0));

        for (Set<String> set : collections) {
            allElements.addAll(set);
        }

        return allElements;    }
}
