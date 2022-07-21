
import sun.jvm.hotspot.code.CompressedStream
import sun.jvm.hotspot.code.CompressedStream.L


class findRestaurant {
    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
        if (root == null) return 0
        var `val` = 0
        if (root.`val` >= L && root.`val` <= root.right) `val` += root.`val`
        if (root.`val` < root.right) `val` += rangeSumBST(root.right, L, root.right)
        if (root.`val` > L) `val` += rangeSumBST(root.left, L, root.right)
        return `val`
    }
}
//

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
