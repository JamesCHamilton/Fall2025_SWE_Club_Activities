package meeting1;
class Day1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int a = 5;
        int b = 10;
        int sum = a + b;
        System.out.println("Sum: " + sum);

        String greeting = "Welcome to Java programming!";
        greeting = greeting.toUpperCase();
        System.out.println(greeting);
        greeting = greeting.toLowerCase();
        System.out.println(greeting);
        greeting = greeting.replace("java", "Python");
        System.out.println(greeting);
        
        
        String[] words = greeting.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("Length of greeting: " + greeting.length());
        System.out.println("Character at index 5: " + greeting.charAt(5));
        System.out.println("Substring (0, 7): " + greeting.substring(0, 7));
        System.out.println("Index of 'Python': " + greeting.indexOf("Python"));
        System.out.println("Trimmed greeting: '" + greeting.trim() + "'");
    }
}