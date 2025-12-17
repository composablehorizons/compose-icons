package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Text_rotate_vertical: ImageVector
    get() {
        if (_Text_rotate_vertical != null) return _Text_rotate_vertical!!
        
        _Text_rotate_vertical = ImageVector.Builder(
            name = "text_rotate_vertical",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.75f, 5f)
                horizontalLineToRelative(-1.5f)
                lineTo(9.5f, 16f)
                horizontalLineToRelative(2.1f)
                lineToRelative(0.9f, -2.2f)
                horizontalLineToRelative(5f)
                lineToRelative(0.9f, 2.2f)
                horizontalLineToRelative(2.1f)
                lineTo(15.75f, 5f)
                close()
                moveToRelative(-2.62f, 7f)
                lineTo(15f, 6.98f)
                lineTo(16.87f, 12f)
                horizontalLineToRelative(-3.74f)
                close()
                moveTo(6f, 19.75f)
                lineToRelative(3f, -3f)
                horizontalLineTo(7f)
                verticalLineTo(4.25f)
                horizontalLineTo(5f)
                verticalLineToRelative(12.5f)
                horizontalLineTo(3f)
                lineToRelative(3f, 3f)
                close()
            }
        }.build()
        
        return _Text_rotate_vertical!!
    }

private var _Text_rotate_vertical: ImageVector? = null

