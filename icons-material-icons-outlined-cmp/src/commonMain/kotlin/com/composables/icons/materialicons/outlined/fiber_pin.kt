package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Fiber_pin: ImageVector
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
                moveTo(11f, 15f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineToRelative(6f)
                close()
                moveToRelative(7.75f, -6f)
                verticalLineToRelative(3.5f)
                lineTo(16.25f, 9f)
                horizontalLineTo(15f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-3.5f)
                lineTo(18.8f, 15f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                horizontalLineToRelative(-1.25f)
                close()
                moveTo(7.5f, 9f)
                horizontalLineTo(4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.85f, 0f, 1.5f, -0.65f, 1.5f, -1.5f)
                verticalLineToRelative(-1f)
                curveTo(9f, 9.65f, 8.35f, 9f, 7.5f, 9f)
                close()
                moveToRelative(0f, 2.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                close()
            }
        }.build()
        
        return _Fiber_pin!!
    }

private var _Fiber_pin: ImageVector? = null

