package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Thumb_up_off_alt: ImageVector
    get() {
        if (_Thumb_up_off_alt != null) return _Thumb_up_off_alt!!
        
        _Thumb_up_off_alt = ImageVector.Builder(
            name = "thumb_up_off_alt",
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
                        moveTo(13.12f, 2.06f)
                        lineTo(7.58f, 7.6f)
                        curveTo(7.21f, 7.97f, 7f, 8.48f, 7f, 9.01f)
                        verticalLineTo(19f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(9f)
                        curveToRelative(0.8f, 0f, 1.52f, -0.48f, 1.84f, -1.21f)
                        lineToRelative(3.26f, -7.61f)
                        curveTo(23.94f, 10.2f, 22.49f, 8f, 20.34f, 8f)
                        horizontalLineToRelative(-5.65f)
                        lineToRelative(0.95f, -4.58f)
                        curveToRelative(0.1f, -0.5f, -0.05f, -1.01f, -0.41f, -1.37f)
                        curveTo(14.64f, 1.47f, 13.7f, 1.47f, 13.12f, 2.06f)
                        close()
                        moveTo(3f, 21f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-8f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                        verticalLineToRelative(8f)
                        curveTo(1f, 20.1f, 1.9f, 21f, 3f, 21f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Thumb_up_off_alt!!
    }

private var _Thumb_up_off_alt: ImageVector? = null

