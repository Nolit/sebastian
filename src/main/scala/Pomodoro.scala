/**
  * Created by Linustocks on 2017/01/06.
  */
//package example.lambda

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.control.Button
import scalafx.scene.layout.VBox

object Pomodoro extends JFXApp {
  stage = new PrimaryStage {
    title = "Hello"
    scene = new Scene {
      root = new VBox {
        children = new Button("Hello Button") {
          onMouseClicked = handle {
            println("hello")
          }
        }
      }
    }
  }
}