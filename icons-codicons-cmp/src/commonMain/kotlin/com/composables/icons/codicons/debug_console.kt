package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DebugConsole: ImageVector
    get() {
        if (_DebugConsole != null) return _DebugConsole!!
        
        _DebugConsole = ImageVector.Builder(
            name = "debug-console",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.25f, 21f)
                horizontalLineTo(11.8185f)
                lineTo(11.16f, 21.6585f)
                curveTo(10.9155f, 21.903f, 10.7565f, 22.194f, 10.647f, 22.5f)
                horizontalLineTo(5.25f)
                curveTo(3.1815f, 22.5f, 1.5f, 20.8185f, 1.5f, 18.75f)
                verticalLineTo(5.25f)
                curveTo(1.5f, 3.183f, 3.1815f, 1.5f, 5.25f, 1.5f)
                horizontalLineTo(18.75f)
                curveTo(20.8185f, 1.5f, 22.5f, 3.183f, 22.5f, 5.25f)
                verticalLineTo(12.135f)
                curveTo(22.236f, 12.228f, 21.9885f, 12.3645f, 21.774f, 12.552f)
                curveTo(21.558f, 12.2205f, 21.294f, 11.925f, 21f, 11.661f)
                verticalLineTo(5.25f)
                curveTo(21f, 4.0095f, 19.9905f, 3f, 18.75f, 3f)
                horizontalLineTo(5.25f)
                curveTo(4.0095f, 3f, 3f, 4.0095f, 3f, 5.25f)
                verticalLineTo(18.75f)
                curveTo(3f, 19.9905f, 4.0095f, 21f, 5.25f, 21f)
                close()
                moveTo(4.719f, 17.781f)
                curveTo(4.866f, 17.9265f, 5.058f, 18f, 5.25f, 18f)
                curveTo(5.442f, 18f, 5.634f, 17.928f, 5.781f, 17.781f)
                lineTo(10.2795f, 13.2825f)
                curveTo(10.572f, 12.99f, 10.572f, 12.5145f, 10.2795f, 12.222f)
                lineTo(5.7795f, 7.722f)
                curveTo(5.487f, 7.4295f, 5.0115f, 7.4295f, 4.719f, 7.722f)
                curveTo(4.4265f, 8.0145f, 4.4265f, 8.49f, 4.719f, 8.7825f)
                lineTo(8.688f, 12.7515f)
                lineTo(4.719f, 16.7205f)
                curveTo(4.4265f, 17.013f, 4.4265f, 17.4885f, 4.719f, 17.781f)
                close()
                moveTo(22.5f, 19.5f)
                curveTo(22.5f, 20.076f, 22.3905f, 20.625f, 22.1925f, 21.132f)
                lineTo(23.781f, 22.7205f)
                curveTo(24.0735f, 23.013f, 24.0735f, 23.4885f, 23.781f, 23.781f)
                curveTo(23.634f, 23.928f, 23.442f, 24f, 23.25f, 24f)
                curveTo(23.058f, 24f, 22.866f, 23.9265f, 22.719f, 23.781f)
                lineTo(21.3915f, 22.4535f)
                curveTo(20.5665f, 23.4f, 19.3515f, 24.0015f, 18f, 24.0015f)
                curveTo(16.6485f, 24.0015f, 15.4335f, 23.4015f, 14.6085f, 22.4535f)
                lineTo(13.281f, 23.781f)
                curveTo(13.134f, 23.928f, 12.942f, 24f, 12.75f, 24f)
                curveTo(12.558f, 24f, 12.366f, 23.9265f, 12.219f, 23.781f)
                curveTo(11.9265f, 23.4885f, 11.9265f, 23.013f, 12.219f, 22.7205f)
                lineTo(13.8075f, 21.132f)
                curveTo(13.6095f, 20.625f, 13.5f, 20.076f, 13.5f, 19.5f)
                horizontalLineTo(12.75f)
                curveTo(12.336f, 19.5f, 12f, 19.164f, 12f, 18.75f)
                curveTo(12f, 18.336f, 12.336f, 18f, 12.75f, 18f)
                horizontalLineTo(13.5f)
                verticalLineTo(16.0605f)
                lineTo(12.219f, 14.7795f)
                curveTo(11.9265f, 14.487f, 11.9265f, 14.0115f, 12.219f, 13.719f)
                curveTo(12.5115f, 13.4265f, 12.987f, 13.4265f, 13.2795f, 13.719f)
                lineTo(14.5605f, 15f)
                horizontalLineTo(15f)
                curveTo(15f, 13.3455f, 16.3455f, 12f, 18f, 12f)
                curveTo(19.6545f, 12f, 21f, 13.3455f, 21f, 15f)
                horizontalLineTo(21.4395f)
                lineTo(22.7205f, 13.719f)
                curveTo(23.013f, 13.4265f, 23.4885f, 13.4265f, 23.781f, 13.719f)
                curveTo(24.0735f, 14.0115f, 24.0735f, 14.487f, 23.781f, 14.7795f)
                lineTo(22.5f, 16.0605f)
                verticalLineTo(18f)
                horizontalLineTo(23.25f)
                curveTo(23.664f, 18f, 24f, 18.336f, 24f, 18.75f)
                curveTo(24f, 19.164f, 23.664f, 19.5f, 23.25f, 19.5f)
                horizontalLineTo(22.5f)
                close()
                moveTo(16.5f, 15f)
                horizontalLineTo(19.5f)
                curveTo(19.5f, 14.172f, 18.828f, 13.5f, 18f, 13.5f)
                curveTo(17.172f, 13.5f, 16.5f, 14.172f, 16.5f, 15f)
                close()
                moveTo(21f, 16.5f)
                horizontalLineTo(15f)
                verticalLineTo(19.5f)
                curveTo(15f, 21.1545f, 16.3455f, 22.5f, 18f, 22.5f)
                curveTo(19.6545f, 22.5f, 21f, 21.1545f, 21f, 19.5f)
                verticalLineTo(16.5f)
                close()
            }
        }.build()
        
        return _DebugConsole!!
    }

private var _DebugConsole: ImageVector? = null

