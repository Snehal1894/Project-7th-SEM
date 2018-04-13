# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.


from nltk.corpus import stopwords
from collections import defaultdict
from nltk.tokenize import sent_tokenize,word_tokenize
from heapq import nlargest
from string import punctuation
freq = defaultdict(int)
f=open("d:\\project.txt")
post=f.read()
sents = sent_tokenize(post)
word_sent = [word_tokenize(s.lower()) for s in sents]
print 'word:'
print word_sent
#def _compute_frequencies(word_sent):
_min_cut =0.1
_max_cut =0.9
stopwords = set(stopwords.words('english') + list(punctuation))
freq = defaultdict(int)
for s in word_sent:
    for word in s:
       if word not in stopwords:
           freq[word] += 1
m = float(max(freq.values()))
for w in freq.keys():
    freq[w] = freq[w]/m
    if freq[w] >= _max_cut or freq[w] <= _min_cut:
        del freq[w]
print 'freq: '
print freq
node=nlargest(5, freq, key=freq.get)
print 'node '
print node
