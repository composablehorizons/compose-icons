package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.FileEarmarkLock2: ImageVector
    get() {
        if (_FileEarmarkLock2 != null) return _FileEarmarkLock2!!
        
        _FileEarmarkLock2 = ImageVector.Builder(
            name = "file-earmark-lock2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 7f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                verticalLineToRelative(1f)
                horizontalLineTo(7f)
                close()
            }
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
                moveTo(10f, 7f)
                verticalLineToRelative(1.076f)
                curveToRelative(0.54f, 0.166f, 1f, 0.597f, 1f, 1.224f)
                verticalLineToRelative(2.4f)
                curveToRelative(0f, 0.816f, -0.781f, 1.3f, -1.5f, 1.3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.719f, 0f, -1.5f, -0.484f, -1.5f, -1.3f)
                verticalLineTo(9.3f)
                curveToRelative(0f, -0.627f, 0.46f, -1.058f, 1f, -1.224f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, true, true, 4f, 0f)
            }
        }.build()
        
        return _FileEarmarkLock2!!
    }

private var _FileEarmarkLock2: ImageVector? = null

