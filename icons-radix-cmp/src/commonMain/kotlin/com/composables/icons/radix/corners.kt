package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Corners: ImageVector
    get() {
        if (_Corners != null) return _Corners!!
        
        _Corners = ImageVector.Builder(
            name = "corners",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 9f)
                curveTo(2.77614f, 9f, 3f, 9.22386f, 3f, 9.5f)
                verticalLineTo(10.0996f)
                curveTo(3f, 10.5279f, 3.00017f, 10.8199f, 3.01855f, 11.0449f)
                curveTo(3.03647f, 11.2639f, 3.06956f, 11.376f, 3.10938f, 11.4541f)
                curveTo(3.20521f, 11.6421f, 3.35793f, 11.7948f, 3.5459f, 11.8906f)
                curveTo(3.62405f, 11.9304f, 3.73615f, 11.9635f, 3.95508f, 11.9814f)
                curveTo(4.18012f, 11.9998f, 4.4721f, 12f, 4.90039f, 12f)
                horizontalLineTo(5.5f)
                curveTo(5.77614f, 12f, 6f, 12.2239f, 6f, 12.5f)
                curveTo(6f, 12.7761f, 5.77614f, 13f, 5.5f, 13f)
                horizontalLineTo(4.87891f)
                curveTo(4.47662f, 13f, 4.14452f, 12.9996f, 3.87402f, 12.9775f)
                curveTo(3.59301f, 12.9546f, 3.33444f, 12.9059f, 3.0918f, 12.7822f)
                curveTo(2.71554f, 12.5905f, 2.40951f, 12.2845f, 2.21777f, 11.9082f)
                curveTo(2.09414f, 11.6656f, 2.04543f, 11.407f, 2.02246f, 11.126f)
                curveTo(2.00036f, 10.8555f, 1.99999f, 10.5234f, 2f, 10.1211f)
                verticalLineTo(9.5f)
                curveTo(2f, 9.22386f, 2.22386f, 9f, 2.5f, 9f)
                close()
                moveTo(12.5f, 9f)
                curveTo(12.7761f, 9f, 13f, 9.22386f, 13f, 9.5f)
                verticalLineTo(10.1211f)
                curveTo(13f, 10.5234f, 12.9996f, 10.8555f, 12.9775f, 11.126f)
                curveTo(12.9546f, 11.407f, 12.9059f, 11.6656f, 12.7822f, 11.9082f)
                curveTo(12.5905f, 12.2845f, 12.2845f, 12.5905f, 11.9082f, 12.7822f)
                curveTo(11.6656f, 12.9059f, 11.407f, 12.9546f, 11.126f, 12.9775f)
                curveTo(10.8555f, 12.9996f, 10.5234f, 13f, 10.1211f, 13f)
                horizontalLineTo(9.5f)
                curveTo(9.22386f, 13f, 9f, 12.7761f, 9f, 12.5f)
                curveTo(9f, 12.2239f, 9.22386f, 12f, 9.5f, 12f)
                horizontalLineTo(10.0996f)
                curveTo(10.5279f, 12f, 10.8199f, 11.9998f, 11.0449f, 11.9814f)
                curveTo(11.2639f, 11.9635f, 11.376f, 11.9304f, 11.4541f, 11.8906f)
                curveTo(11.6421f, 11.7948f, 11.7948f, 11.6421f, 11.8906f, 11.4541f)
                curveTo(11.9304f, 11.376f, 11.9635f, 11.2639f, 11.9814f, 11.0449f)
                curveTo(11.9998f, 10.8199f, 12f, 10.5279f, 12f, 10.0996f)
                verticalLineTo(9.5f)
                curveTo(12f, 9.22386f, 12.2239f, 9f, 12.5f, 9f)
                close()
                moveTo(5.5f, 2f)
                curveTo(5.77614f, 2f, 6f, 2.22386f, 6f, 2.5f)
                curveTo(6f, 2.77614f, 5.77614f, 3f, 5.5f, 3f)
                horizontalLineTo(4.90039f)
                curveTo(4.4721f, 3f, 4.18012f, 3.00017f, 3.95508f, 3.01855f)
                curveTo(3.73615f, 3.03647f, 3.62405f, 3.06956f, 3.5459f, 3.10938f)
                curveTo(3.35793f, 3.20522f, 3.20521f, 3.35793f, 3.10938f, 3.5459f)
                curveTo(3.06956f, 3.62405f, 3.03647f, 3.73615f, 3.01855f, 3.95508f)
                curveTo(3.00017f, 4.18012f, 3f, 4.4721f, 3f, 4.90039f)
                verticalLineTo(5.5f)
                curveTo(3f, 5.77614f, 2.77614f, 6f, 2.5f, 6f)
                curveTo(2.22386f, 6f, 2f, 5.77614f, 2f, 5.5f)
                verticalLineTo(4.87891f)
                curveTo(1.99999f, 4.47662f, 2.00036f, 4.14452f, 2.02246f, 3.87402f)
                curveTo(2.04543f, 3.59301f, 2.09414f, 3.33444f, 2.21777f, 3.0918f)
                curveTo(2.40951f, 2.71554f, 2.71554f, 2.40951f, 3.0918f, 2.21777f)
                curveTo(3.33444f, 2.09414f, 3.59301f, 2.04543f, 3.87402f, 2.02246f)
                curveTo(4.14452f, 2.00036f, 4.47662f, 1.99999f, 4.87891f, 2f)
                horizontalLineTo(5.5f)
                close()
                moveTo(10.1211f, 2f)
                curveTo(10.5234f, 1.99999f, 10.8555f, 2.00036f, 11.126f, 2.02246f)
                curveTo(11.407f, 2.04543f, 11.6656f, 2.09414f, 11.9082f, 2.21777f)
                curveTo(12.2845f, 2.40951f, 12.5905f, 2.71554f, 12.7822f, 3.0918f)
                curveTo(12.9059f, 3.33444f, 12.9546f, 3.59301f, 12.9775f, 3.87402f)
                curveTo(12.9996f, 4.14452f, 13f, 4.47662f, 13f, 4.87891f)
                verticalLineTo(5.5f)
                curveTo(13f, 5.77614f, 12.7761f, 6f, 12.5f, 6f)
                curveTo(12.2239f, 6f, 12f, 5.77614f, 12f, 5.5f)
                verticalLineTo(4.90039f)
                curveTo(12f, 4.4721f, 11.9998f, 4.18012f, 11.9814f, 3.95508f)
                curveTo(11.9635f, 3.73615f, 11.9304f, 3.62405f, 11.8906f, 3.5459f)
                curveTo(11.7948f, 3.35793f, 11.6421f, 3.20522f, 11.4541f, 3.10938f)
                curveTo(11.376f, 3.06956f, 11.2639f, 3.03647f, 11.0449f, 3.01855f)
                curveTo(10.8199f, 3.00017f, 10.5279f, 3f, 10.0996f, 3f)
                horizontalLineTo(9.5f)
                curveTo(9.22386f, 3f, 9f, 2.77614f, 9f, 2.5f)
                curveTo(9f, 2.22386f, 9.22386f, 2f, 9.5f, 2f)
                horizontalLineTo(10.1211f)
                close()
            }
        }.build()
        
        return _Corners!!
    }

private var _Corners: ImageVector? = null

