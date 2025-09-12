package hunglcb.example.bai2.repository;

import hunglcb.example.bai2.entity.Word;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DictionaryRepositoryImpl implements IDictionaryRepository{
    static List<Word> dictionary=new ArrayList<>();
    static {
        dictionary.add(new Word("hello", "xin chào"));
        dictionary.add(new Word("book", "quyển sách"));
        dictionary.add(new Word("computer", "máy tính"));
        dictionary.add(new Word("dog", "con chó"));
        dictionary.add(new Word("cat", "con mèo"));
    }
    @Override
    public String findVietnamese(String english) {
        for (Word word:dictionary){
            if (word.getEnglish().equals(english)){
                return word.getVietnamese();
            }
        }
        return null;
    }
}
