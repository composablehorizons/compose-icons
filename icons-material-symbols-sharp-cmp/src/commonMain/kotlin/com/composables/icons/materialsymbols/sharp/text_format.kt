package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Text_format: ImageVector
    get() {
        if (_Text_format != null) return _Text_format!!
        
        _Text_format = ImageVector.Builder(
            name = "text_format",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 760f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                close()
                moveToRelative(76f, -160f)
                lineToRelative(164f, -440f)
                horizontalLineToRelative(80f)
                lineToRelative(164f, 440f)
                horizontalLineToRelative(-76f)
                lineToRelative(-38f, -112f)
                horizontalLineTo(392f)
                lineToRelative(-40f, 112f)
                horizontalLineToRelative(-76f)
                close()
                moveToRelative(138f, -176f)
                horizontalLineToRelative(132f)
                lineToRelative(-64f, -182f)
                horizontalLineToRelative(-4f)
                lineToRelative(-64f, 182f)
                close()
            }
        }.build()
        
        return _Text_format!!
    }

private var _Text_format: ImageVector? = null

