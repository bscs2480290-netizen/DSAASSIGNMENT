public class Main {
    public static void main(String[] args) {
        dubblylinklist dll=new dubblylinklist();

            // Insert at beginning


            // Insert at beginning
            dll.insertatbeginning(10);
            dll.insertatbeginning(20);

            // Insert at end
            dll.insertatlast(30);
            dll.insertatlast(40);
            dll.insertatlast(5);
            dll.insertatlast(50);

            dll.displayforward();
            dll.displayforward();

            dll.deletefirst();
            dll.deletelast();

            dll.detelebyvalue(20);
            dll.deleteBeforeValue(30);
            dll.deleteAfterValue(20);

            dll.displayforward();
            dll.displayback();

            dll.findMinMax();
        }
    }
