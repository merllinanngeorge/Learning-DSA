class TrieNode{
    TrieNode links[] = new TrieNode[26];
    boolean flag = false;

    public boolean containsKey(char ch)
    {
        return links[ch - 'a'] != null;
    }

    public void put(char ch, TrieNode node)
    {
        links[ch - 'a'] = node;
    }

    public TrieNode get(char ch)
    {
        return links[ch - 'a'];
    }

    public void setEnd()
    {
        flag = true;
    }

    public boolean isEnd()
    {
        return flag;
    }
}
class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode node = root;
        for(char ch : word.toCharArray())
        {
            if(!node.containsKey(ch))
            node.put(ch,new TrieNode());
            node = node.get(ch);
        }
        node.setEnd();
    }
    
    public boolean search(String word) {
        TrieNode node = root;
        for(char ch : word.toCharArray())
        {
            if(!node.containsKey(ch))
            return false;
            node = node.get(ch);
        }
        return node.isEnd();
    }
    
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for(char ch : prefix.toCharArray())
        {
            if(!node.containsKey(ch))
            return false;
            node = node.get(ch);
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */