package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Fiber_new: ImageVector
    get() {
        if (_Fiber_new != null) return _Fiber_new!!
        
        _Fiber_new = ImageVector.Builder(
            name = "fiber_new",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.12f, 14.47f)
                verticalLineTo(9.53f)
                horizontalLineTo(8.09f)
                verticalLineToRelative(2.88f)
                lineTo(6.03f, 9.53f)
                horizontalLineTo(5f)
                verticalLineToRelative(4.94f)
                horizontalLineToRelative(1.03f)
                verticalLineToRelative(-2.88f)
                lineToRelative(2.1f, 2.88f)
                close()
                moveToRelative(4.12f, -3.9f)
                verticalLineTo(9.53f)
                horizontalLineToRelative(-3.3f)
                verticalLineToRelative(4.94f)
                horizontalLineToRelative(3.3f)
                verticalLineToRelative(-1.03f)
                horizontalLineToRelative(-2.06f)
                verticalLineToRelative(-0.91f)
                horizontalLineToRelative(2.06f)
                verticalLineToRelative(-1.04f)
                horizontalLineToRelative(-2.06f)
                verticalLineToRelative(-0.92f)
                close()
                moveToRelative(0.82f, -1.04f)
                verticalLineToRelative(4.12f)
                curveToRelative(0f, 0.45f, 0.37f, 0.82f, 0.82f, 0.82f)
                horizontalLineToRelative(3.29f)
                curveToRelative(0.45f, 0f, 0.82f, -0.37f, 0.82f, -0.82f)
                verticalLineTo(9.53f)
                horizontalLineToRelative(-1.03f)
                verticalLineToRelative(3.71f)
                horizontalLineToRelative(-0.92f)
                verticalLineToRelative(-2.89f)
                horizontalLineToRelative(-1.03f)
                verticalLineToRelative(2.9f)
                horizontalLineToRelative(-0.93f)
                verticalLineTo(9.53f)
                horizontalLineToRelative(-1.02f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 6f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(12f)
                horizontalLineTo(4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                curveToRelative(-1.11f, 0f, -1.99f, 0.89f, -1.99f, 2f)
                lineTo(2f, 18f)
                curveToRelative(0f, 1.11f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.11f, 0f, 2f, -0.89f, 2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.11f, -0.89f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 14f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(12f)
                close()
            }
        }.build()
        
        return _Fiber_new!!
    }

private var _Fiber_new: ImageVector? = null

