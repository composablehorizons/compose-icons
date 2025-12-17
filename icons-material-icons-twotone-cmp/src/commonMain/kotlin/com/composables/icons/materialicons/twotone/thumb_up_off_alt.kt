package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Thumb_up_off_alt: ImageVector
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
                        moveTo(13.34f, 4.66f)
                        lineTo(9f, 9f)
                        lineTo(9f, 19f)
                        lineTo(18f, 19f)
                        lineTo(21f, 12f)
                        lineTo(21f, 10f)
                        lineTo(12.23f, 10f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21f, 8f)
                        horizontalLineToRelative(-6.31f)
                        lineToRelative(0.95f, -4.57f)
                        lineToRelative(0.03f, -0.32f)
                        curveToRelative(0f, -0.41f, -0.17f, -0.79f, -0.44f, -1.06f)
                        lineTo(14.17f, 1f)
                        lineTo(7.59f, 7.59f)
                        curveTo(7.22f, 7.95f, 7f, 8.45f, 7f, 9f)
                        verticalLineToRelative(10f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(9f)
                        curveToRelative(0.83f, 0f, 1.54f, -0.5f, 1.84f, -1.22f)
                        lineToRelative(3.02f, -7.05f)
                        curveTo(22.95f, 12.5f, 23f, 12.26f, 23f, 12f)
                        verticalLineToRelative(-2f)
                        curveTo(23f, 8.9f, 22.1f, 8f, 21f, 8f)
                        close()
                        moveTo(21f, 12f)
                        lineToRelative(-3f, 7f)
                        horizontalLineTo(9f)
                        verticalLineTo(9f)
                        lineToRelative(4.34f, -4.34f)
                        lineTo(12.23f, 10f)
                        horizontalLineTo(21f)
                        verticalLineTo(12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(1f, 9f)
                        horizontalLineTo(5f)
                        verticalLineTo(21f)
                        horizontalLineTo(1f)
                        verticalLineTo(9f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Thumb_up_off_alt!!
    }

private var _Thumb_up_off_alt: ImageVector? = null

