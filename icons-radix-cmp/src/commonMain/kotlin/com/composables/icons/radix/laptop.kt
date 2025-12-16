package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Laptop: ImageVector
    get() {
        if (_Laptop != null) return _Laptop!!
        
        _Laptop = ImageVector.Builder(
            name = "laptop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.75f, 3f)
                curveTo(13.4404f, 3f, 14f, 3.55964f, 14f, 4.25f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                verticalLineTo(12.5f)
                curveTo(15f, 12.7761f, 14.7761f, 13f, 14.5f, 13f)
                horizontalLineTo(0.5f)
                curveTo(0.223858f, 13f, 0f, 12.7761f, 0f, 12.5f)
                verticalLineTo(12f)
                horizontalLineTo(1f)
                verticalLineTo(4.25f)
                curveTo(1f, 3.55964f, 1.55964f, 3f, 2.25f, 3f)
                horizontalLineTo(12.75f)
                close()
                moveTo(2.25f, 4f)
                curveTo(2.11193f, 4f, 2f, 4.11193f, 2f, 4.25f)
                verticalLineTo(11.5f)
                horizontalLineTo(13f)
                verticalLineTo(4.25f)
                curveTo(13f, 4.11193f, 12.8881f, 4f, 12.75f, 4f)
                horizontalLineTo(2.25f)
                close()
            }
        }.build()
        
        return _Laptop!!
    }

private var _Laptop: ImageVector? = null

