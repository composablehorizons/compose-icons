package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Text_rotation_none: ImageVector
    get() {
        if (_Text_rotation_none != null) return _Text_rotation_none!!
        
        _Text_rotation_none = ImageVector.Builder(
            name = "text_rotation_none",
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
                moveTo(21f, 18f)
                lineToRelative(-3f, -3f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(2f)
                lineToRelative(3f, -3f)
                close()
                moveTo(9.5f, 11.8f)
                horizontalLineToRelative(5f)
                lineToRelative(0.9f, 2.2f)
                horizontalLineToRelative(2.1f)
                lineTo(12.75f, 3f)
                horizontalLineToRelative(-1.5f)
                lineTo(6.5f, 14f)
                horizontalLineToRelative(2.1f)
                lineToRelative(0.9f, -2.2f)
                close()
                moveTo(12f, 4.98f)
                lineTo(13.87f, 10f)
                horizontalLineToRelative(-3.74f)
                lineTo(12f, 4.98f)
                close()
            }
        }.build()
        
        return _Text_rotation_none!!
    }

private var _Text_rotation_none: ImageVector? = null

