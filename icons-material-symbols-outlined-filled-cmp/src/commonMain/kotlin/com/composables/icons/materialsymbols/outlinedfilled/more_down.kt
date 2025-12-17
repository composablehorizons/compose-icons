package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.More_down: ImageVector
    get() {
        if (_More_down != null) return _More_down!!
        
        _More_down = ImageVector.Builder(
            name = "more_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 760f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                close()
                moveToRelative(200f, -200f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(400f)
                close()
            }
        }.build()
        
        return _More_down!!
    }

private var _More_down: ImageVector? = null

