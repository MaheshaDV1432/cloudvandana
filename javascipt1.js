//A. Take a sentence as an input and reverse every word in that sentence.
    a. Example - This is a sunny day > shiT si a ynnus yad. 

function reverseWords(sentence) {
    let words = [];
    let word = '';
    for (let char of sentence) {
      if (char === ' ') {
        words.push(word);
        word = '';
      } else {
        word = char + word;
      }
    }
    words.push(word);
  
    return words.join(' ');
  }
  
  let inputSentence = "this is a sunny day";
  let reversedSentence = reverseWords(inputSentence);
  console.log(reversedSentence);

  
  
  