package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Legend_toggle: ImageVector
    get() {
        if (_Legend_toggle != null) return _Legend_toggle!!
        
        _Legend_toggle = ImageVector.Builder(
            name = "legend_toggle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 760f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-94f)
                lineToRelative(240f, -146f)
                lineToRelative(200f, 142f)
                lineToRelative(200f, -142f)
                verticalLineToRelative(98f)
                lineTo(600f, 440f)
                lineTo(397f, 296f)
                lineTo(160f, 440f)
                close()
            }
        }.build()
        
        return _Legend_toggle!!
    }

private var _Legend_toggle: ImageVector? = null

