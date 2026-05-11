import java.util.LinkedList;
import java.util.Queue;

class MaxDepthofTree {

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val=val;
        }
    }
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int dep=0;
        while(!q.isEmpty()){
            int size=q.size();

            for(int i=0; i<size; i++){
                TreeNode temp = q.poll();

                if(temp.left!=null)q.offer(temp.left);
                if(temp.right!=null)q.offer(temp.right);
            }
            dep++;
        }
        return dep;
    }
}