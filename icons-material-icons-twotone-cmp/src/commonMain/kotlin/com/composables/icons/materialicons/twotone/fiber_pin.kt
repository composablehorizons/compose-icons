package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Fiber_pin: ImageVector
    get() {
        if (_Fiber_pin != null) return _Fiber_pin!!
        
        _Fiber_pin = ImageVector.Builder(
            name = "fiber_pin",
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
                moveTo(5f, 14.62f)
                horizontalLineToRelative(1.31f)
                verticalLineToRelative(-1.75f)
                horizontalLineToRelative(1.75f)
                curveToRelative(0.74f, 0f, 1.31f, -0.57f, 1.31f, -1.31f)
                verticalLineToRelative(-0.88f)
                curveToRelative(0f, -0.74f, -0.57f, -1.31f, -1.31f, -1.31f)
                horizontalLineTo(5f)
                verticalLineToRelative(5.25f)
                close()
                moveToRelative(1.31f, -3.93f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(0.88f)
                horizontalLineTo(6.31f)
                verticalLineToRelative(-0.88f)
                close()
                moveToRelative(5.03f, -1.31f)
                horizontalLineToRelative(1.31f)
                verticalLineToRelative(5.25f)
                horizontalLineToRelative(-1.31f)
                close()
                moveToRelative(3.28f, 5.24f)
                horizontalLineToRelative(1.1f)
                verticalLineToRelative(-3.06f)
                lineToRelative(2.23f, 3.06f)
                horizontalLineTo(19f)
                verticalLineTo(9.38f)
                horizontalLineToRelative(-1.09f)
                verticalLineToRelative(3.06f)
                lineToRelative(-2.19f, -3.06f)
                horizontalLineToRelative(-1.1f)
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
        
        return _Fiber_pin!!
    }

private var _Fiber_pin: ImageVector? = null

