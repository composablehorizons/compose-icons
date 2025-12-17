package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Smart_toy: ImageVector
    get() {
        if (_Smart_toy != null) return _Smart_toy!!
        
        _Smart_toy = ImageVector.Builder(
            name = "smart_toy",
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
                        moveTo(20f, 9f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(-5f)
                        verticalLineTo(2f)
                        horizontalLineTo(9f)
                        verticalLineToRelative(3f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(4f)
                        horizontalLineTo(1f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(16f)
                        verticalLineToRelative(-6f)
                        horizontalLineToRelative(3f)
                        verticalLineTo(9f)
                        horizontalLineTo(20f)
                        close()
                        moveTo(7.5f, 11.5f)
                        curveTo(7.5f, 10.67f, 8.17f, 10f, 9f, 10f)
                        reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                        reflectiveCurveTo(9.83f, 13f, 9f, 13f)
                        reflectiveCurveTo(7.5f, 12.33f, 7.5f, 11.5f)
                        close()
                        moveTo(16f, 17f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(8f)
                        verticalLineTo(17f)
                        close()
                        moveTo(15f, 13f)
                        curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                        reflectiveCurveTo(14.17f, 10f, 15f, 10f)
                        reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                        reflectiveCurveTo(15.83f, 13f, 15f, 13f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Smart_toy!!
    }

private var _Smart_toy: ImageVector? = null

