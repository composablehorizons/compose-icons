package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Face_retouching_natural: ImageVector
    get() {
        if (_Face_retouching_natural != null) return _Face_retouching_natural!!
        
        _Face_retouching_natural = ImageVector.Builder(
            name = "face_retouching_natural",
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
                        moveTo(19.85f, 10.59f)
                        curveTo(20.79f, 15.4f, 17.01f, 20f, 12f, 20f)
                        curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                        curveToRelative(0f, -0.39f, 3.87f, -1.12f, 5.74f, -5.69f)
                        curveToRelative(3.42f, 4.19f, 8.07f, 3.73f, 9.09f, 3.59f)
                        lineToRelative(-1.48f, -3.25f)
                        lineTo(12.63f, 4.5f)
                        lineToRelative(3.5f, -1.59f)
                        curveTo(9.51f, -0.14f, 2f, 4.77f, 2f, 12f)
                        curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                        curveToRelative(7.21f, 0f, 12.12f, -7.45f, 9.1f, -14.13f)
                        lineTo(19.85f, 10.59f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.25f, 13f)
                        arcTo(1.25f, 1.25f, 0f, false, true, 15f, 14.25f)
                        arcTo(1.25f, 1.25f, 0f, false, true, 13.75f, 13f)
                        arcTo(1.25f, 1.25f, 0f, false, true, 16.25f, 13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20.6f, 5.6f)
                        lineTo(19.5f, 8f)
                        lineToRelative(-1.1f, -2.4f)
                        lineTo(16f, 4.5f)
                        lineToRelative(2.4f, -1.1f)
                        lineTo(19.5f, 1f)
                        lineToRelative(1.1f, 2.4f)
                        lineTo(23f, 4.5f)
                        lineTo(20.6f, 5.6f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Face_retouching_natural!!
    }

private var _Face_retouching_natural: ImageVector? = null

