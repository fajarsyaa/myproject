package Inheritance;

class Shape {
    int getCorner(){
        return 0;
    }
}

class Rectangle extends Shape{
    int getCorner(){
        return 4;
    }

    /**
     * Super keyword
     * digunakan untuk mengakses class parent*
     */
    int getParentCorner(){
        return super.getCorner();
    }
}
