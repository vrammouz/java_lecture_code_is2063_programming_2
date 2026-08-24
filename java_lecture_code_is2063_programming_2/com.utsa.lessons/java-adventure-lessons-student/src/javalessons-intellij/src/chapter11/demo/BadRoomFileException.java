package chapter11.demo;

/**
 * CHAPTER 11  -  Gaddis 11.3 (writing your own exception classes)
 *
 * An exception is just a class. Extending Exception makes it throwable.
 */
public class BadRoomFileException extends Exception
{
   private static final long serialVersionUID = 1L;

   public BadRoomFileException(int lineNumber, String line)
   {
      super("Line " + lineNumber + " is not a valid room: [" + line + "]");
   }
}
