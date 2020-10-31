/*
  Try this 2-1 Extra Challenge

  Compute the distance to the wall by echo.

  Sound travels at approx. 1,100 fps
*/

class Sound_ExtraChallenge {
  public static void main(String args[]) {
    double total_dist, dist_to_wall, timed_echo, speed_of_sound;
    
    speed_of_sound = 1100;
    timed_echo = 2.2;
    
    total_dist = speed_of_sound * timed_echo;
    
    dist_to_wall = total_dist / 2;

    System.out.println("The wall is " + dist_to_wall + " feet away.");
  }
}
