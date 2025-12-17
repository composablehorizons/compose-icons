package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mobile_hand_off: ImageVector
    get() {
        if (_Mobile_hand_off != null) return _Mobile_hand_off!!
        
        _Mobile_hand_off = ImageVector.Builder(
            name = "mobile_hand_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 488f)
                verticalLineToRelative(-208f)
                horizontalLineToRelative(80f)
                lineToRelative(160f, 160f)
                verticalLineToRelative(288f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-174f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(174f)
                lineToRelative(-80f, -80f)
                close()
                moveToRelative(37f, 432f)
                quadToRelative(-26f, 0f, -49f, -10.5f)
                reflectiveQuadTo(548f, 880f)
                lineTo(346f, 638f)
                lineToRelative(85f, -87f)
                lineToRelative(239f, 119f)
                lineToRelative(155f, 156f)
                quadToRelative(-19f, 42f, -58f, 68f)
                reflectiveQuadToRelative(-87f, 26f)
                horizontalLineToRelative(-43f)
                close()
                moveToRelative(-37f, -640f)
                verticalLineToRelative(-120f)
                horizontalLineTo(272f)
                lineToRelative(-81f, -80f)
                horizontalLineToRelative(489f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(37f, 560f)
                horizontalLineToRelative(43f)
                quadToRelative(10f, 0f, 19.5f, -2f)
                reflectiveQuadToRelative(17.5f, -7f)
                lineToRelative(-94f, -94f)
                lineToRelative(-155f, -79f)
                lineToRelative(138f, 168f)
                quadToRelative(6f, 7f, 14f, 10.5f)
                reflectiveQuadToRelative(17f, 3.5f)
                close()
                moveTo(436f, 304f)
                close()
                moveToRelative(-15f, 230f)
                close()
                moveTo(876f, 876f)
                lineToRelative(-57f, 56f)
                lineToRelative(-579f, -579f)
                verticalLineToRelative(447f)
                horizontalLineToRelative(241f)
                lineToRelative(67f, 80f)
                horizontalLineTo(160f)
                verticalLineToRelative(-607f)
                lineTo(28f, 140f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                close()
                moveTo(420f, 280f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(460f, 240f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(420f, 200f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(380f, 240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(420f, 280f)
                close()
            }
        }.build()
        
        return _Mobile_hand_off!!
    }

private var _Mobile_hand_off: ImageVector? = null

