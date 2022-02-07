/*
Two friends Anna and Brian, are deciding how to split the bill at a dinner. 
Each will only pay for the items they consume. Brian gets the check and calculates Anna's portion.
 You must determine if his calculation is correct.
*/
#include<iostream>
#include <bits/stdc++.h>

using namespace std;

void bonAppetit(vector<int> bill, int k, int b) {
    int sub = bill[k];
    int sum =0;
    bill.erase(bill.begin() + k);
    for(int i =0; i<bill.size(); i++)
    {
        sum += bill[i];
    }
    sum = sum / 2;
    if(b == sum)
        cout << "Bon Appetit" << endl;
    else {
        cout << b - sum << endl;
    }
}
