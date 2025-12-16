package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ArrowSmallUp: ImageVector
    get() {
        if (_ArrowSmallUp != null) return _ArrowSmallUp!!
        
        _ArrowSmallUp = ImageVector.Builder(
            name = "arrow-small-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.85398f, 6.14601f)
                lineTo(7.85398f, 4.14601f)
                curveTo(7.65898f, 3.95101f, 7.34198f, 3.95101f, 7.14698f, 4.14601f)
                lineTo(5.14698f, 6.14601f)
                curveTo(4.95198f, 6.34101f, 4.95198f, 6.65801f, 5.14698f, 6.85301f)
                curveTo(5.34198f, 7.04801f, 5.65898f, 7.04801f, 5.85398f, 6.85301f)
                lineTo(6.99998f, 5.70701f)
                verticalLineTo(10.5f)
                curveTo(6.99998f, 10.776f, 7.22398f, 11f, 7.49998f, 11f)
                curveTo(7.77598f, 11f, 7.99998f, 10.776f, 7.99998f, 10.5f)
                verticalLineTo(5.70701f)
                lineTo(9.14598f, 6.85301f)
                curveTo(9.24398f, 6.95101f, 9.37198f, 6.99901f, 9.49998f, 6.99901f)
                curveTo(9.62798f, 6.99901f, 9.75598f, 6.95001f, 9.85398f, 6.85301f)
                curveTo(10.049f, 6.65801f, 10.049f, 6.34101f, 9.85398f, 6.14601f)
                close()
            }
        }.build()
        
        return _ArrowSmallUp!!
    }

private var _ArrowSmallUp: ImageVector? = null

