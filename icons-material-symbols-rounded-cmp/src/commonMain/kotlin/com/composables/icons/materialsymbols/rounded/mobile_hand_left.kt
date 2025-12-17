package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Mobile_hand_left: ImageVector
    get() {
        if (_Mobile_hand_left != null) return _Mobile_hand_left!!
        
        _Mobile_hand_left = ImageVector.Builder(
            name = "mobile_hand_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 800f)
                verticalLineToRelative(-268f)
                verticalLineToRelative(39f)
                verticalLineToRelative(-411f)
                verticalLineToRelative(640f)
                close()
                moveTo(323f, 920f)
                horizontalLineToRelative(-43f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(355f)
                lineToRelative(116f, -58f)
                quadToRelative(23f, -12f, 49f, -7.5f)
                reflectiveQuadToRelative(44f, 22.5f)
                lineToRelative(19f, 20f)
                quadToRelative(11f, 11f, 12f, 26.5f)
                reflectiveQuadToRelative(-9f, 27.5f)
                lineTo(412f, 880f)
                quadToRelative(-17f, 19f, -40f, 29.5f)
                reflectiveQuadTo(323f, 920f)
                close()
                moveToRelative(397f, -40f)
                horizontalLineTo(412f)
                lineToRelative(67f, -80f)
                horizontalLineToRelative(241f)
                verticalLineToRelative(-640f)
                horizontalLineTo(360f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(360f, 80f)
                horizontalLineToRelative(360f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 160f)
                verticalLineToRelative(640f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                close()
                moveTo(540f, 280f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(580f, 240f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(540f, 200f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(500f, 240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(540f, 280f)
                close()
                moveTo(323f, 840f)
                quadToRelative(9f, 0f, 17f, -3.5f)
                reflectiveQuadToRelative(14f, -10.5f)
                lineToRelative(139f, -167f)
                lineToRelative(-155f, 77f)
                quadToRelative(-20f, 10f, -39f, -1.5f)
                reflectiveQuadTo(280f, 700f)
                verticalLineToRelative(-340f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(200f, 440f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 34f, 23.5f, 57f)
                reflectiveQuadToRelative(56.5f, 23f)
                horizontalLineToRelative(43f)
                close()
            }
        }.build()
        
        return _Mobile_hand_left!!
    }

private var _Mobile_hand_left: ImageVector? = null

