package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.FilePlay: ImageVector
    get() {
        if (_FilePlay != null) return _FilePlay!!
        
        _FilePlay = ImageVector.Builder(
            name = "file-play",
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
                moveTo(6f, 5.883f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.757f, -0.429f)
                lineToRelative(3.528f, 2.117f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.858f)
                lineToRelative(-3.528f, 2.117f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.757f, -0.43f)
                verticalLineTo(5.884f)
                close()
            }
        }.build()
        
        return _FilePlay!!
    }

private var _FilePlay: ImageVector? = null

