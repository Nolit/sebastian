import java.awt.event.{ActionEvent, ActionListener}
import java.awt.{SystemTray, TrayIcon}
import java.io.File
import javax.imageio.ImageIO

/**
  * Created by yaboo on 2017/01/04.
  */
object TaskTray {
  private val iconPath = "src/main/resources/img/icon.png"
  
  def putOn: Unit ={
    println("put on task tray...")

    val icon = new TrayIcon(ImageIO.read(new File(iconPath)))
    icon.addActionListener((e: ActionEvent) => println("Clicked!"))

    SystemTray.getSystemTray.add(icon)
  }

  def main(args: Array[String]): Unit = {
    putOn
  }
}
