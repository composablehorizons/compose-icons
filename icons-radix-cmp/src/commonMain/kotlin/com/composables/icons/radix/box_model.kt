package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.BoxModel: ImageVector
    get() {
        if (_BoxModel != null) return _BoxModel!!
        
        _BoxModel = ImageVector.Builder(
            name = "box-model",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 1f)
                curveTo(13.5523f, 1f, 14f, 1.44772f, 14f, 2f)
                verticalLineTo(13f)
                curveTo(14f, 13.5523f, 13.5523f, 14f, 13f, 14f)
                horizontalLineTo(2f)
                curveTo(1.44772f, 14f, 1f, 13.5523f, 1f, 13f)
                verticalLineTo(2f)
                curveTo(1f, 1.44772f, 1.44772f, 1f, 2f, 1f)
                horizontalLineTo(13f)
                close()
                moveTo(2f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                close()
                moveTo(10.6006f, 4.00977f)
                curveTo(10.8285f, 4.0563f, 11f, 4.25829f, 11f, 4.5f)
                verticalLineTo(10.5f)
                curveTo(11f, 10.7761f, 10.7761f, 11f, 10.5f, 11f)
                horizontalLineTo(4.5f)
                curveTo(4.22386f, 11f, 4.00001f, 10.7761f, 4f, 10.5f)
                verticalLineTo(4.5f)
                lineTo(4.00977f, 4.39941f)
                curveTo(4.05629f, 4.17145f, 4.25829f, 4f, 4.5f, 4f)
                horizontalLineTo(10.5f)
                lineTo(10.6006f, 4.00977f)
                close()
                moveTo(5f, 10f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                close()
            }
        }.build()
        
        return _BoxModel!!
    }

private var _BoxModel: ImageVector? = null

