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

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin_webcast_gift_message_msg.proto

package tech.ordinaryroad.live.chat.client.douyin.protobuf;

public interface douyin_webcast_gift_message_msgOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tech.ordinaryroad.live.chat.client.bilibili.protobuf.douyin_webcast_gift_message_msg)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Common common = 1;</code>
   * @return Whether the common field is set.
   */
  boolean hasCommon();
  /**
   * <code>.Common common = 1;</code>
   * @return The common.
   */
  tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.CommonOuterClass.Common getCommon();
  /**
   * <code>.Common common = 1;</code>
   */
  tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.CommonOuterClass.CommonOrBuilder getCommonOrBuilder();

  /**
   * <code>uint64 gift_id = 2;</code>
   * @return The giftId.
   */
  long getGiftId();

  /**
   * <code>uint64 fan_ticket_count = 3;</code>
   * @return The fanTicketCount.
   */
  long getFanTicketCount();

  /**
   * <code>uint64 group_count = 4;</code>
   * @return The groupCount.
   */
  long getGroupCount();

  /**
   * <code>uint64 repeat_count = 5;</code>
   * @return The repeatCount.
   */
  long getRepeatCount();

  /**
   * <code>uint64 combo_count = 6;</code>
   * @return The comboCount.
   */
  long getComboCount();

  /**
   * <code>.User user = 7;</code>
   * @return Whether the user field is set.
   */
  boolean hasUser();
  /**
   * <code>.User user = 7;</code>
   * @return The user.
   */
  tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.UserOuterClass.User getUser();
  /**
   * <code>.User user = 7;</code>
   */
  tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.UserOuterClass.UserOrBuilder getUserOrBuilder();

  /**
   * <code>.User to_user = 8;</code>
   * @return Whether the toUser field is set.
   */
  boolean hasToUser();
  /**
   * <code>.User to_user = 8;</code>
   * @return The toUser.
   */
  tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.UserOuterClass.User getToUser();
  /**
   * <code>.User to_user = 8;</code>
   */
  tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.UserOuterClass.UserOrBuilder getToUserOrBuilder();

  /**
   * <code>uint32 repeat_end = 9;</code>
   * @return The repeatEnd.
   */
  int getRepeatEnd();

  /**
   * <code>.TextEffect text_effect = 10;</code>
   * @return Whether the textEffect field is set.
   */
  boolean hasTextEffect();
  /**
   * <code>.TextEffect text_effect = 10;</code>
   * @return The textEffect.
   */
  tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect getTextEffect();
  /**
   * <code>.TextEffect text_effect = 10;</code>
   */
  tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffectOrBuilder getTextEffectOrBuilder();

  /**
   * <code>uint64 group_id = 11;</code>
   * @return The groupId.
   */
  long getGroupId();

  /**
   * <code>uint64 income_taskgifts = 12;</code>
   * @return The incomeTaskgifts.
   */
  long getIncomeTaskgifts();

  /**
   * <code>uint64 room_fan_ticket_count = 13;</code>
   * @return The roomFanTicketCount.
   */
  long getRoomFanTicketCount();

  /**
   * <code>.GiftIMPriority priority = 14;</code>
   * @return Whether the priority field is set.
   */
  boolean hasPriority();
  /**
   * <code>.GiftIMPriority priority = 14;</code>
   * @return The priority.
   */
  tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.GiftIMPriorityOuterClass.GiftIMPriority getPriority();
  /**
   * <code>.GiftIMPriority priority = 14;</code>
   */
  tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.GiftIMPriorityOuterClass.GiftIMPriorityOrBuilder getPriorityOrBuilder();

  /**
   * <code>.GiftStruct gift = 15;</code>
   * @return Whether the gift field is set.
   */
  boolean hasGift();
  /**
   * <code>.GiftStruct gift = 15;</code>
   * @return The gift.
   */
  tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.GiftStructOuterClass.GiftStruct getGift();
  /**
   * <code>.GiftStruct gift = 15;</code>
   */
  tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.GiftStructOuterClass.GiftStructOrBuilder getGiftOrBuilder();

  /**
   * <code>string log_id = 16;</code>
   * @return The logId.
   */
  java.lang.String getLogId();
  /**
   * <code>string log_id = 16;</code>
   * @return The bytes for logId.
   */
  com.google.protobuf.ByteString
      getLogIdBytes();

  /**
   * <code>uint64 send_type = 17;</code>
   * @return The sendType.
   */
  long getSendType();

  /**
   * <code>.PublicAreaCommon public_area_common = 18;</code>
   * @return Whether the publicAreaCommon field is set.
   */
  boolean hasPublicAreaCommon();
  /**
   * <code>.PublicAreaCommon public_area_common = 18;</code>
   * @return The publicAreaCommon.
   */
  tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.PublicAreaCommonOuterClass.PublicAreaCommon getPublicAreaCommon();
  /**
   * <code>.PublicAreaCommon public_area_common = 18;</code>
   */
  tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.PublicAreaCommonOuterClass.PublicAreaCommonOrBuilder getPublicAreaCommonOrBuilder();

  /**
   * <code>.Text tray_display_text = 19;</code>
   * @return Whether the trayDisplayText field is set.
   */
  boolean hasTrayDisplayText();
  /**
   * <code>.Text tray_display_text = 19;</code>
   * @return The trayDisplayText.
   */
  tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextOuterClass.Text getTrayDisplayText();
  /**
   * <code>.Text tray_display_text = 19;</code>
   */
  tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextOuterClass.TextOrBuilder getTrayDisplayTextOrBuilder();

  /**
   * <code>uint64 banned_display_effects = 20;</code>
   * @return The bannedDisplayEffects.
   */
  long getBannedDisplayEffects();

  /**
   * <pre>
   * GiftTrayInfo trayInfo = 21;
   * AssetEffectMixInfo assetEffectMixInfo = 22;
   * </pre>
   *
   * <code>bool display_for_self = 25;</code>
   * @return The displayForSelf.
   */
  boolean getDisplayForSelf();

  /**
   * <code>string interact_gift_info = 26;</code>
   * @return The interactGiftInfo.
   */
  java.lang.String getInteractGiftInfo();
  /**
   * <code>string interact_gift_info = 26;</code>
   * @return The bytes for interactGiftInfo.
   */
  com.google.protobuf.ByteString
      getInteractGiftInfoBytes();

  /**
   * <code>string diy_item_info = 27;</code>
   * @return The diyItemInfo.
   */
  java.lang.String getDiyItemInfo();
  /**
   * <code>string diy_item_info = 27;</code>
   * @return The bytes for diyItemInfo.
   */
  com.google.protobuf.ByteString
      getDiyItemInfoBytes();

  /**
   * <code>repeated uint64 min_asset_set_list = 28;</code>
   * @return A list containing the minAssetSetList.
   */
  java.util.List<java.lang.Long> getMinAssetSetListList();
  /**
   * <code>repeated uint64 min_asset_set_list = 28;</code>
   * @return The count of minAssetSetList.
   */
  int getMinAssetSetListCount();
  /**
   * <code>repeated uint64 min_asset_set_list = 28;</code>
   * @param index The index of the element to return.
   * @return The minAssetSetList at the given index.
   */
  long getMinAssetSetList(int index);

  /**
   * <code>uint64 total_count = 29;</code>
   * @return The totalCount.
   */
  long getTotalCount();

  /**
   * <code>uint32 client_gift_source = 30;</code>
   * @return The clientGiftSource.
   */
  int getClientGiftSource();

  /**
   * <pre>
   * AnchorGiftData anchorGift = 31;
   * </pre>
   *
   * <code>repeated uint64 to_user_ids_list = 32;</code>
   * @return A list containing the toUserIdsList.
   */
  java.util.List<java.lang.Long> getToUserIdsListList();
  /**
   * <pre>
   * AnchorGiftData anchorGift = 31;
   * </pre>
   *
   * <code>repeated uint64 to_user_ids_list = 32;</code>
   * @return The count of toUserIdsList.
   */
  int getToUserIdsListCount();
  /**
   * <pre>
   * AnchorGiftData anchorGift = 31;
   * </pre>
   *
   * <code>repeated uint64 to_user_ids_list = 32;</code>
   * @param index The index of the element to return.
   * @return The toUserIdsList at the given index.
   */
  long getToUserIdsList(int index);

  /**
   * <code>uint64 send_timet = 33;</code>
   * @return The sendTimet.
   */
  long getSendTimet();

  /**
   * <code>uint64 force_display_effectst = 34;</code>
   * @return The forceDisplayEffectst.
   */
  long getForceDisplayEffectst();

  /**
   * <code>string trace_id = 35;</code>
   * @return The traceId.
   */
  java.lang.String getTraceId();
  /**
   * <code>string trace_id = 35;</code>
   * @return The bytes for traceId.
   */
  com.google.protobuf.ByteString
      getTraceIdBytes();

  /**
   * <code>uint64 effect_display_ts = 36;</code>
   * @return The effectDisplayTs.
   */
  long getEffectDisplayTs();
}