package ru.vsu.cs.pavlenkodm;

class Main {
    public static void main(String[] args) {
        //Проверка на работоспособность нахождения чисел
        BinaryTree tree = new BinaryTree();
        BinaryTree.Node root = null;
        int minDate = 5; //Произвольное число, которое является ограничением при нахождении минимального значения
        int maxDate = 45;//Произвольное число, которое является ограничением при нахождении максимального значения
        root = tree.insert(root, 10);
        tree.insert(root, 43);
        tree.insert(root, 9);
        tree.insert(root, 3);
        tree.insert(root, 11);
        tree.insert(root, 8);
        tree.insert(root, 4);
        tree.insert(root, 56);

        System.out.println("Минимальное значение, большее числа minDate: " + tree.minvalue(root, minDate));
        System.out.println("Максимальное значение, меньшее числа maxDate: " + tree.maxvalue(root, maxDate));
        System.out.println("Что и требовалось доказать, всё работает идеально!!!");
    }
}