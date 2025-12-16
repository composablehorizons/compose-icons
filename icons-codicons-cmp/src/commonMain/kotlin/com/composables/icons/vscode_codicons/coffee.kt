package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Coffee: ImageVector
    get() {
        if (_Coffee != null) return _Coffee!!
        
        _Coffee = ImageVector.Builder(
            name = "coffee",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 0f)
                curveTo(2.77614f, 0f, 3f, 0.223858f, 3f, 0.5f)
                curveTo(3f, 0.969538f, 3.27449f, 1.20587f, 3.8f, 1.6f)
                lineTo(3.83977f, 1.62978f)
                curveTo(4.31392f, 1.98457f, 5f, 2.49793f, 5f, 3.5f)
                curveTo(5f, 3.77614f, 4.77614f, 4f, 4.5f, 4f)
                curveTo(4.22386f, 4f, 4f, 3.77614f, 4f, 3.5f)
                curveTo(4f, 3.03046f, 3.72551f, 2.79413f, 3.2f, 2.4f)
                lineTo(3.16023f, 2.37022f)
                curveTo(2.68608f, 2.01543f, 2f, 1.50207f, 2f, 0.5f)
                curveTo(2f, 0.223858f, 2.22386f, 0f, 2.5f, 0f)
                close()
                moveTo(5.5f, 0f)
                curveTo(5.77614f, 0f, 6f, 0.223858f, 6f, 0.5f)
                curveTo(6f, 0.969538f, 6.27449f, 1.20587f, 6.8f, 1.6f)
                lineTo(6.83977f, 1.62978f)
                curveTo(7.31392f, 1.98457f, 8f, 2.49793f, 8f, 3.5f)
                curveTo(8f, 3.77614f, 7.77614f, 4f, 7.5f, 4f)
                curveTo(7.22386f, 4f, 7f, 3.77614f, 7f, 3.5f)
                curveTo(7f, 3.03046f, 6.72551f, 2.79413f, 6.2f, 2.4f)
                lineTo(6.16023f, 2.37022f)
                curveTo(5.68608f, 2.01543f, 5f, 1.50207f, 5f, 0.5f)
                curveTo(5f, 0.223858f, 5.22386f, 0f, 5.5f, 0f)
                close()
                moveTo(9f, 0.5f)
                curveTo(9f, 0.223858f, 8.77614f, 0f, 8.5f, 0f)
                curveTo(8.22386f, 0f, 8f, 0.223858f, 8f, 0.5f)
                curveTo(8f, 1.50207f, 8.68608f, 2.01543f, 9.16023f, 2.37022f)
                lineTo(9.2f, 2.4f)
                curveTo(9.72551f, 2.79413f, 10f, 3.03046f, 10f, 3.5f)
                curveTo(10f, 3.77614f, 10.2239f, 4f, 10.5f, 4f)
                curveTo(10.7761f, 4f, 11f, 3.77614f, 11f, 3.5f)
                curveTo(11f, 2.49793f, 10.3139f, 1.98457f, 9.83977f, 1.62978f)
                lineTo(9.8f, 1.6f)
                curveTo(9.27449f, 1.20587f, 9f, 0.969538f, 9f, 0.5f)
                close()
                moveTo(13f, 6f)
                horizontalLineTo(13.5f)
                curveTo(14.8807f, 6f, 16f, 7.11929f, 16f, 8.5f)
                curveTo(16f, 9.88071f, 14.8807f, 11f, 13.5f, 11f)
                horizontalLineTo(12.793f)
                curveTo(12.14f, 13.3085f, 10.0176f, 15f, 7.5f, 15f)
                curveTo(4.46243f, 15f, 2f, 12.5376f, 2f, 9.5f)
                verticalLineTo(5.8913f)
                curveTo(2f, 5.39905f, 2.39905f, 5f, 2.8913f, 5f)
                horizontalLineTo(12.1087f)
                curveTo(12.6009f, 5f, 13f, 5.39905f, 13f, 5.8913f)
                verticalLineTo(6f)
                close()
                moveTo(3f, 6f)
                verticalLineTo(9.5f)
                curveTo(3f, 11.9853f, 5.01472f, 14f, 7.5f, 14f)
                curveTo(9.98528f, 14f, 12f, 11.9853f, 12f, 9.5f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                close()
                moveTo(13f, 7f)
                verticalLineTo(9.5f)
                curveTo(13f, 9.66854f, 12.9924f, 9.83532f, 12.9776f, 10f)
                horizontalLineTo(13.5f)
                curveTo(14.3284f, 10f, 15f, 9.32843f, 15f, 8.5f)
                curveTo(15f, 7.67157f, 14.3284f, 7f, 13.5f, 7f)
                horizontalLineTo(13f)
                close()
            }
        }.build()
        
        return _Coffee!!
    }

private var _Coffee: ImageVector? = null

