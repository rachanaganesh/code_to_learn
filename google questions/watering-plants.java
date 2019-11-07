package Arrays;

public class Google_WateringFlower {

    public int Google_WateringFlower(int[] plants,int c1, int c2){
        int low = 0;
        int high = plants.length-1;
        int can1 = 0;
        int can2 = 0;
        int noOfRefills = 0;

        while(low < high) {
            if (can1 < plants[low]) {
                can1 = c1;
                ++noOfRefills;
            }
            if (can2 < plants[high]) {
                can2 = c2;
                ++noOfRefills;
            }

            can1 -=plants[low++];
            can2 -=plants[high--];

            if(low == high && plants[low] > c1+c2){
                return ++noOfRefills;
            } else {
                return noOfRefills;
            }
        }
        return noOfRefills;
    }

    public static void main(String[] args){
        int[] plants = {2,4,5,1,2};
        int capacity1 = 5, capacity2 = 7;
        Google_WateringFlower plant = new Google_WateringFlower();
        System.out.println(plant.Google_WateringFlower(plants, capacity1,capacity2));

    }
}
