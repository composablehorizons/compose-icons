package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DeviceMobile: ImageVector
    get() {
        if (_DeviceMobile != null) return _DeviceMobile!!
        
        _DeviceMobile = ImageVector.Builder(
            name = "device-mobile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 12f)
                curveTo(6.72386f, 12f, 6.5f, 12.2239f, 6.5f, 12.5f)
                curveTo(6.5f, 12.7761f, 6.72386f, 13f, 7f, 13f)
                horizontalLineTo(9f)
                curveTo(9.27614f, 13f, 9.5f, 12.7761f, 9.5f, 12.5f)
                curveTo(9.5f, 12.2239f, 9.27614f, 12f, 9f, 12f)
                horizontalLineTo(7f)
                close()
                moveTo(5.75f, 1f)
                curveTo(4.7835f, 1f, 4f, 1.7835f, 4f, 2.75f)
                verticalLineTo(13.25f)
                curveTo(4f, 14.2165f, 4.7835f, 15f, 5.75f, 15f)
                horizontalLineTo(10.25f)
                curveTo(11.2165f, 15f, 12f, 14.2165f, 12f, 13.25f)
                verticalLineTo(2.75f)
                curveTo(12f, 1.7835f, 11.2165f, 1f, 10.25f, 1f)
                horizontalLineTo(5.75f)
                close()
                moveTo(5f, 2.75f)
                curveTo(5f, 2.33579f, 5.33579f, 2f, 5.75f, 2f)
                horizontalLineTo(10.25f)
                curveTo(10.6642f, 2f, 11f, 2.33579f, 11f, 2.75f)
                verticalLineTo(13.25f)
                curveTo(11f, 13.6642f, 10.6642f, 14f, 10.25f, 14f)
                horizontalLineTo(5.75f)
                curveTo(5.33579f, 14f, 5f, 13.6642f, 5f, 13.25f)
                verticalLineTo(2.75f)
                close()
            }
        }.build()
        
        return _DeviceMobile!!
    }

private var _DeviceMobile: ImageVector? = null

