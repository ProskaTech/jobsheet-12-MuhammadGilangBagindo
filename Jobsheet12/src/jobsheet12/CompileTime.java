package jobsheet12;

/**
 * Created by 21343030_Muhammad Gilang Bagindo
 * @author HP
 */

class CompileTime {
    //method keliling dengan single argumen
    static int keliling(int a){
        return 4 * a;
    }
    //method keliling dengan dua rgumen (method overloading)
    static int keliling(int l, int b){
        return 2 * (l + b);
    }
}
