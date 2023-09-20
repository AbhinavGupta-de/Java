#include <bits/stdc++.h>

// We use this to write java code into c++ to just check the TLE 

using namespace std;

int main() {
 int n; cin >> n;
 vector<int> v;
 for (int i = 0; i < n; i++) {
  int x; cin >> x;
  v.push_back(x);
 }
 sort(v.begin(), v.end());
 vector<int> prefixSum;
 prefixSum.push_back(v[0]);
 for (int i = 1; i < n; i++) {
  prefixSum.push_back(prefixSum[i - 1] + v[i]);
 }
 

}