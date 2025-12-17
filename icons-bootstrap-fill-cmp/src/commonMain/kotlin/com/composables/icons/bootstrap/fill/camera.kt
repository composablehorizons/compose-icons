package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Camera: ImageVector
    get() {
        if (_Camera != null) return _Camera!!
        
        _Camera = ImageVector.Builder(
            name = "camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 8.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, -5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 5f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-1.172f)
                arcToRelative(2f, 2f, 0f, false, true, -1.414f, -0.586f)
                lineToRelative(-0.828f, -0.828f)
                arcTo(2f, 2f, 0f, false, false, 9.172f, 2f)
                horizontalLineTo(6.828f)
                arcToRelative(2f, 2f, 0f, false, false, -1.414f, 0.586f)
                lineToRelative(-0.828f, 0.828f)
                arcTo(2f, 2f, 0f, false, true, 3.172f, 4f)
                close()
                moveToRelative(0.5f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                moveToRelative(9f, 2.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, -7f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 7f, 0f)
            }
        }.build()
        
        return _Camera!!
    }

private var _Camera: ImageVector? = null

