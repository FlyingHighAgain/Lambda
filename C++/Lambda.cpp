// Lambda.cpp

#include <iostream>

using namespace std;

int main()
{
    cout <<  ( [] (int x) { return x + 2; } )(3)  << endl;
}

