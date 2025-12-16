package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Crosshair1: ImageVector
    get() {
        if (_Crosshair1 != null) return _Crosshair1!!
        
        _Crosshair1 = ImageVector.Builder(
            name = "crosshair-1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.50208f, 0.877045f)
                curveTo(11.1606f, 0.877256f, 14.1269f, 3.84347f, 14.1271f, 7.50204f)
                curveTo(14.1269f, 11.1606f, 11.1606f, 14.1268f, 7.50208f, 14.127f)
                curveTo(3.8435f, 14.1268f, 0.877286f, 11.1606f, 0.877075f, 7.50204f)
                curveTo(0.877285f, 3.84347f, 3.8435f, 0.877256f, 7.50208f, 0.877045f)
                close()
                moveTo(8.00012f, 4.50009f)
                curveTo(8.00007f, 4.77616f, 7.77619f, 5.00004f, 7.50012f, 5.00009f)
                curveTo(7.22401f, 5.00009f, 7.00017f, 4.77619f, 7.00012f, 4.50009f)
                verticalLineTo(1.8497f)
                curveTo(4.26672f, 2.08955f, 2.08958f, 4.26669f, 1.84973f, 7.00009f)
                horizontalLineTo(4.50012f)
                curveTo(4.77622f, 7.00014f, 5.00012f, 7.22398f, 5.00012f, 7.50009f)
                curveTo(5.00007f, 7.77616f, 4.77619f, 8.00004f, 4.50012f, 8.00009f)
                horizontalLineTo(1.84973f)
                curveTo(2.08769f, 10.7354f, 4.26533f, 12.9135f, 7.00012f, 13.1534f)
                verticalLineTo(10.5001f)
                curveTo(7.00012f, 10.2239f, 7.22398f, 10.0001f, 7.50012f, 10.0001f)
                curveTo(7.77622f, 10.0001f, 8.00012f, 10.224f, 8.00012f, 10.5001f)
                verticalLineTo(13.1534f)
                curveTo(10.7368f, 12.9153f, 12.9164f, 10.7368f, 13.1544f, 8.00009f)
                horizontalLineTo(10.5001f)
                curveTo(10.224f, 8.00009f, 10.0002f, 7.77619f, 10.0001f, 7.50009f)
                curveTo(10.0001f, 7.22395f, 10.224f, 7.00009f, 10.5001f, 7.00009f)
                horizontalLineTo(13.1534f)
                curveTo(12.9135f, 4.26527f, 10.7355f, 2.08665f, 8.00012f, 1.84872f)
                verticalLineTo(4.50009f)
                close()
            }
        }.build()
        
        return _Crosshair1!!
    }

private var _Crosshair1: ImageVector? = null

