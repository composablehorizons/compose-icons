package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Thumb_down_off_alt: ImageVector
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
                        moveTo(15f, 3f)
                        horizontalLineTo(6f)
                        curveTo(5.17f, 3f, 4.46f, 3.5f, 4.16f, 4.22f)
                        lineToRelative(-3.02f, 7.05f)
                        curveTo(1.05f, 11.5f, 1f, 11.74f, 1f, 12f)
                        verticalLineToRelative(2f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(6.31f)
                        lineToRelative(-0.95f, 4.57f)
                        lineToRelative(-0.03f, 0.32f)
                        curveToRelative(0f, 0.41f, 0.17f, 0.79f, 0.44f, 1.06f)
                        lineTo(9.83f, 23f)
                        lineToRelative(6.59f, -6.59f)
                        curveTo(16.78f, 16.05f, 17f, 15.55f, 17f, 15f)
                        verticalLineTo(5f)
                        curveTo(17f, 3.9f, 16.1f, 3f, 15f, 3f)
                        close()
                        moveTo(15f, 15f)
                        lineToRelative(-4.34f, 4.34f)
                        lineTo(12f, 14f)
                        horizontalLineTo(3f)
                        verticalLineToRelative(-2f)
                        lineToRelative(3f, -7f)
                        horizontalLineToRelative(9f)
                        verticalLineTo(15f)
                        close()
                        moveTo(19f, 3f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(12f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(3f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Thumb_down_off_alt!!
    }

private var _Thumb_down_off_alt: ImageVector? = null

