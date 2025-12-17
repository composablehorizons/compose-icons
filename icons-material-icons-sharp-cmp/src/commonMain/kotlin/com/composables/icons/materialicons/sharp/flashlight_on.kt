package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Flashlight_on: ImageVector
    get() {
        if (_Flashlight_on != null) return _Flashlight_on!!
        
        _Flashlight_on = ImageVector.Builder(
            name = "flashlight_on",
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
                        moveTo(6f, 2f)
                        horizontalLineTo(18f)
                        verticalLineTo(5f)
                        horizontalLineTo(6f)
                        verticalLineTo(2f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(6f, 7f)
                        verticalLineToRelative(1f)
                        lineToRelative(2f, 3f)
                        verticalLineToRelative(11f)
                        horizontalLineToRelative(8f)
                        verticalLineTo(11f)
                        lineToRelative(2f, -3f)
                        verticalLineTo(7f)
                        horizontalLineTo(6f)
                        close()
                        moveTo(12f, 15.5f)
                        curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                        reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                        reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                        reflectiveCurveTo(12.83f, 15.5f, 12f, 15.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Flashlight_on!!
    }

private var _Flashlight_on: ImageVector? = null

