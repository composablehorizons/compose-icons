package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Castle: ImageVector
    get() {
        if (_Castle != null) return _Castle!!
        
        _Castle = ImageVector.Builder(
            name = "castle",
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
                        moveTo(22f, 9f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(4f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(4f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(4f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        reflectiveCurveTo(9f, 3.45f, 9f, 4f)
                        verticalLineToRelative(1f)
                        horizontalLineTo(7f)
                        verticalLineTo(4f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        reflectiveCurveTo(5f, 3.45f, 5f, 4f)
                        verticalLineToRelative(7f)
                        horizontalLineTo(3f)
                        verticalLineToRelative(-1f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(9f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(7f)
                        verticalLineToRelative(-3f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(7f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-9f)
                        curveTo(23f, 9.45f, 22.55f, 9f, 22f, 9f)
                        close()
                        moveTo(11f, 12f)
                        horizontalLineTo(9f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(12f)
                        close()
                        moveTo(15f, 12f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Castle!!
    }

private var _Castle: ImageVector? = null

