package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Gesture: ImageVector
    get() {
        if (_Gesture != null) return _Gesture!!
        
        _Gesture = ImageVector.Builder(
            name = "gesture",
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
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.72f, 6.04f)
                curveToRelative(0.47f, 0.46f, 1.21f, 0.48f, 1.71f, 0.06f)
                curveToRelative(0.37f, -0.32f, 0.69f, -0.51f, 0.87f, -0.43f)
                curveToRelative(0.5f, 0.2f, 0f, 1.03f, -0.3f, 1.52f)
                curveToRelative(-0.25f, 0.42f, -2.86f, 3.89f, -2.86f, 6.31f)
                curveToRelative(0f, 1.28f, 0.48f, 2.34f, 1.34f, 2.98f)
                curveToRelative(0.75f, 0.56f, 1.74f, 0.73f, 2.64f, 0.46f)
                curveToRelative(1.07f, -0.31f, 1.95f, -1.4f, 3.06f, -2.77f)
                curveToRelative(1.21f, -1.49f, 2.83f, -3.44f, 4.08f, -3.44f)
                curveToRelative(1.63f, 0f, 1.65f, 1.01f, 1.76f, 1.79f)
                curveToRelative(-3.78f, 0.64f, -5.38f, 3.67f, -5.38f, 5.37f)
                curveToRelative(0f, 1.7f, 1.44f, 3.09f, 3.21f, 3.09f)
                curveToRelative(1.63f, 0f, 4.29f, -1.33f, 4.69f, -6.1f)
                horizontalLineToRelative(1.21f)
                curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
                reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
                horizontalLineToRelative(-1.22f)
                curveToRelative(-0.15f, -1.65f, -1.09f, -4.2f, -4.03f, -4.2f)
                curveToRelative(-2.25f, 0f, -4.18f, 1.91f, -4.94f, 2.84f)
                curveToRelative(-0.58f, 0.73f, -2.06f, 2.48f, -2.29f, 2.72f)
                curveToRelative(-0.25f, 0.3f, -0.68f, 0.84f, -1.11f, 0.84f)
                curveToRelative(-0.45f, 0f, -0.72f, -0.83f, -0.36f, -1.92f)
                curveToRelative(0.35f, -1.09f, 1.4f, -2.86f, 1.85f, -3.52f)
                curveToRelative(0.78f, -1.14f, 1.3f, -1.92f, 1.3f, -3.28f)
                curveTo(8.95f, 3.69f, 7.31f, 3f, 6.44f, 3f)
                curveToRelative(-1.09f, 0f, -2.04f, 0.63f, -2.7f, 1.22f)
                curveToRelative(-0.53f, 0.48f, -0.53f, 1.32f, -0.02f, 1.82f)
                close()
                moveToRelative(10.16f, 12.51f)
                curveToRelative(-0.31f, 0f, -0.74f, -0.26f, -0.74f, -0.72f)
                curveToRelative(0f, -0.6f, 0.73f, -2.2f, 2.87f, -2.76f)
                curveToRelative(-0.3f, 2.69f, -1.43f, 3.48f, -2.13f, 3.48f)
                close()
            }
        }.build()
        
        return _Gesture!!
    }

private var _Gesture: ImageVector? = null

