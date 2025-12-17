package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Swipe_vertical: ImageVector
    get() {
        if (_Swipe_vertical != null) return _Swipe_vertical!!
        
        _Swipe_vertical = ImageVector.Builder(
            name = "swipe_vertical",
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
                    moveTo(1f, 2f)
                    horizontalLineToRelative(3.5f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(1.5f)
                    verticalLineTo(7f)
                    horizontalLineTo(4.5f)
                    verticalLineTo(4.09f)
                    curveToRelative(-1.86f, 2.11f, -3f, 4.88f, -3f, 7.91f)
                    reflectiveCurveToRelative(1.14f, 5.79f, 3f, 7.91f)
                    verticalLineTo(17f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(3.5f)
                    verticalLineTo(22f)
                    horizontalLineTo(4.5f)
                    horizontalLineTo(1f)
                    verticalLineToRelative(-1.5f)
                    horizontalLineToRelative(2.02f)
                    curveTo(1.13f, 18.18f, 0f, 15.22f, 0f, 12f)
                    reflectiveCurveToRelative(1.13f, -6.18f, 3.02f, -8.5f)
                    horizontalLineTo(1f)
                    verticalLineTo(2f)
                    close()
                    moveTo(20.22f, 10f)
                    lineToRelative(-4.15f, 0.01f)
                    curveToRelative(-0.16f, -0.01f, -0.31f, 0.02f, -0.45f, 0.08f)
                    lineToRelative(-0.59f, 0.26f)
                    lineTo(13.2f, 6.25f)
                    curveToRelative(-0.56f, -1.26f, -2.04f, -1.83f, -3.3f, -1.27f)
                    reflectiveCurveToRelative(-1.83f, 2.04f, -1.27f, 3.3f)
                    lineToRelative(3.3f, 7.45f)
                    lineToRelative(-1.87f, 0.39f)
                    curveToRelative(-0.19f, 0.05f, -0.99f, 0.27f, -1.36f, 1.21f)
                    lineTo(8f, 19.19f)
                    lineToRelative(6.78f, 2.67f)
                    curveToRelative(0.49f, 0.19f, 1.05f, 0.18f, 1.53f, -0.04f)
                    lineToRelative(5.99f, -2.65f)
                    curveToRelative(0.89f, -0.4f, 1.37f, -1.38f, 1.13f, -2.32f)
                    lineToRelative(-1.36f, -5.34f)
                    curveTo(21.85f, 10.65f, 21.1f, 10.04f, 20.22f, 10f)
                    close()
                    moveTo(21.49f, 17.34f)
                    lineTo(15.5f, 20f)
                    lineToRelative(-4.92f, -1.96f)
                    lineToRelative(4.18f, -0.88f)
                    lineToRelative(-4.3f, -9.7f)
                    curveToRelative(-0.11f, -0.25f, 0f, -0.55f, 0.25f, -0.66f)
                    curveToRelative(0.25f, -0.11f, 0.55f, 0f, 0.66f, 0.25f)
                    lineToRelative(2.5f, 5.65f)
                    lineToRelative(1.61f, -0.71f)
                    lineTo(20.13f, 12f)
                    lineTo(21.49f, 17.34f)
                    close()
                }
            }
        }.build()
        
        return _Swipe_vertical!!
    }

private var _Swipe_vertical: ImageVector? = null

