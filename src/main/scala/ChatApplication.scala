import scala.swing.{Dimension, Frame, MainFrame, SimpleSwingApplication}

/**
  * Created by yaboo on 2017/01/04.
  */

object MainApplication extends SimpleSwingApplication {
  override def top: Frame = new MainFrame {
    // Windowのタイトル
    title = "Sebastian"
    // Windowのサイズ
    minimumSize = new Dimension( 300, 200 )
  }
}
//
//object Main {
//  def main(args: Array[String]): Unit = {
//    MainApplication.top
//  }
//}
