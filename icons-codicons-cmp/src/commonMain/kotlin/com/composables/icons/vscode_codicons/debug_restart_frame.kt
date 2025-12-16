package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DebugRestartFrame: ImageVector
    get() {
        if (_DebugRestartFrame != null) return _DebugRestartFrame!!
        
        _DebugRestartFrame = ImageVector.Builder(
            name = "debug-restart-frame",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 3.5f)
                curveTo(1f, 3.22386f, 1.22386f, 3f, 1.5f, 3f)
                horizontalLineTo(14.5f)
                curveTo(14.7761f, 3f, 15f, 3.22386f, 15f, 3.5f)
                curveTo(15f, 3.77614f, 14.7761f, 4f, 14.5f, 4f)
                horizontalLineTo(1.5f)
                curveTo(1.22386f, 4f, 1f, 3.77614f, 1f, 3.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 7.5f)
                curveTo(1f, 7.22386f, 1.22386f, 7f, 1.5f, 7f)
                horizontalLineTo(14.5f)
                curveTo(14.7761f, 7f, 15f, 7.22386f, 15f, 7.5f)
                curveTo(15f, 7.77614f, 14.7761f, 8f, 14.5f, 8f)
                horizontalLineTo(1.5f)
                curveTo(1.22386f, 8f, 1f, 7.77614f, 1f, 7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 11.5f)
                curveTo(1f, 11.2239f, 1.22386f, 11f, 1.5f, 11f)
                horizontalLineTo(7.99939f)
                verticalLineTo(11.4994f)
                curveTo(7.99939f, 11.6716f, 8.02899f, 11.8407f, 8.08538f, 12f)
                horizontalLineTo(1.5f)
                curveTo(1.22386f, 12f, 1f, 11.7761f, 1f, 11.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.99939f, 9.49939f)
                verticalLineTo(11.4994f)
                curveTo(8.99939f, 11.632f, 9.05207f, 11.7592f, 9.14584f, 11.8529f)
                curveTo(9.2396f, 11.9467f, 9.36678f, 11.9994f, 9.49939f, 11.9994f)
                horizontalLineTo(11.4994f)
                curveTo(11.632f, 11.9994f, 11.7592f, 11.9467f, 11.8529f, 11.8529f)
                curveTo(11.9467f, 11.7592f, 11.9994f, 11.632f, 11.9994f, 11.4994f)
                curveTo(11.9994f, 11.3668f, 11.9467f, 11.2396f, 11.8529f, 11.1458f)
                curveTo(11.7592f, 11.0521f, 11.632f, 10.9994f, 11.4994f, 10.9994f)
                horizontalLineTo(10.4994f)
                curveTo(10.5702f, 10.9049f, 10.6477f, 10.8157f, 10.7314f, 10.7324f)
                curveTo(11.2078f, 10.2778f, 11.8409f, 10.0242f, 12.4994f, 10.0242f)
                curveTo(13.1579f, 10.0242f, 13.791f, 10.2778f, 14.2674f, 10.7324f)
                curveTo(14.4996f, 10.9645f, 14.6838f, 11.2402f, 14.8095f, 11.5435f)
                curveTo(14.9352f, 11.8469f, 14.9999f, 12.172f, 14.9999f, 12.5004f)
                curveTo(14.9999f, 12.8287f, 14.9352f, 13.1539f, 14.8095f, 13.4573f)
                curveTo(14.6838f, 13.7606f, 14.4996f, 14.0362f, 14.2674f, 14.2684f)
                curveTo(13.7909f, 14.7227f, 13.1578f, 14.9762f, 12.4994f, 14.9762f)
                curveTo(11.841f, 14.9762f, 11.2079f, 14.7227f, 10.7314f, 14.2684f)
                curveTo(10.6371f, 14.1773f, 10.5108f, 14.1269f, 10.3797f, 14.1281f)
                curveTo(10.2486f, 14.1292f, 10.1232f, 14.1818f, 10.0305f, 14.2745f)
                curveTo(9.93778f, 14.3672f, 9.88519f, 14.4926f, 9.88405f, 14.6237f)
                curveTo(9.88291f, 14.7548f, 9.93331f, 14.8811f, 10.0244f, 14.9754f)
                curveTo(10.6808f, 15.6318f, 11.5711f, 16.0006f, 12.4994f, 16.0006f)
                curveTo(13.4277f, 16.0006f, 14.318f, 15.6318f, 14.9744f, 14.9754f)
                curveTo(15.6308f, 14.319f, 15.9996f, 13.4287f, 15.9996f, 12.5004f)
                curveTo(15.9996f, 11.5721f, 15.6308f, 10.6818f, 14.9744f, 10.0254f)
                curveTo(14.3075f, 9.38902f, 13.4212f, 9.03396f, 12.4994f, 9.03396f)
                curveTo(11.5776f, 9.03396f, 10.6912f, 9.38902f, 10.0244f, 10.0254f)
                lineTo(9.99939f, 10.0514f)
                verticalLineTo(9.49939f)
                curveTo(9.99939f, 9.36678f, 9.94671f, 9.2396f, 9.85294f, 9.14584f)
                curveTo(9.75918f, 9.05207f, 9.632f, 8.99939f, 9.49939f, 8.99939f)
                curveTo(9.36678f, 8.99939f, 9.2396f, 9.05207f, 9.14584f, 9.14584f)
                curveTo(9.05207f, 9.2396f, 8.99939f, 9.36678f, 8.99939f, 9.49939f)
                close()
            }
        }.build()
        
        return _DebugRestartFrame!!
    }

private var _DebugRestartFrame: ImageVector? = null

