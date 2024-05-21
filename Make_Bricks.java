/*We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks


makeBricks(3, 1, 8) → true
makeBricks(3, 1, 9) → false
makeBricks(3, 2, 10) → true*/

public boolean makeBricks(int small, int big, int goal) {
  int a = goal / 5;
  int b = goal % 5;
  if(a < big){
    int y = small - b;
    if(y >= 0){
      return true;
    }
    else {
      return false;
    }
  }
  else {
    int x = (a - big) * 5 + b;
    int y = small - x;
    if(y >= 0){
      return true;
    }
    else {
      return false;
    }
  }
}
