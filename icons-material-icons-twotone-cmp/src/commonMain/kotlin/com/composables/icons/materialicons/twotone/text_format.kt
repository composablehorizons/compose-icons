package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Text_format: ImageVector
    get() {
        if (_Text_format != null) return _Text_format!!
        
        _Text_format = ImageVector.Builder(
            name = "text_format",
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
                moveTo(5f, 17f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-2f)
                horizontalLineTo(5f)
                close()
                moveToRelative(4.5f, -4.2f)
                horizontalLineToRelative(5f)
                lineToRelative(0.9f, 2.2f)
                horizontalLineToRelative(2.1f)
                lineTo(12.75f, 4f)
                horizontalLineToRelative(-1.5f)
                lineTo(6.5f, 15f)
                horizontalLineToRelative(2.1f)
                lineToRelative(0.9f, -2.2f)
                close()
                moveTo(12f, 5.98f)
                lineTo(13.87f, 11f)
                horizontalLineToRelative(-3.74f)
                lineTo(12f, 5.98f)
                close()
            }
        }.build()
        
        return _Text_format!!
    }

private var _Text_format: ImageVector? = null

