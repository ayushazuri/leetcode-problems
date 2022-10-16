/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> listInner;
        
        if(root == null)
            return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(queue.size() > 0) {
            int size = queue.size();
            listInner = new ArrayList<>();
            while(size-- != 0){
                TreeNode node = queue.poll();
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
                listInner.add(node.val);
            }
            list.add(listInner);
        }
        return list;
    }
    
//     public void levelOrderHelper(List<List<Integer>> res, TreeNode root, int level) {
//         if(root == null) return;
//         List<Integer> curr;
        
//         if(res.get( ) == null){
//             curr = new ArrayList<>();
//             curr.add(root.val);
//             res.add(curr);
//         }else{
//             curr = res.get(level);
//             curr.add(root.val);
//         }
        
//         levelOrderHelper(res, root.left, level + 1);
//         levelOrderHelper(res, root.right, level + 1);
//     }
}