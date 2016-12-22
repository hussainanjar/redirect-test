package com.test

class RedirectController {

    def testOne() {

      redirect uri:'/redirect/actionOne', permanent: false
    }

    def testTwo() {

      redirect action:'actionTwo', permanent: false
    }

    def testThree() {

      redirect url: '/redirect/actionTwo'
    }

    def actionOne() {
      render "This is action one"
    }

    def actionTwo() {
      render "This is action two"
    }
}
