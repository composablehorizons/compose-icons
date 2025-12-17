package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Shutter_speed_minus: ImageVector
    get() {
        if (_Shutter_speed_minus != null) return _Shutter_speed_minus!!
        
        _Shutter_speed_minus = ImageVector.Builder(
            name = "shutter_speed_minus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 720f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 800f)
                horizontalLineTo(640f)
                close()
                moveTo(400f, 120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(400f, 40f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 120f)
                horizontalLineTo(400f)
                close()
                moveToRelative(80f, 320f)
                horizontalLineToRelative(268f)
                quadToRelative(-18f, -62f, -61.5f, -109f)
                reflectiveQuadTo(584f, 260f)
                lineTo(480f, 440f)
                close()
                moveToRelative(-70f, 40f)
                lineToRelative(134f, -232f)
                quadToRelative(-16f, -4f, -32.5f, -6f)
                reflectiveQuadToRelative(-33.5f, -2f)
                quadToRelative(-45f, 0f, -89f, 14.5f)
                reflectiveQuadTo(306f, 300f)
                lineToRelative(104f, 180f)
                close()
                moveToRelative(-206f, 80f)
                horizontalLineToRelative(206f)
                lineTo(276f, 328f)
                quadToRelative(-42f, 47f, -62.5f, 106.5f)
                reflectiveQuadTo(204f, 560f)
                close()
                moveToRelative(172f, 220f)
                lineToRelative(104f, -180f)
                horizontalLineTo(212f)
                quadToRelative(18f, 62f, 61.5f, 109f)
                reflectiveQuadTo(376f, 780f)
                close()
                moveToRelative(104f, -260f)
                close()
                moveToRelative(42f, 277f)
                close()
                moveToRelative(238f, -278f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-75f, 0f, -140.5f, -28.5f)
                reflectiveQuadToRelative(-114f, -77f)
                quadToRelative(-48.5f, -48.5f, -77f, -114f)
                reflectiveQuadTo(120f, 520f)
                quadToRelative(0f, -75f, 28.5f, -140.5f)
                reflectiveQuadToRelative(77f, -114f)
                quadToRelative(48.5f, -48.5f, 114f, -77f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(64f, 0f, 121f, 21f)
                reflectiveQuadToRelative(104f, 58f)
                lineToRelative(29f, -29f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(790f, 210f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(791f, 266f)
                lineToRelative(-29f, 30f)
                quadToRelative(37f, 47f, 57.5f, 103f)
                reflectiveQuadTo(840f, 519f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 559f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 519f)
                quadToRelative(0f, -10f, -0.5f, -19.5f)
                reflectiveQuadTo(757f, 480f)
                horizontalLineTo(596f)
                lineTo(416f, 793f)
                quadToRelative(16f, 4f, 31.5f, 5.5f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(11f, 0f, 21f, -0.5f)
                reflectiveQuadToRelative(21f, -2.5f)
                quadToRelative(17f, -2f, 30f, 7.5f)
                reflectiveQuadToRelative(15f, 26.5f)
                quadToRelative(2f, 17f, -7.5f, 30f)
                reflectiveQuadTo(533f, 876f)
                quadToRelative(-13f, 2f, -26f, 3f)
                reflectiveQuadToRelative(-27f, 1f)
                close()
            }
        }.build()
        
        return _Shutter_speed_minus!!
    }

private var _Shutter_speed_minus: ImageVector? = null

