package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.G_translate: ImageVector
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 4f)
                horizontalLineTo(11f)
                lineToRelative(-1f, -3f)
                horizontalLineTo(3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(8f)
                lineToRelative(1f, 3f)
                horizontalLineToRelative(9f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(7f, 16f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                curveToRelative(1.35f, 0f, 2.48f, 0.5f, 3.35f, 1.3f)
                lineTo(9.03f, 8.57f)
                curveToRelative(-0.38f, -0.36f, -1.04f, -0.78f, -2.03f, -0.78f)
                curveToRelative(-1.74f, 0f, -3.15f, 1.44f, -3.15f, 3.21f)
                reflectiveCurveTo(5.26f, 14.21f, 7f, 14.21f)
                curveToRelative(2.01f, 0f, 2.84f, -1.44f, 2.92f, -2.41f)
                horizontalLineTo(7f)
                verticalLineToRelative(-1.71f)
                horizontalLineToRelative(4.68f)
                curveToRelative(0.07f, 0.31f, 0.12f, 0.61f, 0.12f, 1.02f)
                curveTo(11.8f, 13.97f, 9.89f, 16f, 7f, 16f)
                close()
                moveToRelative(6.17f, -5.42f)
                horizontalLineToRelative(3.7f)
                curveToRelative(-0.43f, 1.25f, -1.11f, 2.43f, -2.05f, 3.47f)
                curveToRelative(-0.31f, -0.35f, -0.6f, -0.72f, -0.86f, -1.1f)
                lineToRelative(-0.79f, -2.37f)
                close()
                moveToRelative(8.33f, 9.92f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(14f)
                lineToRelative(2f, -2.5f)
                lineToRelative(-1.04f, -3.1f)
                lineToRelative(3.1f, 3.1f)
                lineToRelative(0.92f, -0.92f)
                lineToRelative(-3.3f, -3.25f)
                lineToRelative(0.02f, -0.02f)
                curveToRelative(1.13f, -1.25f, 1.93f, -2.69f, 2.4f, -4.22f)
                horizontalLineTo(20f)
                verticalLineToRelative(-1.3f)
                horizontalLineToRelative(-4.53f)
                verticalLineTo(8f)
                horizontalLineToRelative(-1.29f)
                verticalLineToRelative(1.29f)
                horizontalLineToRelative(-1.44f)
                lineTo(11.46f, 5.5f)
                horizontalLineToRelative(9.04f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(14f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
            }
        }.build()
        
        return _G_translate!!
    }

private var _G_translate: ImageVector? = null

