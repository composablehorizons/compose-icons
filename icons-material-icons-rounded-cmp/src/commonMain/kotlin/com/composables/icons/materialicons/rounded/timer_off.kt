package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Timer_off: ImageVector
    get() {
        if (_Timer_off != null) return _Timer_off!!
        
        _Timer_off = ImageVector.Builder(
            name = "timer_off",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 3f)
                        horizontalLineToRelative(4f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(-4f)
                        curveTo(9.45f, 1f, 9f, 1.45f, 9f, 2f)
                        curveTo(9f, 2.55f, 9.45f, 3f, 10f, 3f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 8f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(1.17f)
                        lineToRelative(6.98f, 6.98f)
                        curveTo(20.63f, 15.91f, 21f, 14.5f, 21f, 13f)
                        curveToRelative(0f, -2.12f, -0.74f, -4.07f, -1.97f, -5.61f)
                        lineToRelative(0.75f, -0.75f)
                        curveToRelative(0.38f, -0.38f, 0.39f, -1.01f, 0f, -1.4f)
                        curveToRelative(0f, 0f, -0.01f, -0.01f, -0.01f, -0.01f)
                        curveToRelative(-0.39f, -0.39f, -1.01f, -0.38f, -1.4f, 0f)
                        lineToRelative(-0.75f, 0.75f)
                        curveTo(16.07f, 4.74f, 14.12f, 4f, 12f, 4f)
                        curveToRelative(-1.48f, 0f, -2.89f, 0.38f, -4.13f, 1.04f)
                        lineToRelative(3.36f, 3.36f)
                        curveTo(11.41f, 8.16f, 11.68f, 8f, 12f, 8f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2.1f, 3.51f)
                        lineTo(2.1f, 3.51f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        lineToRelative(2.72f, 2.72f)
                        curveTo(3.73f, 9.09f, 3.05f, 10.86f, 3f, 12.76f)
                        curveTo(2.87f, 17.84f, 6.94f, 22f, 12f, 22f)
                        curveToRelative(2.02f, 0f, 3.88f, -0.67f, 5.38f, -1.79f)
                        lineToRelative(1.69f, 1.69f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineTo(3.51f, 3.51f)
                        curveTo(3.12f, 3.12f, 2.49f, 3.12f, 2.1f, 3.51f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Timer_off!!
    }

private var _Timer_off: ImageVector? = null

