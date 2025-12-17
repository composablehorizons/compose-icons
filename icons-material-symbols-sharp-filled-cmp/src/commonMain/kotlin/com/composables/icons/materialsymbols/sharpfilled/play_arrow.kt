package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Play_arrow: ImageVector
    get() {
        if (_Play_arrow != null) return _Play_arrow!!
        
        _Play_arrow = ImageVector.Builder(
            name = "play_arrow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 760f)
                verticalLineToRelative(-560f)
                lineToRelative(440f, 280f)
                lineToRelative(-440f, 280f)
                close()
            }
        }.build()
        
        return _Play_arrow!!
    }

private var _Play_arrow: ImageVector? = null

