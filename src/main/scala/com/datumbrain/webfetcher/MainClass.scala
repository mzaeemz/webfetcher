package com.datumbrain.webfetcher

import java.io.File
import java.io.PrintWriter

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

class MainClass(val URL: String) {

  //get the html of the url website
  val DOCUMENT: Document = Jsoup.connect(URL).get()
  //the directory where all outputs are to be stored
  var outPath: String = "./output"
  val OUTDIR = new File(outPath)
  OUTDIR.mkdir()
  //directory for current run's output
  var path: String = cleanseURL(URL)
  path = "./output/" + path + System.currentTimeMillis().toString
  val myDir = new File(path)
  myDir.mkdir()
  //file to store html
  var outFile = new File(myDir.toString + "/output.html")
  //file to store url
  var outURL = new File(myDir.toString + "/output.url")
  //printWriter for html file
  val print_Writer_html = new PrintWriter(outFile)
  //printWriter for url file
  val print_Writer_url = new PrintWriter(outURL)
  print_Writer_html.write(DOCUMENT.toString)
  print_Writer_url.write(URL)
  //close the writers
  print_Writer_url.close()
  print_Writer_html.close()
  def cleanseURL(url: String): String = {
    url.replaceAll("[^a-zA-Z0-9]", "");
  }
}
