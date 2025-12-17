package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Baby_changing_station: ImageVector
    get() {
        if (_Baby_changing_station != null) return _Baby_changing_station!!
        
        _Baby_changing_station = ImageVector.Builder(
            name = "baby_changing_station",
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
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(14f, 8f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-3f)
                    lineTo(8.31f, 8.82f)
                    lineTo(7f, 12.75f)
                    verticalLineTo(22f)
                    horizontalLineTo(3f)
                    verticalLineTo(12f)
                    lineToRelative(1.58f, -4.63f)
                    curveTo(4.86f, 6.53f, 5.63f, 6.01f, 6.46f, 6f)
                    curveTo(6.74f, 6f, 7.02f, 6.05f, 7.3f, 6.18f)
                    lineToRelative(4.15f, 1.83f)
                    lineTo(14f, 8f)
                    close()
                    moveTo(8f, 1f)
                    curveTo(6.9f, 1f, 6f, 1.9f, 6f, 3f)
                    reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                    reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                    reflectiveCurveTo(9.1f, 1f, 8f, 1f)
                    close()
                    moveTo(9f, 19f)
                    horizontalLineToRelative(12f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(9f)
                    verticalLineTo(19f)
                    close()
                    moveTo(19.5f, 16f)
                    curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                    curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                    reflectiveCurveTo(18f, 13.67f, 18f, 14.5f)
                    curveTo(18f, 15.33f, 18.67f, 16f, 19.5f, 16f)
                    close()
                    moveTo(13f, 13f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(6f)
                    verticalLineToRelative(-5f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(13f)
                    close()
                }
            }
        }.build()
        
        return _Baby_changing_station!!
    }

private var _Baby_changing_station: ImageVector? = null

