package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BadgeWc: ImageVector
    get() {
        if (_BadgeWc != null) return _BadgeWc!!
        
        _BadgeWc = ImageVector.Builder(
            name = "badge-wc",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.348f, 7.643f)
                curveToRelative(0f, -1.112f, 0.488f, -1.754f, 1.318f, -1.754f)
                curveToRelative(0.682f, 0f, 1.139f, 0.47f, 1.187f, 1.108f)
                horizontalLineTo(14f)
                verticalLineToRelative(-0.11f)
                curveToRelative(-0.053f, -1.187f, -1.024f, -2f, -2.342f, -2f)
                curveToRelative(-1.604f, 0f, -2.518f, 1.05f, -2.518f, 2.751f)
                verticalLineToRelative(0.747f)
                curveToRelative(0f, 1.7f, 0.905f, 2.73f, 2.518f, 2.73f)
                curveToRelative(1.314f, 0f, 2.285f, -0.792f, 2.342f, -1.939f)
                verticalLineToRelative(-0.114f)
                horizontalLineToRelative(-1.147f)
                curveToRelative(-0.048f, 0.615f, -0.497f, 1.05f, -1.187f, 1.05f)
                curveToRelative(-0.839f, 0f, -1.318f, -0.62f, -1.318f, -1.727f)
                close()
                moveTo(4.457f, 11f)
                lineToRelative(1.02f, -4.184f)
                horizontalLineToRelative(0.045f)
                lineTo(6.542f, 11f)
                horizontalLineToRelative(1.006f)
                lineTo(9f, 5.001f)
                horizontalLineTo(7.818f)
                lineToRelative(-0.82f, 4.355f)
                horizontalLineToRelative(-0.056f)
                lineTo(5.97f, 5.001f)
                horizontalLineToRelative(-0.94f)
                lineToRelative(-0.972f, 4.355f)
                horizontalLineToRelative(-0.053f)
                lineToRelative(-0.827f, -4.355f)
                horizontalLineTo(2f)
                lineTo(3.452f, 11f)
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
        
        return _BadgeWc!!
    }

private var _BadgeWc: ImageVector? = null

