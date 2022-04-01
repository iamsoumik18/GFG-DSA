import java.util.*;

/*
    Primitive type array sorts only in ascending order. Comparator doesn't work.
    To reverse that we have to reverse it manually after sort.

    Sorting non primitive is stable but primitive is not guaranteed to be stable
*/
public class Test{

    public static void main(String[] args){
        int a[] = {5,30, 10, 20, 8};
        Arrays.sort(a,1,4);//This sort the array from index 1(inclusive) to index 4(exclusive)
        //System.out.println(Arrays.toString(a));

        //Sorting array of objects using comparable interface
        Point p[] = {new Point(10,20), new Point(3,12), new Point(5,7)};
        //Collections.reverseOrder() reverses the natural order of sorting of the class
        Arrays.sort(p);//natural order of sorting defined in the class
        Arrays.sort(p,Collections.reverseOrder());
        for(int i=0; i<p.length; i++){
            //System.out.println(p[i].x+" "+p[i].y);
        }

        Point2 p2[] = {new Point2(10,20), new Point2(3,12), new Point2(5,7)};
        //Custom Comparator object
        Arrays.sort(p2,new MyCmp());
        for(int i=0; i<p2.length; i++){
            //System.out.println(p2[i].x+" "+p2[i].y);
        }

        //We can sort non primitive array in non increasing order
        Integer b[] = {5,10,2,6,3,9};
        Arrays.sort(b,Collections.reverseOrder());
        //System.out.println(Arrays.toString(b));

        //Sort Integer Array such that even no comes first then odd
        Integer c[] = {2, 6, 8, 4, 5, 9, 7, 1, 3};
        Arrays.sort(c, new MyCmp2());
        //System.out.println(Arrays.toString(c));
    }

}

//We have defined in the class itself how to sort array of this object when Arrays.sort() is used
class Point implements Comparable<Point>{
    int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int compareTo(Point P){
        return this.x - P.x;
    }
}

class Point2 {
    int x, y;
    Point2(int x, int y){
        this.x = x;
        this.y = y;
    }
}


//Custom comparator class
class MyCmp implements Comparator<Point2>{
    public int compare(Point2 p1, Point2 p2){
        return p1.x-p2.x;
    }
}

class MyCmp2 implements Comparator<Integer>{
    public int compare(Integer a, Integer b){
        return a%2 - b%2;
    }
}