#include <iostream>
#include <math.h>


using namespace std;

int main(){
	int n, a, x=0, min = 9999, max = 0;
	
	
	
	cin>>n;
	int nn = n;
	int arr[n+1];
	
	while(n != 0){
		cin>>a;
		arr[x] = a;
		
		if(a >= max)
			max = a;
			
		if(a <= min)
			min = a;
		
		
		x++;	
		n--;
	}
	
	int max_pos = 0, min_pos = 99999;
	
	// Find index of maxumium element from start
	for(int r = 0; r < x; r++){
		if(max == arr[r]){
			max_pos = r;
			break;
		}
		
	}
	// END
	
	// Find index of minumium element from end
	for(int r = x-1; r >=0; r--){
		if(min == arr[r]){
			min_pos = r;
			break;
		}
	}
	// END
	
	//cout<<max_pos<<" "<<min_pos<<endl;
	/*cout<<nn-max_pos<<" + "<<min_pos<<endl;*/
	
	int ans = max_pos + (nn - min_pos - 1);
	
	(max_pos >= min_pos) ? ans-- : ans=ans;
	cout<<ans;
	
	
}
