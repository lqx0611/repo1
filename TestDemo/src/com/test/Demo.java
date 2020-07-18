package com.test;
/***
 * 
* 1.ʵ���·��ĳ齱����(luckdraw)���ṩ5000�γ齱���ᣬ��Ʒ��һ�Ƚ�3�������Ƚ� 100�������Ƚ�50������Ʒ����5000�γ齱�о���ƽ���ֲ����������й��ɱ�����
* 2.ʵ���·������ֲ��ҷ������������ĵ����ֺ���С���֣��ó����ǵĳ˻�
* 
 */
public class Demo {
	
	public void sayHello() {
		System.out.println("Hello world!");
	}

	
	public static boolean checkErqual(Integer num) {
		return num==100;
	}

	public final static int FIRST_PRIZE = 3;    //一等奖数量
	public final static int SECOND_PRIZE = 100; //二等奖数量
	public final static int THIRD_PRIZE = 50;   //三等奖数量
	public void luckDraw() {
		// do something
		int count_1 = 0;  	//中一等奖的次数
		int count_2 = 0;	//中二等奖的次数
		int count_3 = 0;	//中三等奖的次数
		int count = 0 ;		//抽奖的次数
		int miss = 0;       //谢谢惠顾的次数
		int t = 0 ;         //保存每次抽奖的号码
		while (count<5000){
			count++;  //抽奖次数 +1
			t = (int) (Math.random() * 5000);
			if(t>=0&&t<3){      						// 一等奖范围
				if(count_1<FIRST_PRIZE){
					System.out.println("恭喜 "+count+" 获得一等奖");
					count_1++;  						//中一奖次数 + 1
				}else {        							//一等奖抽完
					miss++;     						// 谢谢惠顾次数 + 1
				}
			}else if(t>2&&t<103){						//二等奖范围
				if(count_2<SECOND_PRIZE){
					System.out.println("恭喜 "+count+" 获得二等奖");
					count_2++;							//中二等奖次数 + 1
				}else {        							//二等奖抽完
					miss++;     						// 谢谢惠顾次数 + 1
				}
			}else if(t>102&&t<153){  	   				//三等奖范围
				if(count_3<THIRD_PRIZE){
					System.out.println("恭喜 "+count+" 获得三等奖");
					count_3++;							//中三等奖次数 + 1
				}else {        							//三等奖抽完
					miss++;     						// 谢谢惠顾次数 + 1
				}
			}else {
				miss++;									//谢谢惠顾 + 1
			}
		}
		System.out.println("一等奖中奖次数:"+count_1);
		System.out.println("二等奖中奖次数:"+count_2);
		System.out.println("三等奖中奖次数:"+count_3);
		System.out.println("谢谢惠顾次数:"+miss);

	}
	
	public void findNumber() {
		String[] array={"15","5","33","7","8","27","5","80","3","6","25","5"};
		//do
		int[] arrInt = stringToIntArr(array);
		arrInt = quickSort(arrInt,0,arrInt.length-1);
		System.out.println("最小值:"+arrInt[0]);
		System.out.println("最大值:"+arrInt[arrInt.length-1]);
		System.out.println("乘积: " + arrInt[0]*arrInt[arrInt.length-1]);
		// do something
//		int len = array.length;
//		String min = array[0];
//		String max = array[0];
//		for(int i = 0; i< len-1;i++){
//			if(Integer.parseInt(array[i+1])>Integer.parseInt(max)){
//				max = array[i+1];
//			}
//			if(Integer.parseInt(array[i+1])<Integer.parseInt(min)){
//				min = array[i+1];
//			}
//		}
//		System.out.println("最终结果:");
//		System.out.println("最大数:"+max+"，最小数:"+min);
//		System.out.println("乘积 :" +Integer.parseInt(max)*Integer.parseInt(min));
	}
	//String 数组转换成 int 数组
	public static int[] stringToIntArr(String[] arr){
		int[] result = new int[arr.length];
		for (int i = 0; i<arr.length;i++){
			result[i] = Integer.parseInt(arr[i]);
		}
		return result;
	}
	//快速排序法
	public static int[] quickSort(int[] arr,int L ,int R){
		if( L<R ){
			int BASE = arr[L];
			int iL = L;
			int iR = R;
			while( iL<iR ){   				//iL<iR 是控制指针不重合时一直重复排序。
				while(iL<iR){
					if( arr[iR]<BASE ){ 	//当args[iR]<BASE，arr[iR]放到arr[iL]
						arr[iL] = arr[iR];
						break;
					}
					iR--;
				}
				while(iL<iR){
					if( arr[iL]>BASE ){ 	//当args[iL]>BASE，arr[iL]放到arr[iR]
						arr[iR] = arr[iL];
						break;
					}
					iL++;
				}
			}
			arr[iL]=BASE;		//把基准值放在相遇的位置
			quickSort(arr,L,iL-1); //左边子集再排
			quickSort(arr,iL+1,R);	//右边子集再排
		}
		return arr;
	}
	public static void main(String[] args){
		Demo demo = new Demo();
		demo.findNumber();
		//demo.luckDraw();
	}
	
}
