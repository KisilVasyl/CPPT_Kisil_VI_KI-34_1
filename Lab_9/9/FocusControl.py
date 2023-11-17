class FocusControl:
    def __init__(self, standart_length = 15, standart_minlength = 1, standart_maxlength = 30 ):
        self.__length = standart_length
        self.__minlength = standart_minlength
        self.__maxlength = standart_maxlength
    def scrollUp (self):
        if self.__length==self.__maxlength :
            print("Error. Length is already max")
        else:
            self.__length = self.length+1
    def scrollDown (self):
        if self.length == self.__minlength:
            print("Error. Length is already min")
        else:
            self.__length=self.__length+1
    def getFocusDistance(self):
        return self.__length
    def getMinFocusDistance(self):
        return self.__minlength
    def getMaxFocusDistance(self):
        return self.__maxlength