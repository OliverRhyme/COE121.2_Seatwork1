package problem3;

public class Scoreboard {

    private static final int DEFAULT_CAPACITY = 10;

    private final Entry[] entries;

    private int headIndex = 0;

    public Scoreboard() {
        this(DEFAULT_CAPACITY);
    }

    public Scoreboard(int capacity) {
        entries = new Entry[capacity];
    }

    public void add(Entry entry) {
        entries[headIndex] = entry;
        headIndex = (headIndex + 1) % entries.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < entries.length; i++) {
            Entry entry = entries[(i + headIndex) % entries.length];
            // If entry is null, skip
            if (entry == null) {
                continue;
            }

            sb.append(entry).append(": ").append(entry.score).append('\n');
        }
        return sb.toString();
    }

    public record Entry(String name, int score) {
    }
}
