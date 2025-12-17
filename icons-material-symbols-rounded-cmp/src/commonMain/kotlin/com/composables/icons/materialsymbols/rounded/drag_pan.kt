package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Drag_pan: ImageVector
    get() {
        if (_Drag_pan != null) return _Drag_pan!!
        
        _Drag_pan = ImageVector.Builder(
            name = "drag_pan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 520f)
                horizontalLineTo(235f)
                lineToRelative(44f, 43f)
                quadToRelative(12f, 12f, 12f, 29f)
                reflectiveQuadToRelative(-12f, 29f)
                quadToRelative(-12f, 12f, -29f, 12f)
                reflectiveQuadToRelative(-29f, -12f)
                lineTo(108f, 508f)
                quadToRelative(-6f, -6f, -8.5f, -13f)
                reflectiveQuadTo(97f, 480f)
                quadToRelative(0f, -8f, 2.5f, -15f)
                reflectiveQuadToRelative(8.5f, -13f)
                lineToRelative(113f, -113f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(278f, 396f)
                lineToRelative(-44f, 44f)
                horizontalLineToRelative(206f)
                verticalLineToRelative(-206f)
                lineToRelative(-45f, 45f)
                quadToRelative(-12f, 12f, -28f, 11.5f)
                reflectiveQuadTo(339f, 278f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(113f, -113f)
                quadToRelative(6f, -6f, 13f, -8.5f)
                reflectiveQuadToRelative(15f, -2.5f)
                quadToRelative(8f, 0f, 15f, 2.5f)
                reflectiveQuadToRelative(13f, 8.5f)
                lineToRelative(114f, 114f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(565f, 278f)
                lineToRelative(-45f, -44f)
                verticalLineToRelative(206f)
                horizontalLineToRelative(205f)
                lineToRelative(-44f, -43f)
                quadToRelative(-12f, -12f, -12f, -29f)
                reflectiveQuadToRelative(12f, -29f)
                quadToRelative(12f, -12f, 29f, -12f)
                reflectiveQuadToRelative(29f, 12f)
                lineToRelative(113f, 113f)
                quadToRelative(6f, 6f, 8.5f, 13f)
                reflectiveQuadToRelative(2.5f, 15f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineTo(738f, 622f)
                quadToRelative(-12f, 12f, -28f, 11.5f)
                reflectiveQuadTo(682f, 621f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(44f, -44f)
                horizontalLineTo(520f)
                verticalLineToRelative(205f)
                lineToRelative(43f, -44f)
                quadToRelative(12f, -12f, 29f, -12f)
                reflectiveQuadToRelative(29f, 12f)
                quadToRelative(12f, 12f, 12f, 29f)
                reflectiveQuadToRelative(-12f, 29f)
                lineTo(508f, 852f)
                quadToRelative(-6f, 6f, -13f, 8.5f)
                reflectiveQuadTo(480f, 863f)
                quadToRelative(-8f, 0f, -15f, -2.5f)
                reflectiveQuadToRelative(-13f, -8.5f)
                lineTo(338f, 738f)
                quadToRelative(-12f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(339f, 681f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(44f, 45f)
                verticalLineToRelative(-206f)
                close()
            }
        }.build()
        
        return _Drag_pan!!
    }

private var _Drag_pan: ImageVector? = null

