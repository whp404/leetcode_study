package sort;

/**
 * 堆排序
 * 堆是一个完全二叉树；
 * 堆中每一个节点的值都必须大于等于（或小于等于）其子树中每个节点的值
 */
public class Heapsort {


    /**
     * 堆排序分为建立堆 和 排序两个步骤
     * 建堆 需要 O(n)
     * 排序需要 O(nlogn)
     * 总体 O(nlogn)
     */
    class Heap {
        private int[] a; //数组从下标1开始
        private int n;//容量
        private int count;//堆中已存储数据个数

        public Heap(int capacity) {
            a = new int[capacity + 1];
            n = capacity;
            count = 0;
        }

        /**
         * 建立堆有两种想法，一种是从上往下，一种从下往上
         * 由下往上堆化
         * @param data
         */
        public void buildHeapBottoom(int data) {
            if (count >= n) {
                return;
            }
            ++count;
            a[count] = data;
            int i = count;
            while (i / 2 > 0 && a[i] > a[i / 2]) {
                swap(a,i,i/2);
                i= i/2;
            }
        }



        public void buildHeapTop(int data){
            for (int i = n/2; i >= 1; --i) {
                heapify(a, n, i);
            }
        }


        /**
         * 本质是从上往下 堆化
         */
        public void removeMax(){
            if(count == 0){
                return;
            }
            a[1] = a[count];
            count--;
            //从下往上堆化
            heapify(a,count,1);
        }

        private void heapify(int[] a, int count, int i) {
            //不停的从上往下交换
            while (true){
                int maxPos = i;
                if(a[2*i]>a[i] && 2*i<=n){
                    maxPos = 2*i;
                }
                if(a[2*i+1]>a[maxPos] && 2*i+1<=n){
                    maxPos = 2*i+1;
                }
                if(maxPos == i){
                    break;
                }
                swap(a,i,maxPos);
            }
        }


        private void swap(int[] a, int i, int j) {
            int tmp = a[j];
            a[j] = a[i];
            a[i] = tmp;

        }



    }
}