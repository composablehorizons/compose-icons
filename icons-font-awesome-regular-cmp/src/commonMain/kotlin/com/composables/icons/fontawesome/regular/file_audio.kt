package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.FileAudio: ImageVector
    get() {
        if (_FileAudio != null) return _FileAudio!!
        
        _FileAudio = ImageVector.Builder(
            name = "file-audio",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(369.941f, 97.941f)
                lineToRelative(-83.882f, -83.882f)
                arcTo(48f, 48f, 0f, false, false, 252.118f, 0f)
                horizontalLineTo(48f)
                curveTo(21.49f, 0f, 0f, 21.49f, 0f, 48f)
                verticalLineToRelative(416f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                horizontalLineToRelative(288f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                verticalLineTo(131.882f)
                arcToRelative(48f, 48f, 0f, false, false, -14.059f, -33.941f)
                close()
                moveTo(332.118f, 128f)
                horizontalLineTo(256f)
                verticalLineTo(51.882f)
                lineTo(332.118f, 128f)
                close()
                moveTo(48f, 464f)
                verticalLineTo(48f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(104f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(104f)
                verticalLineToRelative(288f)
                horizontalLineTo(48f)
                close()
                moveToRelative(144f, -76.024f)
                curveToRelative(0f, 10.691f, -12.926f, 16.045f, -20.485f, 8.485f)
                lineTo(136f, 360.486f)
                horizontalLineToRelative(-28f)
                curveToRelative(-6.627f, 0f, -12f, -5.373f, -12f, -12f)
                verticalLineToRelative(-56f)
                curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                horizontalLineToRelative(28f)
                lineToRelative(35.515f, -36.947f)
                curveToRelative(7.56f, -7.56f, 20.485f, -2.206f, 20.485f, 8.485f)
                verticalLineToRelative(135.952f)
                close()
                moveToRelative(41.201f, -47.13f)
                curveToRelative(9.051f, -9.297f, 9.06f, -24.133f, 0.001f, -33.439f)
                curveToRelative(-22.149f, -22.752f, 12.235f, -56.246f, 34.395f, -33.481f)
                curveToRelative(27.198f, 27.94f, 27.212f, 72.444f, 0.001f, 100.401f)
                curveToRelative(-21.793f, 22.386f, -56.947f, -10.315f, -34.397f, -33.481f)
                close()
            }
        }.build()
        
        return _FileAudio!!
    }

private var _FileAudio: ImageVector? = null

