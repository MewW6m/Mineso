package app.service;

import app.model.Nortifications;
import app.repository.NortificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
     *  @param uid ユーザー情報ID
     *  @oaran nid 通知ID
     * @return List<Nortifications> 通知リスト返す
     */
    @Transactional(readOnly = false)
    public void updateNorList(int uid, List<Integer> nid) throws Exception {
        for (Integer i : nid){
            Nortifications nor = nortificationRepository.findFirstByNid(i).orElseThrow(() -> new Exception());
            nor.setNflag(true);
            nortificationRepository.saveAndFlush(nor);
        }
    }
}
