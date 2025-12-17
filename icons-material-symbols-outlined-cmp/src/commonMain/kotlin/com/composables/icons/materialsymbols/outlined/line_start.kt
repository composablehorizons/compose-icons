package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Line_start: ImageVector
    get() {
        if (_Line_start != null) return _Line_start!!
        
        _Line_start = ImageVector.Builder(
            name = "line_start",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(180f, 580f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(31f, 0f, 56f, 17f)
                reflectiveQuadToRelative(36f, 43f)
                horizontalLineToRelative(608f)
                verticalLineToRelative(80f)
                horizontalLineTo(272f)
                quadToRelative(-11f, 26f, -36f, 43f)
                reflectiveQuadToRelative(-56f, 17f)
                close()
            }
        }.build()
        
        return _Line_start!!
    }

private var _Line_start: ImageVector? = null

