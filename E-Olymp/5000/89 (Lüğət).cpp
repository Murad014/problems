#include <iostream>
#include <math.h>
#include <stack>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    int n;
    vector<string> arr;
    string a;
    cin >> n;
    for(int i = 0; i < n; i++){
    	cin >> a;
    	arr.push_back(a);
	}
	sort(arr.begin(), arr.end());
	for(int r = 0; r < arr.size(); r++)
		cout<<arr[r]<<endl;
}
