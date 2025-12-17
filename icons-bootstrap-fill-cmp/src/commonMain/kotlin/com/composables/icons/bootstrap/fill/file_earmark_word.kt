package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.FileEarmarkWord: ImageVector
    get() {
        if (_FileEarmarkWord != null) return _FileEarmarkWord!!
        
        _FileEarmarkWord = ImageVector.Builder(
            name = "file-earmark-word",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.293f, 0f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(4.707f)
                arcTo(1f, 1f, 0f, false, false, 13.707f, 4f)
                lineTo(10f, 0.293f)
                arcTo(1f, 1f, 0f, false, false, 9.293f, 0f)
                moveTo(9.5f, 3.5f)
                verticalLineToRelative(-2f)
                lineToRelative(3f, 3f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                moveTo(5.485f, 6.879f)
                lineToRelative(1.036f, 4.144f)
                lineToRelative(0.997f, -3.655f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.964f, 0f)
                lineToRelative(0.997f, 3.655f)
                lineToRelative(1.036f, -4.144f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.97f, 0.242f)
                lineToRelative(-1.5f, 6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.967f, 0.01f)
                lineTo(8f, 9.402f)
                lineToRelative(-1.018f, 3.73f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.967f, -0.01f)
                lineToRelative(-1.5f, -6f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.97f, -0.242f)
                close()
            }
        }.build()
        
        return _FileEarmarkWord!!
    }

private var _FileEarmarkWord: ImageVector? = null

