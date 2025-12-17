package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Redo: ImageVector
    get() {
        if (_Redo != null) return _Redo!!
        
        _Redo = ImageVector.Builder(
            name = "redo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.0004f, 2.5f)
                curveTo(13.0004f, 2.22386f, 12.7766f, 2f, 12.5004f, 2f)
                curveTo(12.2243f, 2f, 12.0004f, 2.22386f, 12.0004f, 2.5f)
                verticalLineTo(6.34262f)
                lineTo(8.8294f, 3.17157f)
                curveTo(7.26731f, 1.60948f, 4.73465f, 1.60948f, 3.17255f, 3.17157f)
                curveTo(1.61045f, 4.73367f, 1.61045f, 7.26633f, 3.17255f, 8.82843f)
                lineTo(8.19768f, 13.8536f)
                curveTo(8.39294f, 14.0488f, 8.70952f, 14.0488f, 8.90478f, 13.8536f)
                curveTo(9.10004f, 13.6583f, 9.10004f, 13.3417f, 8.90478f, 13.1464f)
                lineTo(3.87966f, 8.12132f)
                curveTo(2.70808f, 6.94975f, 2.70808f, 5.05025f, 3.87966f, 3.87868f)
                curveTo(5.05123f, 2.70711f, 6.95072f, 2.70711f, 8.1223f, 3.87868f)
                lineTo(11.2436f, 7f)
                horizontalLineTo(7.50045f)
                curveTo(7.22431f, 7f, 7.00045f, 7.22386f, 7.00045f, 7.5f)
                curveTo(7.00045f, 7.77614f, 7.22431f, 8f, 7.50045f, 8f)
                horizontalLineTo(12.4004f)
                curveTo(12.7318f, 8f, 13.0004f, 7.73137f, 13.0004f, 7.4f)
                verticalLineTo(2.5f)
                close()
            }
        }.build()
        
        return _Redo!!
    }

private var _Redo: ImageVector? = null

