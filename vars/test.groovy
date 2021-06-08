def add(value1,value2) {
        env.VALUE1 = value1 
        env.VALUE2 = value2 
        sh '''
         VALUE=$(($VALUE1+$VALUE2))
         echo "Displaying value of addition $VALUE"
        '''
    }
