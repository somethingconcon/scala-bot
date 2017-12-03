package bot.actors

import bot.trie.Trie
import bot.trie.TrieOperations.Word

object TrieCreator{

  case class Add(message: List[Word],
                 replies: (Option[() => Set[String]], Set[() => Set[String]]),
                 trie: Trie)


  case class Search(message: List[Word], trie: Trie)


  case class TrieResponse(trie: Trie)


  case object Print
}

class TrieCreator {

}
