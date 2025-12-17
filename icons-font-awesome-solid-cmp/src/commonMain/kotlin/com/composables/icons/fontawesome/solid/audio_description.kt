package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.AudioDescription: ImageVector
    get() {
        if (_AudioDescription != null) return _AudioDescription!!
        
        _AudioDescription = ImageVector.Builder(
            name = "audio-description",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(162.925f, 238.709f)
                lineToRelative(8.822f, 30.655f)
                horizontalLineToRelative(-25.606f)
                lineToRelative(9.041f, -30.652f)
                curveToRelative(1.277f, -4.421f, 2.651f, -9.994f, 3.872f, -15.245f)
                curveToRelative(1.22f, 5.251f, 2.594f, 10.823f, 3.871f, 15.242f)
                close()
                moveToRelative(166.474f, -32.099f)
                horizontalLineToRelative(-14.523f)
                verticalLineToRelative(98.781f)
                horizontalLineToRelative(14.523f)
                curveToRelative(29.776f, 0f, 46.175f, -17.678f, 46.175f, -49.776f)
                curveToRelative(0f, -32.239f, -17.49f, -49.005f, -46.175f, -49.005f)
                close()
                moveTo(512f, 112f)
                verticalLineToRelative(288f)
                curveToRelative(0f, 26.51f, -21.49f, 48f, -48f, 48f)
                horizontalLineTo(48f)
                curveToRelative(-26.51f, 0f, -48f, -21.49f, -48f, -48f)
                verticalLineTo(112f)
                curveToRelative(0f, -26.51f, 21.49f, -48f, 48f, -48f)
                horizontalLineToRelative(416f)
                curveToRelative(26.51f, 0f, 48f, 21.49f, 48f, 48f)
                close()
                moveTo(245.459f, 336.139f)
                lineToRelative(-57.097f, -168f)
                arcTo(12.001f, 12.001f, 0f, false, false, 177f, 160f)
                horizontalLineToRelative(-35.894f)
                arcToRelative(12.001f, 12.001f, 0f, false, false, -11.362f, 8.139f)
                lineToRelative(-57.097f, 168f)
                curveTo(70.003f, 343.922f, 75.789f, 352f, 84.009f, 352f)
                horizontalLineToRelative(29.133f)
                arcToRelative(12f, 12f, 0f, false, false, 11.535f, -8.693f)
                lineToRelative(8.574f, -29.906f)
                horizontalLineToRelative(51.367f)
                lineToRelative(8.793f, 29.977f)
                arcTo(12f, 12f, 0f, false, false, 204.926f, 352f)
                horizontalLineToRelative(29.172f)
                curveToRelative(8.22f, 0f, 14.006f, -8.078f, 11.361f, -15.861f)
                close()
                moveToRelative(184.701f, -80.525f)
                curveToRelative(0f, -58.977f, -37.919f, -95.614f, -98.96f, -95.614f)
                horizontalLineToRelative(-57.366f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(168f)
                curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
                horizontalLineTo(331.2f)
                curveToRelative(61.041f, 0f, 98.96f, -36.933f, 98.96f, -96.386f)
                close()
            }
        }.build()
        
        return _AudioDescription!!
    }

private var _AudioDescription: ImageVector? = null

