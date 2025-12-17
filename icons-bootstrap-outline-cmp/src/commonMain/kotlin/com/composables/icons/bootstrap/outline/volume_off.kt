package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.VolumeOff: ImageVector
    get() {
        if (_VolumeOff != null) return _VolumeOff!!
        
        _VolumeOff = ImageVector.Builder(
            name = "volume-off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.717f, 3.55f)
                arcTo(0.5f, 0.5f, 0f, false, true, 11f, 4f)
                verticalLineToRelative(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.812f, 0.39f)
                lineTo(7.825f, 10.5f)
                horizontalLineTo(5.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 5f, 10f)
                verticalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(2.325f)
                lineToRelative(2.363f, -1.89f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.529f, -0.06f)
                moveTo(10f, 5.04f)
                lineTo(8.312f, 6.39f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 6.5f)
                horizontalLineTo(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.312f, 0.11f)
                lineTo(10f, 10.96f)
                close()
            }
        }.build()
        
        return _VolumeOff!!
    }

private var _VolumeOff: ImageVector? = null

