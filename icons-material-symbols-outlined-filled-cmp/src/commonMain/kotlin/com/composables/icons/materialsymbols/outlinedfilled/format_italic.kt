package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Format_italic: ImageVector
    get() {
        if (_Format_italic != null) return _Format_italic!!
        
        _Format_italic = ImageVector.Builder(
            name = "format_italic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 760f)
                verticalLineToRelative(-100f)
                horizontalLineToRelative(160f)
                lineToRelative(120f, -360f)
                horizontalLineTo(320f)
                verticalLineToRelative(-100f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(100f)
                horizontalLineTo(580f)
                lineTo(460f, 660f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(100f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Format_italic!!
    }

private var _Format_italic: ImageVector? = null

