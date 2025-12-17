package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mobile_hand_off: ImageVector
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
                moveTo(84f, 84f)
                lineTo(876f, 876f)
                lineToRelative(-57f, 56f)
                lineToRelative(-412f, -412f)
                lineToRelative(-115f, 115f)
                lineTo(496f, 880f)
                horizontalLineTo(160f)
                verticalLineToRelative(-608f)
                lineTo(28f, 140f)
                lineToRelative(56f, -56f)
                close()
                moveToRelative(596f, -4f)
                verticalLineToRelative(160f)
                horizontalLineTo(560f)
                verticalLineToRelative(208f)
                lineTo(192f, 80f)
                horizontalLineToRelative(488f)
                close()
                moveTo(420f, 200f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(380f, 240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(420f, 280f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(460f, 240f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(420f, 200f)
                close()
                moveToRelative(220f, 328f)
                verticalLineToRelative(-208f)
                horizontalLineToRelative(40f)
                lineToRelative(120f, 120f)
                verticalLineToRelative(248f)
                lineTo(640f, 528f)
                close()
                moveToRelative(-2f, 352f)
                quadToRelative(-18f, 0f, -34.5f, -7.5f)
                reflectiveQuadTo(576f, 851f)
                lineTo(400f, 640f)
                lineToRelative(40f, -40f)
                lineToRelative(320f, 160f)
                lineToRelative(35f, 35f)
                quadToRelative(-11f, 37f, -42.5f, 61f)
                reflectiveQuadTo(680f, 880f)
                horizontalLineToRelative(-42f)
                close()
            }
        }.build()
        
        return _Mobile_hand_off!!
    }

private var _Mobile_hand_off: ImageVector? = null

