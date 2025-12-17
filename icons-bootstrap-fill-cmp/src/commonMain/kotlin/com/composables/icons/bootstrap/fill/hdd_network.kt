package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.HddNetwork: ImageVector
    get() {
        if (_HddNetwork != null) return _HddNetwork!!
        
        _HddNetwork = ImageVector.Builder(
            name = "hdd-network",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 6f, 11.5f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineTo(6f)
                arcTo(1.5f, 1.5f, 0f, false, false, 7.5f, 14f)
                horizontalLineToRelative(1f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineTo(10f)
                arcTo(1.5f, 1.5f, 0f, false, false, 8.5f, 10f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveToRelative(0.5f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                moveToRelative(2f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
            }
        }.build()
        
        return _HddNetwork!!
    }

private var _HddNetwork: ImageVector? = null

