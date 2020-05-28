package com.datumbrain.webfetcher

/**
  * @author ${user.name}
  */
object App {

  def main(args: Array[String]) {
    //default url
    var url = "https://datumbrain.com/"
    //if a url is provided from command line
    if (args.length >= 1)
      url = args(0)
    //execute the primary constructor of MainClass
    new MainClass(url)
  }

}
