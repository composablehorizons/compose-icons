package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BadgeCc: ImageVector
    get() {
        if (_BadgeCc != null) return _BadgeCc!!
        
        _BadgeCc = ImageVector.Builder(
            name = "badge-cc",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.708f, 7.755f)
                curveToRelative(0f, -1.111f, 0.488f, -1.753f, 1.319f, -1.753f)
                curveToRelative(0.681f, 0f, 1.138f, 0.47f, 1.186f, 1.107f)
                horizontalLineTo(7.36f)
                verticalLineTo(7f)
                curveToRelative(-0.052f, -1.186f, -1.024f, -2f, -2.342f, -2f)
                curveTo(3.414f, 5f, 2.5f, 6.05f, 2.5f, 7.751f)
                verticalLineToRelative(0.747f)
                curveToRelative(0f, 1.7f, 0.905f, 2.73f, 2.518f, 2.73f)
                curveToRelative(1.314f, 0f, 2.285f, -0.792f, 2.342f, -1.939f)
                verticalLineToRelative(-0.114f)
                horizontalLineTo(6.213f)
                curveToRelative(-0.048f, 0.615f, -0.496f, 1.05f, -1.186f, 1.05f)
                curveToRelative(-0.84f, 0f, -1.319f, -0.62f, -1.319f, -1.727f)
                close()
                moveToRelative(6.14f, 0f)
                curveToRelative(0f, -1.111f, 0.488f, -1.753f, 1.318f, -1.753f)
                curveToRelative(0.682f, 0f, 1.139f, 0.47f, 1.187f, 1.107f)
                horizontalLineTo(13.5f)
                verticalLineTo(7f)
                curveToRelative(-0.053f, -1.186f, -1.024f, -2f, -2.342f, -2f)
                curveTo(9.554f, 5f, 8.64f, 6.05f, 8.64f, 7.751f)
                verticalLineToRelative(0.747f)
                curveToRelative(0f, 1.7f, 0.905f, 2.73f, 2.518f, 2.73f)
                curveToRelative(1.314f, 0f, 2.285f, -0.792f, 2.342f, -1.939f)
                verticalLineToRelative(-0.114f)
                horizontalLineToRelative(-1.147f)
                curveToRelative(-0.048f, 0.615f, -0.497f, 1.05f, -1.187f, 1.05f)
                curveToRelative(-0.839f, 0f, -1.318f, -0.62f, -1.318f, -1.727f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
                moveTo(2f, 2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
            }
        }.build()
        
        return _BadgeCc!!
    }

private var _BadgeCc: ImageVector? = null

