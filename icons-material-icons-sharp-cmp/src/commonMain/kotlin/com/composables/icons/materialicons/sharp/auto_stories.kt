package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Auto_stories: ImageVector
    get() {
        if (_Auto_stories != null) return _Auto_stories!!
        
        _Auto_stories = ImageVector.Builder(
            name = "auto_stories",
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
                    moveTo(21f, 4.6f)
                    verticalLineToRelative(2.12f)
                    verticalLineToRelative(7.24f)
                    verticalLineToRelative(2.66f)
                    curveTo(19.86f, 16.21f, 18.69f, 16f, 17.5f, 16f)
                    curveToRelative(-1.9f, 0f, -3.78f, 0.54f, -5.5f, 1.58f)
                    verticalLineToRelative(-3.62f)
                    verticalLineTo(7.79f)
                    verticalLineTo(5.48f)
                    curveTo(10.38f, 4.55f, 8.51f, 4f, 6.5f, 4f)
                    reflectiveCurveTo(2.62f, 4.55f, 1f, 5.48f)
                    verticalLineTo(20f)
                    curveToRelative(1.52f, -1.18f, 3.43f, -2f, 5.5f, -2f)
                    reflectiveCurveToRelative(3.98f, 0.82f, 5.5f, 2f)
                    curveToRelative(1.52f, -1.18f, 3.43f, -2f, 5.5f, -2f)
                    reflectiveCurveToRelative(3.98f, 0.82f, 5.5f, 2f)
                    verticalLineTo(5.48f)
                    curveTo(22.37f, 5.12f, 21.7f, 4.84f, 21f, 4.6f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(19f, 0.5f)
                    lineTo(14f, 5.5f)
                    lineTo(14f, 15f)
                    lineTo(19f, 10.5f)
                    close()
                }
            }
        }.build()
        
        return _Auto_stories!!
    }

private var _Auto_stories: ImageVector? = null

