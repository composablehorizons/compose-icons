package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.CardStack: ImageVector
    get() {
        if (_CardStack != null) return _CardStack!!
        
        _CardStack = ImageVector.Builder(
            name = "card-stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 2f)
                curveTo(13.3284f, 2f, 14f, 2.67157f, 14f, 3.5f)
                verticalLineTo(9.5f)
                curveTo(14f, 10.1528f, 13.5822f, 10.706f, 13f, 10.9121f)
                verticalLineTo(11.5f)
                curveTo(13f, 12.3284f, 12.3284f, 13f, 11.5f, 13f)
                horizontalLineTo(3.5f)
                curveTo(2.67157f, 13f, 2f, 12.3284f, 2f, 11.5f)
                verticalLineTo(10.9121f)
                curveTo(1.41782f, 10.706f, 1f, 10.1528f, 1f, 9.5f)
                verticalLineTo(3.5f)
                curveTo(1f, 2.67157f, 1.67157f, 2f, 2.5f, 2f)
                horizontalLineTo(12.5f)
                close()
                moveTo(3f, 11f)
                verticalLineTo(11.5f)
                curveTo(3f, 11.7761f, 3.22386f, 12f, 3.5f, 12f)
                horizontalLineTo(11.5f)
                curveTo(11.7761f, 12f, 12f, 11.7761f, 12f, 11.5f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                close()
                moveTo(2.5f, 3f)
                curveTo(2.22386f, 3f, 2f, 3.22386f, 2f, 3.5f)
                verticalLineTo(9.5f)
                curveTo(2f, 9.77614f, 2.22386f, 10f, 2.5f, 10f)
                horizontalLineTo(12.5f)
                curveTo(12.7761f, 10f, 13f, 9.77614f, 13f, 9.5f)
                verticalLineTo(3.5f)
                curveTo(13f, 3.22386f, 12.7761f, 3f, 12.5f, 3f)
                horizontalLineTo(2.5f)
                close()
            }
        }.build()
        
        return _CardStack!!
    }

private var _CardStack: ImageVector? = null

