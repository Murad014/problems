#include<bits/stdc++.h>
using namespace std;


int main(){
	long long n;
	cin>>n;
	while(n % 2 == 0){
		cout<<2<<endl;
		n /= 2;
	}
	
	for(long long j=3; j < sqrt(n) + 1; j++){
		while(n % j == 0){
			cout<<j<<endl;
			n /= j;
		}
	}
	if(n > 1)
		cout<<n;
}
