package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Text_rotation_angledown: ImageVector
    get() {
        if (_Text_rotation_angledown != null) return _Text_rotation_angledown!!
        
        _Text_rotation_angledown = ImageVector.Builder(
            name = "text_rotation_angledown",
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
                moveTo(15f, 21f)
                verticalLineToRelative(-4.24f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-9.2f, -9.19f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(9.19f, 9.19f)
                lineTo(10.76f, 21f)
                horizontalLineTo(15f)
                close()
                moveTo(11.25f, 8.48f)
                lineToRelative(3.54f, 3.54f)
                lineToRelative(-0.92f, 2.19f)
                lineToRelative(1.48f, 1.48f)
                lineToRelative(4.42f, -11.14f)
                lineToRelative(-1.06f, -1.05f)
                lineTo(7.57f, 7.92f)
                lineTo(9.06f, 9.4f)
                lineToRelative(2.19f, -0.92f)
                close()
                moveToRelative(6.59f, -3.05f)
                lineToRelative(-2.23f, 4.87f)
                lineToRelative(-2.64f, -2.64f)
                lineToRelative(4.87f, -2.23f)
                close()
            }
        }.build()
        
        return _Text_rotation_angledown!!
    }

private var _Text_rotation_angledown: ImageVector? = null

