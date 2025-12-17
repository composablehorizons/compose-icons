package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Signal_cellular_alt: ImageVector
    get() {
        if (_Signal_cellular_alt != null) return _Signal_cellular_alt!!
        
        _Signal_cellular_alt = ImageVector.Builder(
            name = "signal_cellular_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 800f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(240f)
                horizontalLineTo(200f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(440f)
                horizontalLineTo(440f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(640f)
                horizontalLineTo(680f)
                close()
            }
        }.build()
        
        return _Signal_cellular_alt!!
    }

private var _Signal_cellular_alt: ImageVector? = null

