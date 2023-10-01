/*
 * MIT License
 *
 * Copyright (c) 2023 OrdinaryRoad
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package tech.ordinaryroad.live.chat.client.bilibili.msg;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tech.ordinaryroad.live.chat.client.bilibili.constant.OperationEnum;
import tech.ordinaryroad.live.chat.client.bilibili.msg.base.BaseBilibiliCmdMsg;
import tech.ordinaryroad.live.chat.client.bilibili.msg.dto.MedalInfo;
import tech.ordinaryroad.live.chat.client.commons.base.msg.ISuperChatMsg;

/**
 * @author mjz
 * @date 2023/9/24
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SuperChatMessageMsg extends BaseBilibiliCmdMsg implements ISuperChatMsg {

    private long roomid;
    private Data data;

    @Override
    public OperationEnum getOperationEnum() {
        return OperationEnum.SEND_SMS_REPLY;
    }

    @Override
    public long getUid() {
        return data.uid;
    }

    @Override
    public String getUsername() {
        return data.user_info.uname;
    }

    @Override
    public String getUserAvatar() {
        return data.user_info.face;
    }

    @Override
    public String getContent() {
        return data.message;
    }

    @lombok.Data
    public class Data {
        private String background_bottom_color;
        private String background_color;
        private String background_color_end;
        private String background_color_start;
        private String background_icon;
        private String background_image;
        private String background_price_color;
        private double color_point;
        private int dmscore;
        private long end_time;
        private Gift gift;
        private long id;
        private int is_ranked;
        private int is_send_audit;
        private MedalInfo medal_info;
        private String message;
        private String message_font_color;
        private String message_trans;
        private int price;
        private int rate;
        private long start_time;
        private int time;
        private String token;
        private int trans_mark;
        private long ts;
        private long uid;
        private User_info user_info;
    }

    @lombok.Data
    public static class Gift {
        private int gift_id;
        private String gift_name;
        private int num;
    }

    @lombok.Data
    public class User_info {
        private String face;
        private String face_frame;
        private int guard_level;
        private int is_main_vip;
        private int is_svip;
        private int is_vip;
        private String level_color;
        private int manager;
        private String name_color;
        private String title;
        private String uname;
        private int user_level;
    }
}