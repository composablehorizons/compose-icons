package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Waving_hand: ImageVector
    get() {
        if (_Waving_hand != null) return _Waving_hand!!
        
        _Waving_hand = ImageVector.Builder(
            name = "waving_hand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 921f)
                quadToRelative(-17f, 0f, -28.5f, -12f)
                reflectiveQuadTo(640f, 880f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 840f)
                quadToRelative(66f, 0f, 113f, -47f)
                reflectiveQuadToRelative(47f, -113f)
                quadToRelative(0f, -17f, 12f, -29f)
                reflectiveQuadToRelative(29f, -12f)
                quadToRelative(17f, 0f, 28.5f, 12f)
                reflectiveQuadToRelative(11.5f, 29f)
                quadToRelative(0f, 100f, -70.5f, 170.5f)
                reflectiveQuadTo(680f, 921f)
                close()
                moveTo(80f, 320f)
                quadToRelative(-17f, 0f, -29f, -11.5f)
                reflectiveQuadTo(39f, 280f)
                quadToRelative(0f, -100f, 70.5f, -170.5f)
                reflectiveQuadTo(280f, 39f)
                quadToRelative(17f, 0f, 29f, 11.5f)
                reflectiveQuadToRelative(12f, 28.5f)
                quadToRelative(0f, 17f, -12f, 29f)
                reflectiveQuadToRelative(-29f, 12f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(80f, 320f)
                close()
                moveToRelative(689f, -143f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(515f, 488f)
                quadToRelative(-11f, 12f, -27.5f, 11.5f)
                reflectiveQuadTo(459f, 488f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(254f, -254f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                close()
                moveToRelative(71f, 127f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(840f, 361f)
                lineTo(614f, 587f)
                quadToRelative(-11f, 11f, -27.5f, 11f)
                reflectiveQuadTo(558f, 587f)
                quadToRelative(-12f, -12f, -12.5f, -28.5f)
                reflectiveQuadTo(557f, 530f)
                lineToRelative(226f, -226f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                close()
                moveTo(211f, 749f)
                quadToRelative(-91f, -91f, -91f, -219f)
                reflectiveQuadToRelative(91f, -219f)
                lineToRelative(92f, -92f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(31f, 31f)
                quadToRelative(7f, 7f, 12f, 14.5f)
                reflectiveQuadToRelative(10f, 15.5f)
                lineToRelative(148f, -149f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(617f, 188f)
                lineTo(444f, 361f)
                lineToRelative(-85f, 84f)
                lineToRelative(19f, 19f)
                quadToRelative(46f, 46f, 44f, 110f)
                reflectiveQuadToRelative(-49f, 111f)
                lineToRelative(-1f, 1f)
                quadToRelative(-11f, 11f, -27.5f, 11f)
                reflectiveQuadTo(316f, 686f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                quadToRelative(23f, -23f, 25.5f, -54.5f)
                reflectiveQuadTo(321f, 520f)
                lineToRelative(-47f, -46f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(57f, -56f)
                quadToRelative(12f, -12f, 12f, -28.5f)
                reflectiveQuadTo(331f, 304f)
                lineToRelative(-64f, 64f)
                quadToRelative(-68f, 68f, -68f, 162.5f)
                reflectiveQuadTo(267f, 693f)
                quadToRelative(68f, 68f, 163f, 68f)
                reflectiveQuadToRelative(163f, -68f)
                lineToRelative(239f, -240f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(889f, 510f)
                lineTo(649f, 749f)
                quadToRelative(-91f, 91f, -219f, 91f)
                reflectiveQuadToRelative(-219f, -91f)
                close()
                moveToRelative(219f, -219f)
                close()
            }
        }.build()
        
        return _Waving_hand!!
    }

private var _Waving_hand: ImageVector? = null

