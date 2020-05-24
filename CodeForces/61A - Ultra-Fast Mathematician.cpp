#include <iostream>
#include <math.h>
#include <stack>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    string a, b, m1, m2;
    cin>>a>>b;
    for(int i = 0; i < a.length(); i++){
    	m1 = a[i];
    	m2 = b[i];
		if(m1 == m2){
    		cout<<0;
		}
		else{
			cout<<1;
		}
	}
}
