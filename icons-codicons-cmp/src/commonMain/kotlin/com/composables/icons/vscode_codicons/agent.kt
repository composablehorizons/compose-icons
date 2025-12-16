package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Agent: ImageVector
    get() {
        if (_Agent != null) return _Agent!!
        
        _Agent = ImageVector.Builder(
            name = "agent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.887f, 15f)
                horizontalLineTo(8.49998f)
                curveTo(8.22398f, 15f, 7.99998f, 14.776f, 7.99998f, 14.5f)
                curveTo(7.99998f, 14.224f, 8.22398f, 14f, 8.49998f, 14f)
                horizontalLineTo(10.887f)
                curveTo(11.243f, 14f, 11.575f, 13.809f, 11.752f, 13.5f)
                lineTo(14.64f, 8.5f)
                curveTo(14.819f, 8.191f, 14.819f, 7.809f, 14.64f, 7.5f)
                lineTo(11.705f, 2.416f)
                curveTo(11.557f, 2.16f, 11.28f, 2f, 10.983f, 2f)
                curveTo(10.616f, 2f, 10.296f, 2.236f, 10.188f, 2.587f)
                lineTo(6.76598f, 13.707f)
                curveTo(6.52898f, 14.48f, 5.82498f, 15f, 5.01598f, 15f)
                curveTo(4.36398f, 15f, 3.75498f, 14.649f, 3.42898f, 14.084f)
                lineTo(0.494984f, 9f)
                curveTo(0.137984f, 8.383f, 0.137984f, 7.617f, 0.494984f, 7f)
                lineTo(3.38198f, 2f)
                curveTo(3.73698f, 1.383f, 4.40098f, 1f, 5.11298f, 1f)
                horizontalLineTo(7.49998f)
                curveTo(7.77598f, 1f, 7.99998f, 1.224f, 7.99998f, 1.5f)
                curveTo(7.99998f, 1.776f, 7.77598f, 2f, 7.49998f, 2f)
                horizontalLineTo(5.11298f)
                curveTo(4.75698f, 2f, 4.42498f, 2.191f, 4.24798f, 2.5f)
                lineTo(1.35998f, 7.5f)
                curveTo(1.18098f, 7.809f, 1.18098f, 8.191f, 1.35998f, 8.5f)
                lineTo(4.29498f, 13.584f)
                curveTo(4.44298f, 13.841f, 4.71998f, 14f, 5.01698f, 14f)
                curveTo(5.38398f, 14f, 5.70398f, 13.764f, 5.81198f, 13.412f)
                lineTo(9.23398f, 2.293f)
                curveTo(9.47098f, 1.52f, 10.174f, 1f, 10.984f, 1f)
                curveTo(11.636f, 1f, 12.245f, 1.351f, 12.571f, 1.916f)
                lineTo(15.506f, 7f)
                curveTo(15.863f, 7.617f, 15.863f, 8.383f, 15.506f, 9.001f)
                lineTo(12.619f, 14f)
                curveTo(12.264f, 14.617f, 11.599f, 15f, 10.887f, 15f)
                close()
            }
        }.build()
        
        return _Agent!!
    }

private var _Agent: ImageVector? = null

