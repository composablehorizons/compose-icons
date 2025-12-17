package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Text_rotation_angleup: ImageVector
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
                moveTo(17.61f, 9.85f)
                lineToRelative(0.56f, 0.56f)
                lineToRelative(-8.48f, 8.49f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(8.49f, -8.49f)
                lineToRelative(0.56f, 0.56f)
                curveToRelative(0.31f, 0.32f, 0.85f, 0.1f, 0.85f, -0.34f)
                verticalLineTo(9.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2.54f)
                curveToRelative(-0.44f, 0f, -0.66f, 0.54f, -0.35f, 0.85f)
                close()
                moveToRelative(-9.13f, 2.9f)
                lineToRelative(3.54f, -3.54f)
                lineToRelative(1.6f, 0.67f)
                curveToRelative(0.36f, 0.15f, 0.77f, 0.07f, 1.05f, -0.21f)
                curveToRelative(0.49f, -0.49f, 0.32f, -1.31f, -0.32f, -1.57f)
                lineTo(5.26f, 4.5f)
                curveToRelative(-0.43f, -0.16f, -0.91f, -0.06f, -1.23f, 0.26f)
                curveToRelative(-0.32f, 0.32f, -0.42f, 0.8f, -0.25f, 1.23f)
                lineToRelative(3.61f, 9.09f)
                curveToRelative(0.25f, 0.64f, 1.08f, 0.81f, 1.57f, 0.32f)
                curveToRelative(0.28f, -0.28f, 0.36f, -0.69f, 0.21f, -1.05f)
                lineToRelative(-0.69f, -1.6f)
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

