public class Main {
    public static void main(String[] args) {
        int stages = 5;
        int size = 5;
        String tree = TreeBuilder.createTree(stages, size);
        System.out.println(tree);
    }
}
