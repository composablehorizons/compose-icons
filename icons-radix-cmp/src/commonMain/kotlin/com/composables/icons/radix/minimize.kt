package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Minimize: ImageVector
    get() {
        if (_Minimize != null) return _Minimize!!
        
        _Minimize = ImageVector.Builder(
            name = "minimize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.50021f, 8.0502f)
                curveTo(6.61922f, 8.05031f, 6.73334f, 8.09799f, 6.8176f, 8.18204f)
                curveTo(6.90185f, 8.26641f, 6.95041f, 8.38115f, 6.95041f, 8.5004f)
                verticalLineTo(12.5004f)
                curveTo(6.9502f, 12.7486f, 6.74841f, 12.9494f, 6.50021f, 12.9496f)
                curveTo(6.25178f, 12.9495f, 6.05002f, 12.7479f, 6.05002f, 12.4994f)
                verticalLineTo(9.58536f)
                lineTo(2.3176f, 13.3178f)
                curveTo(2.14195f, 13.4933f, 1.85758f, 13.4942f, 1.68185f, 13.3188f)
                curveTo(1.50615f, 13.1431f, 1.50621f, 12.8578f, 1.68185f, 12.682f)
                lineTo(5.4133f, 8.95059f)
                lineTo(2.50021f, 8.94962f)
                curveTo(2.25182f, 8.94962f, 2.05121f, 8.74874f, 2.05099f, 8.5004f)
                curveTo(2.05099f, 8.25187f, 2.25169f, 8.0502f, 2.50021f, 8.0502f)
                horizontalLineTo(6.50021f)
                close()
                moveTo(12.6819f, 1.68204f)
                curveTo(12.8576f, 1.50651f, 13.1429f, 1.50637f, 13.3186f, 1.68204f)
                curveTo(13.4939f, 1.85767f, 13.4938f, 2.14211f, 13.3186f, 2.31778f)
                lineTo(9.58615f, 6.0502f)
                horizontalLineTo(12.5002f)
                curveTo(12.7486f, 6.05042f, 12.9504f, 6.252f, 12.9504f, 6.5004f)
                curveTo(12.9502f, 6.74861f, 12.7484f, 6.95038f, 12.5002f, 6.95059f)
                horizontalLineTo(8.50021f)
                lineTo(8.40939f, 6.94083f)
                curveTo(8.20459f, 6.8988f, 8.05021f, 6.71759f, 8.05002f, 6.5004f)
                verticalLineTo(2.5004f)
                curveTo(8.05015f, 2.25199f, 8.25178f, 2.05022f, 8.50021f, 2.0502f)
                curveTo(8.74863f, 2.05032f, 8.9494f, 2.25196f, 8.94943f, 2.5004f)
                verticalLineTo(5.41446f)
                lineTo(12.6819f, 1.68204f)
                close()
            }
        }.build()
        
        return _Minimize!!
    }

private var _Minimize: ImageVector? = null

