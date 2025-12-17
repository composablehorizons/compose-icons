package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Tools_level: ImageVector
    get() {
        if (_Tools_level != null) return _Tools_level!!
        
        _Tools_level = ImageVector.Builder(
            name = "tools_level",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 680f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 600f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 280f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 360f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 680f)
                horizontalLineTo(160f)
                close()
                moveToRelative(220f, -200f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-60f)
                quadToRelative(-24f, 0f, -42f, 18f)
                reflectiveQuadToRelative(-18f, 42f)
                quadToRelative(0f, 24f, 18f, 42f)
                reflectiveQuadToRelative(42f, 18f)
                close()
                moveToRelative(140f, 0f)
                horizontalLineToRelative(60f)
                quadToRelative(24f, 0f, 42f, -18f)
                reflectiveQuadToRelative(18f, -42f)
                quadToRelative(0f, -24f, -18f, -42f)
                reflectiveQuadToRelative(-42f, -18f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Tools_level!!
    }

private var _Tools_level: ImageVector? = null

