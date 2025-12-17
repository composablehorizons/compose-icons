package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Church: ImageVector
    get() {
        if (_Church != null) return _Church!!
        
        _Church = ImageVector.Builder(
            name = "church",
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
                        moveTo(18f, 12.22f)
                        verticalLineTo(9f)
                        lineToRelative(-5f, -2.5f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(3f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(1f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(9f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(1.5f)
                        lineTo(6f, 9f)
                        verticalLineToRelative(3.22f)
                        lineTo(2f, 14f)
                        verticalLineToRelative(8f)
                        horizontalLineToRelative(8f)
                        verticalLineToRelative(-5f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(5f)
                        horizontalLineToRelative(8f)
                        verticalLineToRelative(-8f)
                        lineTo(18f, 12.22f)
                        close()
                        moveTo(12f, 13.5f)
                        curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                        reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                        reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                        reflectiveCurveTo(12.83f, 13.5f, 12f, 13.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Church!!
    }

private var _Church: ImageVector? = null

