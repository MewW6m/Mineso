package app.service;

import app.model.Tags;
import app.model.UserTag;
import app.model.Users;
import app.repository.TagRepository;
import app.repository.UserTagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TagService<br>
 * タグ情報を操作するビジネスロジック
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Service
public class TagService {

    @Autowired
    private TagRepository tagRepository;

    @Autowired
    private UserTagRepository userTagRepository;

    /**
     * insertTagname<br>
     * タグ名からタグを追加する
     * @param tagname タグ名
     * @param uid ユーザー固有ID
     */
    public void insertTagname(String tagname, Integer uid){
        tagRepository.saveAndFlush(new Tags(tagname));
        insertUserTag(tagname, uid);
    }

    /**
     * insertUserTag<br>
     * ユーザータグ関連情報を追加する
     * @param tagname タグ名
     * @param uid ユーザー固有ID
     */
    public void insertUserTag(String tagname, Integer uid){
        Tags tags = tagRepository.findFirstByTagname(tagname);
        userTagRepository.saveAndFlush(new UserTag(uid, tags.getTid()));
    }

    /**
     * selectTagUserList<br>
     * タグ名からユーザーリストを取得する
     * @param tagname タグ名
     * @return ユーザーリスト
     */
    public List<Users> selectTagList(String tagname){
        Tags tags = tagRepository.findFirstByTagname(tagname);
        return tags.getUsers();
    }
}
