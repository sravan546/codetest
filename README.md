<h1> Longest word in a sentence </h1>

For this project I used java and Maven .<b>Please install jdk 1.5 or above and maven 3.0 or above </b>

<ol type="1">
<li><h3>To Run Tests</h3>
<ol type="a">
  <li>Open terminal or dos  window</li>
  <li> Go into project root directory. Which is "codetest" directory</li>
  <li> Execute below command <pre>mvn test</pre></li>
  <li> You should see output as below <br></li>
  <pre>Results: Tests run: 15, Failures: 0, Errors: 0, Skipped: 0</pre>
  </ol></li>
  
  <li>
 
  <h3>Classes</h3>
  <ol type="a">

     <li> test classe <pre> com.mastercard.EnglishSentenceServiceTest.java </pre> </li>
</ol>
</li>

  <li>
 
  <h3>Some assumptions I made</h3>
  <ol type="a">
<li>When null or empty I assumed output to be null and empty string respectively and length will be 0.</li>
    <li>When input is other than english language it simply processes it as english sentence .</li>
    <li>When sentence has more than one longest word then findLongestWord() only returns first longest word in  a  sentence. </li>
   <li>However I have created bonus method called findAllLongestWord() where it will give all the longest words. I kept it as separate method because time complexity varies for both methods.</li>
<li>I have also created concise version of above methods called findLongestWord2() and findAllLongestWords2(). These methods are concise but time and space complexity increased.</li>
   </ol>
</li>

<li>
  <h3>Time and space complexity</h3>
  <ol type="a">
    <pre>
    <li> findLongestWord()  :  Time complexity  O(N) and space complexity O(1)</li>
    <li> findAllLongestWords() :  Time complexity O(N) where n is total length of sentence and
                                                  
                                 Space complexity O(K)     K is number of words in sentence
   </li>
   <li> findLongestWord2()  : Time complexity  O(N) and space complexity O(N) </li>
  <li> findAllLongestWords2()  : Time complexity  O(N) and space complexity O(N) </li>

   </pre>
  </ol>
</li>
  
  
 <li>         
<h3>For your convenience I have also included Main class which you can run to provide your own input </h3>
 <ol type="a">
   <li> Open terminal or dos prompt </li>
  <li> Go into project root directory .Which is "codetest" directory</li>
  <li> Execute below command  <pre>mvn test -Prun</pre></li>
  <li> Program will prompt you as below  <pre>Please enter the sentence:</pre></li>
  <li> Enter sentence you want to test </li>
  <li> You should see two output lines as below
  <pre>The largest word in your sentence is<br>The largest word's length is </pre>
  
  </li>
 </li>
 </ol>

</ol>


