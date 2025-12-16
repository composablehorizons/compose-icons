package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Bell: ImageVector
    get() {
        if (_Bell != null) return _Bell!!
        
        _Bell = ImageVector.Builder(
            name = "bell",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.50094f, 0.150421f)
                curveTo(8.10865f, 0.150484f, 8.60153f, 0.64329f, 8.60153f, 1.25101f)
                curveTo(8.60146f, 1.757f, 8.25905f, 2.18112f, 7.79391f, 2.3096f)
                curveTo(10.1422f, 2.46099f, 11.9999f, 4.41337f, 12f, 6.79984f)
                verticalLineTo(10.25f)
                curveTo(12f, 11.0562f, 12.0331f, 11.7074f, 12.7236f, 12.0528f)
                curveTo(12.9308f, 12.1564f, 13.0393f, 12.3888f, 12.9863f, 12.6143f)
                curveTo(12.933f, 12.84f, 12.7319f, 13f, 12.5f, 13f)
                horizontalLineTo(8.15915f)
                curveTo(8.3675f, 13.1833f, 8.49997f, 13.4507f, 8.49997f, 13.75f)
                curveTo(8.49995f, 14.3023f, 8.05224f, 14.75f, 7.49997f, 14.75f)
                curveTo(6.94771f, 14.75f, 6.49999f, 14.3023f, 6.49997f, 13.75f)
                curveTo(6.49997f, 13.4508f, 6.63246f, 13.1833f, 6.84079f, 13f)
                horizontalLineTo(2.49997f)
                curveTo(2.2681f, 13f, 2.06691f, 12.84f, 2.01364f, 12.6143f)
                curveTo(1.96065f, 12.3888f, 2.06913f, 12.1564f, 2.27634f, 12.0528f)
                curveTo(2.96696f, 11.7074f, 2.99996f, 11.0562f, 2.99997f, 10.25f)
                verticalLineTo(6.79984f)
                curveTo(3.00005f, 4.41307f, 4.85835f, 2.46056f, 7.207f, 2.3096f)
                curveTo(6.74221f, 2.18089f, 6.40042f, 1.75675f, 6.40036f, 1.25101f)
                curveTo(6.40036f, 0.643252f, 6.89319f, 0.150421f, 7.50094f, 0.150421f)
                close()
                moveTo(7.49997f, 3.29984f)
                curveTo(5.56705f, 3.29986f, 4.00005f, 4.86693f, 3.99997f, 6.79984f)
                verticalLineTo(10.25f)
                curveTo(3.99997f, 10.6948f, 4.01284f, 11.3855f, 3.69919f, 12f)
                horizontalLineTo(11.3007f)
                curveTo(10.9871f, 11.3855f, 11f, 10.6948f, 11f, 10.25f)
                verticalLineTo(6.79984f)
                curveTo(10.9999f, 4.86691f, 9.43291f, 3.29984f, 7.49997f, 3.29984f)
                close()
            }
        }.build()
        
        return _Bell!!
    }

private var _Bell: ImageVector? = null

