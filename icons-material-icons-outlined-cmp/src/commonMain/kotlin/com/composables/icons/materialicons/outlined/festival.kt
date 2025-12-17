package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Festival: ImageVector
    get() {
        if (_Festival != null) return _Festival!!
        
        _Festival = ImageVector.Builder(
            name = "festival",
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
                    moveTo(23f, 11f)
                    verticalLineTo(9f)
                    curveToRelative(-6f, -2f, -11f, -7f, -11f, -7f)
                    reflectiveCurveTo(7f, 7f, 1f, 9f)
                    verticalLineToRelative(2f)
                    curveToRelative(0f, 1.49f, 0.93f, 2.75f, 2.24f, 3.26f)
                    curveTo(3.2f, 16.76f, 2.92f, 19.69f, 2f, 22f)
                    horizontalLineToRelative(20f)
                    curveToRelative(-0.92f, -2.31f, -1.2f, -5.24f, -1.24f, -7.74f)
                    curveTo(22.07f, 13.75f, 23f, 12.49f, 23f, 11f)
                    close()
                    moveTo(12f, 4.71f)
                    curveToRelative(1.33f, 1.14f, 3.49f, 2.84f, 6.11f, 4.29f)
                    horizontalLineTo(5.89f)
                    curveTo(8.51f, 7.55f, 10.67f, 5.85f, 12f, 4.71f)
                    close()
                    moveTo(13f, 11f)
                    horizontalLineToRelative(3f)
                    curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                    reflectiveCurveTo(13f, 11.83f, 13f, 11f)
                    close()
                    moveTo(9.5f, 12.5f)
                    curveTo(8.67f, 12.5f, 8f, 11.83f, 8f, 11f)
                    horizontalLineToRelative(3f)
                    curveTo(11f, 11.83f, 10.33f, 12.5f, 9.5f, 12.5f)
                    close()
                    moveTo(6f, 11f)
                    curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                    reflectiveCurveTo(3f, 11.83f, 3f, 11f)
                    horizontalLineTo(6f)
                    close()
                    moveTo(4.66f, 20f)
                    curveToRelative(0.39f, -1.86f, 0.54f, -3.82f, 0.57f, -5.58f)
                    curveToRelative(0.68f, -0.15f, 1.29f, -0.49f, 1.76f, -0.98f)
                    curveToRelative(0.25f, 0.25f, 0.54f, 0.45f, 0.85f, 0.62f)
                    curveToRelative(-0.1f, 1.87f, -0.26f, 4f, -0.52f, 5.93f)
                    horizontalLineTo(4.66f)
                    close()
                    moveTo(9.35f, 20f)
                    curveToRelative(0.24f, -1.83f, 0.39f, -3.78f, 0.48f, -5.53f)
                    curveToRelative(0.84f, -0.08f, 1.61f, -0.45f, 2.17f, -1.02f)
                    curveToRelative(0.56f, 0.57f, 1.32f, 0.94f, 2.17f, 1.02f)
                    curveToRelative(0.1f, 1.75f, 0.24f, 3.7f, 0.48f, 5.53f)
                    horizontalLineTo(9.35f)
                    close()
                    moveTo(16.67f, 20f)
                    curveToRelative(-0.27f, -1.94f, -0.43f, -4.07f, -0.52f, -5.93f)
                    curveToRelative(0.31f, -0.17f, 0.61f, -0.37f, 0.85f, -0.62f)
                    curveToRelative(0.47f, 0.48f, 1.08f, 0.83f, 1.76f, 0.98f)
                    curveToRelative(0.03f, 1.76f, 0.18f, 3.72f, 0.57f, 5.58f)
                    horizontalLineTo(16.67f)
                    close()
                    moveTo(19.5f, 12.5f)
                    curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                    horizontalLineToRelative(3f)
                    curveTo(21f, 11.83f, 20.33f, 12.5f, 19.5f, 12.5f)
                    close()
                }
            }
        }.build()
        
        return _Festival!!
    }

private var _Festival: ImageVector? = null

