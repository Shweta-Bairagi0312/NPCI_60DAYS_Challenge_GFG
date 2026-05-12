// import java.util.PriorityQueue;
// import java.util.Comparator;

// public class PQ{
//     public static void main(String[] args){
//         static class Student implements Comparable<Student>{
//             String name;
//             int rank;

//             public Student(String name, int rank){
//                 this.name = name;
//                 this.rank = rank;
//             }
//            @Override
//             public int compareTo(Student s2){
//                 return this.rank-s2.rank;
//             }
//         }
//     // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//     // pq.add(3); //O(logn)
//     // pq.add(4);
//     // pq.add(1);
//     // pq.add(7);

//     // while(!pq.isEmpty()){
//     //     System.out.println(pq.peek());// O(1)
//     //     pq.remove(); //O(logn)
      
//     // }

//     PriorityQueue<Student> pq = new PriorityQueue<>();
//     pq.add(new Student(name:"A",rank : 4)); //O(logn)
//     pq.add(new Student(name:"B",rank : 5));
//     pq.add(new Student(name:"C",rank : 2));
//     pq.add(new Student(name:"D",rank : 12));

//     while(!pq.isEmpty()){
//         System.out.println(pq.peek().name+" -> "+pq.peek().rank);// O(1)
//         pq.remove(); //O(logn)

      
//     }
//   }

// }


import java.util.PriorityQueue;

public class PQ {

    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank; // min-heap based on rank
        }
    }

    public static void main(String[] args) {

        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));

        while (!pq.isEmpty()) {
            Student s = pq.peek();
            System.out.println(s.name  + " -> " + s.rank);
            pq.remove();
        }
    }
}
