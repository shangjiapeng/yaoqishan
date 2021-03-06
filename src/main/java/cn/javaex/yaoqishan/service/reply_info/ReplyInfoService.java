package cn.javaex.yaoqishan.service.reply_info;

import cn.javaex.yaoqishan.dao.reply_info.IReplyInfoDAO;
import cn.javaex.yaoqishan.view.ReplyInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ReplyInfoService")
public class ReplyInfoService {
	@Autowired
	private IReplyInfoDAO iReplyInfoDAO;

	/**
	 * 保存用户的回复
	 * @param replyInfo
	 */
	public void save(ReplyInfo replyInfo) {
		iReplyInfoDAO.insert(replyInfo);
	}

}
