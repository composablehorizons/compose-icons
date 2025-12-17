package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Text_rotation_angledown: ImageVector
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.4f, 4.91f)
                lineToRelative(-1.06f, -1.06f)
                lineTo(7.2f, 8.27f)
                lineToRelative(1.48f, 1.48f)
                lineToRelative(2.19f, -0.92f)
                lineToRelative(3.54f, 3.54f)
                lineToRelative(-0.92f, 2.19f)
                lineToRelative(1.48f, 1.48f)
                lineTo(19.4f, 4.91f)
                close()
                moveToRelative(-6.81f, 3.1f)
                lineToRelative(4.87f, -2.23f)
                lineToRelative(-2.23f, 4.87f)
                lineToRelative(-2.64f, -2.64f)
                close()
                moveTo(14.27f, 21f)
                verticalLineToRelative(-4.24f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-8.84f, -8.84f)
                lineToRelative(-1.42f, 1.42f)
                lineToRelative(8.84f, 8.84f)
                lineTo(10.03f, 21f)
                horizontalLineToRelative(4.24f)
                close()
            }
        }.build()
        
        return _Text_rotation_angledown!!
    }

private var _Text_rotation_angledown: ImageVector? = null

