package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.KebabVertical: ImageVector
    get() {
        if (_KebabVertical != null) return _KebabVertical!!
        
        _KebabVertical = ImageVector.Builder(
            name = "kebab-vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 5f)
                curveTo(7.44772f, 5f, 7f, 4.55228f, 7f, 4f)
                curveTo(7f, 3.44772f, 7.44772f, 3f, 8f, 3f)
                curveTo(8.55228f, 3f, 9f, 3.44772f, 9f, 4f)
                curveTo(9f, 4.55228f, 8.55228f, 5f, 8f, 5f)
                close()
                moveTo(8f, 9f)
                curveTo(7.44771f, 9f, 7f, 8.55229f, 7f, 8f)
                curveTo(7f, 7.44772f, 7.44771f, 7f, 8f, 7f)
                curveTo(8.55228f, 7f, 9f, 7.44772f, 9f, 8f)
                curveTo(9f, 8.55229f, 8.55228f, 9f, 8f, 9f)
                close()
                moveTo(7f, 12f)
                curveTo(7f, 12.5523f, 7.44771f, 13f, 8f, 13f)
                curveTo(8.55228f, 13f, 9f, 12.5523f, 9f, 12f)
                curveTo(9f, 11.4477f, 8.55228f, 11f, 8f, 11f)
                curveTo(7.44771f, 11f, 7f, 11.4477f, 7f, 12f)
                close()
            }
        }.build()
        
        return _KebabVertical!!
    }

private var _KebabVertical: ImageVector? = null

