package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Avatar: ImageVector
    get() {
        if (_Avatar != null) return _Avatar!!
        
        _Avatar = ImageVector.Builder(
            name = "avatar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.49908f, 0.87706f)
                curveTo(11.1565f, 0.87706f, 14.1217f, 3.84179f, 14.1221f, 7.49913f)
                curveTo(14.1221f, 11.1568f, 11.1567f, 14.1222f, 7.49908f, 14.1222f)
                curveTo(3.84175f, 14.1218f, 0.877014f, 11.1565f, 0.877014f, 7.49913f)
                curveTo(0.877426f, 3.84205f, 3.842f, 0.877471f, 7.49908f, 0.87706f)
                close()
                moveTo(7.50006f, 9.97472f)
                curveTo(6.01506f, 9.9748f, 4.7185f, 10.78f, 4.02057f, 11.9786f)
                curveTo(4.98131f, 12.7259f, 6.18779f, 13.1718f, 7.49908f, 13.172f)
                curveTo(8.81087f, 13.172f, 10.0176f, 12.7253f, 10.9786f, 11.9776f)
                curveTo(10.2804f, 10.7797f, 8.98458f, 9.97474f, 7.50006f, 9.97472f)
                close()
                moveTo(7.49908f, 1.82628f)
                curveTo(4.36667f, 1.82669f, 1.82664f, 4.36672f, 1.82623f, 7.49913f)
                curveTo(1.82623f, 8.97122f, 2.38807f, 10.3122f, 3.30768f, 11.3204f)
                curveTo(4.19121f, 9.94086f, 5.73848f, 9.02558f, 7.50006f, 9.0255f)
                curveTo(9.26117f, 9.02552f, 10.8078f, 9.94052f, 11.6915f, 11.3194f)
                curveTo(12.6107f, 10.3113f, 13.1719f, 8.97095f, 13.1719f, 7.49913f)
                curveTo(13.1715f, 4.36647f, 10.6318f, 1.82628f, 7.49908f, 1.82628f)
                close()
                moveTo(7.50006f, 4.15538f)
                curveTo(8.7979f, 4.15542f, 9.84967f, 5.20714f, 9.84967f, 6.50499f)
                curveTo(9.84961f, 7.80279f, 8.79786f, 8.85456f, 7.50006f, 8.8546f)
                curveTo(6.20223f, 8.8546f, 5.15051f, 7.80281f, 5.15045f, 6.50499f)
                curveTo(5.15045f, 5.20712f, 6.20219f, 4.15538f, 7.50006f, 4.15538f)
                close()
                moveTo(7.50006f, 5.1046f)
                curveTo(6.72686f, 5.1046f, 6.09967f, 5.73179f, 6.09967f, 6.50499f)
                curveTo(6.09973f, 7.27814f, 6.7269f, 7.90538f, 7.50006f, 7.90538f)
                curveTo(8.27319f, 7.90534f, 8.9004f, 7.27812f, 8.90045f, 6.50499f)
                curveTo(8.90045f, 5.73181f, 8.27323f, 5.10464f, 7.50006f, 5.1046f)
                close()
            }
        }.build()
        
        return _Avatar!!
    }

private var _Avatar: ImageVector? = null

