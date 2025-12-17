package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Waving_hand: ImageVector
    get() {
        if (_Waving_hand != null) return _Waving_hand!!
        
        _Waving_hand = ImageVector.Builder(
            name = "waving_hand",
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
                moveTo(6.07f, 9.8f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(0f, 0f)
                curveToRelative(1.07f, 1.07f, 1.16f, 2.75f, 0.28f, 3.92f)
                curveToRelative(-0.15f, 0.2f, -0.12f, 0.47f, 0.05f, 0.65f)
                curveToRelative(0.22f, 0.22f, 0.57f, 0.19f, 0.76f, -0.05f)
                curveToRelative(1.07f, -1.43f, 1.06f, -3.43f, -0.04f, -4.85f)
                lineToRelative(7.62f, -7.62f)
                curveToRelative(0.49f, -0.49f, 1.28f, -0.49f, 1.77f, 0f)
                reflectiveCurveToRelative(0.49f, 1.28f, 0f, 1.77f)
                lineToRelative(-5.13f, 5.13f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                reflectiveCurveToRelative(0.51f, 0.2f, 0.71f, 0f)
                lineToRelative(6.54f, -6.54f)
                curveToRelative(0.49f, -0.49f, 1.28f, -0.49f, 1.77f, 0f)
                reflectiveCurveToRelative(0.49f, 1.28f, 0f, 1.77f)
                lineToRelative(-6.54f, 6.54f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                reflectiveCurveToRelative(0.51f, 0.2f, 0.71f, 0f)
                lineToRelative(5.48f, -5.48f)
                curveToRelative(0.49f, -0.49f, 1.28f, -0.49f, 1.77f, 0f)
                reflectiveCurveToRelative(0.49f, 1.28f, 0f, 1.77f)
                lineToRelative(-6.19f, 6.19f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                lineToRelative(4.07f, -4.07f)
                curveToRelative(0.49f, -0.49f, 1.28f, -0.49f, 1.77f, 0f)
                curveToRelative(0.49f, 0.49f, 0.49f, 1.28f, 0f, 1.77f)
                lineToRelative(-7.07f, 7.07f)
                curveToRelative(-3.22f, 3.22f, -8.45f, 3.22f, -11.67f, 0f)
                reflectiveCurveToRelative(-3.22f, -8.45f, 0f, -11.67f)
                lineToRelative(4.6f, -4.6f)
                curveToRelative(0.49f, -0.49f, 1.28f, -0.49f, 1.77f, 0f)
                curveToRelative(0.49f, 0.49f, 0.49f, 1.28f, 0f, 1.77f)
                lineTo(6.07f, 9.8f)
                close()
                moveTo(7f, 1.8f)
                curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                curveToRelative(-0.04f, 0f, -0.07f, 0f, -0.11f, 0.01f)
                curveToRelative(-2.63f, 0.38f, -4.7f, 2.46f, -5.08f, 5.08f)
                curveToRelative(0f, 0.03f, -0.01f, 0.07f, -0.01f, 0.11f)
                curveTo(1.05f, 6.66f, 1.39f, 7f, 1.8f, 7f)
                curveToRelative(0.38f, 0f, 0.69f, -0.28f, 0.74f, -0.64f)
                curveToRelative(0.28f, -1.97f, 1.84f, -3.53f, 3.81f, -3.81f)
                curveTo(6.72f, 2.49f, 7f, 2.18f, 7f, 1.8f)
                close()
                moveTo(17f, 22.2f)
                curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                curveToRelative(0.04f, 0f, 0.07f, 0f, 0.11f, -0.01f)
                curveToRelative(2.63f, -0.38f, 4.7f, -2.46f, 5.08f, -5.08f)
                curveToRelative(0f, -0.03f, 0.01f, -0.07f, 0.01f, -0.11f)
                curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                curveToRelative(-0.38f, 0f, -0.69f, 0.28f, -0.74f, 0.64f)
                curveToRelative(-0.28f, 1.97f, -1.84f, 3.53f, -3.81f, 3.81f)
                curveTo(17.28f, 21.51f, 17f, 21.82f, 17f, 22.2f)
                close()
            }
        }.build()
        
        return _Waving_hand!!
    }

private var _Waving_hand: ImageVector? = null

