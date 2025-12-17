package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Sailing: ImageVector
    get() {
        if (_Sailing != null) return _Sailing!!
        
        _Sailing = ImageVector.Builder(
            name = "sailing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 13f)
                verticalLineTo(3.59f)
                curveToRelative(0f, -0.49f, -0.63f, -0.69f, -0.91f, -0.29f)
                lineToRelative(-6.54f, 9.41f)
                curveToRelative(-0.23f, 0.33f, 0.01f, 0.79f, 0.41f, 0.79f)
                horizontalLineToRelative(6.54f)
                curveTo(10.78f, 13.5f, 11f, 13.28f, 11f, 13f)
                close()
                moveTo(20.99f, 12.98f)
                curveTo(20.72f, 7.07f, 15.9f, 2.32f, 13.4f, 1.23f)
                curveToRelative(-0.37f, -0.16f, -0.77f, 0.2f, -0.67f, 0.59f)
                curveToRelative(0.3f, 1.13f, 0.76f, 3.28f, 0.76f, 5.68f)
                curveToRelative(0f, 2.44f, -0.49f, 4.39f, -0.78f, 5.35f)
                curveToRelative(-0.1f, 0.32f, 0.14f, 0.65f, 0.48f, 0.65f)
                horizontalLineToRelative(7.28f)
                curveTo(20.76f, 13.5f, 21f, 13.26f, 20.99f, 12.98f)
                close()
                moveTo(20.62f, 15f)
                horizontalLineTo(3.38f)
                curveToRelative(-0.73f, 0f, -1.22f, 0.76f, -0.92f, 1.42f)
                curveToRelative(0.43f, 0.92f, 1.07f, 1.71f, 1.86f, 2.31f)
                curveToRelative(0.38f, -0.16f, 0.74f, -0.38f, 1.06f, -0.63f)
                curveToRelative(0.35f, -0.29f, 0.87f, -0.29f, 1.23f, 0f)
                curveTo(7.28f, 18.63f, 8.1f, 19f, 9f, 19f)
                curveToRelative(0.9f, 0f, 1.72f, -0.37f, 2.39f, -0.91f)
                curveToRelative(0.35f, -0.28f, 0.87f, -0.28f, 1.22f, 0f)
                curveTo(13.28f, 18.63f, 14.1f, 19f, 15f, 19f)
                curveToRelative(0.9f, 0f, 1.72f, -0.37f, 2.39f, -0.91f)
                curveToRelative(0.35f, -0.29f, 0.87f, -0.28f, 1.23f, 0f)
                curveToRelative(0.32f, 0.26f, 0.67f, 0.48f, 1.06f, 0.63f)
                curveToRelative(0.79f, -0.6f, 1.43f, -1.39f, 1.86f, -2.31f)
                curveTo(21.84f, 15.76f, 21.35f, 15f, 20.62f, 15f)
                close()
                moveTo(22f, 22f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.87f, 0f, -1.73f, -0.24f, -2.53f, -0.7f)
                curveToRelative(-0.29f, -0.16f, -0.65f, -0.17f, -0.94f, 0f)
                curveToRelative(-1.59f, 0.9f, -3.47f, 0.9f, -5.06f, 0f)
                curveToRelative(-0.29f, -0.16f, -0.65f, -0.16f, -0.94f, 0f)
                curveToRelative(-1.59f, 0.9f, -3.47f, 0.9f, -5.06f, 0f)
                curveToRelative(-0.29f, -0.16f, -0.65f, -0.16f, -0.94f, 0f)
                curveTo(4.73f, 20.76f, 3.87f, 21f, 3f, 21f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(1.15f, 0f, 2.3f, -0.31f, 3.33f, -0.94f)
                curveToRelative(1.66f, 1.11f, 3.78f, 1.01f, 5.58f, 0.14f)
                curveToRelative(1.91f, 1.05f, 4.17f, 1.07f, 6.09f, 0.05f)
                horizontalLineToRelative(0f)
                curveToRelative(0.95f, 0.5f, 1.97f, 0.75f, 3f, 0.75f)
                horizontalLineToRelative(0f)
                curveTo(21.55f, 23f, 22f, 22.55f, 22f, 22f)
                close()
            }
        }.build()
        
        return _Sailing!!
    }

private var _Sailing: ImageVector? = null

