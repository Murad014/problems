#include <iostream>
#include <math.h>
#include <map>
using namespace std;

int main(){
	int res = 0;
	string s, ch;
	map<string, int> arr;
	cin>>s;
	for(int i = 0; i < s.length(); i++){
		ch = s[i];
		arr[ch] = 1;		
	}
	res = arr.size();
	

	if(res % 2 == 0){
		cout<<"CHAT WITH HER!";
	}
	else{
		cout<<"IGNORE HIM!";
	}

}
