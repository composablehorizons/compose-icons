package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Fonts: ImageVector
    get() {
        if (_Fonts != null) return _Fonts!!
        
        _Fonts = ImageVector.Builder(
            name = "fonts",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.258f, 3f)
                horizontalLineToRelative(-8.51f)
                lineToRelative(-0.083f, 2.46f)
                horizontalLineToRelative(0.479f)
                curveToRelative(0.26f, -1.544f, 0.758f, -1.783f, 2.693f, -1.845f)
                lineToRelative(0.424f, -0.013f)
                verticalLineToRelative(7.827f)
                curveToRelative(0f, 0.663f, -0.144f, 0.82f, -1.3f, 0.923f)
                verticalLineToRelative(0.52f)
                horizontalLineToRelative(4.082f)
                verticalLineToRelative(-0.52f)
                curveToRelative(-1.162f, -0.103f, -1.306f, -0.26f, -1.306f, -0.923f)
                verticalLineTo(3.602f)
                lineToRelative(0.431f, 0.013f)
                curveToRelative(1.934f, 0.062f, 2.434f, 0.301f, 2.693f, 1.846f)
                horizontalLineToRelative(0.479f)
                close()
            }
        }.build()
        
        return _Fonts!!
    }

private var _Fonts: ImageVector? = null

