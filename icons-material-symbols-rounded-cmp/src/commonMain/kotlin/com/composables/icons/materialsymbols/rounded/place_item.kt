package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Place_item: ImageVector
    get() {
        if (_Place_item != null) return _Place_item!!
        
        _Place_item = ImageVector.Builder(
            name = "place_item",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 280f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 360f)
                horizontalLineTo(200f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-400f)
                horizontalLineTo(640f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 280f)
                horizontalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 360f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(320f, -353f)
                lineToRelative(36f, -36f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineTo(508f, 612f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineTo(348f, 508f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(348f, 452f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(36f, 35f)
                verticalLineToRelative(-447f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 0f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 40f)
                verticalLineToRelative(447f)
                close()
            }
        }.build()
        
        return _Place_item!!
    }

private var _Place_item: ImageVector? = null

