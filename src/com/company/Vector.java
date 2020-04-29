package com.company;

public class Vector {

    int dim;
    int[] coordinates;

    public Vector(){
    }

    void setDimension(int dim){
        this.dim = dim;
        coordinates = new int[dim];
    }

    int getElem(int index){
        return coordinates[index];
    }

    void setElem(int index, int value){
        coordinates[index] = value;
    }


    Vector add(Vector vector){
        if (vector.dim != this.dim){
            Vector failVector = new Vector();
            failVector.setDimension(0);
            return failVector;
        }

        Vector newVector = new Vector();
        newVector.setDimension(this.dim);
        for (int i = 0; i < dim; i++){
            newVector.setElem(i, this.getElem(i) + vector.getElem(i));
        }
        return newVector;
    }


    Vector deduct(Vector vector){
        if (vector.dim != this.dim){
            Vector failVector = new Vector();
            failVector.setDimension(0);
            return failVector;
        }

        Vector newVector = new Vector();
        newVector.setDimension(this.dim);
        for (int i = 0; i < dim; i++){
            newVector.setElem(i, this.getElem(i) - vector.getElem(i));
        }
        return newVector;
    }


    Vector multiply(Vector vector){
        if (vector.dim != this.dim){
            Vector failVector = new Vector();
            failVector.setDimension(0);
            return failVector;
        }

        Vector newVector = new Vector();
        newVector.setDimension(this.dim);
        for (int i = 0; i < dim; i++){
            newVector.setElem(i, this.getElem(i) * vector.getElem(i));
        }
        return newVector;
    }

    Vector divide   (Vector vector){
        if (vector.dim != this.dim){
            Vector failVector = new Vector();
            failVector.setDimension(0);
            return failVector;
    }

        Vector newVector = new Vector();
        newVector.setDimension(this.dim);
        for (int i = 0; i < dim; i++){
            newVector.setElem(i, this.getElem(i) / vector.getElem(i));
        }
        return newVector;
    }

    void print(){
        System.out.print("[");
        for (int i = 0; i < this.dim; i++){
            System.out.print(getElem(i));
            if (i != dim - 1)  System.out.print(", ");
        }
        System.out.println("]");
    }
}
