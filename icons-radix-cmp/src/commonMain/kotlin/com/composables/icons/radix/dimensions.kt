package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Dimensions: ImageVector
    get() {
        if (_Dimensions != null) return _Dimensions!!
        
        _Dimensions = ImageVector.Builder(
            name = "dimensions",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.3027f, 4.00411f)
                curveTo(13.4028f, 3.87542f, 13.5971f, 3.87542f, 13.6972f, 4.00411f)
                lineTo(14.9365f, 5.59688f)
                curveTo(15.0638f, 5.76108f, 14.9461f, 6.0002f, 14.7382f, 6.0002f)
                horizontalLineTo(14f)
                verticalLineTo(12.0002f)
                horizontalLineTo(14.7382f)
                curveTo(14.9462f, 12.0002f, 15.0639f, 12.2393f, 14.9365f, 12.4035f)
                lineTo(13.6972f, 13.9963f)
                curveTo(13.5971f, 14.125f, 13.4028f, 14.125f, 13.3027f, 13.9963f)
                lineTo(12.0634f, 12.4035f)
                curveTo(11.936f, 12.2394f, 12.053f, 12.0005f, 12.2607f, 12.0002f)
                horizontalLineTo(13f)
                verticalLineTo(6.0002f)
                horizontalLineTo(12.2607f)
                curveTo(12.053f, 5.99995f, 11.9361f, 5.761f, 12.0634f, 5.59688f)
                lineTo(13.3027f, 4.00411f)
                close()
                moveTo(9.65328f, 4.00801f)
                curveTo(10.4096f, 4.08486f, 11f, 4.72357f, 11f, 5.5002f)
                verticalLineTo(12.5002f)
                lineTo(10.9921f, 12.6535f)
                curveTo(10.9204f, 13.3594f, 10.3592f, 13.9207f, 9.65328f, 13.9924f)
                lineTo(9.49996f, 14.0002f)
                horizontalLineTo(2.49996f)
                lineTo(2.34664f, 13.9924f)
                curveTo(1.64068f, 13.9207f, 1.07949f, 13.3595f, 1.00777f, 12.6535f)
                lineTo(0.999957f, 12.5002f)
                verticalLineTo(5.5002f)
                curveTo(0.999957f, 4.72354f, 1.59023f, 4.08481f, 2.34664f, 4.00801f)
                lineTo(2.49996f, 4.0002f)
                horizontalLineTo(9.49996f)
                lineTo(9.65328f, 4.00801f)
                close()
                moveTo(2.49996f, 5.0002f)
                curveTo(2.22381f, 5.0002f, 1.99996f, 5.22406f, 1.99996f, 5.5002f)
                verticalLineTo(12.5002f)
                curveTo(2f, 12.7763f, 2.22384f, 13.0002f, 2.49996f, 13.0002f)
                horizontalLineTo(9.49996f)
                curveTo(9.77603f, 13.0001f, 9.99992f, 12.7763f, 9.99996f, 12.5002f)
                verticalLineTo(5.5002f)
                curveTo(9.99996f, 5.22409f, 9.77605f, 5.00026f, 9.49996f, 5.0002f)
                horizontalLineTo(2.49996f)
                close()
                moveTo(8.99996f, 0.261919f)
                curveTo(8.99996f, 0.0540039f, 9.23907f, -0.0636846f, 9.40328f, 0.0636771f)
                lineTo(10.9961f, 1.30293f)
                curveTo(11.1247f, 1.40302f, 11.1247f, 1.59738f, 10.9961f, 1.69747f)
                lineTo(9.40328f, 2.93672f)
                curveTo(9.23916f, 3.06411f, 9.00022f, 2.94719f, 8.99996f, 2.73946f)
                verticalLineTo(2.0002f)
                horizontalLineTo(2.99996f)
                verticalLineTo(2.73946f)
                curveTo(2.99967f, 2.94716f, 2.76075f, 3.06408f, 2.59664f, 2.93672f)
                lineTo(1.00386f, 1.69747f)
                curveTo(0.875177f, 1.59738f, 0.875177f, 1.40302f, 1.00386f, 1.30293f)
                lineTo(2.59664f, 0.0636771f)
                curveTo(2.76072f, -0.0636022f, 2.9996f, 0.0533126f, 2.99996f, 0.260943f)
                verticalLineTo(1.0002f)
                horizontalLineTo(8.99996f)
                verticalLineTo(0.261919f)
                close()
            }
        }.build()
        
        return _Dimensions!!
    }

private var _Dimensions: ImageVector? = null

