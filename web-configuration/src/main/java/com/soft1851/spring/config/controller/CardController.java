package com.soft1851.spring.config.controller;/*@ClassName CardController
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/24
 *@Version 1.0
 **/

import com.soft1851.spring.config.entity.Card;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class CardController {
    @GetMapping("/")
    public  String card(Model model){
        Card[] cards = {
               new Card(77,"https://dspncdn.com/a1/media/236x/57/d7/b3/57d7b3fe800cb5c4eeb50c6d95421388.jpg"),
                 new Card(54,"https://dspncdn.com/a1/media/236x/fe/c9/af/fec9afc63be58c7ee7ef338ad23494f9.jpg"),
                new Card(742,"https://dspncdn.com/a1/media/236x/fe/06/e5/fe06e5963adfcfab4c9824e06cd942a9.jpg"),
                new Card(41,"https://dspncdn.com/a1/media/236x/5b/e4/db/5be4dbcc751273db08c61b7229dd1f12.jpg"),
                new Card(116,"https://dspncdn.com/a1/media/236x/87/f1/d0/87f1d0b73ab6094a1609a521f2decf29.jpg"),
                 new Card(351,"https://dspncdn.com/a1/media/236x/5a/cb/c2/5acbc24a4a9e50927c67d4449b0a14d7.jpg"),
                 new Card(156,"https://dspncdn.com/a1/media/236x/d2/db/c8/d2dbc872561ba34053ce165d37fec02c.jpg"),
                 new Card(154,"https://dspncdn.com/a1/media/236x/64/05/52/640552748dc87d7c971341fedca0fa24.jpg"),
                 new Card(32,"https://dspncdn.com/a1/media/236x/48/1e/ed/481eeddfb921c03e551cc0373ff5c5c1.jpg"),
                 new Card(98,"https://dspncdn.com/a1/media/236x/7c/43/87/7c4387750f44ca9f30384e48d334dcc1.jpg"),
                 new Card(12,"https://dspncdn.com/a1/media/236x/58/eb/9d/58eb9d40a7854e7812b3c467c3e0a2db.jpg"),
                  new Card(142,"https://dspncdn.com/a1/media/236x/60/ec/9a/60ec9a56c0788f2c97520a717f7aea7d.jpg"),
                new Card(69,"https://dspncdn.com/a1/media/236x/82/cf/cf/82cfcf5daa70e1aea5ac218ca47c01e5.jpg"),
                 new Card(621,"https://dspncdn.com/a1/media/236x/b5/19/56/b5195694477ad3f400a2999e77183769.jpg"),
                 new Card(146,"https://dspncdn.com/a1/media/236x/b0/64/29/b06429df93853ac5827ad83dc9c53ef1.jpg"),
                new Card(52,"https://dspncdn.com/a1/media/236x/32/72/e3/3272e3017c86c9159f2cf0138f2640fc.jpg"),
                new Card(66,"https://dspncdn.com/a1/media/236x/38/fd/2c/38fd2c81fa97b7f6c13f26f1f5e4ec19.jpg"),
                new Card(21,"https://dspncdn.com/a1/media/236x/c9/d5/e7/c9d5e77d2b3a93ca1edd59abe8634b4d.jpg"),
               new Card(82,"https://dspncdn.com/a1/media/236x/27/a5/62/27a5622d8cf7dc62ed9d8869d30d7026.jpg"),
                new Card(43,"https://dspncdn.com/a1/media/236x/09/71/ca/0971ca2a99d8cf221bce3b7b7a88dd37.jpg")
        };
        List<Card> list = Arrays.asList(cards);
        model.addAttribute("cardList",list);

        model.addAttribute("avatar","https://dspncdn.com/a1/media/692x/32/72/e3/3272e3017c86c9159f2cf0138f2640fc.jpg");
       return "card";
    }


}
