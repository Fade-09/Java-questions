//Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.

//evenlySpaced(2, 4, 6) → true
//evenlySpaced(4, 6, 2) → true
//evenlySpaced(4, 6, 3) → false
public boolean evenlySpaced(int a, int b, int c) {
  int x = 0, y = 0;
  boolean z;
 if((a <= b) && (a <= c)){
    if(b <= c){
        x = b - a;
        y = c - b;
    }
    else {
        x = c - a;
        y = b - c;
    }
  }
  else if((b <= a) && (b <= c)){
    if(a <= c){
        x = a - b;
        y = c - a;
    }
    else {
        x = c - b;
        y = a - c;
    }
  }
  else if((c <= a) && (c <= b)){
    if(a <= b){
        x = a - c;
        y = b - a;
    }
    else {
        x = b - c;
        y = a - b;
    }
  }
  z = (x == y);
  return z;
}
