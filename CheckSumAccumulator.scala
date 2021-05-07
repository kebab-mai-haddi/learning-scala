class CheckSumAccumulator:
  private var sum = 0
  def add(b: Byte): Unit = sum += b
  def checksum(): Int = ~(sum & 0XFF) + 1
