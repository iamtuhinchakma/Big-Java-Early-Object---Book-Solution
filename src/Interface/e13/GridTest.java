package Interface.e13;

import java.util.ArrayList;

class Grid{
    private String grid[][];

    public Grid(int numRows, int numColumns) {
        grid = new String[numRows][numColumns];
    }

    public void add(int row, int column, String description){
        if(row >= 0 && row < grid.length && column >= 0 && column < grid[row].length){
            grid[row][column] = description;
        }
    }
    public String getDescription(int row, int column){
        if(row >= 0 && row < grid.length && column >= 0 && column < grid[row].length){
            return grid[row][column];
        }
        return null;
    }
    public ArrayList<Location>getDescribedLocations(){
        ArrayList<Location> locations = new ArrayList<Location>();
        for(int row = 0; row < grid.length; row++){
            for(int column = 0; column < grid[row].length; column++){
                if(grid[row][column] != null){
                    locations.add(new Location(row, column));
                }
            }
        }
        return locations;
    }
    public static class Location{
        private int row;
        private int column;

        public Location(int row, int column) {
            this.row = row;
            this.column = column;
        }
        public int getRow(){
            return row;
        }
        public int getColumn(){
            return column;
        }

    }
}
public class GridTest {
    public static void main(String[] args) {
        Grid grid = new Grid(3, 4);
        grid.add(2, 1, "shoe");
        grid.add(1, 2, "tree");
        grid.add(0, 1, "car");
        grid.add(2, 3, "Luck");

        System.out.println(grid.getDescription(0, 1));
        System.out.println(grid.getDescription(1, 2));
        System.out.println(grid.getDescription(2, 1));
        System.out.println(grid.getDescription(2, 3));

        for(Grid.Location location : grid.getDescribedLocations()){
            System.out.println(location.getRow() + " " + location.getColumn());
        }
        System.out.println();
        System.out.println("Expected: 0 1,  1 2, 2 1");
    }
}
