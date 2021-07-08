package gameProject.Concrete;

import gameProject.Abstract.CampaignService;
import gameProject.Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void campaignAdd(Campaign campaign) {
		System.out.println("Yeni kampanya girişi oluşturuldu");

	}

	@Override
	public void campaignUpdate(Campaign campaign) {
		System.out.println("Kampanya güncellendi");

	}

	@Override
	public void campaignDelete(Campaign campaign) {
		System.out.println("Kampanya silindi");

	}

}
