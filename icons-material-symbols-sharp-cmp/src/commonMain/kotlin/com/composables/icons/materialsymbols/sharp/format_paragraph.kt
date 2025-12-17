package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Format_paragraph: ImageVector
    get() {
        if (_Format_paragraph != null) return _Format_paragraph!!
        
        _Format_paragraph = ImageVector.Builder(
            name = "format_paragraph",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 800f)
                verticalLineToRelative(-240f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(160f, 360f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(360f, 160f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-560f)
                horizontalLineTo(440f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Format_paragraph!!
    }

private var _Format_paragraph: ImageVector? = null

