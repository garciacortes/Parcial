
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Fri Mar 22 03:21:46 BRT 2024
//----------------------------------------------------

package ExemploCUP;

import java_cup.runtime.*;
import java.util.*;
import java.io.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Fri Mar 22 03:21:46 BRT 2024
  */
public class ParserSemantico extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public ParserSemantico() {super();}

  /** Constructor which sets the default scanner. */
  public ParserSemantico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParserSemantico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\006\000\002\004\002\000\002\002\005\000\002\002" +
    "\004\000\002\003\003\000\002\003\005\000\002\003\005" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\013\000\004\007\006\001\002\000\004\002\015\001" +
    "\002\000\004\004\001\001\002\000\010\004\ufffe\005\007" +
    "\006\010\001\002\000\004\007\006\001\002\000\004\007" +
    "\006\001\002\000\004\004\ufffc\001\002\000\004\004\ufffd" +
    "\001\002\000\004\004\014\001\002\000\004\002\000\001" +
    "\002\000\004\002\uffff\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\013\000\006\002\003\003\004\001\001\000\002\001" +
    "\001\000\004\004\012\001\001\000\002\001\001\000\004" +
    "\003\011\001\001\000\004\003\010\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserSemantico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserSemantico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ParserSemantico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 2;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$ParserSemantico$actions {
  private final ParserSemantico parser;

  /** Constructor */
  CUP$ParserSemantico$actions(ParserSemantico parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$ParserSemantico$do_action(
    int                        CUP$ParserSemantico$act_num,
    java_cup.runtime.lr_parser CUP$ParserSemantico$parser,
    java.util.Stack            CUP$ParserSemantico$stack,
    int                        CUP$ParserSemantico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserSemantico$result;

      /* select the action based on the action number */
      switch (CUP$ParserSemantico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expr ::= INTEIRO MENOS expr 
            {
              Integer RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-2)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-2)).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$ParserSemantico$stack.peek()).value;
		
        RESULT = new Integer(n + e);
    
              CUP$ParserSemantico$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-2)), ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()), RESULT);
            }
          return CUP$ParserSemantico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expr ::= INTEIRO MAIS expr 
            {
              Integer RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-2)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-2)).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$ParserSemantico$stack.peek()).value;
		
        RESULT = new Integer(n + e);
     
              CUP$ParserSemantico$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-2)), ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()), RESULT);
            }
          return CUP$ParserSemantico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // expr ::= INTEIRO 
            {
              Integer RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$ParserSemantico$stack.peek()).value;
		
        RESULT = n;
    	
              CUP$ParserSemantico$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()), RESULT);
            }
          return CUP$ParserSemantico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // $START ::= expr_ptv EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-1)).value;
		RESULT = start_val;
              CUP$ParserSemantico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-1)), ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParserSemantico$parser.done_parsing();
          return CUP$ParserSemantico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // expr_ptv ::= expr NT$0 PTVIRG 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-2)).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-2)).value;

              CUP$ParserSemantico$result = parser.getSymbolFactory().newSymbol("expr_ptv",0, ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.elementAt(CUP$ParserSemantico$top-2)), ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()), RESULT);
            }
          return CUP$ParserSemantico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // NT$0 ::= 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$ParserSemantico$stack.peek()).value;
 System.out.println("Resultado = " + e); 
              CUP$ParserSemantico$result = parser.getSymbolFactory().newSymbol("NT$0",2, ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserSemantico$stack.peek()), RESULT);
            }
          return CUP$ParserSemantico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

