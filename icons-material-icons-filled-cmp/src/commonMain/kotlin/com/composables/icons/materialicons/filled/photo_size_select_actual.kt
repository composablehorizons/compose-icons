package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Photo_size_select_actual: ImageVector
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
                moveTo(24f, 24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
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
                moveTo(5f, 17f)
                lineToRelative(3.5f, -4.5f)
                lineToRelative(2.5f, 3.01f)
                lineTo(14.5f, 11f)
                lineToRelative(4.5f, 6f)
                horizontalLineTo(5f)
                close()
            }
        }.build()
        
        return _Photo_size_select_actual!!
    }

private var _Photo_size_select_actual: ImageVector? = null

