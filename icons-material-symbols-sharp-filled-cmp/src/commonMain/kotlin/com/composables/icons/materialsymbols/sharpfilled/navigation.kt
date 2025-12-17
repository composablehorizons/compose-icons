package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Navigation: ImageVector
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
            }
        }.build()
        
        return _Navigation!!
    }

private var _Navigation: ImageVector? = null

