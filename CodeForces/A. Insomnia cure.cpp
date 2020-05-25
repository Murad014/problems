#include <iostream>
#include <math.h>
#include <stack>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    int k, l, m, n, d;
    cin>>k>>l>>m>>n>>d;
    int arr[d] = {};
    for(int i = 0; i < d; i++)
    	arr[i] = i;    	
    	
	for(int i = k; i <= d; i += k)
		arr[i] = -1;

	for(int i = l; i <= d; i += l)
		arr[i] = -1;
		
	for(int i = m; i <= d; i += m)
		arr[i] = -1;
	
	for(int i = n; i <= d; i += n)
		arr[i] = -1;
		
	int res = 0;
	for(int r = 0; r <= d; r++){
		if(arr[r] == -1)
			res++;
	}
	if(res == 0){
		cout<<0;
	}else{
		cout<<res;
	}
}
