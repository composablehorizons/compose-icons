package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.FileWord: ImageVector
    get() {
        if (_FileWord != null) return _FileWord!!
        
        _FileWord = ImageVector.Builder(
            name = "file-word",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 0f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                moveTo(5.485f, 4.879f)
                lineToRelative(1.036f, 4.144f)
                lineToRelative(0.997f, -3.655f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.964f, 0f)
                lineToRelative(0.997f, 3.655f)
                lineToRelative(1.036f, -4.144f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.97f, 0.242f)
                lineToRelative(-1.5f, 6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.967f, 0.01f)
                lineTo(8f, 7.402f)
                lineToRelative(-1.018f, 3.73f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.967f, -0.01f)
                lineToRelative(-1.5f, -6f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.97f, -0.242f)
                close()
            }
        }.build()
        
        return _FileWord!!
    }

private var _FileWord: ImageVector? = null

