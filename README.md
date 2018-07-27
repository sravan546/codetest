<h1> Longest word in a sentence </h1>

This project uses Maven. <b>Please install maven </b>

<ol type="1">
<li><h3>To Run Tests</h3>
<ol type="a">
  <li>Open terminal or dos mac window</li>
  <li> Go into project root directory. Which is "codetest" directory</li>
  <li> Execute below command <pre>mvn test</pre></li>
  <li> You should see output as below <br></li>
  <pre>Results: Tests run: 15, Failures: 0, Errors: 0, Skipped: 0</pre>
  </ol></li>
  
  <li>
 
  <h3>Some assumptions I made</h3>
  <ol type="a">
<li>When null or empty I assumed output to be null and empty string respective and length will be 0</li>
    <li>When input is other than English language it simply processes it as English sentence </li>
    <li>When sentence has more than one longest word then it only returns first longest word in    sentence. </li>
   <li>However I have created bonus method called findAllLongestWord() where it will give all the longest words. I kept it as separate method because time complexity varies for both methods</li>
<li>I have also created concise version of above methods called findAllLongestWord2() and findAllLongestWord2(). These are concise but time and space complexity increased
   </ol>
</li>

<li>
  <h3>Time and space complexity</h3>
  <ol type="a">

    <li> findLongestWord()  :  Time complexity  O(N) and Space complexity O(1)</li>
    <li> findAllLongestWords() :  Time complexity O(N+K) where n is total length of sentence and
                                                      K is number of words in sentence
                                 Space complexity O(K)
    </li>
   <li> findLongestWord2()  : Time complexity  O(N+K) and Space complexity O(N) </li>
  <li> findAllLongestWords2()  : Time complexity  O(N+K) and Space complexity O(N) </li>

   
  </ol>
</li>
  
  
 <li>         
<h3>For your convenience I have also included Main class which you run to provide your own input </h3>
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

