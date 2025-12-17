package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Flag_circle: ImageVector
    get() {
        if (_Flag_circle != null) return _Flag_circle!!
        
        _Flag_circle = ImageVector.Builder(
            name = "flag_circle",
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(12f, 4f)
                            curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                            reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                            reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                            reflectiveCurveTo(16.41f, 4f, 12f, 4f)
                            close()
                            moveTo(13f, 15f)
                            lineToRelative(-1f, -2f)
                            horizontalLineTo(9.5f)
                            verticalLineToRelative(5f)
                            horizontalLineTo(8f)
                            verticalLineTo(7f)
                            horizontalLineToRelative(6f)
                            lineToRelative(1f, 2f)
                            horizontalLineToRelative(3f)
                            verticalLineToRelative(6f)
                            horizontalLineTo(13f)
                            close()
                        }
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 2f)
                        curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                        reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                        reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                        reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                        close()
                        moveTo(12f, 20f)
                        curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                        reflectiveCurveToRelative(3.59f, -8f, 8f, -8f)
                        reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                        reflectiveCurveTo(16.41f, 20f, 12f, 20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 9f)
                        lineToRelative(-1f, -2f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(11f)
                        horizontalLineToRelative(1.5f)
                        verticalLineToRelative(-5f)
                        horizontalLineTo(12f)
                        lineToRelative(1f, 2f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(9f)
                        horizontalLineTo(15f)
                        close()
                        moveTo(16.5f, 13.5f)
                        horizontalLineToRelative(-2.57f)
                        lineToRelative(-1f, -2f)
                        horizontalLineTo(9.5f)
                        verticalLineToRelative(-3f)
                        horizontalLineToRelative(3.57f)
                        lineToRelative(1f, 2f)
                        horizontalLineToRelative(2.43f)
                        verticalLineTo(13.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Flag_circle!!
    }

private var _Flag_circle: ImageVector? = null

