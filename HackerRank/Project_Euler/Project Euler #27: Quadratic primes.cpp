#include <iostream>
#include <math.h>

using namespace std;

bool is_prime(int n){
	n = abs(n);
	
	if(n == 0 || n == 1)
		return false;
	
	for(int i = 2; i <= sqrt(n); i++){
		if(n % i == 0)
			return false;
	}
	
	return true;
}


int main(){
	
	int N, n, a, b, aa, bb, max = 0;
	
	cin>>N;
	
	OUTER: for(b = N; b >= -N; b--){ // This is for b
		
		if(is_prime(b)){
			
			MIDDLE: for(a = N; a >= -N; a--){ // This is for a
				// Computing zone
				int calc, count = 0;
				
				INNER: for(n = 0; n <= N; n++){
					calc = n * n + a * n + b;
					
					if(is_prime(calc) and calc > 0){
						count++;
					}
					else{
						count = 0;
						break;
					}
					
					
					if(count >= max){
						max = count;
						aa = a;
						bb = b;
					}
				}
	
			}
			
		
		}
		
	}
	cout<<aa<<" "<<bb;
	
}
