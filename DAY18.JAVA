class BST{
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;

        }
    }

    public static Node insert(Node root,int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            root.left = insert(root.left,val);
        }
        else{
            root.right = insert(root.right,val);

        }
        return root;
    }

    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left,key);
        }
        else{
            return search(root.right,key);

        }
    }
    public static void Inorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+"");
        Inorder(root.right);

    }

    public static Node delete(Node root, int val){
        if(root.data<val){
            root.right = delete(root.right,val);
        }
        else if(root.data>val){
            root.left = delete(root.left,val);
        }
        else{
            // case1 
            if(root.left==null && root.right==null){
                return null;
            }
            if(root.right==null){
                return root.left;
            }
            else if(root.left==null){
                return root.right;
            }
            // case 3
            Node INS = findInorderSucessor(root.right);
            root.data = INS.data;
            root.right = delete(root.right,IS.data);

             
        }
        return root;

        public static void printInRange(Node root, int k1, int k2){
            if(root==null){
                return;
            }
            if(root.data>=k1 && root.data<=k2){
                printInRange(root.left,k1,k2);
                System.out.println(root.data+" ");
                printInRange(root.right,k1,k2);

            }
            else if(root.data<k1){
                printInRange(root.left,k1,k2);

            }
            else{
                 printInRange(root.right,k1,k2);
            }
        }
    }
    public static Node findInorderSucessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void main(String[]args){
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i = 0; i<values.length; i++){
            root = insert(root,values[i]);
        }

        Inorder(root); 
        System.out.println();


        if(search(root,1)){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }


        root = delete(root,1);
        System.out.println();

        Inorder(root); 
        System.out.println();


    }
}
