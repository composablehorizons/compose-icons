package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Label_off: ImageVector
    get() {
        if (_Label_off != null) return _Label_off!!
        
        _Label_off = ImageVector.Builder(
            name = "label_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(738f, 624f)
                lineToRelative(-58f, -58f)
                lineToRelative(62f, -86f)
                lineToRelative(-142f, -200f)
                horizontalLineTo(394f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(286f)
                quadToRelative(20f, 0f, 37f, 8.5f)
                reflectiveQuadToRelative(29f, 25.5f)
                lineToRelative(174f, 246f)
                lineToRelative(-102f, 144f)
                close()
                moveToRelative(54f, 280f)
                lineTo(638f, 750f)
                quadToRelative(-9f, 5f, -18f, 7.5f)
                reflectiveQuadToRelative(-20f, 2.5f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 680f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -11f, 2.5f, -20f)
                reflectiveQuadToRelative(7.5f, -18f)
                lineToRelative(-74f, -74f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(383f, 496f)
                close()
                moveToRelative(154f, -73f)
                close()
                moveToRelative(31f, 257f)
                lineTo(200f, 312f)
                verticalLineToRelative(368f)
                horizontalLineToRelative(368f)
                close()
            }
        }.build()
        
        return _Label_off!!
    }

private var _Label_off: ImageVector? = null

