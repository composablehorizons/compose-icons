package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Text_rotate_up: ImageVector
    get() {
        if (_Text_rotate_up != null) return _Text_rotate_up!!
        
        _Text_rotate_up = ImageVector.Builder(
            name = "text_rotate_up",
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
                moveTo(18f, 4f)
                lineToRelative(-3f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(2f)
                verticalLineTo(7f)
                horizontalLineToRelative(2f)
                lineToRelative(-3f, -3f)
                close()
                moveToRelative(-6.2f, 11.5f)
                verticalLineToRelative(-5f)
                lineToRelative(2.2f, -0.9f)
                verticalLineTo(7.5f)
                lineTo(3f, 12.25f)
                verticalLineToRelative(1.5f)
                lineToRelative(11f, 4.75f)
                verticalLineToRelative(-2.1f)
                lineToRelative(-2.2f, -0.9f)
                close()
                moveTo(4.98f, 13f)
                lineTo(10f, 11.13f)
                verticalLineToRelative(3.74f)
                lineTo(4.98f, 13f)
                close()
            }
        }.build()
        
        return _Text_rotate_up!!
    }

private var _Text_rotate_up: ImageVector? = null

