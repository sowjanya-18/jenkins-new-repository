def add(value1,value2) {
        env.VALUE1 = value1 
        env.VALUE2 = value2 
        sh '''
         VALUE=$(($VALUE1+$VALUE2))
         echo "Displaying value of addition for $VALUE1 and $VALUE2 is $VALUE"
        '''
    }


def multiply(value1,value2) {
        env.VALUE1 = value1 
        env.VALUE2 = value2 
        sh '''
         VALUE=$(($VALUE1*$VALUE2))
         echo "Displaying value of Multiplication for $VALUE1 and $VALUE2 is $VALUE"
        '''
    }

def substraction(value1,value2) {
        env.VALUE1 = value1
        env.VALUE2 = value2
        sh '''
         VALUE=$(($VALUE1-$VALUE2)) 
        echo "Displaying value of substarction of $VALUE1 and $VALUE2 IS $VALUE
    }

def hello() {
        sh '''
         echo "say hello to everyone" > hello.txt
        '''
    }
