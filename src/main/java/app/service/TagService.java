package app.service;

import app.model.Tags;
import app.model.UserTag;
import app.model.Users;
import app.repository.TagRepository;
import app.repository.UserTagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * TagService<br>
 * タグ情報を操作するビジネスロジック
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Service
@Transactional(readOnly = true)
public class TagService {

    @Autowired
    private TagRepository tagRepository;

    @Autowired
    private UserTagRepository userTagRepository;

    /**
     * selectTagList
     * タグリストを取得する<br>
     * @return タグリスト
     */
    public List<Tags> selectTagList(){
        return tagRepository.findAll();
    }

    /**
     * selectUserListByTags<br>
     * タグ名からユーザーリストを取得する
     * @param tname タグ名
     * @return ユーザーリスト
     */
    public List<Users> selectUserListByTags(String tname){
        // タグを検索する
        Tags tags = tagRepository.findFirstByTname(tname);
        List<Users> usersList = new ArrayList<>();
        // ユーザーリストを作成する
        tags.getUsertag().forEach((ut) ->{
            usersList.add(ut.getUsers());
        });
        return usersList;
    }

    /**
     * insertUserTag<br>
     * ユーザータグ関連情報を追加する(タグがなければタグも登録する)
     * @param tname タグ名
     * @param uid ユーザー固有ID
     */
    @Transactional(readOnly = false)
    public void insertUserTag(String tname, Integer uid){
        // タグを検索する
        Tags tags = tagRepository.findFirstByTname(tname);
        // タグがない場合
        if(tags == null){
            // タグを追加する
            tagRepository.saveAndFlush(new Tags(tname));
            tags = tagRepository.findFirstByTname(tname);
        }
        // ユーザータグ関連情報を追加する
        userTagRepository.insertUserTagByUidIsAndTidIs(uid, tags.getTid());
    }

    /**
     * deleteUsertag<br>
     * ユーザータグ関連情報を削除する
     * @param tname タグ名
     * @param uid ユーザー固有ID
     */
    @Transactional(readOnly = false)
    public void deleteUsertag(String tname, Integer uid){
        // タグを検索する
        Tags tags = tagRepository.findFirstByTname(tname);
        // ユーザータグ関連情報を削除する
        userTagRepository.deleteUserTagByUidIsAndTidIs(uid, tags.getTid());
    }
}
