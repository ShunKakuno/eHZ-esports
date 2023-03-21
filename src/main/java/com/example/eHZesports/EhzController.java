package com.example.eHZesports;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EhzController {
    @RequestMapping("/")
    public ModelAndView index(ModelAndView mav) {
        mav.setViewName("index");
        return mav;
    }
    @RequestMapping("/world-professional-tournament-info")
    public ModelAndView worldProfessionalTournamentInfo(ModelAndView mav) {
        mav.setViewName("world-professional-tournament-info");
        return mav;
    }
    @RequestMapping("/japan-professional-tournament-info")
    public ModelAndView japanProfessionalTournamentInfo(ModelAndView mav) {
        mav.setViewName("japan-professional-tournament-info");
        return mav;
    }
    @RequestMapping("/amateur-tournament-info")
    public ModelAndView amateurTournamentInfo(ModelAndView mav) {
        mav.setViewName("amateur-tournament-info");
        return mav;
    }
    @RequestMapping("/professional-team")
    public ModelAndView professionalTeam(ModelAndView mav) {
        mav.setViewName("professional-team");
        return mav;
    }
    @RequestMapping("/terms")
    public ModelAndView terms(ModelAndView mav) {
        mav.setViewName("terms");
        return mav;
    }
    @RequestMapping("/blog")
    public ModelAndView blog(ModelAndView mav) {
        mav.setViewName("blog/blog");
        return mav;
    }
    @RequestMapping("/contact")
    public ModelAndView contact(ModelAndView mav) {
        mav.setViewName("contact");
        return mav;
    }
    @RequestMapping("/professional-team/bbl")
    public ModelAndView ProfessionalteamBbl(ModelAndView mav) {
        mav.setViewName("professional-team/bbl");
        return mav;
    }
    @RequestMapping("/professional-team/100t")
    public ModelAndView Professionalteam100t(ModelAndView mav) {
        mav.setViewName("professional-team/100t");
        return mav;
    }
    @RequestMapping("/professional-team/c9")
    public ModelAndView ProfessionalteamC9(ModelAndView mav) {
        mav.setViewName("professional-team/c9");
        return mav;
    }
    @RequestMapping("/professional-team/cgz")
    public ModelAndView ProfessionalteamCgz(ModelAndView mav) {
        mav.setViewName("professional-team/cgz");
        return mav;
    }
    @RequestMapping("/professional-team/cr")
    public ModelAndView ProfessionalteamCr(ModelAndView mav) {
        mav.setViewName("professional-team/cr");
        return mav;
    }
    @RequestMapping("/professional-team/dfm")
    public ModelAndView ProfessionalteamDfm(ModelAndView mav) {
        mav.setViewName("professional-team/dfm");
        return mav;
    }
    @RequestMapping("/professional-team/drx")
    public ModelAndView ProfessionalteamDrx(ModelAndView mav) {
        mav.setViewName("professional-team/drx");
        return mav;
    }
    @RequestMapping("/professional-team/edg")
    public ModelAndView ProfessionalteamEdg(ModelAndView mav) {
        mav.setViewName("professional-team/edg");
        return mav;
    }
    @RequestMapping("/professional-team/eg")
    public ModelAndView ProfessionalteamEg(ModelAndView mav) {
        mav.setViewName("professional-team/eg");
        return mav;
    }
    @RequestMapping("/professional-team/fl")
    public ModelAndView ProfessionalteamFl(ModelAndView mav) {
        mav.setViewName("professional-team/fl");
        return mav;
    }
    @RequestMapping("/professional-team/fnc")
    public ModelAndView ProfessionalteamFnc(ModelAndView mav) {
        mav.setViewName("professional-team/fnc");
        return mav;
    }
    @RequestMapping("/professional-team/fpx")
    public ModelAndView ProfessionalteamFpx(ModelAndView mav) {
        mav.setViewName("professional-team/fpx");
        return mav;
    }
    @RequestMapping("/professional-team/fur")
    public ModelAndView ProfessionalteamFur(ModelAndView mav) {
        mav.setViewName("professional-team/fur");
        return mav;
    }
    @RequestMapping("/professional-team/fut")
    public ModelAndView ProfessionalteamFut(ModelAndView mav) {
        mav.setViewName("professional-team/fut");
        return mav;
    }
    @RequestMapping("/professional-team/gen")
    public ModelAndView ProfessionalteamGen(ModelAndView mav) {
        mav.setViewName("professional-team/gen");
        return mav;
    }
    @RequestMapping("/professional-team/ges")
    public ModelAndView ProfessionalteamGes(ModelAndView mav) {
        mav.setViewName("professional-team/ges");
        return mav;
    }
    @RequestMapping("/professional-team/gia")
    public ModelAndView ProfessionalteamGia(ModelAndView mav) {
        mav.setViewName("professional-team/gia");
        return mav;
    }
    @RequestMapping("/professional-team/igz")
    public ModelAndView ProfessionalteamIgz(ModelAndView mav) {
        mav.setViewName("professional-team/igz");
        return mav;
    }
    @RequestMapping("/professional-team/kc")
    public ModelAndView ProfessionalteamKc(ModelAndView mav) {
        mav.setViewName("professional-team/kc");
        return mav;
    }
    @RequestMapping("/professional-team/koi")
    public ModelAndView ProfessionalteamKoi(ModelAndView mav) {
        mav.setViewName("professional-team/koi");
        return mav;
    }
    @RequestMapping("/professional-team/kru")
    public ModelAndView ProfessionalteamKru(ModelAndView mav) {
        mav.setViewName("professional-team/kru");
        return mav;
    }
    @RequestMapping("/professional-team/lev")
    public ModelAndView ProfessionalteamLev(ModelAndView mav) {
        mav.setViewName("professional-team/lev");
        return mav;
    }
    @RequestMapping("/professional-team/loud")
    public ModelAndView ProfessionalteamLoud(ModelAndView mav) {
        mav.setViewName("professional-team/loud");
        return mav;
    }
    @RequestMapping("/professional-team/mibr")
    public ModelAndView ProfessionalteamMibr(ModelAndView mav) {
        mav.setViewName("professional-team/mibr");
        return mav;
    }
    @RequestMapping("/professional-team/navi")
    public ModelAndView ProfessionalteamNavi(ModelAndView mav) {
        mav.setViewName("professional-team/navi");
        return mav;
    }
    @RequestMapping("/professional-team/nrg")
    public ModelAndView ProfessionalteamNrg(ModelAndView mav) {
        mav.setViewName("professional-team/nrg");
        return mav;
    }
    @RequestMapping("/professional-team/nth")
    public ModelAndView ProfessionalteamNth(ModelAndView mav) {
        mav.setViewName("professional-team/nth");
        return mav;
    }
    @RequestMapping("/professional-team/prx")
    public ModelAndView ProfessionalteamPrx(ModelAndView mav) {
        mav.setViewName("professional-team/prx");
        return mav;
    }
    @RequestMapping("/professional-team/rc")
    public ModelAndView ProfessionalteamRc(ModelAndView mav) {
        mav.setViewName("professional-team/rc");
        return mav;
    }
    @RequestMapping("/professional-team/sen")
    public ModelAndView ProfessionalteamSen(ModelAndView mav) {
        mav.setViewName("professional-team/sen");
        return mav;
    }
    @RequestMapping("/professional-team/sg")
    public ModelAndView ProfessionalteamSg(ModelAndView mav) {
        mav.setViewName("professional-team/sg");
        return mav;
    }
    @RequestMapping("/professional-team/sz")
    public ModelAndView ProfessionalteamSz(ModelAndView mav) {
        mav.setViewName("professional-team/sz");
        return mav;
    }
    @RequestMapping("/professional-team/t1")
    public ModelAndView ProfessionalteamT1(ModelAndView mav) {
        mav.setViewName("professional-team/t1");
        return mav;
    }
    @RequestMapping("/professional-team/th")
    public ModelAndView ProfessionalteamTh(ModelAndView mav) {
        mav.setViewName("professional-team/th");
        return mav;
    }
    @RequestMapping("/professional-team/tl")
    public ModelAndView ProfessionalteamTl(ModelAndView mav) {
        mav.setViewName("professional-team/tl");
        return mav;
    }
    @RequestMapping("/professional-team/tln")
    public ModelAndView ProfessionalteamTln(ModelAndView mav) {
        mav.setViewName("professional-team/tln");
        return mav;
    }
    @RequestMapping("/professional-team/ts")
    public ModelAndView ProfessionalteamTs(ModelAndView mav) {
        mav.setViewName("professional-team/ts");
        return mav;
    }
    @RequestMapping("/professional-team/vit")
    public ModelAndView ProfessionalteamVit(ModelAndView mav) {
        mav.setViewName("professional-team/vit");
        return mav;
    }
    @RequestMapping("/professional-team/zeta")
    public ModelAndView ProfessionalteamZeta(ModelAndView mav) {
        mav.setViewName("professional-team/zeta");
        return mav;
    }
    @RequestMapping("/blog-lists")
    public ModelAndView blogLists(ModelAndView mav) {
        mav.setViewName("blog/blog-lists");
        return mav;
    }
    @RequestMapping("/2023-02-23")
    public ModelAndView blog20230223(ModelAndView mav) {
        mav.setViewName("blog/2023-02-23");
        return mav;
    }
    @RequestMapping("/2023-03-03")
    public ModelAndView blog20230303(ModelAndView mav) {
        mav.setViewName("blog/2023-03-03");
        return mav;
    }
}
