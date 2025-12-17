package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Navigation: ImageVector
    get() {
        if (_Navigation != null) return _Navigation!!
        
        _Navigation = ImageVector.Builder(
            name = "navigation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                lineToRelative(-40f, -40f)
                lineToRelative(320f, -720f)
                lineToRelative(320f, 720f)
                lineToRelative(-40f, 40f)
                lineToRelative(-280f, -120f)
                lineToRelative(-280f, 120f)
                close()
                moveToRelative(84f, -124f)
                lineToRelative(196f, -84f)
                lineToRelative(196f, 84f)
                lineToRelative(-196f, -440f)
                lineToRelative(-196f, 440f)
                close()
                moveToRelative(196f, -84f)
                close()
            }
        }.build()
        
        return _Navigation!!
    }

private var _Navigation: ImageVector? = null

