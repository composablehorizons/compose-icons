package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.VolumeMute: ImageVector
    get() {
        if (_VolumeMute != null) return _VolumeMute!!
        
        _VolumeMute = ImageVector.Builder(
            name = "volume-mute",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.717f, 3.55f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7f, 4f)
                verticalLineToRelative(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.812f, 0.39f)
                lineTo(3.825f, 10.5f)
                horizontalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 1f, 10f)
                verticalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(2.325f)
                lineToRelative(2.363f, -1.89f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.529f, -0.06f)
                moveToRelative(7.137f, 2.096f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.708f)
                lineTo(12.207f, 8f)
                lineToRelative(1.647f, 1.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0.708f)
                lineTo(11.5f, 8.707f)
                lineToRelative(-1.646f, 1.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, -0.708f)
                lineTo(10.793f, 8f)
                lineTo(9.146f, 6.354f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.708f, -0.708f)
                lineTo(11.5f, 7.293f)
                lineToRelative(1.646f, -1.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
            }
        }.build()
        
        return _VolumeMute!!
    }

private var _VolumeMute: ImageVector? = null

