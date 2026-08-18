class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {

        int position = 0;

        for (String dir : commands) {

            if (dir.equals("RIGHT")) {
                position++;
            }
            else if (dir.equals("LEFT")) {
                position--;
            }
            else if (dir.equals("DOWN")) {
                position += n;
            }
            else if (dir.equals("UP")) {
                position -= n;
            }
        }

        return position;
    }
}