package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mobile_hand_left_off: ImageVector
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
                verticalLineToRelative(-88f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(608f)
                close()
                moveToRelative(19f, 244f)
                lineToRelative(-52f, -52f)
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
                lineToRelative(104f, -104f)
                lineTo(28f, 140f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-57f, 56f)
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
                moveToRelative(407f, -40f)
                close()
                moveTo(360f, 635f)
                lineToRelative(107f, -54f)
                lineToRelative(-107f, -109f)
                verticalLineToRelative(163f)
                close()
            }
        }.build()
        
        return _Mobile_hand_left_off!!
    }

private var _Mobile_hand_left_off: ImageVector? = null

