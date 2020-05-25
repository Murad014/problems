#include <iostream>
#include <math.h>
#include <stack>
#include <vector>
#include <algorithm>
#include <iomanip>
using namespace std;

int main(){
    int n; 
	double p, sums = 0, res;
    
	cin>>n;
    for(int i = 0; i < n; i++){
    	cin>>p;
    	sums += p / 100;
	}
	res = (sums / n) * 100;
	cout<<fixed<<setprecision(12)<<res;
}
