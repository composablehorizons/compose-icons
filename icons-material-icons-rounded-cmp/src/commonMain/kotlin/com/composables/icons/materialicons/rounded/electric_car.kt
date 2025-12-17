package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Electric_car: ImageVector
    get() {
        if (_Electric_car != null) return _Electric_car!!
        
        _Electric_car = ImageVector.Builder(
            name = "electric_car",
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
                    moveTo(18.92f, 2.01f)
                    curveTo(18.72f, 1.42f, 18.16f, 1f, 17.5f, 1f)
                    horizontalLineToRelative(-11f)
                    curveTo(5.84f, 1f, 5.29f, 1.42f, 5.08f, 2.01f)
                    lineTo(3.11f, 7.68f)
                    curveTo(3.04f, 7.89f, 3f, 8.11f, 3f, 8.34f)
                    verticalLineToRelative(7.16f)
                    curveTo(3f, 16.33f, 3.67f, 17f, 4.5f, 17f)
                    horizontalLineToRelative(0f)
                    curveTo(5.33f, 17f, 6f, 16.33f, 6f, 15.5f)
                    verticalLineTo(15f)
                    horizontalLineToRelative(12f)
                    verticalLineToRelative(0.5f)
                    curveToRelative(0f, 0.82f, 0.67f, 1.5f, 1.5f, 1.5f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.82f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                    verticalLineTo(8.34f)
                    curveToRelative(0f, -0.22f, -0.04f, -0.45f, -0.11f, -0.66f)
                    lineTo(18.92f, 2.01f)
                    close()
                    moveTo(6.5f, 12f)
                    curveTo(5.67f, 12f, 5f, 11.33f, 5f, 10.5f)
                    reflectiveCurveTo(5.67f, 9f, 6.5f, 9f)
                    reflectiveCurveTo(8f, 9.67f, 8f, 10.5f)
                    reflectiveCurveTo(7.33f, 12f, 6.5f, 12f)
                    close()
                    moveTo(17.5f, 12f)
                    curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                    reflectiveCurveTo(16.67f, 9f, 17.5f, 9f)
                    reflectiveCurveTo(19f, 9.67f, 19f, 10.5f)
                    reflectiveCurveTo(18.33f, 12f, 17.5f, 12f)
                    close()
                    moveTo(5f, 7f)
                    lineToRelative(1.27f, -3.82f)
                    curveTo(6.41f, 2.78f, 6.79f, 2.5f, 7.22f, 2.5f)
                    horizontalLineToRelative(9.56f)
                    curveToRelative(0.43f, 0f, 0.81f, 0.28f, 0.95f, 0.68f)
                    lineTo(19f, 7f)
                    horizontalLineTo(5f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(7f, 20f)
                    lineTo(11f, 20f)
                    lineTo(11f, 18f)
                    lineTo(17f, 21f)
                    lineTo(13f, 21f)
                    lineTo(13f, 23f)
                    close()
                }
            }
        }.build()
        
        return _Electric_car!!
    }

private var _Electric_car: ImageVector? = null

