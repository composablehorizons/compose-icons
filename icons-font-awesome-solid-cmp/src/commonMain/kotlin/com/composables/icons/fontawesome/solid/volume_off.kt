package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.VolumeOff: ImageVector
    get() {
        if (_VolumeOff != null) return _VolumeOff!!
        
        _VolumeOff = ImageVector.Builder(
            name = "volume-off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(215f, 71f)
                lineToRelative(-89f, 89f)
                horizontalLineTo(24f)
                arcToRelative(24f, 24f, 0f, false, false, -24f, 24f)
                verticalLineToRelative(144f)
                arcToRelative(24f, 24f, 0f, false, false, 24f, 24f)
                horizontalLineToRelative(102.06f)
                lineTo(215f, 441f)
                curveToRelative(15f, 15f, 41f, 4.47f, 41f, -17f)
                verticalLineTo(88f)
                curveToRelative(0f, -21.47f, -26f, -32f, -41f, -17f)
                close()
            }
        }.build()
        
        return _VolumeOff!!
    }

private var _VolumeOff: ImageVector? = null

