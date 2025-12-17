package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Thumb_down_off_alt: ImageVector
    get() {
        if (_Thumb_down_off_alt != null) return _Thumb_down_off_alt!!
        
        _Thumb_down_off_alt = ImageVector.Builder(
            name = "thumb_down_off_alt",
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
                        moveTo(14.99f, 3f)
                        horizontalLineTo(6f)
                        curveTo(5.2f, 3f, 4.48f, 3.48f, 4.17f, 4.21f)
                        lineToRelative(-3.26f, 7.61f)
                        curveTo(0.06f, 13.8f, 1.51f, 16f, 3.66f, 16f)
                        horizontalLineToRelative(5.65f)
                        lineToRelative(-0.95f, 4.58f)
                        curveToRelative(-0.1f, 0.5f, 0.05f, 1.01f, 0.41f, 1.37f)
                        curveToRelative(0.29f, 0.29f, 0.67f, 0.43f, 1.05f, 0.43f)
                        curveToRelative(0.38f, 0f, 0.77f, -0.15f, 1.06f, -0.44f)
                        lineToRelative(5.53f, -5.54f)
                        curveToRelative(0.37f, -0.37f, 0.58f, -0.88f, 0.58f, -1.41f)
                        verticalLineTo(5f)
                        curveTo(16.99f, 3.9f, 16.09f, 3f, 14.99f, 3f)
                        close()
                        moveTo(10.66f, 19.33f)
                        lineToRelative(0.61f, -2.92f)
                        lineToRelative(0.5f, -2.41f)
                        horizontalLineTo(9.31f)
                        horizontalLineTo(3.66f)
                        curveToRelative(-0.47f, 0f, -0.72f, -0.28f, -0.83f, -0.45f)
                        curveToRelative(-0.11f, -0.17f, -0.27f, -0.51f, -0.08f, -0.95f)
                        lineTo(6f, 5f)
                        horizontalLineToRelative(8.99f)
                        lineToRelative(0f, 9.99f)
                        lineTo(10.66f, 19.33f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21f, 3f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        verticalLineToRelative(8f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                        verticalLineTo(5f)
                        curveTo(23f, 3.9f, 22.1f, 3f, 21f, 3f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Thumb_down_off_alt!!
    }

private var _Thumb_down_off_alt: ImageVector? = null

