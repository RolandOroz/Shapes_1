package comparer;

import base.ShapeBase;

import java.util.Arrays;

public class UnionBox
{

    // Function to check if two
// rectangles are intersecting or not
    static boolean doIntersect( int []X,
                               int []Y)
    {
        // If one rectangle is to the
        // right of other's right edge
        if (X[0] > X[3] || X[2] > X[1])
            return false;

        // If one rectangle is on the
        // top of other's top edge
        if (Y[0] > Y[3] || Y[2] > Y[1])
            return false;

        return true;
    }

    // Function to return the perimeter of
// the Union of Two Rectangles
    static int getUnionPerimeter( int []X,
                                 int []Y)
    {
        // Stores the resultant perimeter
        int perimeter = 0;

        // If rectangles do not intersect
        if (!doIntersect(X, Y)) {

            // Perimeter of Rectangle 1
            perimeter
                    += 2 * (Math.abs(X[1] - X[0])
                    + Math.abs(Y[1] - Y[0]));

            // Perimeter of Rectangle 2
            perimeter
                    += 2 * (Math.abs(X[3] - X[2])
                    + Math.abs(Y[3] - Y[2]));
        }

        // If the rectangles intersect
        else {

            // Get width of combined figure
            int w = Arrays.stream(X).max().getAsInt()
                    - Arrays.stream(X).min().getAsInt();

            // Get length of combined figure
            int l = Arrays.stream(Y).max().getAsInt()
                    - Arrays.stream(Y).min().getAsInt();

            perimeter = 2 * (l + w);
        }

        // Return the perimeter
        return perimeter;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int []X = { -1, 2, 4, 6 };
        int []Y = { 2, 5, 3, 7 };

        System.out.print(getUnionPerimeter(X, Y));
    }
}
