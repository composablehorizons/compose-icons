package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Shutter_speed_minus: ImageVector
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
                moveTo(920f, 800f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                close()
                moveTo(360f, 120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
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
                lineToRelative(57f, -57f)
                lineToRelative(56f, 56f)
                lineToRelative(-56f, 58f)
                quadToRelative(39f, 49f, 59.5f, 109f)
                reflectiveQuadTo(840f, 533f)
                quadToRelative(-14f, -4f, -31f, -9f)
                reflectiveQuadToRelative(-49f, -5f)
                quadToRelative(0f, -10f, -0.5f, -19.5f)
                reflectiveQuadTo(757f, 480f)
                horizontalLineTo(596f)
                lineTo(416f, 793f)
                quadToRelative(16f, 4f, 31.5f, 5.5f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(11f, 0f, 21f, -0.5f)
                reflectiveQuadToRelative(21f, -2.5f)
                quadToRelative(3f, 20f, 9.5f, 40f)
                reflectiveQuadTo(548f, 874f)
                quadToRelative(-17f, 3f, -34f, 4.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -440f)
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
            }
        }.build()
        
        return _Shutter_speed_minus!!
    }

private var _Shutter_speed_minus: ImageVector? = null

