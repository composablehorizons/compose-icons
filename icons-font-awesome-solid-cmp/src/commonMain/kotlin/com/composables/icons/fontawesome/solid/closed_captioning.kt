package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ClosedCaptioning: ImageVector
    get() {
        if (_ClosedCaptioning != null) return _ClosedCaptioning!!
        
        _ClosedCaptioning = ImageVector.Builder(
            name = "closed-captioning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(464f, 64f)
                horizontalLineTo(48f)
                curveTo(21.5f, 64f, 0f, 85.5f, 0f, 112f)
                verticalLineToRelative(288f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(416f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(112f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
                moveTo(218.1f, 287.7f)
                curveToRelative(2.8f, -2.5f, 7.1f, -2.1f, 9.2f, 0.9f)
                lineToRelative(19.5f, 27.7f)
                curveToRelative(1.7f, 2.4f, 1.5f, 5.6f, -0.5f, 7.7f)
                curveToRelative(-53.6f, 56.8f, -172.8f, 32.1f, -172.8f, -67.9f)
                curveToRelative(0f, -97.3f, 121.7f, -119.5f, 172.5f, -70.1f)
                curveToRelative(2.1f, 2f, 2.5f, 3.2f, 1f, 5.7f)
                lineToRelative(-17.5f, 30.5f)
                curveToRelative(-1.9f, 3.1f, -6.2f, 4f, -9.1f, 1.7f)
                curveToRelative(-40.8f, -32f, -94.6f, -14.9f, -94.6f, 31.2f)
                curveToRelative(0.1f, 48f, 51.1f, 70.5f, 92.3f, 32.6f)
                close()
                moveToRelative(190.4f, 0f)
                curveToRelative(2.8f, -2.5f, 7.1f, -2.1f, 9.2f, 0.9f)
                lineToRelative(19.5f, 27.7f)
                curveToRelative(1.7f, 2.4f, 1.5f, 5.6f, -0.5f, 7.7f)
                curveToRelative(-53.5f, 56.9f, -172.7f, 32.1f, -172.7f, -67.9f)
                curveToRelative(0f, -97.3f, 121.7f, -119.5f, 172.5f, -70.1f)
                curveToRelative(2.1f, 2f, 2.5f, 3.2f, 1f, 5.7f)
                lineTo(420f, 222.2f)
                curveToRelative(-1.9f, 3.1f, -6.2f, 4f, -9.1f, 1.7f)
                curveToRelative(-40.8f, -32f, -94.6f, -14.9f, -94.6f, 31.2f)
                curveToRelative(0f, 48f, 51f, 70.5f, 92.2f, 32.6f)
                close()
            }
        }.build()
        
        return _ClosedCaptioning!!
    }

private var _ClosedCaptioning: ImageVector? = null

