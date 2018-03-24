# Data Structure - Java Implementation

🔧环境和工具
------
  1. install Java & Maven for your OS  
  2. Idea or Eclipse

⚡️每个算法都附带相应的测试用例，部分地方加上了利用大量生成的随机数进行的性能实际测试。
# 📖 目录
------
* 线形
  1. 字符串 [字符串压缩](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/array/CompressStr.java) [矩阵](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/array/SetZeroMatrix.java) [String的秘密](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/string/StringEqual.java)
  2. 链表 [删除重复元素](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/linkedlist/DeleteDups.java) [链表排序](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/linkedlist/SortWithValue.java) [链表环儿](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/linkedlist/LinkedListLoop.java) [链表环儿测试](https://github.com/razertory/datastructure/blob/master/src/test/java/org/razertory/datastructure/linkedlist/LinkedListLoopTest.java)
  3. 查找 [二分查找](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/search/BinarySearch.java) [二分查找测试](https://github.com/razertory/datastructure/blob/master/src/test/java/org/razertory/datastructure/search/BinarySearchTest.java)
  4. 排序 [冒泡排序](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/sort/BubbleSort.java) [归并排序](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/sort/MergeSort.java) [快速排序](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/sort/QuickSort.java) [选择排序](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/sort/SelectionSort.java) [插入排序](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/sort/InsertSort.java) [插入优化排序](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/sort/InsertOptimizeSort.java) [排序全测试](https://github.com/razertory/datastructure/blob/master/src/test/java/org/razertory/datastructure/sort/SortTest.java)
  5. 栈 [栈的实现](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/stack/Stack.java) [记录存储容量和索引的栈](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/stack/StackCapacity.java) [能获取最小值的栈](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/stack/StackWithMin.java) [汉诺塔](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/stack/Hannotower.java) [栈全测试](https://github.com/razertory/datastructure/blob/master/src/test/java/org/razertory/datastructure/stack/StackTest.java)
  6. 队列 [队列实现](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/queue/Queue.java) [两栈实现队列](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/queue/QueueWith2Stack.java) [队列全测试](https://github.com/razertory/datastructure/blob/master/src/test/java/org/razertory/datastructure/queue/QueueTest.java)
* 树形
  1. 树 [树的前序，中序，后续遍历搜索](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/tree/TreeSearch.java) [遍历搜索测试](https://github.com/razertory/datastructure/blob/master/src/test/java/org/razertory/datastructure/tree/TreeSearchTest.java) [二叉树判断](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/tree/BinarySearchTree.java) [二叉树判断测试](https://github.com/razertory/datastructure/blob/master/src/test/java/org/razertory/datastructure/tree/BinarySearchTreeTest.java)  [平衡树判断](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/tree/CheckBalanceTree.java) [平衡树判断测试](https://github.com/razertory/datastructure/blob/master/src/test/java/org/razertory/datastructure/tree/CheckBalanceTreeTest.java) [查找两节点共同祖先](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/tree/CommonAncestorSearch.java) [共同祖先测试](https://github.com/razertory/datastructure/blob/master/src/test/java/org/razertory/datastructure/tree/CommonAncestorSearchTest.java) [数组变二叉查找树](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/tree/MinBinaryTree.java)
* 图
  1. 两种基本搜索:[图的广度优先和深度优先搜索](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/graph/GraphSearch.java) [广度优先和深度优先搜索测试](https://github.com/razertory/datastructure/blob/master/src/test/java/org/razertory/datastructure/graph/GraphSearchTest.java)
  2. 图的路径:[有向图路径判断](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/graph/DirectedGraphPathCheck.java) [有向图路径判断测试](https://github.com/razertory/datastructure/blob/master/src/test/java/org/razertory/datastructure/graph/DirectedGraphPathCheckTest.java)
* 并行程序设计
  1. 多线程基础 [线程实现之继承Thread](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/thread/ExtendThread.java) [线程实现之实现Runnable](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/thread/RunableThread.java)
  2. 多线程应用 [实现锁的ATM取款与存款](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/thread/LockedATM.java) [哲学家就餐问题之会死锁的哲学家](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/thread/PhilosopherLocked.java) [死锁哲学家测试](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/thread/PhilosopherLockedEat.java)  [哲学家就餐问题之不会死锁的哲学家](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/thread/PhilosopherUnLocked.java) [不死锁哲学家测试](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/thread/PhilosopherUnLockedEat.java) [同步对象](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/thread/SynchronizedObject.java) [同步线程](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/thread/SynchronizedThread.java) [Lock Condition转账](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/thread/lockcondition/SynchBankTest.java) [synchronized wait转账](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/thread/usesynchronized/SynchBankTest2.java) [线程池](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/thread/threadpool/ThreadPoolTest.java)
  3. IO [BIO服务端](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/io/bio/TimeServer.java) [BIO客户端](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/io/bio/TimeClient.java) [伪NIO服务端](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/io/fakenio/TimeServer.java) [NIO服务端](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/io/nio/TimeServer.java) [NIO客户端](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/io/nio/TimeClient.java) [AIO服务端](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/io/aio/TimeServer.java) [AIO客户端](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/io/aio/TimeClient.java)
  4. Netty [Netty粘包拆包服务端](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/io/netty/tcpacketsplicing/TimeServer.java) [Netty粘包拆包客户端](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/io/netty/tcpacketsplicing/TimeClient.java) [Netty序列化服务端](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/io/netty/serializable/SubReqServer.java) [Netty序列化客户端](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/io/netty/serializable/SubReqClient.java)
* 设计模式
  1. [五种单例模式](https://github.com/razertory/datastructure/blob/master/src/main/java/org/razertory/datastructure/designPatterns/singleton/Singleton.java)
