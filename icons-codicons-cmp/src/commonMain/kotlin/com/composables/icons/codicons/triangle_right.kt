package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.TriangleRight: ImageVector
    get() {
        if (_TriangleRight != null) return _TriangleRight!!
        
        _TriangleRight = ImageVector.Builder(
            name = "triangle-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.57107f, 11.8403f)
                curveTo(6.90803f, 12.2987f, 6f, 11.8272f, 6f, 11.0244f)
                verticalLineTo(4.9756f)
                curveTo(6f, 4.17287f, 6.90803f, 3.70133f, 7.57106f, 4.15974f)
                lineTo(11.3555f, 6.77622f)
                curveTo(12.2133f, 7.36933f, 12.2134f, 8.6307f, 11.3555f, 9.22382f)
                lineTo(7.57107f, 11.8403f)
                close()
            }
        }.build()
        
        return _TriangleRight!!
    }

private var _TriangleRight: ImageVector? = null

