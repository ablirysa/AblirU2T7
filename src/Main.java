public class Main {
    public static void main(String[] args) {
        CustomStringMethods method = new CustomStringMethods();
        method.alphabetical("capples", "bapples");
        System.out.println(method.halvesReversed("reverse me!"));

        System.out.println(method.yellOrWhisper("hello James!"));

        System.out.println(method.endUp("food!", 2));

        System.out.println(method.removeCharacter("Halloween", 0));

        System.out.println(method.insertAt("ghost", "BOO!", "o"));
    }
}
