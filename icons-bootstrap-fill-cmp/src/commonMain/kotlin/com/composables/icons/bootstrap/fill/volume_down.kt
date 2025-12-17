package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.VolumeDown: ImageVector
    get() {
        if (_VolumeDown != null) return _VolumeDown!!
        
        _VolumeDown = ImageVector.Builder(
            name = "volume-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.812f, -0.39f)
                lineTo(5.825f, 5.5f)
                horizontalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0f, false, false, 3f, 6f)
                verticalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(2.325f)
                lineToRelative(2.363f, 1.89f)
                arcTo(0.5f, 0.5f, 0f, false, false, 9f, 12f)
                close()
                moveToRelative(3.025f, 4f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -1.318f, 3.182f)
                lineTo(10f, 10.475f)
                arcTo(3.5f, 3.5f, 0f, false, false, 11.025f, 8f)
                arcTo(3.5f, 3.5f, 0f, false, false, 10f, 5.525f)
                lineToRelative(0.707f, -0.707f)
                arcTo(4.5f, 4.5f, 0f, false, true, 12.025f, 8f)
            }
        }.build()
        
        return _VolumeDown!!
    }

private var _VolumeDown: ImageVector? = null

