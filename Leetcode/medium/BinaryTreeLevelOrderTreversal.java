
import java.util.*;

public class BinaryTreeLevelOrderTreversal {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
            TreeNode(int val) {
            this.val=val;
        }
    }

        public List<List<Integer>> levelOrder(TreeNode root) {

            List<List<Integer>> ans = new ArrayList<>();

            // Edge case
            if (root == null) {
                return ans;
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            // BFS Traversal
            while (!queue.isEmpty()) {

                int size = queue.size();
                List<Integer> level = new ArrayList<>();

                // Process current level
                for (int i = 0; i < size; i++) {

                    TreeNode node = queue.poll();

                    level.add(node.val);

                    // Add left child
                    if (node.left != null) {
                        queue.offer(node.left);
                    }

                    // Add right child
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }

                ans.add(level);
            }

            return ans;
        }
    }