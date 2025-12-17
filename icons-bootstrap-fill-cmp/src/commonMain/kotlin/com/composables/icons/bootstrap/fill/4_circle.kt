package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.`4Circle`: ImageVector
    get() {
        if (_4Circle != null) return _4Circle!!
        
        _4Circle = ImageVector.Builder(
            name = "4-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveTo(7.519f, 5.057f)
                curveToRelative(-0.886f, 1.418f, -1.772f, 2.838f, -2.542f, 4.265f)
                verticalLineToRelative(1.12f)
                horizontalLineTo(8.85f)
                verticalLineTo(12f)
                horizontalLineToRelative(1.26f)
                verticalLineToRelative(-1.559f)
                horizontalLineToRelative(1.007f)
                verticalLineTo(9.334f)
                horizontalLineTo(10.11f)
                verticalLineTo(4.002f)
                horizontalLineTo(8.176f)
                close()
                moveTo(6.225f, 9.281f)
                verticalLineToRelative(0.053f)
                horizontalLineTo(8.85f)
                verticalLineTo(5.063f)
                horizontalLineToRelative(-0.065f)
                curveToRelative(-0.867f, 1.33f, -1.787f, 2.806f, -2.56f, 4.218f)
            }
        }.build()
        
        return _4Circle!!
    }

private var _4Circle: ImageVector? = null

