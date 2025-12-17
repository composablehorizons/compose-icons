package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Raw_on: ImageVector
    get() {
        if (_Raw_on != null) return _Raw_on!!
        
        _Raw_on = ImageVector.Builder(
            name = "raw_on",
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
                        moveTo(6.5f, 9f)
                        horizontalLineTo(3f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(1.5f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(1.1f)
                        lineToRelative(0.9f, 2f)
                        horizontalLineTo(8f)
                        lineToRelative(-0.9f, -2.1f)
                        curveTo(7.6f, 12.6f, 8f, 12.1f, 8f, 11.5f)
                        verticalLineToRelative(-1f)
                        curveTo(8f, 9.7f, 7.3f, 9f, 6.5f, 9f)
                        close()
                        moveTo(6.5f, 11.5f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(11.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.25f, 9f)
                        lineToRelative(-1.5f, 6f)
                        horizontalLineToRelative(1.5f)
                        lineToRelative(0.38f, -1.5f)
                        horizontalLineToRelative(1.75f)
                        lineToRelative(0.37f, 1.5f)
                        horizontalLineToRelative(1.5f)
                        lineToRelative(-1.5f, -6f)
                        horizontalLineTo(10.25f)
                        close()
                        moveTo(11f, 12f)
                        lineToRelative(0.25f, -1f)
                        horizontalLineToRelative(0.5f)
                        lineTo(12f, 12f)
                        horizontalLineTo(11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.98f, 9f)
                        lineTo(19.24f, 12f)
                        lineTo(18.5f, 9f)
                        lineTo(16.98f, 9f)
                        lineTo(16.24f, 12f)
                        lineTo(15.5f, 9f)
                        lineTo(14f, 9f)
                        lineTo(15.5f, 15f)
                        lineTo(16.98f, 15f)
                        lineTo(17.74f, 11.96f)
                        lineTo(18.5f, 15f)
                        lineTo(19.98f, 15f)
                        lineTo(21.48f, 9f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Raw_on!!
    }

private var _Raw_on: ImageVector? = null

