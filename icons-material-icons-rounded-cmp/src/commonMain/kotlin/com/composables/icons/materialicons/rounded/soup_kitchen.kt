package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Soup_kitchen: ImageVector
    get() {
        if (_Soup_kitchen != null) return _Soup_kitchen!!
        
        _Soup_kitchen = ImageVector.Builder(
            name = "soup_kitchen",
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
                moveTo(6.15f, 13.5f)
                curveToRelative(-0.46f, 0f, -0.8f, -0.42f, -0.71f, -0.87f)
                curveTo(5.48f, 12.45f, 5.5f, 12.24f, 5.5f, 12f)
                curveToRelative(0f, -1f, -1f, -2.85f, -1f, -3.62f)
                curveToRelative(0f, -0.29f, 0.03f, -0.59f, 0.17f, -0.93f)
                curveTo(4.78f, 7.18f, 5.04f, 7f, 5.34f, 7f)
                curveToRelative(0.45f, 0f, 0.8f, 0.42f, 0.71f, 0.86f)
                curveTo(6.01f, 8.04f, 6f, 8.21f, 6f, 8.38f)
                curveTo(6f, 9.15f, 7f, 11f, 7f, 12f)
                curveToRelative(0f, 0.42f, -0.08f, 0.76f, -0.17f, 1.01f)
                curveTo(6.73f, 13.31f, 6.46f, 13.5f, 6.15f, 13.5f)
                close()
                moveTo(12.65f, 13.5f)
                curveToRelative(0.31f, 0f, 0.58f, -0.19f, 0.68f, -0.49f)
                curveToRelative(0.09f, -0.25f, 0.17f, -0.59f, 0.17f, -1.01f)
                curveToRelative(0f, -1f, -1f, -2.85f, -1f, -3.62f)
                curveToRelative(0f, -0.17f, 0.01f, -0.34f, 0.04f, -0.51f)
                curveTo(12.63f, 7.42f, 12.29f, 7f, 11.84f, 7f)
                curveToRelative(-0.29f, 0f, -0.56f, 0.18f, -0.67f, 0.45f)
                curveTo(11.03f, 7.79f, 11f, 8.08f, 11f, 8.38f)
                curveTo(11f, 9.15f, 12f, 11f, 12f, 12f)
                curveToRelative(0f, 0.24f, -0.02f, 0.45f, -0.06f, 0.63f)
                curveTo(11.85f, 13.08f, 12.19f, 13.5f, 12.65f, 13.5f)
                close()
                moveTo(9.4f, 13.5f)
                curveToRelative(0.31f, 0f, 0.58f, -0.19f, 0.68f, -0.49f)
                curveToRelative(0.09f, -0.25f, 0.17f, -0.59f, 0.17f, -1.01f)
                curveToRelative(0f, -1f, -1f, -2.85f, -1f, -3.62f)
                curveToRelative(0f, -0.17f, 0.01f, -0.34f, 0.04f, -0.51f)
                curveTo(9.38f, 7.42f, 9.04f, 7f, 8.59f, 7f)
                curveTo(8.29f, 7f, 8.03f, 7.18f, 7.92f, 7.45f)
                curveTo(7.78f, 7.79f, 7.75f, 8.08f, 7.75f, 8.38f)
                curveToRelative(0f, 0.77f, 1f, 2.63f, 1f, 3.62f)
                curveToRelative(0f, 0.24f, -0.02f, 0.45f, -0.06f, 0.63f)
                curveTo(8.6f, 13.08f, 8.94f, 13.5f, 9.4f, 13.5f)
                close()
                moveTo(20.46f, 6.37f)
                curveToRelative(0.57f, 0.07f, 1.08f, -0.34f, 1.12f, -0.91f)
                curveTo(21.59f, 5.28f, 21.6f, 5.12f, 21.6f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                curveToRelative(-1.54f, 0f, -2.81f, 1.16f, -2.98f, 2.65f)
                lineTo(14.53f, 15f)
                horizontalLineTo(3.99f)
                curveToRelative(-0.6f, 0f, -1.07f, 0.54f, -0.98f, 1.14f)
                curveTo(3.54f, 19.46f, 6.39f, 22f, 9.75f, 22f)
                curveToRelative(3.48f, 0f, 6.34f, -2.73f, 6.71f, -6.23f)
                lineToRelative(1.15f, -10.87f)
                curveTo(17.66f, 4.39f, 18.08f, 4f, 18.6f, 4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 0.07f, -0.01f, 0.18f, -0.01f, 0.31f)
                curveTo(19.55f, 5.84f, 19.93f, 6.3f, 20.46f, 6.37f)
                lineTo(20.46f, 6.37f)
                close()
            }
        }.build()
        
        return _Soup_kitchen!!
    }

private var _Soup_kitchen: ImageVector? = null

