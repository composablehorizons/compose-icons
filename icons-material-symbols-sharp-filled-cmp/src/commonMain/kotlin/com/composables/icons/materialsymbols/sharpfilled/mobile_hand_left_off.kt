package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mobile_hand_left_off: ImageVector
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
                moveTo(819f, 932f)
                lineToRelative(-52f, -52f)
                horizontalLineTo(464f)
                lineToRelative(138f, -165f)
                lineToRelative(-57f, -57f)
                lineToRelative(-161f, 193f)
                quadToRelative(-11f, 14f, -27.5f, 21.5f)
                reflectiveQuadTo(322f, 880f)
                horizontalLineToRelative(-42f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-320f)
                lineToRelative(84f, -84f)
                lineTo(28f, 140f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-57f, 56f)
                close()
                moveToRelative(-19f, -244f)
                lineTo(280f, 168f)
                verticalLineToRelative(-88f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(608f)
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
                moveTo(320f, 700f)
                lineToRelative(178f, -89f)
                lineToRelative(-178f, -179f)
                verticalLineToRelative(268f)
                close()
            }
        }.build()
        
        return _Mobile_hand_left_off!!
    }

private var _Mobile_hand_left_off: ImageVector? = null

