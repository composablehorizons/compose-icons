package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Arrow_shape_up: ImageVector
    get() {
        if (_Arrow_shape_up != null) return _Arrow_shape_up!!
        
        _Arrow_shape_up = ImageVector.Builder(
            name = "arrow_shape_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 840f)
                verticalLineToRelative(-240f)
                horizontalLineTo(120f)
                lineToRelative(360f, -440f)
                lineToRelative(360f, 440f)
                horizontalLineTo(640f)
                verticalLineToRelative(240f)
                horizontalLineTo(320f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(111f)
                lineTo(480f, 286f)
                lineTo(289f, 520f)
                horizontalLineToRelative(111f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(80f, -240f)
                close()
            }
        }.build()
        
        return _Arrow_shape_up!!
    }

private var _Arrow_shape_up: ImageVector? = null

