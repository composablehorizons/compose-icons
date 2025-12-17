package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Mobile_hand: ImageVector
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
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(360f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 160f)
                verticalLineToRelative(80f)
                horizontalLineTo(560f)
                verticalLineToRelative(331f)
                lineToRelative(-50f, -26f)
                quadToRelative(-38f, -19f, -80f, -13f)
                reflectiveQuadToRelative(-72f, 36f)
                lineToRelative(-66f, 67f)
                lineTo(496f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(398f, 0f)
                quadToRelative(-18f, 0f, -34.5f, -7.5f)
                reflectiveQuadTo(576f, 851f)
                lineTo(400f, 640f)
                lineToRelative(15f, -15f)
                quadToRelative(11f, -11f, 27.5f, -13.5f)
                reflectiveQuadTo(474f, 617f)
                lineToRelative(166f, 83f)
                verticalLineToRelative(-380f)
                horizontalLineToRelative(40f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                horizontalLineToRelative(-42f)
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
        
        return _Mobile_hand!!
    }

private var _Mobile_hand: ImageVector? = null

