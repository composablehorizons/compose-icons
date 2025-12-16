package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.CardStackPlus: ImageVector
    get() {
        if (_CardStackPlus != null) return _CardStackPlus!!
        
        _CardStackPlus = ImageVector.Builder(
            name = "card-stack-plus",
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
                moveTo(3f, 11.5f)
                curveTo(3f, 11.7761f, 3.22386f, 12f, 3.5f, 12f)
                horizontalLineTo(11.5f)
                curveTo(11.7761f, 12f, 12f, 11.7761f, 12f, 11.5f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                verticalLineTo(11.5f)
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
                moveTo(7.5f, 4f)
                curveTo(7.77614f, 4f, 8f, 4.22386f, 8f, 4.5f)
                verticalLineTo(6f)
                horizontalLineTo(9.5f)
                curveTo(9.77614f, 6f, 10f, 6.22386f, 10f, 6.5f)
                curveTo(10f, 6.77614f, 9.77614f, 7f, 9.5f, 7f)
                horizontalLineTo(8f)
                verticalLineTo(8.5f)
                curveTo(8f, 8.77614f, 7.77614f, 9f, 7.5f, 9f)
                curveTo(7.22386f, 9f, 7f, 8.77614f, 7f, 8.5f)
                verticalLineTo(7f)
                horizontalLineTo(5.5f)
                curveTo(5.22386f, 7f, 5f, 6.77614f, 5f, 6.5f)
                curveTo(5f, 6.22386f, 5.22386f, 6f, 5.5f, 6f)
                horizontalLineTo(7f)
                verticalLineTo(4.5f)
                curveTo(7f, 4.22386f, 7.22386f, 4f, 7.5f, 4f)
                close()
            }
        }.build()
        
        return _CardStackPlus!!
    }

private var _CardStackPlus: ImageVector? = null

