package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Visibility_off: ImageVector
    get() {
        if (_Visibility_off != null) return _Visibility_off!!
        
        _Visibility_off = ImageVector.Builder(
            name = "visibility_off",
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
                moveTo(12f, 14f)
                curveToRelative(0.04f, 0f, 0.08f, -0.01f, 0.12f, -0.01f)
                lineToRelative(-2.61f, -2.61f)
                curveToRelative(0f, 0.04f, -0.01f, 0.08f, -0.01f, 0.12f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveToRelative(1.01f, -4.79f)
                lineToRelative(1.28f, 1.28f)
                curveToRelative(-0.26f, -0.57f, -0.71f, -1.03f, -1.28f, -1.28f)
                close()
                moveToRelative(7.81f, 2.29f)
                curveTo(19.17f, 8.13f, 15.79f, 6f, 12f, 6f)
                curveToRelative(-0.68f, 0f, -1.34f, 0.09f, -1.99f, 0.22f)
                lineToRelative(0.92f, 0.92f)
                curveToRelative(0.35f, -0.09f, 0.7f, -0.14f, 1.07f, -0.14f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                curveToRelative(0f, 0.37f, -0.06f, 0.72f, -0.14f, 1.07f)
                lineToRelative(2.05f, 2.05f)
                curveToRelative(0.98f, -0.86f, 1.81f, -1.91f, 2.41f, -3.12f)
                close()
                moveTo(12f, 17f)
                curveToRelative(0.95f, 0f, 1.87f, -0.13f, 2.75f, -0.39f)
                lineToRelative(-0.98f, -0.98f)
                curveToRelative(-0.54f, 0.24f, -1.14f, 0.37f, -1.77f, 0.37f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                curveToRelative(0f, -0.63f, 0.13f, -1.23f, 0.36f, -1.77f)
                lineTo(6.11f, 7.97f)
                curveToRelative(-1.22f, 0.91f, -2.23f, 2.1f, -2.93f, 3.52f)
                curveTo(4.83f, 14.86f, 8.21f, 17f, 12f, 17f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 6f)
                curveToRelative(3.79f, 0f, 7.17f, 2.13f, 8.82f, 5.5f)
                curveToRelative(-0.59f, 1.22f, -1.42f, 2.27f, -2.41f, 3.12f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(1.39f, -1.23f, 2.49f, -2.77f, 3.18f, -4.53f)
                curveTo(21.27f, 7.11f, 17f, 4f, 12f, 4f)
                curveToRelative(-1.27f, 0f, -2.49f, 0.2f, -3.64f, 0.57f)
                lineToRelative(1.65f, 1.65f)
                curveTo(10.66f, 6.09f, 11.32f, 6f, 12f, 6f)
                close()
                moveToRelative(2.28f, 4.49f)
                lineToRelative(2.07f, 2.07f)
                curveToRelative(0.08f, -0.34f, 0.14f, -0.7f, 0.14f, -1.07f)
                curveTo(16.5f, 9.01f, 14.48f, 7f, 12f, 7f)
                curveToRelative(-0.37f, 0f, -0.72f, 0.06f, -1.07f, 0.14f)
                lineTo(13f, 9.21f)
                curveToRelative(0.58f, 0.25f, 1.03f, 0.71f, 1.28f, 1.28f)
                close()
                moveTo(2.01f, 3.87f)
                lineToRelative(2.68f, 2.68f)
                curveTo(3.06f, 7.83f, 1.77f, 9.53f, 1f, 11.5f)
                curveTo(2.73f, 15.89f, 7f, 19f, 12f, 19f)
                curveToRelative(1.52f, 0f, 2.98f, -0.29f, 4.32f, -0.82f)
                lineToRelative(3.42f, 3.42f)
                lineToRelative(1.41f, -1.41f)
                lineTo(3.42f, 2.45f)
                lineTo(2.01f, 3.87f)
                close()
                moveToRelative(7.5f, 7.5f)
                lineToRelative(2.61f, 2.61f)
                curveToRelative(-0.04f, 0.01f, -0.08f, 0.02f, -0.12f, 0.02f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -0.05f, 0.01f, -0.08f, 0.01f, -0.13f)
                close()
                moveToRelative(-3.4f, -3.4f)
                lineToRelative(1.75f, 1.75f)
                curveToRelative(-0.23f, 0.55f, -0.36f, 1.15f, -0.36f, 1.78f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                curveToRelative(0.63f, 0f, 1.23f, -0.13f, 1.77f, -0.36f)
                lineToRelative(0.98f, 0.98f)
                curveToRelative(-0.88f, 0.24f, -1.8f, 0.38f, -2.75f, 0.38f)
                curveToRelative(-3.79f, 0f, -7.17f, -2.13f, -8.82f, -5.5f)
                curveToRelative(0.7f, -1.43f, 1.72f, -2.61f, 2.93f, -3.53f)
                close()
            }
        }.build()
        
        return _Visibility_off!!
    }

private var _Visibility_off: ImageVector? = null

