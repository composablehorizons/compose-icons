package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Text_rotation_down: ImageVector
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
                verticalLineTo(0f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 20f)
                lineToRelative(3f, -3f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                horizontalLineTo(5f)
                verticalLineToRelative(13f)
                horizontalLineTo(3f)
                lineToRelative(3f, 3f)
                close()
                moveToRelative(6.2f, -11.5f)
                verticalLineToRelative(5f)
                lineToRelative(-2.2f, 0.9f)
                verticalLineToRelative(2.1f)
                lineToRelative(11f, -4.75f)
                verticalLineToRelative(-1.5f)
                lineTo(10f, 5.5f)
                verticalLineToRelative(2.1f)
                lineToRelative(2.2f, 0.9f)
                close()
                moveToRelative(6.82f, 2.5f)
                lineTo(14f, 12.87f)
                verticalLineTo(9.13f)
                lineTo(19.02f, 11f)
                close()
            }
        }.build()
        
        return _Text_rotation_down!!
    }

private var _Text_rotation_down: ImageVector? = null

