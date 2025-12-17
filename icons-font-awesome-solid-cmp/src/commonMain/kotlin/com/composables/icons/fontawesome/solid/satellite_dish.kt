package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.SatelliteDish: ImageVector
    get() {
        if (_SatelliteDish != null) return _SatelliteDish!!
        
        _SatelliteDish = ImageVector.Builder(
            name = "satellite-dish",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(305.44955f, 462.59f)
                curveToRelative(7.39157f, 7.29792f, 6.18829f, 20.09661f, -3.00038f, 25.00356f)
                curveToRelative(-77.713f, 41.80281f, -176.72559f, 29.9105f, -242.3433f, -35.7082f)
                curveTo(-5.49624f, 386.28226f, -17.404f, 287.362f, 24.41381f, 209.554f)
                curveToRelative(4.89125f, -9.095f, 17.68975f, -10.29834f, 25.00318f, -3.00043f)
                lineTo(166.22871f, 323.36707f)
                lineToRelative(27.39411f, -27.39452f)
                curveToRelative(-0.68759f, -2.60974f, -1.594f, -5.00071f, -1.594f, -7.81361f)
                arcToRelative(32.00407f, 32.00407f, 0f, true, true, 32.00407f, 32.00455f)
                curveToRelative(-2.79723f, 0f, -5.20378f, -0.89075f, -7.79786f, -1.594f)
                lineToRelative(-27.40974f, 27.41015f)
                close()
                moveTo(511.9758f, 303.06732f)
                arcToRelative(16.10336f, 16.10336f, 0f, false, true, -16.002f, 17.00242f)
                horizontalLineTo(463.86032f)
                arcToRelative(15.96956f, 15.96956f, 0f, false, true, -15.89265f, -15.00213f)
                curveTo(440.4667f, 175.5492f, 336.4535f, 70.53427f, 207.03078f, 63.53328f)
                arcToRelative(15.84486f, 15.84486f, 0f, false, true, -15.00191f, -15.90852f)
                verticalLineTo(16.02652f)
                arcTo(16.09389f, 16.09389f, 0f, false, true, 209.031f, 0.02425f)
                curveTo(372.2549f, 8.61922f, 503.47473f, 139.841f, 511.9758f, 303.06732f)
                close()
                moveToRelative(-96.01221f, -0.29692f)
                arcToRelative(16.21093f, 16.21093f, 0f, false, true, -16.11142f, 17.29934f)
                horizontalLineTo(367.645f)
                arcToRelative(16.06862f, 16.06862f, 0f, false, true, -15.89265f, -14.70522f)
                curveToRelative(-6.90712f, -77.01094f, -68.118f, -138.91037f, -144.92467f, -145.22375f)
                arcToRelative(15.94f, 15.94f, 0f, false, true, -14.79876f, -15.89289f)
                verticalLineTo(112.13393f)
                arcToRelative(16.134f, 16.134f, 0f, false, true, 17.29908f, -16.096f)
                curveTo(319.45132f, 104.5391f, 407.55627f, 192.64539f, 415.9636f, 302.7704f)
                close()
            }
        }.build()
        
        return _SatelliteDish!!
    }

private var _SatelliteDish: ImageVector? = null

