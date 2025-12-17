package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Radar: ImageVector
    get() {
        if (_Radar != null) return _Radar!!
        
        _Radar = ImageVector.Builder(
            name = "radar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.74f, 18.33f)
                        curveTo(21.15f, 16.6f, 22f, 14.4f, 22f, 12f)
                        curveToRelative(0f, -5.52f, -4.48f, -10f, -10f, -10f)
                        reflectiveCurveTo(2f, 6.48f, 2f, 12f)
                        reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                        curveToRelative(2.4f, 0f, 4.6f, -0.85f, 6.33f, -2.26f)
                        curveToRelative(0.27f, -0.22f, 0.53f, -0.46f, 0.78f, -0.71f)
                        curveToRelative(0.03f, -0.03f, 0.05f, -0.06f, 0.07f, -0.08f)
                        curveTo(19.38f, 18.75f, 19.57f, 18.54f, 19.74f, 18.33f)
                        close()
                        moveTo(12f, 20f)
                        curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                        reflectiveCurveToRelative(3.59f, -8f, 8f, -8f)
                        reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                        curveToRelative(0f, 1.85f, -0.63f, 3.54f, -1.69f, 4.9f)
                        lineToRelative(-1.43f, -1.43f)
                        curveToRelative(0.69f, -0.98f, 1.1f, -2.17f, 1.1f, -3.46f)
                        curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                        reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                        reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                        curveToRelative(1.3f, 0f, 2.51f, -0.42f, 3.49f, -1.13f)
                        lineToRelative(1.42f, 1.42f)
                        curveTo(15.54f, 19.37f, 13.85f, 20f, 12f, 20f)
                        close()
                        moveTo(13.92f, 12.51f)
                        curveToRelative(0.17f, -0.66f, 0.02f, -1.38f, -0.49f, -1.9f)
                        lineToRelative(-0.02f, -0.02f)
                        curveToRelative(-0.77f, -0.77f, -2f, -0.78f, -2.78f, -0.04f)
                        curveToRelative(-0.01f, 0.01f, -0.03f, 0.02f, -0.05f, 0.04f)
                        curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0f, 2.83f)
                        lineToRelative(0.02f, 0.02f)
                        curveToRelative(0.52f, 0.51f, 1.25f, 0.67f, 1.91f, 0.49f)
                        lineToRelative(1.51f, 1.51f)
                        curveToRelative(-0.6f, 0.36f, -1.29f, 0.58f, -2.04f, 0.58f)
                        curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                        reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                        reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                        curveToRelative(0f, 0.73f, -0.21f, 1.41f, -0.56f, 2f)
                        lineTo(13.92f, 12.51f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Radar!!
    }

private var _Radar: ImageVector? = null

