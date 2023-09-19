package main.java.org.navid.array;

public class Array {
    int[] items;
    int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item){
        //if array is full resize it;
        if(count == items.length){
            int[] newItems = new int[count * 2];
            for(int i = 0; i<count; i++){
                newItems[i]  = items[i];
            }
            items = newItems;
        }
        //insert in the lst index;
        items[count++] = item;

    }

    public void remove(int index){
        if(index > count){
            throw new IllegalArgumentException();
        }
        for(int i = index; i< count; i++){
            items[i] = items[i + 1];
        }
        count--;
    }

    public int max(){
        int max = 0;
        for (int i = 0; i<count; i++){
            max  = (items[i] > max) ? items[i] : max;
        }
        return max;
    }

    public Array intersect(int[] array){
        Array commonComponent = new Array(3);
        for(int i = 0; i < count; i++){
            for(int j = 0; j<array.length; j++){
                if(items[i] == array[j])
                    commonComponent.insert(items[i]);
            }
        }
        return commonComponent;
    }

    public void reverse(){
        int[] newItems = new int[count];
        for(int i = 0; i < count; i++){
            newItems[i] = items[count - i-1];
        }
        items = newItems;
    }

    public void insertAt(int item, int index){
        //increase length by 1
        int[] newItems = new int[count+1];
        for(int i = 0; i< count; i++){
            newItems[i] = items[i];
        }
        items = newItems;
        count++;

        //shift all the items from index to right
        for (int  i  = count-1; i > index; i--){
          items[i]  = items[i-1];
        }

        //insert item in index
        items[index] = item;
    }
    public void print(){
        for(int i = 0; i <count; i++)
            System.out.println(items[i]);
    }



}
