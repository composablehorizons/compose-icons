package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Hail: ImageVector
    get() {
        if (_Hail != null) return _Hail!!
        
        _Hail = ImageVector.Builder(
            name = "hail",
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
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 6f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                    reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                    reflectiveCurveTo(13.1f, 6f, 12f, 6f)
                    close()
                    moveTo(17.95f, 2f)
                    lineTo(17.95f, 2f)
                    curveToRelative(0.59f, 0f, 1.06f, 0.51f, 1f, 1.09f)
                    curveTo(18.93f, 3.24f, 18.74f, 7.15f, 15f, 8.4f)
                    verticalLineTo(21f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-5f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(5f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineTo(10.1f)
                    curveToRelative(-0.3f, 0.1f, -0.5f, 0.2f, -0.6f, 0.3f)
                    curveToRelative(-0.46f, 0.36f, -1.17f, 0.87f, -1.36f, 2.67f)
                    curveTo(6.99f, 13.59f, 6.57f, 14f, 6.04f, 14f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.58f, 0f, -1.05f, -0.49f, -1f, -1.07f)
                    curveToRelative(0.13f, -1.6f, 0.62f, -2.98f, 2.07f, -4.22f)
                    curveTo(8.21f, 7.81f, 10f, 7f, 12f, 7f)
                    reflectiveCurveToRelative(2.68f, -0.46f, 3.48f, -1.06f)
                    curveToRelative(0.43f, -0.34f, 1.28f, -0.99f, 1.48f, -3.02f)
                    curveTo(17.01f, 2.4f, 17.43f, 2f, 17.95f, 2f)
                    close()
                    moveTo(5f, 16f)
                    horizontalLineToRelative(1f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(4f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineTo(5f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-4f)
                    curveTo(4f, 16.45f, 4.45f, 16f, 5f, 16f)
                    close()
                }
            }
        }.build()
        
        return _Hail!!
    }

private var _Hail: ImageVector? = null

