package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Screen_lock_rotation: ImageVector
    get() {
        if (_Screen_lock_rotation != null) return _Screen_lock_rotation!!
        
        _Screen_lock_rotation = ImageVector.Builder(
            name = "screen_lock_rotation",
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
                        moveTo(20.41f, 11.36f)
                        lineToRelative(-0.35f, -0.35f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        lineTo(19f, 12.77f)
                        lineToRelative(-4.24f, 4.24f)
                        lineTo(6.98f, 9.23f)
                        lineToRelative(4.24f, -4.24f)
                        lineToRelative(0.35f, 0.35f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineToRelative(-0.35f, -0.36f)
                        curveToRelative(-0.79f, -0.79f, -2.03f, -0.79f, -2.82f, 0f)
                        lineTo(5.57f, 7.82f)
                        curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0f, 2.83f)
                        lineToRelative(7.78f, 7.78f)
                        curveToRelative(0.79f, 0.79f, 2.03f, 0.79f, 2.82f, 0f)
                        lineToRelative(4.24f, -4.24f)
                        curveTo(21.2f, 13.41f, 21.2f, 12.14f, 20.41f, 11.36f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.85f, 17.85f)
                        curveTo(10.54f, 17.54f, 10f, 17.76f, 10f, 18.21f)
                        verticalLineToRelative(1.53f)
                        curveToRelative(-3.17f, -0.82f, -5.59f, -3.54f, -5.95f, -6.86f)
                        curveTo(3.99f, 12.37f, 3.56f, 12f, 3.06f, 12f)
                        curveToRelative(-0.6f, 0f, -1.07f, 0.53f, -1f, 1.12f)
                        curveTo(2.62f, 18.11f, 6.87f, 22f, 12f, 22f)
                        curveToRelative(0.59f, 0f, 1.17f, -0.06f, 1.73f, -0.16f)
                        curveToRelative(0.4f, -0.07f, 0.55f, -0.56f, 0.27f, -0.85f)
                        lineTo(10.85f, 17.85f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 9f)
                        horizontalLineToRelative(4f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineTo(5f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        verticalLineTo(3.11f)
                        curveToRelative(0f, -1f, -0.68f, -1.92f, -1.66f, -2.08f)
                        curveTo(17.08f, 0.82f, 16f, 1.79f, 16f, 3f)
                        verticalLineToRelative(1f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(3f)
                        curveTo(15f, 8.55f, 15.45f, 9f, 16f, 9f)
                        close()
                        moveTo(17f, 3f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(3f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Screen_lock_rotation!!
    }

private var _Screen_lock_rotation: ImageVector? = null

