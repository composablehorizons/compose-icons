package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.VerifiedFilled: ImageVector
    get() {
        if (_VerifiedFilled != null) return _VerifiedFilled!!
        
        _VerifiedFilled = ImageVector.Builder(
            name = "verified-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.335f, 2.06532f)
                lineTo(11.4114f, 2.21789f)
                lineTo(11.9879f, 3.75087f)
                curveTo(12.0332f, 3.87159f, 12.1284f, 3.96685f, 12.2492f, 4.01214f)
                lineTo(13.7292f, 4.56741f)
                curveTo(14.3787f, 4.81108f, 14.7278f, 5.50512f, 14.5547f, 6.16178f)
                lineTo(14.5131f, 6.29246f)
                lineTo(13.8245f, 7.81529f)
                curveTo(13.7712f, 7.93268f, 13.7712f, 8.06739f, 13.8245f, 8.18478f)
                lineTo(14.4784f, 9.62399f)
                curveTo(14.7654f, 10.2556f, 14.5214f, 10.9931f, 13.9347f, 11.3351f)
                lineTo(13.7822f, 11.4115f)
                lineTo(12.2492f, 11.9879f)
                curveTo(12.1284f, 12.0332f, 12.0332f, 12.1285f, 11.9879f, 12.2492f)
                lineTo(11.4326f, 13.7293f)
                curveTo(11.189f, 14.3788f, 10.4949f, 14.7278f, 9.83826f, 14.5547f)
                lineTo(9.70758f, 14.5131f)
                lineTo(8.18475f, 13.8245f)
                curveTo(8.06736f, 13.7712f, 7.93265f, 13.7712f, 7.81526f, 13.8245f)
                lineTo(6.37605f, 14.4785f)
                curveTo(5.74448f, 14.7654f, 5.00693f, 14.5215f, 4.66498f, 13.9347f)
                lineTo(4.58856f, 13.7822f)
                lineTo(4.01211f, 12.2492f)
                curveTo(3.96682f, 12.1285f, 3.87156f, 12.0332f, 3.75084f, 11.9879f)
                lineTo(2.27076f, 11.4327f)
                curveTo(1.62126f, 11.189f, 1.27224f, 10.4949f, 1.44531f, 9.83829f)
                lineTo(1.48695f, 9.70761f)
                lineTo(2.17552f, 8.18478f)
                curveTo(2.22886f, 8.06739f, 2.22886f, 7.93268f, 2.17552f, 7.81529f)
                lineTo(1.52159f, 6.37608f)
                curveTo(1.23462f, 5.74451f, 1.47858f, 5.00696f, 2.06529f, 4.66501f)
                lineTo(2.21786f, 4.58859f)
                lineTo(3.75084f, 4.01214f)
                curveTo(3.87156f, 3.96685f, 3.96682f, 3.87159f, 4.01211f, 3.75087f)
                lineTo(4.56738f, 2.27079f)
                curveTo(4.81105f, 1.62129f, 5.50509f, 1.27227f, 6.16175f, 1.44534f)
                lineTo(6.29243f, 1.48698f)
                lineTo(7.81526f, 2.17555f)
                curveTo(7.93265f, 2.22889f, 8.06736f, 2.22889f, 8.18475f, 2.17555f)
                lineTo(9.62396f, 1.52162f)
                curveTo(10.2555f, 1.23465f, 10.9931f, 1.47861f, 11.335f, 2.06532f)
                close()
                moveTo(10.1639f, 5.70595f)
                lineTo(6.97825f, 9.34669f)
                lineTo(5.8158f, 8.18424f)
                curveTo(5.64139f, 8.00983f, 5.35862f, 8.00983f, 5.18421f, 8.18424f)
                curveTo(5.0098f, 8.35865f, 5.0098f, 8.64142f, 5.18421f, 8.81583f)
                lineTo(6.68421f, 10.3158f)
                curveTo(6.86689f, 10.4985f, 7.16599f, 10.4885f, 7.33611f, 10.2941f)
                lineTo(10.8361f, 6.29412f)
                curveTo(10.9985f, 6.1085f, 10.9797f, 5.82635f, 10.7941f, 5.66393f)
                curveTo(10.6085f, 5.50151f, 10.3263f, 5.52032f, 10.1639f, 5.70595f)
                close()
            }
        }.build()
        
        return _VerifiedFilled!!
    }

private var _VerifiedFilled: ImageVector? = null

