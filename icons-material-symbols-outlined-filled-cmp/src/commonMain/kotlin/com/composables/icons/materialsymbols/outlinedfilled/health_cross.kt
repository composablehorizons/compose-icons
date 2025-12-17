package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Health_cross: ImageVector
    get() {
        if (_Health_cross != null) return _Health_cross!!
        
        _Health_cross = ImageVector.Builder(
            name = "health_cross",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 840f)
                verticalLineToRelative(-200f)
                horizontalLineTo(120f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(320f)
                horizontalLineTo(640f)
                verticalLineToRelative(200f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Health_cross!!
    }

private var _Health_cross: ImageVector? = null

