package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DebugAlt: ImageVector
    get() {
        if (_DebugAlt != null) return _DebugAlt!!
        
        _DebugAlt = ImageVector.Builder(
            name = "debug-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.854f, 13.9605f)
                lineTo(13.2105f, 17.697f)
                curveTo(12.954f, 17.22f, 12.5505f, 16.8345f, 12.039f, 16.641f)
                lineTo(12.054f, 16.626f)
                lineTo(19.1175f, 12.6525f)
                curveTo(19.6275f, 12.366f, 19.6275f, 11.6325f, 19.1175f, 11.3445f)
                lineTo(7.11751f, 4.59599f)
                curveTo(6.61801f, 4.31399f, 6.00001f, 4.67549f, 6.00001f, 5.24999f)
                verticalLineTo(10.5f)
                curveTo(5.46901f, 10.5f, 4.97401f, 10.6215f, 4.50001f, 10.791f)
                verticalLineTo(5.24999f)
                curveTo(4.50001f, 3.52949f, 6.35251f, 2.44499f, 7.85251f, 3.28949f)
                lineTo(19.8525f, 10.0395f)
                curveTo(21.381f, 10.899f, 21.381f, 13.101f, 19.8525f, 13.962f)
                lineTo(19.854f, 13.9605f)
                close()
                moveTo(10.5f, 16.0605f)
                verticalLineTo(18f)
                horizontalLineTo(11.25f)
                curveTo(11.664f, 18f, 12f, 18.336f, 12f, 18.75f)
                curveTo(12f, 19.164f, 11.664f, 19.5f, 11.25f, 19.5f)
                horizontalLineTo(10.5f)
                curveTo(10.5f, 20.076f, 10.3905f, 20.625f, 10.1925f, 21.132f)
                lineTo(11.781f, 22.7205f)
                curveTo(12.0735f, 23.013f, 12.0735f, 23.4885f, 11.781f, 23.781f)
                curveTo(11.634f, 23.928f, 11.442f, 24f, 11.25f, 24f)
                curveTo(11.058f, 24f, 10.866f, 23.9265f, 10.719f, 23.781f)
                lineTo(9.39151f, 22.4535f)
                curveTo(8.56651f, 23.4f, 7.35151f, 24.0015f, 6.00001f, 24.0015f)
                curveTo(4.64851f, 24.0015f, 3.43351f, 23.4015f, 2.60851f, 22.4535f)
                lineTo(1.28101f, 23.781f)
                curveTo(1.13401f, 23.928f, 0.942009f, 24f, 0.750009f, 24f)
                curveTo(0.558009f, 24f, 0.366009f, 23.9265f, 0.219009f, 23.781f)
                curveTo(-0.0734912f, 23.4885f, -0.0734912f, 23.013f, 0.219009f, 22.7205f)
                lineTo(1.80751f, 21.132f)
                curveTo(1.60951f, 20.625f, 1.50001f, 20.076f, 1.50001f, 19.5f)
                horizontalLineTo(0.750009f)
                curveTo(0.336009f, 19.5f, 8.78423E-6f, 19.164f, 8.78423E-6f, 18.75f)
                curveTo(8.78423E-6f, 18.336f, 0.336009f, 18f, 0.750009f, 18f)
                horizontalLineTo(1.50001f)
                verticalLineTo(16.0605f)
                lineTo(0.219009f, 14.7795f)
                curveTo(-0.0734912f, 14.487f, -0.0734912f, 14.0115f, 0.219009f, 13.719f)
                curveTo(0.511509f, 13.4265f, 0.987009f, 13.4265f, 1.27951f, 13.719f)
                lineTo(2.56051f, 15f)
                horizontalLineTo(3.00001f)
                curveTo(3.00001f, 13.3455f, 4.34551f, 12f, 6.00001f, 12f)
                curveTo(7.65451f, 12f, 9.00001f, 13.3455f, 9.00001f, 15f)
                horizontalLineTo(9.43951f)
                lineTo(10.7205f, 13.719f)
                curveTo(11.013f, 13.4265f, 11.4885f, 13.4265f, 11.781f, 13.719f)
                curveTo(12.0735f, 14.0115f, 12.0735f, 14.487f, 11.781f, 14.7795f)
                lineTo(10.5f, 16.0605f)
                close()
                moveTo(4.50001f, 15f)
                horizontalLineTo(7.50001f)
                curveTo(7.50001f, 14.172f, 6.82801f, 13.5f, 6.00001f, 13.5f)
                curveTo(5.17201f, 13.5f, 4.50001f, 14.172f, 4.50001f, 15f)
                close()
                moveTo(9.00001f, 16.5f)
                horizontalLineTo(3.00001f)
                verticalLineTo(19.5f)
                curveTo(3.00001f, 21.1545f, 4.34551f, 22.5f, 6.00001f, 22.5f)
                curveTo(7.65451f, 22.5f, 9.00001f, 21.1545f, 9.00001f, 19.5f)
                verticalLineTo(16.5f)
                close()
            }
        }.build()
        
        return _DebugAlt!!
    }

private var _DebugAlt: ImageVector? = null

