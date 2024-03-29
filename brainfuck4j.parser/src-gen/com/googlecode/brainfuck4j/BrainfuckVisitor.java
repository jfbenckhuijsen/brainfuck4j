/* Generated By:JavaCC: Do not edit this line. BrainfuckVisitor.java Version 4.2 */
package com.googlecode.brainfuck4j;

public interface BrainfuckVisitor
{
  public Object visit(SimpleNode node, Object data);
  public Object visit(ASTStart node, Object data);
  public Object visit(Header node, Object data);
  public Object visit(ProgramHeader node, Object data);
  public Object visit(HeapHeader node, Object data);
  public Object visit(Expression node, Object data);
  public Object visit(UnaryExpression node, Object data);
  public Object visit(BlockExpression node, Object data);
}
/* JavaCC - OriginalChecksum=1fc53edf27bd2bf72e94bfaf6482f9e5 (do not edit this line) */
