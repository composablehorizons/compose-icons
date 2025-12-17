package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Mobile_hand_left_off: ImageVector
    get() {
        if (_Mobile_hand_left_off != null) return _Mobile_hand_left_off!!
        
        _Mobile_hand_left_off = ImageVector.Builder(
            name = "mobile_hand_left_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(800f, 688f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-448f)
                horizontalLineTo(360f)
                verticalLineToRelative(88f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-8f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(360f, 80f)
                horizontalLineToRelative(360f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 160f)
                verticalLineToRelative(528f)
                close()
                moveToRelative(47f, 216f)
                quadToRelative(-12f, 11f, -28f, 11.5f)
                reflectiveQuadTo(791f, 904f)
                lineToRelative(-33f, -33f)
                quadToRelative(-8f, 5f, -17.5f, 7f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(412f)
                lineToRelative(67f, -80f)
                horizontalLineToRelative(208f)
                lineTo(574f, 686f)
                lineTo(412f, 880f)
                quadToRelative(-17f, 19f, -40f, 29.5f)
                reflectiveQuadTo(323f, 920f)
                horizontalLineToRelative(-43f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -42f, 20f, -77f)
                reflectiveQuadToRelative(53f, -57f)
                lineTo(56f, 168f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(56f, 112f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(736f, 736f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(847f, 904f)
                close()
                moveTo(540f, 384f)
                close()
                moveToRelative(0f, -104f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(580f, 240f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(540f, 200f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(500f, 240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(540f, 280f)
                close()
                moveToRelative(147f, 520f)
                close()
                moveToRelative(-407f, 40f)
                horizontalLineToRelative(43f)
                quadToRelative(9f, 0f, 17f, -3.5f)
                reflectiveQuadToRelative(14f, -10.5f)
                lineToRelative(138f, -168f)
                lineToRelative(-212f, 107f)
                verticalLineToRelative(-373f)
                lineToRelative(-27f, -27f)
                quadToRelative(-23f, 8f, -38f, 28.5f)
                reflectiveQuadTo(200f, 440f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 34f, 23.5f, 57f)
                reflectiveQuadToRelative(56.5f, 23f)
                close()
                moveToRelative(80f, -205f)
                lineToRelative(107f, -54f)
                lineToRelative(-107f, -109f)
                verticalLineToRelative(163f)
                close()
            }
        }.build()
        
        return _Mobile_hand_left_off!!
    }

private var _Mobile_hand_left_off: ImageVector? = null

