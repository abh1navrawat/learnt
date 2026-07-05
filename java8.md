features- 

Functional Interface - The interface which contain one abstract method but can have multiple static or normal method

some examples are
Runnable class have run() method
Callable have call()
Comparable have compareTo()
Comparator have compare()



Lambda expression - if we want to override the abstract method of functional interface we dont have to do it in traditional way, we can instead use lambda function

syntax-   (parameters list) ->  {body}

ex - interface Calc{
        int add(int a,int b);

    Class Calculator{
      publc static void main(String args[]){
        Calc calc = (a,b) -> a+b;
        Sysout(calc.add(2,8));
        }
        }
