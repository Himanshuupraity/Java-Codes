public class string_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // Char at index 0
        System.out.println(sb.charAt(0));

        // set char at index
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        //insert the char in starting
        sb.insert(0, 'S');
        System.out.println(sb);

         //insert the char in between
        sb.insert(3, 'n');
        System.out.println(sb);

        // Delete the character
        sb.delete(2, 3);
        System.out.println(sb);

        //adding at last
        sb.append("e");
        sb.append("t");
        System.out.println(sb);
        System.out.println(sb.length());

    }
}
