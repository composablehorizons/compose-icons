package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.MicMute: ImageVector
    get() {
        if (_MicMute != null) return _MicMute!!
        
        _MicMute = ImageVector.Builder(
            name = "mic-mute",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 8f)
                curveToRelative(0f, 0.564f, -0.094f, 1.107f, -0.266f, 1.613f)
                lineToRelative(-0.814f, -0.814f)
                arcTo(4f, 4f, 0f, false, false, 12f, 8f)
                verticalLineTo(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                close()
                moveToRelative(-5f, 4f)
                curveToRelative(0.818f, 0f, 1.578f, -0.245f, 2.212f, -0.667f)
                lineToRelative(0.718f, 0.719f)
                arcToRelative(5f, 5f, 0f, false, true, -2.43f, 0.923f)
                verticalLineTo(15f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.025f)
                arcTo(5f, 5f, 0f, false, true, 3f, 8f)
                verticalLineTo(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineToRelative(1f)
                arcToRelative(4f, 4f, 0f, false, false, 4f, 4f)
                moveToRelative(3f, -9f)
                verticalLineToRelative(4.879f)
                lineToRelative(-1f, -1f)
                verticalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, false, -3.997f, -0.118f)
                lineToRelative(-0.845f, -0.845f)
                arcTo(3.001f, 3.001f, 0f, false, true, 11f, 3f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.486f, 10.607f)
                lineToRelative(-0.748f, -0.748f)
                arcTo(2f, 2f, 0f, false, true, 6f, 8f)
                verticalLineToRelative(-0.878f)
                lineToRelative(-1f, -1f)
                verticalLineTo(8f)
                arcToRelative(3f, 3f, 0f, false, false, 4.486f, 2.607f)
                moveToRelative(-7.84f, -9.253f)
                lineToRelative(12f, 12f)
                lineToRelative(0.708f, -0.708f)
                lineToRelative(-12f, -12f)
                close()
            }
        }.build()
        
        return _MicMute!!
    }

private var _MicMute: ImageVector? = null

