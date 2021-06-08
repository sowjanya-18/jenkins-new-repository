def add(value1,value2) {
        env.VALUE1 = value1 
        env.VALUE2 = value2 
        sh '''
         VALUE=$(($VALUE1+$VALUE2))
         echo "Displaying value of addition $VALUE"
        '''
    }


def multiply(value1,value2) {
        env.VALUE1 = value1 
        env.VALUE2 = value2 
        sh '''
         VALUE=$(($VALUE1*$VALUE2))
         echo "Displaying value of Multiplication $VALUE"
        '''
    }

def hello() {
        sh '''
         echo "say hello to everyone" > hello.txt
        '''
    }
