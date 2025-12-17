package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Photo_size_select_actual: ImageVector
    get() {
        if (_Photo_size_select_actual != null) return _Photo_size_select_actual!!
        
        _Photo_size_select_actual = ImageVector.Builder(
            name = "photo_size_select_actual",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                curveTo(2f, 3f, 1f, 4f, 1f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(18f)
                curveToRelative(1f, 0f, 2f, -1f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1f, -1f, -2f, -2f, -2f)
                close()
                moveTo(5.63f, 16.19f)
                lineToRelative(2.49f, -3.2f)
                curveToRelative(0.2f, -0.25f, 0.58f, -0.26f, 0.78f, -0.01f)
                lineToRelative(2.1f, 2.53f)
                lineToRelative(3.1f, -3.99f)
                curveToRelative(0.2f, -0.26f, 0.6f, -0.26f, 0.8f, 0.01f)
                lineToRelative(3.51f, 4.68f)
                curveToRelative(0.25f, 0.33f, 0.01f, 0.8f, -0.4f, 0.8f)
                horizontalLineTo(6.02f)
                curveToRelative(-0.41f, -0.01f, -0.65f, -0.49f, -0.39f, -0.82f)
                close()
            }
        }.build()
        
        return _Photo_size_select_actual!!
    }

private var _Photo_size_select_actual: ImageVector? = null

