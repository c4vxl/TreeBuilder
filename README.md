# Christmas Tree Generator

This Java program generates Christmas tree patterns that you can print and enjoy for the festive season. You can create Christmas trees with customizable properties or generate random-sized trees.

## Features

- Create Christmas trees with a specified number of stages and the size of each stage.
- Customize the decoration of the tree with your choice of characters.
- Generate random-sized Christmas trees for a unique and festive look.

## Usage

You can use the `TreeBuilder` class to create Christmas trees:

### Creating a Christmas Tree

To create a Christmas tree with a specified number of stages and the size of each stage using the default decoration (asterisks `*`), you can use the `createTree` method:

```java
String tree = TreeBuilder.createTree(stageAmount, sizeOfStage);
```

## Customizing Tree Decoration
If you want to use a different character for decoration, you can use the createTreeWithGivenChars method. For example, to create a tree with # as decoration:
```java
String tree = TreeBuilder.createTreeWithGivenChars(stageAmount, sizeOfStage, "#");
```

## Generating Random Christmas Trees
You can also create random-sized Christmas trees:
```java
String randomTree = TreeBuilder.createRandomSizeTree();
String randomTreeWithCustomChars = TreeBuilder.createRandomSizeTreeWithGivenChars("#"); // will create a tree with # as leaves
```

## Printing the Tree
You can then print the generated tree using System.out.println() or save it to a file.

## Example

Here's a simple example of how to use the TreeBuilder class to create a Christmas tree:
```java
public class Main {
    public static void main(String[] args) {
        int stages = 5;
        int size = 5;
        String tree = TreeBuilder.createTree(stages, size);
        System.out.println(tree);
    }
}
```
This will generate and print a 5-stage Christmas tree with a size of 5 using asterisks as decoration.

# BUT WHY???
IDK dude, just got bored during class

---
## Developer
This Project was Developed by [c4vxl](https://c4vxl.de)
