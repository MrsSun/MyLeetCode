package MySort;

/**
 * Created by chaoge on 2017/6/2.
 */
public class MySort {

    public int[] insertSort(int[] a){
        int length = a.length;

        for(int i = 1; i < length; i++){
            int j = i-1;
            int val = a[i];
            while(j >= 0 && a[j] > val){
                a[j+1] = a[j];
                --j;
            }
            a[j+1] = val;
        }
        return a;
    }
    public int[] bubblingSort(int[] a){
      int length = a.length;
      int val;
      for(int i = 0; i < length; i++){
          for(int j = i; j > 0; j--){
              if(a[j] < a[j-1]){
                  val = a[j];
                  a[j] = a[j-1];
                  a[j-1] = val;
              }
              else
                  break;
          }
      }
        return a;
    }

/*
 *   快速排序
*/
//    public int[] fastSort(int[] a){
//        int low = 0,high = a.length-1;
//        sort(a,low,high);
//
//        return a;
//    }
//
//    private int[] sort(int[] a, int low, int high) {
//      int key = a[low];
//      int left = low, right = high;
//
//      while (left < right){
//          while (left < right && a[right] >= key)
//              --right;
//          if(a[right] < key){
//              a[left] = a[right];
//              a[right] = key;
//          }
//          while (left < right && a[left] <= key)
//              ++left;
//          if(a[left] > key){
//              a[right] = a[left];
//              a[left] = key;
//          }
//      }
//
//      if(left > low) sort(a,low,left-1);
//      if(right < high) sort(a,right+1,high);
//
//        return a;
//    }

    /*
    堆排序
     */
    public int[] HeapSort(int[] a){
        //建立大顶堆
        buildBigStack(a,0,a.length-1);
        int length = a.length;
        //将堆顶的元素与堆尾的元素交换
        swap(a,0,length-1);
        //开始递归调整大顶堆，最终形成一个有序的小顶堆，即排好序
        sort02(a,0,length-2);
        return a;
    }

    private void HeapAdjust(int[] a, int start, int end) {
        while (2*start+1 <= end){//循环终止条件，即当元素没有子节点的时候终止
            int biggerIndex = 2*start+1;//用来记录子节点中值较大的子节点的索引
            //如果存在子节点，且左儿子的值比右儿子小，修改索引值
            if(2*start+2 <= end && a[2*start+1] < a[2*start+2]){
                biggerIndex = 2*start + 2;
            }
            //如果父节点的值小于子节点的值
            if(a[start] < a[biggerIndex]){
                //交换父子节点
                swap(a,start,biggerIndex);
                //并且保存子节点的索引值
                start = biggerIndex;
            }
            //如果父节点的值大于子节点的值，就直接跳出循环即可，因为调整的堆已排好序了
            else
                break;
        }

    }
   //递归调整
    private void sort02(int[] a, int start, int end) {
        //调整元素
        HeapAdjust(a,start,end);
        //交换堆顶和堆尾的元素
        swap(a,0,end);
        if(end > 1)//如果仅剩一个元素，不再进行比较
            sort02(a,0,end-1);
    }
    //用来交换元素
    public void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public int[] buildBigStack(int[] a, int start, int end) {
        //最后一个有子节点的父节点
        int lastFatherIndex = (end - 1)/2;
        //从最后一个拥有儿子的父节点开始建立
        for(int i = lastFatherIndex; i >= start ; i--){
            HeapAdjust(a,i,end);
        }
        return a;
    }

/*
   fastSort
 */

  public int[] fastSort(int[] a){
      sort(a,0,a.length-1);
      return a;
  }
  public void sort(int[] a,int start, int end){
      int left = start, right = end;
      int key = a[left];
      while (left < right){
          while(left < right && a[right] >= key)
              right--;
          if(a[right] < key){
             a[left] = a[right];
             a[right] = key;
          }
          while (left < right && a[left] <= key)
              left++;
          if(a[left] >  key){
              a[right] = a[left];
              a[left] = key;
          }
      }
      if(left > start) sort(a,start,left-1);
      if(right < end)  sort(a,right+1,end);
  }

  /*
   归并排序
   */

 public int[] mergingSort (int[] a){
     //定义一个用于存放最后结果的数组
     int[]temp = new int[a.length];
     //递归分组，注意end是length-1
     merging(a,0,a.length-1,temp);
     return temp;
 }
 public void merging(int[]a,int start,int end,int[] temp){
     //如果起点和终点不相同，即子序列包含一个以上的元素
     if(start < end){
         int mid = (start+end)/2;
         merging(a,start,mid,temp);
         merging(a,mid+1,end,temp);
         group(a,start,mid,end,temp);//合并
     }
 }
 public int[] group(int[]a, int start,int mid, int end, int[] temp){
     int i = start;
     int k = start;
     int j = mid + 1;
     while (i <= mid && j <= end){
          if(a[i] < a[j])
              temp[k++] = a[i++];
          else
              temp[k++] = a[j++];
     }
     while (i <= mid) {
         temp[k++] = a[i++];
     }
     while (j <= end){
         temp[k++] = a[j++];
     }
     //注意！！！每次合并完了以后需要将原始数组a，
     // 重调位置，变成刚合并成的有序序列。
     for(int w = start; w <= end;w++){
         a[w] = temp[w];
     }
     return temp;
 }

}














