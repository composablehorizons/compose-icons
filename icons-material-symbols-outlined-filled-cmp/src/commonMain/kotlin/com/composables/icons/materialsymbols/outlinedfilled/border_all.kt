package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Border_all: ImageVector
    get() {
        if (_Border_all != null) return _Border_all!!
        
        _Border_all = ImageVector.Builder(
            name = "border_all",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 840f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                horizontalLineTo(520f)
                close()
                moveToRelative(0f, -400f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                horizontalLineTo(520f)
                close()
                moveToRelative(-400f, 0f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, 400f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Border_all!!
    }

private var _Border_all: ImageVector? = null

