package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Text_rotation_angleup: ImageVector
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.49f, 4.21f)
                lineTo(3.43f, 5.27f)
                lineTo(7.85f, 16.4f)
                lineToRelative(1.48f, -1.48f)
                lineToRelative(-0.92f, -2.19f)
                lineToRelative(3.54f, -3.54f)
                lineToRelative(2.19f, 0.92f)
                lineToRelative(1.48f, -1.48f)
                lineTo(4.49f, 4.21f)
                close()
                moveToRelative(3.09f, 6.8f)
                lineTo(5.36f, 6.14f)
                lineToRelative(4.87f, 2.23f)
                lineToRelative(-2.65f, 2.64f)
                close()
                moveToRelative(12.99f, -1.68f)
                horizontalLineToRelative(-4.24f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-8.84f, 8.84f)
                lineTo(10.32f, 21f)
                lineToRelative(8.84f, -8.84f)
                lineToRelative(1.41f, 1.41f)
                verticalLineTo(9.33f)
                close()
            }
        }.build()
        
        return _Text_rotation_angleup!!
    }

private var _Text_rotation_angleup: ImageVector? = null

