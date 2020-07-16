package app.service;

import app.model.Nortifications;
import app.repository.NortificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * NortificationService<br>
 * 通知情報を操作するビジネスロジック
 * @author MewW6m　(https://github.com/MewW6m)
 */
@Service
@Transactional(readOnly = true)
public class NortificationService {
    @Autowired
    private NortificationRepository nortificationRepository;

    /**
     * getNorList<br>
     * 通知リストを取得する
     *  @param uid ユーザー情報ID
     * @return List<Nortifications> 通知リスト返す
     */
    public List<Nortifications> selectNorList(int uid) throws Exception {
        List<Nortifications> norList = nortificationRepository.findByUid(uid);
        if(norList.size() == 0)
            throw new Exception();
        return norList;
    }

    /**
     * postNorList<br>
     * 通知を更新する
     *  @oaran nid 通知ID
     * @return List<Nortifications> 通知リスト返す
     */
    public void updateNorList(List<Integer> nid) throws Exception {
        for (Integer i : nid){ updateNor(i); }
    }

    @Transactional(readOnly = false)
    public void updateNor(Integer nid) throws Exception {
            Nortifications nor = nortificationRepository.findFirstByNid(nid).orElseThrow(() -> new Exception());
            nor.setNflag(true);
            nortificationRepository.saveAndFlush(nor);
    }
}
