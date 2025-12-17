package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Mobile_cancel: ImageVector
    get() {
        if (_Mobile_cancel != null) return _Mobile_cancel!!
        
        _Mobile_cancel = ImageVector.Builder(
            name = "mobile_cancel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 840f)
                verticalLineToRelative(-720f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 40f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 120f)
                verticalLineToRelative(124f)
                quadToRelative(18f, 7f, 29f, 22f)
                reflectiveQuadToRelative(11f, 34f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 19f, -11f, 34f)
                reflectiveQuadToRelative(-29f, 22f)
                verticalLineToRelative(404f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 920f)
                horizontalLineTo(280f)
                close()
                moveToRelative(200f, -383f)
                lineToRelative(65f, 65f)
                quadToRelative(11f, 11f, 27.5f, 11f)
                reflectiveQuadToRelative(28.5f, -11f)
                quadToRelative(12f, -12f, 12f, -28.5f)
                reflectiveQuadTo(601f, 545f)
                lineToRelative(-65f, -65f)
                lineToRelative(66f, -65f)
                quadToRelative(12f, -12f, 12f, -28f)
                reflectiveQuadToRelative(-12f, -28f)
                quadToRelative(-12f, -12f, -28.5f, -12f)
                reflectiveQuadTo(545f, 359f)
                lineToRelative(-65f, 65f)
                lineToRelative(-66f, -66f)
                quadToRelative(-12f, -12f, -28f, -11.5f)
                reflectiveQuadTo(358f, 359f)
                quadToRelative(-11f, 12f, -11.5f, 28f)
                reflectiveQuadToRelative(11.5f, 28f)
                lineToRelative(65f, 65f)
                lineToRelative(-65f, 66f)
                quadToRelative(-11f, 11f, -11.5f, 27.5f)
                reflectiveQuadTo(358f, 602f)
                quadToRelative(11f, 11f, 28f, 11f)
                reflectiveQuadToRelative(28f, -11f)
                lineToRelative(66f, -65f)
                close()
            }
        }.build()
        
        return _Mobile_cancel!!
    }

private var _Mobile_cancel: ImageVector? = null

