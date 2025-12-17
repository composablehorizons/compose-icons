package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Custom_typography: ImageVector
    get() {
        if (_Custom_typography != null) return _Custom_typography!!
        
        _Custom_typography = ImageVector.Builder(
            name = "custom_typography",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 880f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(520f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-320f, -80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(137f, -240f)
                horizontalLineToRelative(83f)
                lineToRelative(44f, -123f)
                horizontalLineToRelative(193f)
                lineToRelative(43f, 123f)
                horizontalLineToRelative(83f)
                lineTo(523f, 80f)
                horizontalLineToRelative(-86f)
                lineTo(257f, 560f)
                close()
                moveToRelative(151f, -192f)
                lineToRelative(70f, -199f)
                horizontalLineToRelative(4f)
                lineToRelative(70f, 199f)
                horizontalLineTo(408f)
                close()
            }
        }.build()
        
        return _Custom_typography!!
    }

private var _Custom_typography: ImageVector? = null

