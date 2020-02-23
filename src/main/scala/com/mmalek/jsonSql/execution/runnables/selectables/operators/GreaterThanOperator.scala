package com.mmalek.jsonSql.execution.runnables.selectables.operators

import com.mmalek.jsonSql.execution.runnables.Folders._
import com.mmalek.jsonSql.execution.runnables.Types.RunnableArgument
import com.mmalek.jsonSql.execution.runnables.selectables.operators.base.BaseSingularComparisonOperator

class GreaterThanOperator extends BaseSingularComparisonOperator {
  def canRun(symbol: String, args: Seq[RunnableArgument]): Boolean =
    symbol == ">" && args.length >= 2 && args.forall(_.fold(IsNumeric))

  protected def operation(arg1: BigDecimal, arg2: BigDecimal): Boolean = arg1 > arg2
}
