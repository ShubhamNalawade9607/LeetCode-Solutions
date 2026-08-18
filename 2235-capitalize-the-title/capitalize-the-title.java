class Solution {
    public String capitalizeTitle(String title) {

        String[] words = title.toLowerCase().split(" ");

        StringBuilder sb = new StringBuilder();

        for (String word : words) {

            if (word.length() <= 2) {
                sb.append(word);
            } else {
                sb.append(Character.toUpperCase(word.charAt(0)));
                sb.append(word.substring(1));
            }

            sb.append(" ");
        }

        return sb.toString().trim();
    }
}