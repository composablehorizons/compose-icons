package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.TriangleLeft: ImageVector
    get() {
        if (_TriangleLeft != null) return _TriangleLeft!!
        
        _TriangleLeft = ImageVector.Builder(
            name = "triangle-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.42784f, 11.8403f)
                curveTo(10.0909f, 12.2987f, 10.9989f, 11.8272f, 10.9989f, 11.0244f)
                verticalLineTo(4.9756f)
                curveTo(10.9989f, 4.17287f, 10.0909f, 3.70133f, 9.42784f, 4.15974f)
                lineTo(5.64342f, 6.77622f)
                curveTo(4.78555f, 7.36933f, 4.78555f, 8.6307f, 5.64342f, 9.22382f)
                lineTo(9.42784f, 11.8403f)
                close()
            }
        }.build()
        
        return _TriangleLeft!!
    }

private var _TriangleLeft: ImageVector? = null

