package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Fiber_pin: ImageVector
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
                moveTo(5.5f, 10.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                close()
                moveTo(22f, 4f)
                horizontalLineTo(2f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(20f)
                verticalLineTo(4f)
                close()
                moveTo(9f, 13f)
                horizontalLineTo(5.5f)
                verticalLineToRelative(2f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(3.5f, 2f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(6f)
                close()
                moveToRelative(7.5f, 0f)
                horizontalLineToRelative(-1.2f)
                lineToRelative(-2.55f, -3.5f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineToRelative(1.25f)
                lineToRelative(2.5f, 3.5f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                verticalLineToRelative(6f)
                close()
            }
        }.build()
        
        return _Fiber_pin!!
    }

private var _Fiber_pin: ImageVector? = null

