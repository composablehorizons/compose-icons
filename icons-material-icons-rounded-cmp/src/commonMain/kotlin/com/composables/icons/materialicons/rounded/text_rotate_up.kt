package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Text_rotate_up: ImageVector
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
                moveTo(18.35f, 4.35f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                lineToRelative(-1.79f, 1.79f)
                curveToRelative(-0.31f, 0.32f, -0.09f, 0.86f, 0.36f, 0.86f)
                horizontalLineTo(17f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(7f)
                horizontalLineToRelative(0.79f)
                curveToRelative(0.45f, 0f, 0.67f, -0.54f, 0.35f, -0.85f)
                lineToRelative(-1.79f, -1.8f)
                close()
                moveTo(11.8f, 15.5f)
                verticalLineToRelative(-5f)
                lineToRelative(1.6f, -0.66f)
                curveToRelative(0.36f, -0.14f, 0.6f, -0.49f, 0.6f, -0.88f)
                curveToRelative(0f, -0.69f, -0.71f, -1.15f, -1.34f, -0.88f)
                lineToRelative(-8.97f, 3.88f)
                curveToRelative(-0.42f, 0.17f, -0.69f, 0.58f, -0.69f, 1.04f)
                curveToRelative(0f, 0.46f, 0.27f, 0.87f, 0.69f, 1.05f)
                lineToRelative(8.97f, 3.88f)
                curveToRelative(0.63f, 0.27f, 1.34f, -0.2f, 1.34f, -0.89f)
                curveToRelative(0f, -0.39f, -0.24f, -0.74f, -0.6f, -0.89f)
                lineToRelative(-1.6f, -0.65f)
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

