#include <iostream>
#include <math.h>
#include <stack>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    int n, a, b;
    vector<int> arr;
    cin>>n;
    for(int i = 0; i < n; i++){
    	cin>>a;
    	if(a == 3 || a == 4){
    		if(!arr.empty()){
    			if(a == 3){
    				cout<<arr[0]<<endl;
    				arr.erase(arr.begin());
				}else{
					cout<<arr[arr.size() - 1]<<endl;
					arr.pop_back();
				}	   			
			}
    		
		}
		if(a == 1){
			cin>>b;
			arr.insert(arr.begin()+0, b);			
		}
		else if (a == 2){
			cin>>b;
			arr.push_back(b);
		}
	}
}
