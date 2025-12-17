package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Save_as: ImageVector
    get() {
        if (_Save_as != null) return _Save_as!!
        
        _Save_as = ImageVector.Builder(
            name = "save_as",
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
                    moveTo(20.41f, 6.41f)
                    lineToRelative(-2.83f, -2.83f)
                    curveTo(17.21f, 3.21f, 16.7f, 3f, 16.17f, 3f)
                    horizontalLineTo(5f)
                    curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                    verticalLineToRelative(14f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(7.4f)
                    lineToRelative(8.6f, -8.6f)
                    verticalLineTo(7.83f)
                    curveTo(21f, 7.3f, 20.79f, 6.79f, 20.41f, 6.41f)
                    close()
                    moveTo(12f, 18f)
                    curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                    reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                    reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                    reflectiveCurveTo(13.66f, 18f, 12f, 18f)
                    close()
                    moveTo(15f, 9f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineTo(7f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineTo(7f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(7f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineTo(9f)
                    close()
                    moveTo(19.99f, 16.25f)
                    lineToRelative(1.77f, 1.77f)
                    lineToRelative(-4.84f, 4.84f)
                    curveTo(16.82f, 22.95f, 16.69f, 23f, 16.56f, 23f)
                    horizontalLineTo(15.5f)
                    curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                    verticalLineToRelative(-1.06f)
                    curveToRelative(0f, -0.13f, 0.05f, -0.26f, 0.15f, -0.35f)
                    lineTo(19.99f, 16.25f)
                    close()
                    moveTo(23.25f, 16.51f)
                    lineToRelative(-0.85f, 0.85f)
                    lineToRelative(-1.77f, -1.77f)
                    lineToRelative(0.85f, -0.85f)
                    curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                    lineToRelative(1.06f, 1.06f)
                    curveTo(23.45f, 16f, 23.45f, 16.32f, 23.25f, 16.51f)
                    close()
                }
            }
        }.build()
        
        return _Save_as!!
    }

private var _Save_as: ImageVector? = null

