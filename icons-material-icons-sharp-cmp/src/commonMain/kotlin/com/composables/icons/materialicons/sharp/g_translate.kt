package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.G_translate: ImageVector
    get() {
        if (_G_translate != null) return _G_translate!!
        
        _G_translate = ImageVector.Builder(
            name = "g_translate",
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
                moveTo(20f, 5f)
                horizontalLineToRelative(-9.12f)
                lineTo(10f, 2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(7f)
                lineToRelative(1f, 3f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(7f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(7.17f, 14.59f)
                curveToRelative(-2.25f, 0f, -4.09f, -1.83f, -4.09f, -4.09f)
                reflectiveCurveToRelative(1.83f, -4.09f, 4.09f, -4.09f)
                curveToRelative(1.04f, 0f, 1.99f, 0.37f, 2.74f, 1.07f)
                lineToRelative(0.07f, 0.06f)
                lineToRelative(-1.23f, 1.18f)
                lineToRelative(-0.06f, -0.05f)
                curveToRelative(-0.29f, -0.27f, -0.78f, -0.59f, -1.52f, -0.59f)
                curveToRelative(-1.31f, 0f, -2.38f, 1.09f, -2.38f, 2.42f)
                reflectiveCurveToRelative(1.07f, 2.42f, 2.38f, 2.42f)
                curveToRelative(1.37f, 0f, 1.96f, -0.87f, 2.12f, -1.46f)
                horizontalLineTo(7.08f)
                verticalLineTo(9.91f)
                horizontalLineToRelative(3.95f)
                lineToRelative(0.01f, 0.07f)
                curveToRelative(0.04f, 0.21f, 0.05f, 0.4f, 0.05f, 0.61f)
                curveToRelative(0f, 2.35f, -1.61f, 4f, -3.92f, 4f)
                close()
                moveToRelative(6.03f, -1.71f)
                curveToRelative(0.33f, 0.6f, 0.74f, 1.18f, 1.19f, 1.7f)
                lineToRelative(-0.54f, 0.53f)
                lineToRelative(-0.65f, -2.23f)
                close()
                moveToRelative(0.77f, -0.76f)
                horizontalLineToRelative(-0.99f)
                lineToRelative(-0.31f, -1.04f)
                horizontalLineToRelative(3.99f)
                reflectiveCurveToRelative(-0.34f, 1.31f, -1.56f, 2.74f)
                curveToRelative(-0.52f, -0.62f, -0.89f, -1.23f, -1.13f, -1.7f)
                close()
                moveTo(21f, 20f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-7f)
                lineToRelative(2f, -2f)
                lineToRelative(-0.81f, -2.77f)
                lineToRelative(0.92f, -0.92f)
                lineTo(17.79f, 18f)
                lineToRelative(0.73f, -0.73f)
                lineToRelative(-2.71f, -2.68f)
                curveToRelative(0.9f, -1.03f, 1.6f, -2.25f, 1.92f, -3.51f)
                horizontalLineTo(19f)
                verticalLineToRelative(-1.04f)
                horizontalLineToRelative(-3.64f)
                verticalLineTo(9f)
                horizontalLineToRelative(-1.04f)
                verticalLineToRelative(1.04f)
                horizontalLineToRelative(-1.96f)
                lineTo(11.18f, 6f)
                horizontalLineTo(20f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(13f)
                close()
            }
        }.build()
        
        return _G_translate!!
    }

private var _G_translate: ImageVector? = null

