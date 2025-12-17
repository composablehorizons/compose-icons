package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Timer: ImageVector
    get() {
        if (_Timer != null) return _Timer!!
        
        _Timer = ImageVector.Builder(
            name = "timer",
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
                        moveTo(19.03f, 7.39f)
                        lineToRelative(0.75f, -0.75f)
                        curveToRelative(0.38f, -0.38f, 0.39f, -1.01f, 0f, -1.4f)
                        curveToRelative(0f, 0f, -0.01f, -0.01f, -0.01f, -0.01f)
                        curveToRelative(-0.39f, -0.39f, -1.01f, -0.38f, -1.4f, 0f)
                        lineToRelative(-0.75f, 0.75f)
                        curveTo(16.07f, 4.74f, 14.12f, 4f, 12f, 4f)
                        curveToRelative(-4.8f, 0f, -8.88f, 3.96f, -9f, 8.76f)
                        curveTo(2.87f, 17.84f, 6.94f, 22f, 12f, 22f)
                        curveToRelative(4.98f, 0f, 9f, -4.03f, 9f, -9f)
                        curveTo(21f, 10.88f, 20.26f, 8.93f, 19.03f, 7.39f)
                        close()
                        moveTo(13f, 13f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                        verticalLineTo(9f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        verticalLineTo(13f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Timer!!
    }

private var _Timer: ImageVector? = null

