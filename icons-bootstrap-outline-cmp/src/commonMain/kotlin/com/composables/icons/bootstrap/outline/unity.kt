package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Unity: ImageVector
    get() {
        if (_Unity != null) return _Unity!!
        
        _Unity = ImageVector.Builder(
            name = "unity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 11.2f)
                verticalLineTo(3.733f)
                lineTo(8.61f, 0f)
                verticalLineToRelative(2.867f)
                lineToRelative(2.503f, 1.466f)
                curveToRelative(0.099f, 0.067f, 0.099f, 0.2f, 0f, 0.234f)
                lineTo(8.148f, 6.3f)
                curveToRelative(-0.099f, 0.067f, -0.197f, 0.033f, -0.263f, 0f)
                lineTo(4.92f, 4.567f)
                curveToRelative(-0.099f, -0.034f, -0.099f, -0.2f, 0f, -0.234f)
                lineToRelative(2.504f, -1.466f)
                verticalLineTo(0f)
                lineTo(1f, 3.733f)
                verticalLineTo(11.2f)
                verticalLineToRelative(-0.033f)
                verticalLineToRelative(0.033f)
                lineToRelative(2.438f, -1.433f)
                verticalLineTo(6.833f)
                curveToRelative(0f, -0.1f, 0.131f, -0.166f, 0.197f, -0.133f)
                lineTo(6.6f, 8.433f)
                curveToRelative(0.099f, 0.067f, 0.132f, 0.134f, 0.132f, 0.234f)
                verticalLineToRelative(3.466f)
                curveToRelative(0f, 0.1f, -0.132f, 0.167f, -0.198f, 0.134f)
                lineTo(4.031f, 10.8f)
                lineToRelative(-2.438f, 1.433f)
                lineTo(7.983f, 16f)
                lineToRelative(6.391f, -3.733f)
                lineToRelative(-2.438f, -1.434f)
                lineTo(9.434f, 12.3f)
                curveToRelative(-0.099f, 0.067f, -0.198f, 0f, -0.198f, -0.133f)
                verticalLineTo(8.7f)
                curveToRelative(0f, -0.1f, 0.066f, -0.2f, 0.132f, -0.233f)
                lineToRelative(2.965f, -1.734f)
                curveToRelative(0.099f, -0.066f, 0.197f, 0f, 0.197f, 0.134f)
                verticalLineTo(9.8f)
                close()
            }
        }.build()
        
        return _Unity!!
    }

private var _Unity: ImageVector? = null

