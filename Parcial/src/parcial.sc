def myMethod(x: List[Double]): Double = {
  val prom: Double = x.sum/x.size
  val dif: List[Double] = x.map(x => x - prom)
  val sumcdr: Double = dif.map(n => n* n).sum
  val res: Double = Math.sqrt(sumcdr/x.size)
  res;
}


