class MaxDepthofTree {
    public int maxDepth(TreeNode root) {
        if(root==null)return 1;

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