Sorting Array
int[] nums = new int[]{...}
Arrays.sort(nums)

class Melon {
    private final String type;
    private final int weight;
}
Melon[]  melons = new Melon{..}

Arrays.sort(melon, (Melon melon1, Melon melon2) 
        -> Integer.compare(melon1.getWeight(), melon2.getWeight()));

