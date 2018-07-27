<h1> Longest word in a sentence </h1>

This project uses Maven .<b>Please install maven </b>

<ol type="1">
<li><h3>To Running Tests</h3>
<ol type="a">
  <li> Go into project root directory .Which is "codetest" directory</li>
  <li> Execute below command  <pre>mvn test</pre></li>
  <li> You should see output as below <br></li>
  <pre>Results :Tests run: 12, Failures: 0, Errors: 0, Skipped: 0</pre>
  </ol></li>
  
  <li>
 
  <h3>Some assumptions i made</h3>
  <ol type="a">
    <li>When null or empty i assumed  output to be null and empty string respective and length will be 0</li>
    <li>When input is other than english language it simply processes it as english letters </li>
    <li>When sentence has more than one longest word then it only returns first found longest word.
        However i have created new bonus method called findAllLongestWord() where it will give all the longest words.
        I kept it as seprate method because time complexity varies for both methods
    </li>
    
   </ol>
</li>

<li>
  <h3>Time and space complexity</h3>
  <ol type="a">
    <li> findFirstLongestWord() :  Time complexity  O(N) and Space complexity O(1)</li>
    <li> findAllLongestWords():  Time complexity O(n+k) where n is total length of sentence and
                                      k is number of words in string
          Space complexity O(k)
    </li>
  </ol>
</li>
  
  
 <li>         
<h3>For your convinience i have also included Main class which you run to provide your own input </h3>
 <ol type="a">
 
  <li> Go into project root directory .Which is "codetest" directory</li>
  <li> Execute below command  <pre>mvn test -Prun</pre></li>
  <li> Program will prompt you as below  <pre>Please enter the sentence:</pre></li>
  <li> Enter sentence you want to test </li>
  <li> You shoud see two output lines as below
  <pre>The largest word in your sentence is<br>The largest word's length is </pre>
  
  </li>
 </li>
 </ol>

</ol>
