package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DebugCoverage: ImageVector
    get() {
        if (_DebugCoverage != null) return _DebugCoverage!!
        
        _DebugCoverage = ImageVector.Builder(
            name = "debug-coverage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 10f)
                curveTo(6f, 11.023f, 5.488f, 11.926f, 4.706f, 12.468f)
                lineTo(4.6f, 13f)
                horizontalLineTo(1.4f)
                lineTo(1.294f, 12.468f)
                curveTo(0.512f, 11.926f, 0f, 11.023f, 0f, 10f)
                curveTo(0f, 8.343f, 1.344f, 7f, 3.001f, 7f)
                curveTo(4.658f, 7f, 6f, 8.343f, 6f, 10f)
                close()
                moveTo(13.233f, 6.691f)
                lineTo(5.234f, 2.191f)
                curveTo(5.01f, 2.066f, 4.756f, 2f, 4.5f, 2f)
                curveTo(3.673f, 2f, 3f, 2.673f, 3f, 3.5f)
                verticalLineTo(6f)
                curveTo(3.347f, 6f, 3.678f, 6.058f, 3.999f, 6.142f)
                verticalLineTo(3.5f)
                curveTo(3.999f, 3.225f, 4.223f, 3f, 4.499f, 3f)
                curveTo(4.586f, 3f, 4.668f, 3.021f, 4.744f, 3.063f)
                lineTo(12.744f, 7.563f)
                curveTo(12.901f, 7.652f, 12.999f, 7.819f, 12.999f, 8f)
                curveTo(12.999f, 8.181f, 12.901f, 8.348f, 12.743f, 8.437f)
                lineTo(6.451f, 11.976f)
                curveTo(6.228f, 12.365f, 5.959f, 12.729f, 5.614f, 13.027f)
                lineTo(5.487f, 13.665f)
                lineTo(13.233f, 9.308f)
                curveTo(13.706f, 9.042f, 14f, 8.541f, 14f, 7.999f)
                curveTo(14f, 7.457f, 13.706f, 6.957f, 13.233f, 6.691f)
                close()
                moveTo(1.839f, 15.196f)
                curveTo(1.933f, 15.663f, 2.343f, 16f, 2.82f, 16f)
                horizontalLineTo(3.18f)
                curveTo(3.657f, 16f, 4.067f, 15.663f, 4.161f, 15.196f)
                lineTo(4.4f, 14f)
                horizontalLineTo(1.6f)
                lineTo(1.839f, 15.196f)
                close()
            }
        }.build()
        
        return _DebugCoverage!!
    }

private var _DebugCoverage: ImageVector? = null

