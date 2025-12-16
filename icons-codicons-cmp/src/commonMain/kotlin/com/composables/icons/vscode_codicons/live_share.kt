package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.LiveShare: ImageVector
    get() {
        if (_LiveShare != null) return _LiveShare!!
        
        _LiveShare = ImageVector.Builder(
            name = "live-share",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 25f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.75f, 2.06775f)
                curveTo(10.164f, 2.06775f, 10.5f, 2.40375f, 10.5f, 2.81775f)
                curveTo(10.5f, 3.23175f, 10.164f, 3.56775f, 9.75f, 3.56775f)
                horizontalLineTo(4.5f)
                curveTo(2.843f, 3.56775f, 1.5f, 4.91075f, 1.5f, 6.56775f)
                verticalLineTo(18.5677f)
                curveTo(1.5f, 20.2247f, 2.843f, 21.5677f, 4.5f, 21.5677f)
                horizontalLineTo(16.5f)
                curveTo(18.157f, 21.5677f, 19.5f, 20.2247f, 19.5f, 18.5677f)
                verticalLineTo(16.3177f)
                curveTo(19.5f, 15.9037f, 19.836f, 15.5677f, 20.25f, 15.5677f)
                curveTo(20.664f, 15.5677f, 21f, 15.9037f, 21f, 16.3177f)
                verticalLineTo(18.5677f)
                curveTo(21f, 21.0527f, 18.985f, 23.0677f, 16.5f, 23.0677f)
                horizontalLineTo(4.5f)
                curveTo(2.015f, 23.0677f, 0f, 21.0527f, 0f, 18.5677f)
                verticalLineTo(6.56775f)
                curveTo(0f, 4.08275f, 2.015f, 2.06775f, 4.5f, 2.06775f)
                horizontalLineTo(9.75f)
                close()
                moveTo(15.75f, 0.567749f)
                curveTo(15.932f, 0.567749f, 16.112f, 0.633749f, 16.252f, 0.759749f)
                lineTo(23.752f, 7.50975f)
                curveTo(23.91f, 7.65175f, 23.999f, 7.85575f, 24f, 8.06775f)
                curveTo(24f, 8.28075f, 23.91f, 8.48375f, 23.752f, 8.62575f)
                lineTo(16.252f, 15.3757f)
                curveTo(16.112f, 15.5017f, 15.932f, 15.5677f, 15.75f, 15.5677f)
                curveTo(15.255f, 15.5677f, 14.999f, 15.1467f, 14.999f, 14.8177f)
                verticalLineTo(11.5777f)
                curveTo(10.215f, 12.0157f, 6.971f, 16.3267f, 6.157f, 17.7167f)
                lineTo(5.92f, 18.1537f)
                curveTo(5.791f, 18.4117f, 5.528f, 18.5677f, 5.249f, 18.5677f)
                curveTo(4.802f, 18.5677f, 4.499f, 18.1987f, 4.499f, 17.8177f)
                curveTo(4.499f, 4.10175f, 14.721f, 4.35075f, 14.999f, 4.33675f)
                verticalLineTo(1.31775f)
                lineTo(15.006f, 1.20775f)
                curveTo(15.033f, 1.02575f, 15.224f, 0.567749f, 15.749f, 0.567749f)
                horizontalLineTo(15.75f)
                close()
                moveTo(16.5f, 5.06775f)
                curveTo(16.5f, 5.48175f, 16.164f, 5.81775f, 15.75f, 5.81775f)
                curveTo(11.869f, 5.81775f, 9.485f, 7.38575f, 8.035f, 9.60275f)
                curveTo(7.007f, 11.1757f, 6.425f, 13.1117f, 6.166f, 15.1277f)
                curveTo(6.815f, 14.3477f, 7.604f, 13.5467f, 8.513f, 12.8187f)
                curveTo(10.415f, 11.2947f, 12.901f, 10.0397f, 15.751f, 10.0397f)
                curveTo(16.165f, 10.0397f, 16.501f, 10.3757f, 16.501f, 10.7897f)
                verticalLineTo(13.1307f)
                lineTo(22.127f, 8.06675f)
                lineTo(16.501f, 3.00175f)
                verticalLineTo(5.06675f)
                lineTo(16.5f, 5.06775f)
                close()
            }
        }.build()
        
        return _LiveShare!!
    }

private var _LiveShare: ImageVector? = null

