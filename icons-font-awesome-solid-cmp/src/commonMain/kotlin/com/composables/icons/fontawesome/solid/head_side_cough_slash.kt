package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HeadSideCoughSlash: ImageVector
    get() {
        if (_HeadSideCoughSlash != null) return _HeadSideCoughSlash!!
        
        _HeadSideCoughSlash = ImageVector.Builder(
            name = "head-side-cough-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(454.11f, 319.21f)
                curveToRelative(19.56f, -3.81f, 31.62f, -25f, 23.11f, -44.21f)
                curveToRelative(-21f, -47.12f, -48.5f, -151.75f, -73.12f, -186.75f)
                arcTo(208.13f, 208.13f, 0f, false, false, 234.1f, 0f)
                horizontalLineTo(192f)
                arcTo(190.64f, 190.64f, 0f, false, false, 84.18f, 33.3f)
                lineTo(45.46f, 3.38f)
                arcTo(16f, 16f, 0f, false, false, 23f, 6.19f)
                lineTo(3.37f, 31.46f)
                arcTo(16f, 16f, 0f, false, false, 6.18f, 53.91f)
                lineTo(594.53f, 508.63f)
                arcTo(16f, 16f, 0f, false, false, 617f, 505.82f)
                lineToRelative(19.64f, -25.27f)
                arcToRelative(16f, 16f, 0f, false, false, -2.81f, -22.45f)
                close()
                moveTo(313.39f, 210.45f)
                lineTo(263.61f, 172f)
                curveToRelative(5.88f, -7.14f, 14.43f, -12f, 24.36f, -12f)
                arcToRelative(32.06f, 32.06f, 0f, false, true, 32f, 32f)
                curveTo(320f, 199f, 317.24f, 205.17f, 313.39f, 210.45f)
                close()
                moveTo(616f, 304f)
                arcToRelative(24f, 24f, 0f, true, false, -24f, -24f)
                arcTo(24f, 24f, 0f, false, false, 616f, 304f)
                close()
                moveToRelative(-64f, 64f)
                arcToRelative(24f, 24f, 0f, true, false, -24f, -24f)
                arcTo(24f, 24f, 0f, false, false, 552f, 368f)
                close()
                moveTo(288f, 384f)
                arcToRelative(32f, 32f, 0f, false, true, 32f, -32f)
                horizontalLineToRelative(19.54f)
                lineTo(20.73f, 105.59f)
                arcTo(190.86f, 190.86f, 0f, false, false, 0f, 192f)
                curveToRelative(0f, 56.75f, 24.75f, 107.62f, 64f, 142.88f)
                verticalLineTo(512f)
                horizontalLineTo(288f)
                verticalLineTo(480f)
                horizontalLineToRelative(64f)
                arcToRelative(64f, 64f, 0f, false, false, 64f, -64f)
                horizontalLineTo(320f)
                arcTo(32f, 32f, 0f, false, true, 288f, 384f)
                close()
                moveToRelative(328f, -24f)
                arcToRelative(24f, 24f, 0f, true, false, 24f, 24f)
                arcTo(24f, 24f, 0f, false, false, 616f, 360f)
                close()
            }
        }.build()
        
        return _HeadSideCoughSlash!!
    }

private var _HeadSideCoughSlash: ImageVector? = null

