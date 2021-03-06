package pixLab;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("images//beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("images//beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  
  public static void testZeroRed()
  {
    Picture beach = new Picture("images//sunset.jpg");
    beach.explore();
    beach.zeroRed();
    beach.explore();
  }
  
  public static void testNegate()
  {
    Picture beach = new Picture("images//beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  
  public static void testGrayscale()
  {
    Picture beach = new Picture("images//beach.jpg");
    beach.explore();
    beach.grayScale();
    beach.explore();
  }
  
  public static void testFixUnderwater()
  {
    Picture beach = new Picture("images//water.jpg");
    beach.explore();
    beach.fixUnderwater();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("images//caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("images//caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  public static void testMirrorHorizontal()
  {
    Picture moto = new Picture("images//redMotorcycle.jpg");
    moto.explore();
    moto.mirrorHorizontal();
    moto.explore();
  }
  public static void testMirrorHorizontalBotToTop()
  {
    Picture moto = new Picture("images//redMotorcycle.jpg");
    moto.explore();
    moto.mirrorHorizontalBotToTop();
    moto.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("images//temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture temple = new Picture("images//snowman.jpg");
    temple.explore();
    temple.mirrorArms();
    temple.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture temple = new Picture("images//seagull.jpg");
    temple.explore();
    temple.mirrorGull();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("images//640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testCollage2()
  {
    Picture canvas = new Picture("images//640x480.jpg");
    canvas.createCollage2();
    canvas.explore();
  }
  
  public static void testMyCollage() {
	  Picture canvas = new Picture("images//640x480.jpg");
	  canvas.createCollage2();
	  canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("images//moon-surface.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
	//testZeroRed();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
	//testCollage2();
	//testMyCollage();
    //testCopy();
    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}