import java.util.*;

class RelativeDistance {
    private final Map<String, Set<String>> adj = new HashMap<>();

    RelativeDistance(Map<String, List<String>> familyTree) {
        // parent <-> child
        for (Map.Entry<String, List<String>> e : familyTree.entrySet()) {
            String parent = e.getKey();
            List<String> kids = e.getValue();

            for (String child : kids) {
                addUndirected(parent, child);
            }

            // sibling <-> sibling
            for (int i = 0; i < kids.size(); i++) {
                for (int j = i + 1; j < kids.size(); j++) {
                    addUndirected(kids.get(i), kids.get(j));
                }
            }
        }
    }

    private void addUndirected(String a, String b) {
        adj.computeIfAbsent(a, k -> new HashSet<>()).add(b);
        adj.computeIfAbsent(b, k -> new HashSet<>()).add(a);
    }

    int degreeOfSeparation(String a, String b) {
        if (a.equals(b)) return 0;

        Set<String> visited = new HashSet<>();
        List<String> current = new ArrayList<>();
        current.add(a);
        visited.add(a);
        int degree = 0;

        while (!current.isEmpty()) {
            degree++;
            List<String> next = new ArrayList<>();

            for (String u : current) {
                for (String v : adj.getOrDefault(u, Collections.emptySet())) {
                    if (visited.contains(v)) continue;
                    if (v.equals(b)) return degree;
                    visited.add(v);
                    next.add(v);
                }
            }
            current = next;
        }
        return -1; // brak połączenia
    }
}
