package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mobile_hand_left: ImageVector
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
                verticalLineToRelative(-297f)
                verticalLineToRelative(68f)
                verticalLineToRelative(-411f)
                verticalLineToRelative(640f)
                close()
                moveTo(280f, 920f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                verticalLineToRelative(-320f)
                lineToRelative(160f, -160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(355f)
                lineToRelative(168f, -83f)
                lineToRelative(86f, 86f)
                lineTo(412f, 880f)
                quadToRelative(-17f, 19f, -40f, 29.5f)
                reflectiveQuadTo(323f, 920f)
                horizontalLineToRelative(-43f)
                close()
                moveToRelative(132f, -40f)
                lineToRelative(67f, -80f)
                horizontalLineToRelative(241f)
                verticalLineToRelative(-640f)
                horizontalLineTo(360f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(800f)
                horizontalLineTo(412f)
                close()
                moveToRelative(128f, -600f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(580f, 240f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(540f, 200f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(500f, 240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(540f, 280f)
                close()
                moveTo(280f, 840f)
                horizontalLineToRelative(43f)
                quadToRelative(9f, 0f, 17f, -3.5f)
                reflectiveQuadToRelative(14f, -10.5f)
                lineToRelative(138f, -168f)
                lineToRelative(-212f, 107f)
                verticalLineToRelative(-369f)
                lineToRelative(-80f, 80f)
                verticalLineToRelative(284f)
                quadToRelative(0f, 34f, 23.5f, 57f)
                reflectiveQuadToRelative(56.5f, 23f)
                close()
            }
        }.build()
        
        return _Mobile_hand_left!!
    }

private var _Mobile_hand_left: ImageVector? = null

