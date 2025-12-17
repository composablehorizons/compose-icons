package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Details: ImageVector
    get() {
        if (_Details != null) return _Details!!
        
        _Details = ImageVector.Builder(
            name = "details",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                lineToRelative(400f, -720f)
                lineToRelative(400f, 720f)
                horizontalLineTo(80f)
                close()
                moveToRelative(136f, -80f)
                horizontalLineToRelative(224f)
                verticalLineToRelative(-403f)
                lineTo(216f, 760f)
                close()
                moveToRelative(304f, 0f)
                horizontalLineToRelative(224f)
                lineTo(520f, 357f)
                verticalLineToRelative(403f)
                close()
            }
        }.build()
        
        return _Details!!
    }

private var _Details: ImageVector? = null

