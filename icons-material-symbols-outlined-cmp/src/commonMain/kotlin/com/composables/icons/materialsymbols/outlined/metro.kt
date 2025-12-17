package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Metro: ImageVector
    get() {
        if (_Metro != null) return _Metro!!
        
        _Metro = ImageVector.Builder(
            name = "metro",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(162f)
                lineToRelative(198f, 522f)
                lineToRelative(196f, -522f)
                horizontalLineToRelative(164f)
                verticalLineToRelative(720f)
                horizontalLineTo(720f)
                verticalLineToRelative(-490f)
                lineTo(531f, 840f)
                horizontalLineTo(429f)
                lineTo(240f, 353f)
                verticalLineToRelative(487f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Metro!!
    }

private var _Metro: ImageVector? = null

