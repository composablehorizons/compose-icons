package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Text_rotation_angledown: ImageVector
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
                moveTo(15f, 20.5f)
                verticalLineToRelative(-2.54f)
                curveToRelative(0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f)
                lineToRelative(-0.56f, 0.56f)
                lineTo(5.1f, 9.68f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(8.49f, 8.49f)
                lineToRelative(-0.56f, 0.56f)
                curveToRelative(-0.32f, 0.32f, -0.1f, 0.86f, 0.34f, 0.86f)
                horizontalLineToRelative(2.54f)
                curveToRelative(0.28f, 0f, 0.5f, -0.23f, 0.5f, -0.5f)
                close()
                moveTo(11.25f, 8.48f)
                lineToRelative(3.54f, 3.54f)
                lineToRelative(-0.67f, 1.6f)
                curveToRelative(-0.15f, 0.36f, -0.07f, 0.77f, 0.21f, 1.05f)
                curveToRelative(0.49f, 0.49f, 1.31f, 0.32f, 1.57f, -0.32f)
                lineToRelative(3.61f, -9.09f)
                curveToRelative(0.17f, -0.42f, 0.07f, -0.91f, -0.25f, -1.23f)
                curveToRelative(-0.32f, -0.32f, -0.8f, -0.42f, -1.23f, -0.25f)
                lineToRelative(-9.1f, 3.6f)
                curveToRelative(-0.64f, 0.25f, -0.81f, 1.08f, -0.32f, 1.57f)
                curveToRelative(0.27f, 0.27f, 0.68f, 0.35f, 1.04f, 0.2f)
                lineToRelative(1.6f, -0.67f)
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

