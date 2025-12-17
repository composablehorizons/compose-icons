package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Vape_free: ImageVector
    get() {
        if (_Vape_free != null) return _Vape_free!!
        
        _Vape_free = ImageVector.Builder(
            name = "vape_free",
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
                    moveTo(2f, 16.5f)
                    horizontalLineToRelative(1f)
                    curveToRelative(1.33f, 0f, 2.71f, -0.18f, 4f, -0.5f)
                    verticalLineToRelative(3f)
                    curveToRelative(-1.29f, -0.32f, -2.67f, -0.5f, -4f, -0.5f)
                    horizontalLineTo(2f)
                    verticalLineTo(16.5f)
                    close()
                    moveTo(16.17f, 19f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(-3f)
                    horizontalLineToRelative(5.17f)
                    lineTo(1.39f, 4.22f)
                    lineToRelative(1.41f, -1.41f)
                    lineToRelative(18.38f, 18.38f)
                    lineToRelative(-1.41f, 1.41f)
                    lineTo(16.17f, 19f)
                    close()
                    moveTo(18.83f, 16f)
                    horizontalLineTo(22f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(-0.17f)
                    lineTo(18.83f, 16f)
                    close()
                    moveTo(11f, 17.5f)
                    curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                    reflectiveCurveTo(10f, 17.22f, 10f, 17.5f)
                    curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                    reflectiveCurveTo(11f, 17.78f, 11f, 17.5f)
                    close()
                    moveTo(22f, 12.76f)
                    verticalLineTo(15f)
                    horizontalLineToRelative(-1.5f)
                    verticalLineToRelative(-2.23f)
                    curveToRelative(0f, -2.24f, -1.76f, -4.07f, -4f, -4.07f)
                    verticalLineTo(7.2f)
                    curveToRelative(1.02f, 0f, 1.85f, -0.83f, 1.85f, -1.85f)
                    reflectiveCurveTo(17.52f, 3.5f, 16.5f, 3.5f)
                    verticalLineTo(2f)
                    curveToRelative(1.85f, 0f, 3.35f, 1.5f, 3.35f, 3.35f)
                    curveToRelative(0f, 0.93f, -0.38f, 1.77f, -1f, 2.38f)
                    curveTo(20.72f, 8.62f, 22f, 10.54f, 22f, 12.76f)
                    close()
                    moveTo(11.15f, 8.32f)
                    curveToRelative(0f, -0.01f, 0f, -0.01f, 0f, -0.02f)
                    curveToRelative(0f, -1.85f, 1.5f, -3.35f, 3.35f, -3.35f)
                    verticalLineToRelative(1.5f)
                    curveToRelative(-1.02f, 0f, -1.85f, 0.73f, -1.85f, 1.75f)
                    reflectiveCurveToRelative(0.83f, 2f, 1.85f, 2f)
                    horizontalLineToRelative(1.53f)
                    curveToRelative(1.87f, 0f, 3.47f, 1.35f, 3.47f, 3.16f)
                    verticalLineTo(15f)
                    horizontalLineTo(18f)
                    verticalLineToRelative(-1.3f)
                    curveToRelative(0f, -1.31f, -0.92f, -2.05f, -1.97f, -2.05f)
                    horizontalLineTo(14.5f)
                    curveToRelative(-0.01f, 0f, -0.01f, 0f, -0.02f, 0f)
                    lineTo(11.15f, 8.32f)
                    close()
                }
            }
        }.build()
        
        return _Vape_free!!
    }

private var _Vape_free: ImageVector? = null

