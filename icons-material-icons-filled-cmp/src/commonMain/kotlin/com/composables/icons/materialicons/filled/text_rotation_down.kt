package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Text_rotation_down: ImageVector
    get() {
        if (_Text_rotation_down != null) return _Text_rotation_down!!
        
        _Text_rotation_down = ImageVector.Builder(
            name = "text_rotation_down",
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
                moveTo(21f, 12f)
                verticalLineToRelative(-1.5f)
                lineTo(10f, 5.75f)
                verticalLineToRelative(2.1f)
                lineToRelative(2.2f, 0.9f)
                verticalLineToRelative(5f)
                lineToRelative(-2.2f, 0.9f)
                verticalLineToRelative(2.1f)
                lineTo(21f, 12f)
                close()
                moveToRelative(-7f, -2.62f)
                lineToRelative(5.02f, 1.87f)
                lineTo(14f, 13.12f)
                verticalLineTo(9.38f)
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
        
        return _Text_rotation_down!!
    }

private var _Text_rotation_down: ImageVector? = null

