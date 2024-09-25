public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle plot1 = new Rectangle(150,200);
        Rectangle plot2 = new Rectangle(125);
        Rectangle plot3 = new Rectangle();

        int plot1Length = plot1.getLength();
        int plot1Width = plot1.getWidth();
        int plot1Area = plot1.calculateArea();
        
        int plot2Length = plot2.getLength();
        int plot2Width = plot2.getWidth();
        int plot2Area = plot2.calculateArea();

        int plot3Length = plot3.getLength();
        int plot3Width = plot3.getWidth();
        int plot3Area = plot3.calculateArea();

        //update variables

        plot1.setWidth(75);
        plot1Width = plot1.getWidth();
        plot2.setLength(75);
        plot2.setWidth(75);
        plot2Width = plot2.getWidth();
        plot2Length = plot2.getLength();
        plot3.setWidth(75);
        plot3Width = plot3.getWidth();

        plot1Area = plot1.calculateArea();
        plot2Area = plot2.calculateArea();
        plot3Area = plot3.calculateArea();

        System.out.println("These three plots requires " + (plot1Area + plot2Area + plot3Area) + " square feet of seed.");
    }
}
 