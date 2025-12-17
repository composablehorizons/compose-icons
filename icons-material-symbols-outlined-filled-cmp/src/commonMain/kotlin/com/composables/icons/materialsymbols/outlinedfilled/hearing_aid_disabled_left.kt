package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Hearing_aid_disabled_left: ImageVector
    get() {
        if (_Hearing_aid_disabled_left != null) return _Hearing_aid_disabled_left!!
        
        _Hearing_aid_disabled_left = ImageVector.Builder(
            name = "hearing_aid_disabled_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 880f)
                quadToRelative(-57f, 0f, -100f, -34f)
                reflectiveQuadToRelative(-62f, -90f)
                quadToRelative(-17f, -50f, -36.5f, -74f)
                reflectiveQuadTo(417f, 626f)
                quadToRelative(-67f, -48f, -102f, -119.5f)
                reflectiveQuadTo(280f, 360f)
                quadToRelative(0f, -20f, 3f, -40f)
                reflectiveQuadToRelative(9f, -38f)
                lineToRelative(67f, 67f)
                quadToRelative(-2f, 62f, 26.5f, 119.5f)
                reflectiveQuadTo(467f, 564f)
                quadToRelative(48f, 34f, 76.5f, 65.5f)
                reflectiveQuadTo(589f, 715f)
                quadToRelative(11f, 35f, 33.5f, 60f)
                reflectiveQuadToRelative(57.5f, 25f)
                quadToRelative(26f, 0f, 46.5f, -14.5f)
                reflectiveQuadTo(757f, 748f)
                lineToRelative(59f, 59f)
                quadToRelative(-23f, 32f, -58.5f, 52.5f)
                reflectiveQuadTo(680f, 880f)
                close()
                moveToRelative(160f, -163f)
                lineTo(430f, 307f)
                quadToRelative(16f, -38f, 50.5f, -62.5f)
                reflectiveQuadTo(560f, 220f)
                quadToRelative(65f, 0f, 106.5f, 49f)
                reflectiveQuadTo(698f, 382f)
                lineToRelative(164f, 142f)
                lineToRelative(-60f, 48f)
                quadToRelative(19f, 29f, 28.5f, 66f)
                reflectiveQuadToRelative(9.5f, 79f)
                close()
                moveToRelative(-80f, -357f)
                quadToRelative(0f, -85f, -57.5f, -142.5f)
                reflectiveQuadTo(560f, 160f)
                quadToRelative(-57f, 0f, -102.5f, 27.5f)
                reflectiveQuadTo(386f, 261f)
                lineToRelative(-59f, -58f)
                quadToRelative(38f, -57f, 98.5f, -90f)
                reflectiveQuadTo(560f, 80f)
                quadToRelative(118f, 0f, 199f, 81f)
                reflectiveQuadToRelative(81f, 199f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(30f, 535f)
                lineTo(204f, 307f)
                quadToRelative(-2f, 13f, -3f, 26f)
                reflectiveQuadToRelative(-1f, 27f)
                quadToRelative(0f, 72f, 27.5f, 137.5f)
                reflectiveQuadTo(306f, 614f)
                lineToRelative(-58f, 56f)
                quadToRelative(-62f, -63f, -95f, -143.5f)
                reflectiveQuadTo(120f, 360f)
                quadToRelative(0f, -31f, 4.5f, -61f)
                reflectiveQuadToRelative(12.5f, -59f)
                lineToRelative(-81f, -81f)
                lineToRelative(57f, -57f)
                lineToRelative(734f, 736f)
                lineToRelative(-57f, 57f)
                close()
            }
        }.build()
        
        return _Hearing_aid_disabled_left!!
    }

private var _Hearing_aid_disabled_left: ImageVector? = null

