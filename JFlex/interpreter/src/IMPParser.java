/* The following code was generated by JFlex 1.7.0 */

import java.util.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>parser.flex</tt>
 */
class IMPParser {

  /**
   * This character denotes the end of file
   */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED =
          "\11\0\5\33\22\0\1\33\1\26\4\0\1\24\1\0\1\22\1\23" +
                  "\1\0\1\20\1\34\2\0\1\21\1\2\11\1\1\0\1\32\1\0" +
                  "\1\31\1\25\42\0\1\10\3\13\1\6\1\7\1\13\1\16\1\14" +
                  "\2\13\1\11\1\13\1\17\3\13\1\4\1\12\1\3\1\5\1\13" +
                  "\1\15\3\13\1\27\1\0\1\30\7\0\1\33\32\0\1\33\u15df\0" +
                  "\1\33\u097f\0\13\33\35\0\2\33\5\0\1\33\57\0\1\33\u0fa0\0" +
                  "\1\33\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\ud00f\0";

  /** 
   * Translates characters to character classes
   */
  private static final char[] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int[] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
          "\1\0\2\1\6\2\1\3\1\4\1\5\1\6\1\0" +
                  "\1\7\1\10\1\11\1\12\1\13\1\14\2\15\3\2" +
                  "\1\16\2\2\1\17\1\20\3\2\1\21\1\2\1\22" +
                  "\1\23\1\2\1\24";

  private static int[] zzUnpackAction() {
    int[] result = new int[39];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int[] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int[] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
          "\0\0\0\35\0\72\0\127\0\164\0\221\0\256\0\313" +
                  "\0\350\0\72\0\72\0\72\0\72\0\u0105\0\72\0\72" +
                  "\0\u0122\0\72\0\72\0\72\0\u013f\0\72\0\u015c\0\u0179" +
                  "\0\u0196\0\164\0\u01b3\0\u01d0\0\72\0\72\0\u01ed\0\u020a" +
                  "\0\u0227\0\164\0\u0244\0\164\0\164\0\u0261\0\164";

  private static int[] zzUnpackRowMap() {
    int[] result = new int[39];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int[] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int[] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
          "\1\0\1\2\1\3\1\4\2\5\1\6\1\7\4\5" +
                  "\1\10\1\11\2\5\1\12\1\13\1\14\1\15\1\16" +
                  "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26" +
                  "\1\0\2\2\72\0\1\5\1\27\13\5\20\0\15\5" +
                  "\20\0\6\5\1\30\6\5\20\0\5\5\1\31\7\5" +
                  "\20\0\4\5\1\32\7\5\1\33\20\0\13\5\1\34" +
                  "\1\5\41\0\1\35\40\0\1\36\37\0\1\25\4\0" +
                  "\2\5\1\37\12\5\20\0\7\5\1\40\5\5\20\0" +
                  "\6\5\1\41\6\5\20\0\1\42\14\5\20\0\11\5" +
                  "\1\43\3\5\20\0\3\5\1\44\11\5\20\0\3\5" +
                  "\1\45\11\5\20\0\7\5\1\37\5\5\20\0\6\5" +
                  "\1\46\6\5\20\0\3\5\1\47\11\5\15\0";

  private static int[] zzUnpackTrans() {
    int[] result = new int[638];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int[] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
          "Unknown internal scanner error",
          "Error: could not match input",
          "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int[] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
          "\1\0\1\1\1\11\6\1\4\11\1\0\2\11\1\1" +
                  "\3\11\1\1\1\11\6\1\2\11\11\1";

  private static int[] zzUnpackAttribute() {
    int[] result = new int[39];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int[] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
   the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
   from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */

  /**
   * Pair between a token and its line in the source file
   */
  private class TokenWithLine {
    String str;
    int line;

    public TokenWithLine(String str, int line) {
      this.str = str;
      this.line = line;
    }
  }

  private Stack<TokenWithLine> operatorStack;
  private Stack<ASTNode> nodesStack;
  public AST syntaxTree;

  /**
   * Detects the type of the block ((if)then block, else block, while block or standalone block)
   * and creates the right node into the nodes stack.
   */
  private void pushBlockNode(BlockNode block) {
    if (!operatorStack.empty() && operatorStack.peek().str.equals("else")) {
      // this was an else block
      // build the if node
      operatorStack.pop(); // pop else
      TokenWithLine token = operatorStack.pop(); // pop if
      nodesStack.push(block);
      nodesStack.push(ASTNode.buildNode(token.line, "if", nodesStack));
    } else if (!operatorStack.empty() && operatorStack.peek().str.equals("while")) {
      // this was a (while) do block
      // build the while node
      TokenWithLine token = operatorStack.pop(); // pop while
      nodesStack.push(block);
      nodesStack.push(ASTNode.buildNode(token.line, "while", nodesStack));
    } else {
      // simple block node
      nodesStack.push(block);
    }
  }

  /**
   * Creates a new operator node together with its line in the source file and pushes it
   * into the nodes stack.
   */
  private void makeOperatorNode() {
    TokenWithLine op = operatorStack.pop();
    nodesStack.push(ASTNode.buildNode(op.line, op.str, nodesStack));
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  IMPParser(java.io.Reader in) {
    operatorStack = new Stack<>();
    nodesStack = new Stack<>();
    syntaxTree = new AST();
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return the unpacked character translation table
   */
  private static char[] zzUnpackCMap(String packed) {
    char[] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 156) {
      int count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
              zzBuffer, 0,
              zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos - zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos -zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number) {
    if (number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
      // compress stmt nodes using Sequence Nodes
      while (nodesStack.size() > 1) {
        ASTNode top = nodesStack.pop();
        ASTNode top2 = nodesStack.pop();

        nodesStack.push(new SequenceNode(top2, top));
      }

      syntaxTree.root.setSon(0, nodesStack.peek());

    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return the next token
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;
    char[] zzCMapL = ZZ_CMAP;

    int[] zzTransL = ZZ_TRANS;
    int[] zzRowMapL = ZZ_ROWMAP;
    int[] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
          case '\u000B':  // fall through
          case '\u000C':  // fall through
          case '\u0085':  // fall through
          case '\u2028':  // fall through
          case '\u2029':
            yyline++;
            zzR = false;
            break;
          case '\r':
            yyline++;
            zzR = true;
            break;
          case '\n':
            if (zzR)
              zzR = false;
            else {
              yyline++;
            }
            break;
          default:
            zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ((zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          } else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          } else {
            // store back cached positions
            zzCurrentPos = zzCurrentPosL;
            zzMarkedPos = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL = zzCurrentPos;
            zzMarkedPosL = zzMarkedPos;
            zzBufferL = zzBuffer;
            zzEndReadL = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            } else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ((zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ((zzAttributes & 8) == 8) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return YYEOF;
      } else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: {
            nodesStack.push(new IntNode(yyline + 1, Integer.parseInt(yytext())));
          }
          // fall through
          case 21:
            break;
          case 2: {
            nodesStack.push(new VarNode(yyline + 1, yytext()));
          }
          // fall through
          case 22:
            break;
          case 3: {
            while (!operatorStack.empty() && (operatorStack.peek().str.equals("/") ||
                    operatorStack.peek().str.equals("+")))
              makeOperatorNode();

            operatorStack.push(new TokenWithLine("+", yyline + 1));
          }
          // fall through
          case 23:
            break;
          case 4: {
            while (!operatorStack.empty() && operatorStack.peek().str.equals("/"))
              makeOperatorNode();

            operatorStack.push(new TokenWithLine("/", yyline + 1));
          }
          // fall through
          case 24:
            break;
          case 5: {
            operatorStack.push(new TokenWithLine("(", yyline + 1));
          }
          // fall through
          case 25:
            break;
          case 6: {
            while (!operatorStack.empty() && !operatorStack.peek().str.equals("("))
              makeOperatorNode();

            operatorStack.pop(); // pop the opening bracket '('
            nodesStack.push(new BracketNode(nodesStack.pop()));
          }
          // fall through
          case 26:
            break;
          case 7: {
            while (!operatorStack.empty() && (operatorStack.peek().str.equals("+") ||
                    operatorStack.peek().str.equals("/")))
              makeOperatorNode();

            operatorStack.push(new TokenWithLine(">", yyline + 1));
          }
          // fall through
          case 27:
            break;
          case 8: {
            while (!operatorStack.empty() && operatorStack.peek().str.equals(">"))
              makeOperatorNode();

            operatorStack.push(new TokenWithLine("!", yyline + 1));
          }
          // fall through
          case 28:
            break;
          case 9: {
            operatorStack.push(new TokenWithLine("{", yyline + 1));
            nodesStack.push(new BlockBegin()); // mark the beginning of a block
          }
          // fall through
          case 29:
            break;
          case 10: {
            while (!operatorStack.empty() && !operatorStack.peek().str.equals("{"))
              makeOperatorNode();

            operatorStack.pop(); // delete '{' from the stack
            ASTNode blockContent = nodesStack.pop();

            // compress stmt nodes using Sequence Nodes
            while (!(nodesStack.peek() instanceof BlockBegin)) {
              ASTNode top = nodesStack.pop();
              blockContent = new SequenceNode(top, blockContent);
            }
            nodesStack.pop(); // pop the BlockBegin node

            pushBlockNode(new BlockNode(blockContent));
          }
          // fall through
          case 30:
            break;
          case 11: {
            operatorStack.push(new TokenWithLine("=", yyline + 1));
          }
          // fall through
          case 31:
            break;
          case 12: { // the end of the variables list or of an assignment
            while (!operatorStack.empty() && !operatorStack.peek().str.equals("int") &&
                    !operatorStack.peek().str.equals("="))
              makeOperatorNode();

            TokenWithLine op = operatorStack.pop();
            if (op.str.equals("int")) {
              // insert the variables list into the main node
              syntaxTree.root = new MainNode();

              while (!nodesStack.empty())
                syntaxTree.root.declareVar(((VarNode) nodesStack.pop()).name);
            } else { // ';'
              // create the assignment node
              ASTNode assignmentNode = ASTNode.buildNode(op.line, "=", nodesStack);
              nodesStack.push(assignmentNode);
            }
          }
          // fall through
          case 32:
            break;
          case 13: {
          }
          // fall through
          case 33:
            break;
          case 14: {
            operatorStack.push(new TokenWithLine("if", yyline + 1));
          }
          // fall through
          case 34:
            break;
          case 15: {
            while (!operatorStack.empty() && (operatorStack.peek().str.equals("!") ||
                    operatorStack.peek().str.equals("&&") ||
                    operatorStack.peek().str.equals(">")))
              makeOperatorNode();

            operatorStack.push(new TokenWithLine("&&", yyline + 1));
          }
          // fall through
          case 35:
            break;
          case 16: {
            pushBlockNode(new BlockNode()); // create an empty block node
          }
          // fall through
          case 36:
            break;
          case 17: { // the beginning of the variables list
            operatorStack.push(new TokenWithLine("int", yyline + 1));
          }
          // fall through
          case 37:
            break;
          case 18: {
            nodesStack.push(new BoolNode(yyline + 1, Boolean.parseBoolean(yytext())));
          }
          // fall through
          case 38:
            break;
          case 19: {
            operatorStack.push(new TokenWithLine("else", yyline + 1));
          }
          // fall through
          case 39:
            break;
          case 20: {
            operatorStack.push(new TokenWithLine("while", yyline + 1));
          }
          // fall through
          case 40: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
