package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Church: ImageVector
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
                        moveTo(16f, 10.04f)
                        lineTo(12f, 8f)
                        lineToRelative(-4f, 2.04f)
                        verticalLineToRelative(3.35f)
                        lineToRelative(-4f, 1.81f)
                        verticalLineTo(20f)
                        horizontalLineToRelative(5f)
                        verticalLineToRelative(-2.04f)
                        curveToRelative(0f, -1.69f, 1.35f, -3.06f, 3f, -3.06f)
                        curveToRelative(1.65f, 0f, 3f, 1.37f, 3f, 3.06f)
                        verticalLineTo(20f)
                        horizontalLineToRelative(5f)
                        verticalLineToRelative(-4.79f)
                        lineToRelative(-4f, -1.81f)
                        verticalLineTo(10.04f)
                        close()
                        moveTo(12f, 13.5f)
                        curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                        reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                        reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                        reflectiveCurveTo(12.83f, 13.5f, 12f, 13.5f)
                        close()
                    }
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
                        horizontalLineToRelative(9f)
                        verticalLineToRelative(-4f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(9f)
                        verticalLineToRelative(-8f)
                        lineTo(18f, 12.22f)
                        close()
                        moveTo(20f, 20f)
                        horizontalLineToRelative(-5f)
                        verticalLineToRelative(-2.04f)
                        curveToRelative(0f, -1.69f, -1.35f, -3.06f, -3f, -3.06f)
                        curveToRelative(-1.65f, 0f, -3f, 1.37f, -3f, 3.06f)
                        verticalLineTo(20f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(-4.79f)
                        lineToRelative(4f, -1.81f)
                        verticalLineToRelative(-3.35f)
                        lineTo(12f, 8f)
                        lineToRelative(4f, 2.04f)
                        verticalLineToRelative(3.35f)
                        lineToRelative(4f, 1.81f)
                        verticalLineTo(20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13.5f, 12f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 12f, 13.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 10.5f, 12f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 13.5f, 12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Church!!
    }

private var _Church: ImageVector? = null

