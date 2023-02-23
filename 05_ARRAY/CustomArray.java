import java.util.Scanner;

class CustomArray {
    static int[] arr;
    static int size;
    static int len;

    public CustomArray(int cap) {
        arr = new int[cap];
        size = 0;
        len = cap;
    }

    public static void size() {
        System.out.println("Size of Array --> " + size);
    }

    public static void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void update(int idx, int val) {
        if (idx < 0 || idx > size) {
            System.out.println("Invalid position");
        } else {
            arr[idx] = val;
            System.out.println("val updated");
        }
    }

    public static int delete(int idx) {
        if (idx < 0 || idx >= len) {
            System.out.println("Invalid position");
            return -1;
        } else if (size == 0) {
            System.out.println("Arr is empty Nothing to delete");
            return -1;
        } else {
            int val = arr[idx];
            for (int i = idx; i < size; i++) {
                arr[i] = arr[i + 1];
            }
            arr[size] = 0;
            System.out.println("val deleted");
            size--;
            return val;
        }
    }

    public static void add(int val) {
        if (size == len) {
            System.out.println("already full no space");
            return;
        } else {
            arr[size] = val;
            size++;
            System.out.println("val added");
        }
    }

    public static void addAt(int val, int idx) {
        if (size == len) {
            System.out.println("already full no space");
            return;
        } else {

            for (int i = size; i >= idx; i--) {
                arr[i + 1] = arr[i];
            }
            arr[idx] = val;
            size++;
            System.out.println("val " + val + " added At " + idx);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array --> ");
        int n = sc.nextInt();
        // System.out.println();
        System.out.println("Press 1 for add val ");
        System.out.println("Press 2 for add At val ");
        System.out.println("Press 3 for delete val ");
        System.out.println("Press 4 for update val ");
        System.out.println("Press 5 for print val ");
        System.out.println("Press 6 for get size of arr ");
        System.out.println("Press 7 Exit ");
        CustomArray Obj = new CustomArray(n);
        int choice;
        while (true) {
            System.out.println("-----------------------------");
            // System.out.println("Press 1 for add val ");
            // System.out.println("Press 2 for add At val ");
            // System.out.println("Press 3 for delete val ");
            // System.out.println("Press 4 for update val ");
            // System.out.println("Press 5 for print val ");
            // System.out.println("Press 6 for get size of arr ");
            // System.out.println("Press 7 Exit ");
            choice = sc.nextInt();
            boolean temp = false;
            int val;
            int idx;
            switch (choice) {
                case 1:
                    System.out.println("You choose ADD");
                    System.out.print("Enter Value --> ");
                    val = sc.nextInt();
                    System.out.println();
                    Obj.add(val);
                    break;
                case 2:
                    System.out.println("You choose ADD-AT ");
                    System.out.print("Enter Value ");
                    val = sc.nextInt();
                    System.out.println();
                    System.out.print("Enter index --> ");
                    idx = sc.nextInt();
                    System.out.println();
                    Obj.addAt(val, idx);
                    break;
                case 3:
                    System.out.println("You choose DELETE ");
                    System.out.print("Enter index --> ");
                    idx = sc.nextInt();
                    System.out.println();
                    val = Obj.delete(idx);
                    System.out.println("deleted value is -->  " + val);
                    break;
                case 4:
                    System.out.println("You choose UPDATE ");
                    System.out.print("Enter index --> ");
                    idx = sc.nextInt();
                    System.out.println();
                    System.out.print("Enter value --> ");
                    val = sc.nextInt();
                    System.out.println();
                    Obj.update(idx, val);
                    break;
                case 5:
                    System.out.println("You choose PRINT");
                    Obj.print();
                    break;
                case 6:
                    System.out.println("You choose SIZE ");
                    Obj.size();
                    break;
                case 7:
                    System.out.println("You choose Exit ");
                    temp = true;
                    break;
                default:
                    break;
            }

            if (temp) {
                System.out.println("Exit");
                break;
            }
        }
        sc.close();
    }
}