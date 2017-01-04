import java.awt.{SystemTray, TrayIcon}
import java.io.File
import javax.imageio.ImageIO

/**
  * Created by yaboo on 2017/01/04.
  */
object TaskTray {
  def show: Unit ={
    println("put on task tray...")

    val icon: TrayIcon = new TrayIcon(ImageIO.read(new File("src/main/resources/img/icon.png")))
    SystemTray.getSystemTray.add(icon)
  }

  def main(args: Array[String]): Unit = {
    show
  }
}
