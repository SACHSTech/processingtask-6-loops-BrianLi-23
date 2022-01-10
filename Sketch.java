import processing.core.PApplet;

public class Sketch extends PApplet {

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    // put your size call here
    size(600, 600);
  }

  /**
   * Called once at the beginning of execution. Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // Quadrant 1

    // Using for loop to draw a vertical line after every 30 units (to draw 10 lines
    // in quadrant 1)
    stroke(0, 0, 0);
    strokeWeight(2);
    for (int intLineX = 0; intLineX < width / 2; intLineX += width / 20) {
      line(intLineX, 0, intLineX, width / 2);
    }

    // Using for loop to draw horozontial line after every 30 units (to draw 10 in
    // lines in quadrant 1)
    for (int intLineY = 0; intLineY < height / 2; intLineY += height / 20) {
      line(0, intLineY, height / 2, intLineY);
    }

    // Quadrant 2

    // Using a nested for loop to draw a grid of circles (5 x 5)
    stroke(0, 0, 0);
    fill(212, 15, 125);
    for (int intCircleX = ((width / 2) + (width / 15)); intCircleX < width; intCircleX += (width / 11.5)) {
      for (int intCircleY = (height / 15); intCircleY < height / 2; intCircleY += height / 11.5)
        circle(intCircleX, intCircleY, 30);
    }

    // Quadrant 3

    // Using a for loop to draw lines with gradually increasing RGB colour (making
    // it lighter)
    int intR = -35;
    int intG = -35;
    int intB = -35;
    for (int intGreyScale = 0; intGreyScale < width / 2; intGreyScale++) {
      stroke(intR, intG, intB);
      line(intGreyScale, height / 2, intGreyScale, height);
      intR++;
      intG++;
      intB++;
    }

    // Quadrant 4

    // Using for loop to draw the 8 petals for the flower, iterating through the
    // rotation angles
    for (int intAngle = 0; intAngle < 360; intAngle += 45) {
      stroke(0, 0, 0);
      strokeWeight(1);
      fill(220, 93, 52);

      pushMatrix();
      translate(width * 3 / 4, height * 3 / 4);
      rotate(radians(intAngle));
      ellipse(0, 0, width / 20, height / 3);
      popMatrix();

    }

    // Draw intial circle in the middle
    noStroke();
    fill(38, 108, 45);
    circle(width * 3 / 4, height * 3 / 4, 55);

  }
}
