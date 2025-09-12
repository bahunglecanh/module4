package hunglcb.example.bai2.service;

import hunglcb.example.bai2.repository.IDictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryServiceImpl implements IDictionaryService{
    @Autowired
    IDictionaryRepository iDictionaryRepository;
    @Override
    public String findVietnamese(String english) {
        return iDictionaryRepository.findVietnamese(english);
    }
}
