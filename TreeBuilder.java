public class TreeBuilder {
    public static final int MAX_RANDOM_SIZE = 100;

    public static String createTree(int stageAmount, int sizeOfStage) {
        return createTreeWithGivenChars(stageAmount, sizeOfStage, "*");
    }

    public static String createTreeWithGivenChars(int stageAmount, int sizeOfStage, String leaves) {
        StringBuilder tree = new StringBuilder();

        // create leaves
        for (int i = 0; i < stageAmount; i++) {
            for (int j = 0; j < sizeOfStage; j++) {
                tree.append(" ".repeat(sizeOfStage - j - 1)); // append spaces
                tree.append(String.valueOf(leaves).repeat(Math.max(0, 2 * j + 1))); // append leaves

                tree.append("\n"); // new line
            }
        }

        // add trunk
        for (int i = 0; i < 2; i++) {
            tree.append(" ".repeat(sizeOfStage - 1)); // append spaces
            tree.append("|\n"); // append trunk
        }

        return tree.toString();
    }

    public static String createRandomSizeTree() {
        return createTree((int) (Math.random() * MAX_RANDOM_SIZE), (int) (Math.random() * MAX_RANDOM_SIZE));
    }

    public static String createRandomSizeTreeWithGivenChars(String leaves) {
        return createTreeWithGivenChars((int) (Math.random() * MAX_RANDOM_SIZE), (int) (Math.random() * MAX_RANDOM_SIZE), leaves);
    }
}
