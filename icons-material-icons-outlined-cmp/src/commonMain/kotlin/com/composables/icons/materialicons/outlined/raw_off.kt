package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Raw_off: ImageVector
    get() {
        if (_Raw_off != null) return _Raw_off!!
        
        _Raw_off = ImageVector.Builder(
            name = "raw_off",
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
                        moveTo(17.15f, 14.32f)
                        lineTo(17.74f, 11.96f)
                        lineTo(18.5f, 15f)
                        lineTo(19.98f, 15f)
                        lineTo(21.48f, 9f)
                        lineTo(19.98f, 9f)
                        lineTo(19.24f, 12f)
                        lineTo(18.5f, 9f)
                        lineTo(16.98f, 9f)
                        lineTo(16.24f, 12f)
                        lineTo(15.5f, 9f)
                        lineTo(14f, 9f)
                        lineTo(14.72f, 11.9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(1.39f, 4.22f)
                        lineTo(6.17f, 9f)
                        horizontalLineTo(3f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(1.5f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(1.1f)
                        lineToRelative(0.9f, 2f)
                        horizontalLineTo(8f)
                        lineToRelative(-0.9f, -2.1f)
                        curveTo(7.6f, 12.6f, 8f, 12.1f, 8f, 11.5f)
                        verticalLineToRelative(-0.67f)
                        lineToRelative(1.43f, 1.43f)
                        lineTo(8.75f, 15f)
                        horizontalLineToRelative(1.5f)
                        lineToRelative(0.38f, -1.5f)
                        horizontalLineToRelative(0.04f)
                        lineToRelative(9.11f, 9.11f)
                        lineToRelative(1.41f, -1.41f)
                        lineTo(2.81f, 2.81f)
                        lineTo(1.39f, 4.22f)
                        close()
                        moveTo(6.5f, 11.5f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(11.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Raw_off!!
    }

private var _Raw_off: ImageVector? = null

