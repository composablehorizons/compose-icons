package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Coffee: ImageVector
    get() {
        if (_Coffee != null) return _Coffee!!
        
        _Coffee = ImageVector.Builder(
            name = "coffee",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                        moveTo(6f, 11f)
                        curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                        reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                        verticalLineToRelative(-1f)
                        horizontalLineTo(6f)
                        verticalLineTo(11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(4f, 19f)
                        horizontalLineTo(20f)
                        verticalLineTo(21f)
                        horizontalLineTo(4f)
                        verticalLineTo(19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.5f, 3f)
                        horizontalLineTo(6f)
                        curveTo(4.9f, 3f, 4f, 3.9f, 4f, 5f)
                        verticalLineToRelative(5.71f)
                        curveToRelative(0f, 3.83f, 2.95f, 7.18f, 6.78f, 7.29f)
                        curveToRelative(3.96f, 0.12f, 7.22f, -3.06f, 7.22f, -7f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(0.5f)
                        curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                        reflectiveCurveTo(20.43f, 3f, 18.5f, 3f)
                        close()
                        moveTo(16f, 11f)
                        curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                        reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(11f)
                        close()
                        moveTo(16f, 8f)
                        horizontalLineTo(6f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(8f)
                        close()
                        moveTo(18.5f, 8f)
                        horizontalLineTo(18f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(0.5f)
                        curveTo(19.33f, 5f, 20f, 5.67f, 20f, 6.5f)
                        reflectiveCurveTo(19.33f, 8f, 18.5f, 8f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Coffee!!
    }

private var _Coffee: ImageVector? = null

