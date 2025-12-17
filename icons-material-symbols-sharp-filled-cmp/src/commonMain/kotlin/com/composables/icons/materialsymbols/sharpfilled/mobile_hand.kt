package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mobile_hand: ImageVector
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
                moveTo(160f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(160f)
                horizontalLineTo(560f)
                verticalLineToRelative(331f)
                lineToRelative(-136f, -68f)
                lineToRelative(-132f, 132f)
                lineTo(496f, 880f)
                horizontalLineTo(160f)
                close()
                moveToRelative(478f, 0f)
                quadToRelative(-18f, 0f, -34.5f, -7.5f)
                reflectiveQuadTo(576f, 851f)
                lineTo(400f, 640f)
                lineToRelative(40f, -40f)
                lineToRelative(200f, 100f)
                verticalLineToRelative(-380f)
                horizontalLineToRelative(40f)
                lineToRelative(120f, 120f)
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

