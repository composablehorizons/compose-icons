package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mobile_hand: ImageVector
    get() {
        if (_Mobile_hand != null) return _Mobile_hand!!
        
        _Mobile_hand = ImageVector.Builder(
            name = "mobile_hand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 800f)
                verticalLineToRelative(-640f)
                verticalLineToRelative(640f)
                close()
                moveToRelative(600f, -40f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(680f, 920f)
                horizontalLineToRelative(-43f)
                quadToRelative(-26f, 0f, -49f, -10.5f)
                reflectiveQuadTo(548f, 880f)
                lineTo(346f, 638f)
                lineToRelative(86f, -86f)
                lineToRelative(168f, 83f)
                verticalLineToRelative(-355f)
                horizontalLineToRelative(80f)
                lineToRelative(160f, 160f)
                verticalLineToRelative(320f)
                close()
                moveTo(160f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-120f)
                horizontalLineTo(240f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(241f)
                lineToRelative(67f, 80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(260f, -600f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(460f, 240f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(420f, 200f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(380f, 240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(420f, 280f)
                close()
                moveToRelative(217f, 560f)
                horizontalLineToRelative(43f)
                quadToRelative(33f, 0f, 56.5f, -23f)
                reflectiveQuadToRelative(23.5f, -57f)
                verticalLineToRelative(-284f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(369f)
                lineTo(468f, 658f)
                lineToRelative(138f, 168f)
                quadToRelative(6f, 7f, 14f, 10.5f)
                reflectiveQuadToRelative(17f, 3.5f)
                close()
            }
        }.build()
        
        return _Mobile_hand!!
    }

private var _Mobile_hand: ImageVector? = null

