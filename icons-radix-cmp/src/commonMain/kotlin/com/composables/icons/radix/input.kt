package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Input: ImageVector
    get() {
        if (_Input != null) return _Input!!
        
        _Input = ImageVector.Builder(
            name = "input",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 1f)
                curveTo(10.7761f, 1f, 11f, 1.22386f, 11f, 1.5f)
                curveTo(11f, 1.77614f, 10.7761f, 2f, 10.5f, 2f)
                curveTo(9.87329f, 2f, 9.54318f, 2.20068f, 9.34473f, 2.47852f)
                curveTo(9.1223f, 2.78998f, 9f, 3.28844f, 9f, 4f)
                verticalLineTo(11f)
                curveTo(9f, 11.7116f, 9.1223f, 12.21f, 9.34473f, 12.5215f)
                curveTo(9.54318f, 12.7993f, 9.87329f, 13f, 10.5f, 13f)
                curveTo(10.7761f, 13f, 11f, 13.2239f, 11f, 13.5f)
                curveTo(11f, 13.7761f, 10.7761f, 14f, 10.5f, 14f)
                curveTo(9.62675f, 14f, 8.95682f, 13.7006f, 8.53027f, 13.1035f)
                curveTo(8.51917f, 13.088f, 8.51069f, 13.0705f, 8.5f, 13.0547f)
                curveTo(8.48931f, 13.0705f, 8.48083f, 13.088f, 8.46973f, 13.1035f)
                curveTo(8.04318f, 13.7006f, 7.37325f, 14f, 6.5f, 14f)
                curveTo(6.22386f, 14f, 6f, 13.7761f, 6f, 13.5f)
                curveTo(6f, 13.2239f, 6.22386f, 13f, 6.5f, 13f)
                curveTo(7.12671f, 13f, 7.45682f, 12.7993f, 7.65527f, 12.5215f)
                curveTo(7.8777f, 12.21f, 8f, 11.7116f, 8f, 11f)
                verticalLineTo(4f)
                curveTo(8f, 3.28844f, 7.8777f, 2.78998f, 7.65527f, 2.47852f)
                curveTo(7.45682f, 2.20068f, 7.12671f, 2f, 6.5f, 2f)
                curveTo(6.22386f, 2f, 6f, 1.77614f, 6f, 1.5f)
                curveTo(6f, 1.22386f, 6.22386f, 1f, 6.5f, 1f)
                curveTo(7.37325f, 1f, 8.04318f, 1.29938f, 8.46973f, 1.89648f)
                curveTo(8.48067f, 1.91181f, 8.48946f, 1.92874f, 8.5f, 1.94434f)
                curveTo(8.51054f, 1.92874f, 8.51933f, 1.91181f, 8.53027f, 1.89648f)
                curveTo(8.95682f, 1.29938f, 9.62675f, 1f, 10.5f, 1f)
                close()
                moveTo(6f, 5f)
                horizontalLineTo(1f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                horizontalLineTo(1f)
                lineTo(0.897461f, 10.9951f)
                curveTo(0.427034f, 10.9472f, 0.0527828f, 10.573f, 0.00488281f, 10.1025f)
                lineTo(0f, 10f)
                verticalLineTo(5f)
                curveTo(0f, 4.48232f, 0.393331f, 4.05621f, 0.897461f, 4.00488f)
                lineTo(1f, 4f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                close()
                moveTo(14.1025f, 4.00488f)
                curveTo(14.6067f, 4.05621f, 15f, 4.48232f, 15f, 5f)
                verticalLineTo(10f)
                lineTo(14.9951f, 10.1025f)
                curveTo(14.9472f, 10.573f, 14.573f, 10.9472f, 14.1025f, 10.9951f)
                lineTo(14f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(14f)
                lineTo(14.1025f, 4.00488f)
                close()
            }
        }.build()
        
        return _Input!!
    }

private var _Input: ImageVector? = null

