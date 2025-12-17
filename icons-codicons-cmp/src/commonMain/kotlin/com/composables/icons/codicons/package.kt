package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Package: ImageVector
    get() {
        if (_Package != null) return _Package!!
        
        _Package = ImageVector.Builder(
            name = "package",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 8.63998f)
                curveTo(5.934f, 8.63998f, 5.867f, 8.62698f, 5.803f, 8.59898f)
                lineTo(3.303f, 7.52898f)
                curveTo(3.049f, 7.42098f, 2.931f, 7.12698f, 3.04f, 6.87298f)
                curveTo(3.149f, 6.61998f, 3.444f, 6.50098f, 3.696f, 6.60998f)
                lineTo(6.196f, 7.67998f)
                curveTo(6.45f, 7.78798f, 6.568f, 8.08198f, 6.459f, 8.33598f)
                curveTo(6.378f, 8.52498f, 6.193f, 8.63898f, 6f, 8.63898f)
                verticalLineTo(8.63998f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.80397f, 10.17f)
                curveTo(4.86797f, 10.197f, 4.93397f, 10.21f, 4.99997f, 10.21f)
                curveTo(5.19397f, 10.21f, 5.37897f, 10.096f, 5.45997f, 9.90599f)
                curveTo(5.56797f, 9.65199f, 5.44997f, 9.35799f, 5.19597f, 9.24999f)
                lineTo(3.69597f, 8.60999f)
                curveTo(3.44397f, 8.50199f, 3.14797f, 8.61999f, 3.03997f, 8.87399f)
                curveTo(2.93197f, 9.12799f, 3.04997f, 9.42199f, 3.30397f, 9.52999f)
                lineTo(4.80397f, 10.17f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.039f, 3.28598f)
                lineTo(9.077f, 1.37798f)
                curveTo(8.384f, 1.11098f, 7.616f, 1.11098f, 6.923f, 1.37798f)
                lineTo(1.962f, 3.28598f)
                curveTo(1.383f, 3.50898f, 1f, 4.06498f, 1f, 4.68598f)
                verticalLineTo(11.312f)
                curveTo(1f, 11.933f, 1.382f, 12.489f, 1.962f, 12.712f)
                lineTo(6.923f, 14.62f)
                curveTo(7.616f, 14.887f, 8.384f, 14.887f, 9.077f, 14.62f)
                lineTo(14.039f, 12.712f)
                curveTo(14.618f, 12.489f, 15f, 11.933f, 15f, 11.312f)
                verticalLineTo(4.68598f)
                curveTo(15f, 4.06498f, 14.618f, 3.50898f, 14.039f, 3.28598f)
                close()
                moveTo(7.5f, 13.757f)
                curveTo(7.426f, 13.738f, 7.354f, 13.715f, 7.282f, 13.687f)
                lineTo(2.32f, 11.779f)
                curveTo(2.127f, 11.705f, 2f, 11.519f, 2f, 11.312f)
                verticalLineTo(4.97098f)
                lineTo(7.5f, 7.32798f)
                verticalLineTo(13.757f)
                close()
                moveTo(2.564f, 4.12598f)
                lineTo(7.282f, 2.31098f)
                curveTo(7.744f, 2.13298f, 8.256f, 2.13298f, 8.718f, 2.31098f)
                lineTo(13.436f, 4.12598f)
                lineTo(8f, 6.45598f)
                lineTo(2.564f, 4.12598f)
                close()
                moveTo(14f, 11.313f)
                curveTo(14f, 11.52f, 13.873f, 11.705f, 13.68f, 11.78f)
                lineTo(8.718f, 13.688f)
                curveTo(8.646f, 13.716f, 8.574f, 13.739f, 8.5f, 13.758f)
                verticalLineTo(7.32998f)
                lineTo(14f, 4.97298f)
                verticalLineTo(11.313f)
                close()
            }
        }.build()
        
        return _Package!!
    }

private var _Package: ImageVector? = null

