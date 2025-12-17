package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.VolumeMute: ImageVector
    get() {
        if (_VolumeMute != null) return _VolumeMute!!
        
        _VolumeMute = ImageVector.Builder(
            name = "volume-mute",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(215.03f, 71.05f)
                lineTo(126.06f, 160f)
                horizontalLineTo(24f)
                curveToRelative(-13.26f, 0f, -24f, 10.74f, -24f, 24f)
                verticalLineToRelative(144f)
                curveToRelative(0f, 13.25f, 10.74f, 24f, 24f, 24f)
                horizontalLineToRelative(102.06f)
                lineToRelative(88.97f, 88.95f)
                curveToRelative(15.03f, 15.03f, 40.97f, 4.47f, 40.97f, -16.97f)
                verticalLineTo(88.02f)
                curveToRelative(0f, -21.46f, -25.96f, -31.98f, -40.97f, -16.97f)
                close()
                moveTo(461.64f, 256f)
                lineToRelative(45.64f, -45.64f)
                curveToRelative(6.3f, -6.3f, 6.3f, -16.52f, 0f, -22.82f)
                lineToRelative(-22.82f, -22.82f)
                curveToRelative(-6.3f, -6.3f, -16.52f, -6.3f, -22.82f, 0f)
                lineTo(416f, 210.36f)
                lineToRelative(-45.64f, -45.64f)
                curveToRelative(-6.3f, -6.3f, -16.52f, -6.3f, -22.82f, 0f)
                lineToRelative(-22.82f, 22.82f)
                curveToRelative(-6.3f, 6.3f, -6.3f, 16.52f, 0f, 22.82f)
                lineTo(370.36f, 256f)
                lineToRelative(-45.63f, 45.63f)
                curveToRelative(-6.3f, 6.3f, -6.3f, 16.52f, 0f, 22.82f)
                lineToRelative(22.82f, 22.82f)
                curveToRelative(6.3f, 6.3f, 16.52f, 6.3f, 22.82f, 0f)
                lineTo(416f, 301.64f)
                lineToRelative(45.64f, 45.64f)
                curveToRelative(6.3f, 6.3f, 16.52f, 6.3f, 22.82f, 0f)
                lineToRelative(22.82f, -22.82f)
                curveToRelative(6.3f, -6.3f, 6.3f, -16.52f, 0f, -22.82f)
                lineTo(461.64f, 256f)
                close()
            }
        }.build()
        
        return _VolumeMute!!
    }

private var _VolumeMute: ImageVector? = null

