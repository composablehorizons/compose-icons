package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mobile_sound_off: ImageVector
    get() {
        if (_Mobile_sound_off != null) return _Mobile_sound_off!!
        
        _Mobile_sound_off = ImageVector.Builder(
            name = "mobile_sound_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(678f, 565f)
                lineToRelative(-62f, -61f)
                quadToRelative(2f, -6f, 3f, -12f)
                reflectiveQuadToRelative(1f, -12f)
                quadToRelative(0f, -16f, -6.5f, -30.5f)
                reflectiveQuadTo(595f, 424f)
                lineToRelative(58f, -58f)
                quadToRelative(23f, 23f, 35f, 52.5f)
                reflectiveQuadToRelative(12f, 61.5f)
                quadToRelative(0f, 22f, -5.5f, 43f)
                reflectiveQuadTo(678f, 565f)
                close()
                moveToRelative(99f, 98f)
                lineToRelative(-57f, -57f)
                quadToRelative(20f, -27f, 30f, -59f)
                reflectiveQuadToRelative(10f, -67f)
                quadToRelative(0f, -45f, -17f, -85f)
                reflectiveQuadToRelative(-48f, -71f)
                lineToRelative(56f, -56f)
                quadToRelative(43f, 42f, 66f, 97f)
                reflectiveQuadToRelative(23f, 115f)
                quadToRelative(0f, 51f, -16f, 97.5f)
                reflectiveQuadTo(777f, 663f)
                close()
                moveToRelative(43f, 269f)
                lineTo(28f, 140f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(480f, 240f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 200f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 240f)
                close()
                moveTo(200f, 920f)
                verticalLineToRelative(-720f)
                lineToRelative(560f, 560f)
                verticalLineToRelative(160f)
                horizontalLineTo(200f)
                close()
                moveToRelative(310f, -524f)
                lineTo(205f, 91f)
                verticalLineToRelative(-51f)
                horizontalLineToRelative(555f)
                verticalLineToRelative(106f)
                lineTo(510f, 396f)
                close()
            }
        }.build()
        
        return _Mobile_sound_off!!
    }

private var _Mobile_sound_off: ImageVector? = null

