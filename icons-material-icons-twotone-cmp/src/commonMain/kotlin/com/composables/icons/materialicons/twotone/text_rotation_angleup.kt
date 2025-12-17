package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Text_rotation_angleup: ImageVector
    get() {
        if (_Text_rotation_angleup != null) return _Text_rotation_angleup!!
        
        _Text_rotation_angleup = ImageVector.Builder(
            name = "text_rotation_angleup",
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
                moveTo(16.76f, 9f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-9.19f, 9.19f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(9.19f, -9.19f)
                lineTo(21f, 13.24f)
                verticalLineTo(9f)
                horizontalLineToRelative(-4.24f)
                close()
                moveToRelative(-8.28f, 3.75f)
                lineToRelative(3.54f, -3.54f)
                lineToRelative(2.19f, 0.92f)
                lineToRelative(1.48f, -1.48f)
                lineTo(4.56f, 4.23f)
                lineTo(3.5f, 5.29f)
                lineToRelative(4.42f, 11.14f)
                lineToRelative(1.48f, -1.48f)
                lineToRelative(-0.92f, -2.2f)
                close()
                moveToRelative(-0.82f, -1.72f)
                lineTo(5.43f, 6.16f)
                lineToRelative(4.87f, 2.23f)
                lineToRelative(-2.64f, 2.64f)
                close()
            }
        }.build()
        
        return _Text_rotation_angleup!!
    }

private var _Text_rotation_angleup: ImageVector? = null

