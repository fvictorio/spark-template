import org.apache.spark.sql.SparkSession

object App {
  def main(args: Array[String]) {
    val spark = SparkSession.builder.appName("Simple Application").getOrCreate()
    val sc = spark.sparkContext

    val data = sc.parallelize(1 to 100)
    val sum = data.reduce(_ + _)
    println(s"Result: \$sum")

    spark.stop()
  }
}
