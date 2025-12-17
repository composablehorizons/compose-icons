package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Face_retouching_off: ImageVector
    get() {
        if (_Face_retouching_off != null) return _Face_retouching_off!!
        
        _Face_retouching_off = ImageVector.Builder(
            name = "face_retouching_off",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.25f, 13f)
                        arcTo(1.25f, 1.25f, 0f, false, true, 9f, 14.25f)
                        arcTo(1.25f, 1.25f, 0f, false, true, 7.75f, 13f)
                        arcTo(1.25f, 1.25f, 0f, false, true, 10.25f, 13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17.5f, 10f)
                        curveToRelative(0.75f, 0f, 1.47f, -0.09f, 2.17f, -0.24f)
                        curveTo(19.88f, 10.47f, 20f, 11.22f, 20f, 12f)
                        curveToRelative(0f, 1.22f, -0.28f, 2.37f, -0.77f, 3.4f)
                        lineToRelative(1.49f, 1.49f)
                        curveTo(21.53f, 15.44f, 22f, 13.78f, 22f, 12f)
                        curveToRelative(0f, -5.52f, -4.48f, -10f, -10f, -10f)
                        curveToRelative(-1.78f, 0f, -3.44f, 0.47f, -4.89f, 1.28f)
                        lineToRelative(5.33f, 5.33f)
                        curveTo(13.93f, 9.49f, 15.65f, 10f, 17.5f, 10f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(1.89f, 3.72f)
                        lineToRelative(2.19f, 2.19f)
                        curveTo(2.78f, 7.6f, 2f, 9.71f, 2f, 12f)
                        curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                        curveToRelative(2.29f, 0f, 4.4f, -0.78f, 6.09f, -2.08f)
                        lineToRelative(2.19f, 2.19f)
                        lineToRelative(1.41f, -1.41f)
                        lineTo(3.31f, 2.31f)
                        lineTo(1.89f, 3.72f)
                        close()
                        moveTo(16.66f, 18.49f)
                        curveTo(15.35f, 19.44f, 13.74f, 20f, 12f, 20f)
                        curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                        curveToRelative(0f, -0.05f, 0.01f, -0.1f, 0f, -0.14f)
                        curveToRelative(1.39f, -0.52f, 2.63f, -1.35f, 3.64f, -2.39f)
                        lineTo(16.66f, 18.49f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Face_retouching_off!!
    }

private var _Face_retouching_off: ImageVector? = null

