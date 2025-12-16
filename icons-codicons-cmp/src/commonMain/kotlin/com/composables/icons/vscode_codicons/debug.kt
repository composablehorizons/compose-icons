package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Debug: ImageVector
    get() {
        if (_Debug != null) return _Debug!!
        
        _Debug = ImageVector.Builder(
            name = "debug",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21.75f, 12f)
                horizontalLineTo(19.5f)
                verticalLineTo(9f)
                curveTo(19.5f, 8.445f, 19.347f, 7.9245f, 19.083f, 7.4775f)
                lineTo(20.7795f, 5.781f)
                curveTo(21.072f, 5.4885f, 21.072f, 5.013f, 20.7795f, 4.7205f)
                curveTo(20.487f, 4.428f, 20.0115f, 4.428f, 19.719f, 4.7205f)
                lineTo(18.0225f, 6.417f)
                curveTo(17.5755f, 6.153f, 17.055f, 6f, 16.5f, 6f)
                curveTo(16.5f, 3.519f, 14.481f, 1.5f, 12f, 1.5f)
                curveTo(9.519f, 1.5f, 7.5f, 3.519f, 7.5f, 6f)
                curveTo(6.945f, 6f, 6.4245f, 6.153f, 5.9775f, 6.417f)
                lineTo(4.281f, 4.7205f)
                curveTo(3.9885f, 4.428f, 3.513f, 4.428f, 3.2205f, 4.7205f)
                curveTo(2.928f, 5.013f, 2.928f, 5.4885f, 3.2205f, 5.781f)
                lineTo(4.917f, 7.4775f)
                curveTo(4.653f, 7.9245f, 4.5f, 8.445f, 4.5f, 9f)
                verticalLineTo(12f)
                horizontalLineTo(2.25f)
                curveTo(1.836f, 12f, 1.5f, 12.336f, 1.5f, 12.75f)
                curveTo(1.5f, 13.164f, 1.836f, 13.5f, 2.25f, 13.5f)
                horizontalLineTo(4.5f)
                curveTo(4.5f, 15.2985f, 5.136f, 16.95f, 6.195f, 18.2445f)
                lineTo(3.594f, 20.8455f)
                curveTo(3.3015f, 21.138f, 3.3015f, 21.6135f, 3.594f, 21.906f)
                curveTo(3.741f, 22.053f, 3.933f, 22.125f, 4.125f, 22.125f)
                curveTo(4.317f, 22.125f, 4.509f, 22.0515f, 4.656f, 21.906f)
                lineTo(7.257f, 19.305f)
                curveTo(8.55f, 20.364f, 10.203f, 21f, 12.0015f, 21f)
                curveTo(13.8f, 21f, 15.4515f, 20.364f, 16.746f, 19.305f)
                lineTo(19.347f, 21.906f)
                curveTo(19.494f, 22.053f, 19.686f, 22.125f, 19.878f, 22.125f)
                curveTo(20.07f, 22.125f, 20.262f, 22.0515f, 20.409f, 21.906f)
                curveTo(20.7015f, 21.6135f, 20.7015f, 21.138f, 20.409f, 20.8455f)
                lineTo(17.808f, 18.2445f)
                curveTo(18.867f, 16.9515f, 19.503f, 15.2985f, 19.503f, 13.5f)
                horizontalLineTo(21.753f)
                curveTo(22.167f, 13.5f, 22.503f, 13.164f, 22.503f, 12.75f)
                curveTo(22.503f, 12.336f, 22.167f, 12f, 21.753f, 12f)
                horizontalLineTo(21.75f)
                close()
                moveTo(12f, 3f)
                curveTo(13.6545f, 3f, 15f, 4.3455f, 15f, 6f)
                horizontalLineTo(9f)
                curveTo(9f, 4.3455f, 10.3455f, 3f, 12f, 3f)
                close()
                moveTo(18f, 13.5f)
                curveTo(18f, 16.809f, 15.309f, 19.5f, 12f, 19.5f)
                curveTo(8.691f, 19.5f, 6f, 16.809f, 6f, 13.5f)
                verticalLineTo(9f)
                curveTo(6f, 8.172f, 6.672f, 7.5f, 7.5f, 7.5f)
                horizontalLineTo(16.5f)
                curveTo(17.328f, 7.5f, 18f, 8.172f, 18f, 9f)
                verticalLineTo(13.5f)
                close()
                moveTo(14.781f, 11.031f)
                lineTo(13.062f, 12.75f)
                lineTo(14.781f, 14.469f)
                curveTo(15.0735f, 14.7615f, 15.0735f, 15.237f, 14.781f, 15.5295f)
                curveTo(14.634f, 15.6765f, 14.442f, 15.7485f, 14.25f, 15.7485f)
                curveTo(14.058f, 15.7485f, 13.866f, 15.675f, 13.719f, 15.5295f)
                lineTo(12f, 13.8105f)
                lineTo(10.281f, 15.5295f)
                curveTo(10.134f, 15.6765f, 9.942f, 15.7485f, 9.75f, 15.7485f)
                curveTo(9.558f, 15.7485f, 9.366f, 15.675f, 9.219f, 15.5295f)
                curveTo(8.9265f, 15.237f, 8.9265f, 14.7615f, 9.219f, 14.469f)
                lineTo(10.938f, 12.75f)
                lineTo(9.219f, 11.031f)
                curveTo(8.9265f, 10.7385f, 8.9265f, 10.263f, 9.219f, 9.9705f)
                curveTo(9.5115f, 9.678f, 9.987f, 9.678f, 10.2795f, 9.9705f)
                lineTo(11.9985f, 11.6895f)
                lineTo(13.7175f, 9.9705f)
                curveTo(14.01f, 9.678f, 14.4855f, 9.678f, 14.778f, 9.9705f)
                curveTo(15.0705f, 10.263f, 15.0705f, 10.7385f, 14.778f, 11.031f)
                horizontalLineTo(14.781f)
                close()
            }
        }.build()
        
        return _Debug!!
    }

private var _Debug: ImageVector? = null

