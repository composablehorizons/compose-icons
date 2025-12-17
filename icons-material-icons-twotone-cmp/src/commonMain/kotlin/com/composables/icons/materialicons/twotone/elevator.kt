package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Elevator: ImageVector
    get() {
        if (_Elevator != null) return _Elevator!!
        
        _Elevator = ImageVector.Builder(
            name = "elevator",
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
                    moveTo(19f, 5f)
                    verticalLineToRelative(14f)
                    horizontalLineTo(5f)
                    verticalLineTo(5f)
                    horizontalLineTo(19f)
                    moveTo(10f, 18f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(-2.5f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineTo(8f)
                    curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                    verticalLineTo(14f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(10f)
                    close()
                    moveTo(8.5f, 8.5f)
                    curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
                    reflectiveCurveTo(9.19f, 6f, 8.5f, 6f)
                    reflectiveCurveTo(7.25f, 6.56f, 7.25f, 7.25f)
                    reflectiveCurveTo(7.81f, 8.5f, 8.5f, 8.5f)
                    close()
                    moveTo(18f, 11f)
                    lineToRelative(-2.5f, -4f)
                    lineTo(13f, 11f)
                    horizontalLineTo(18f)
                    close()
                    moveTo(13f, 13f)
                    lineToRelative(2.5f, 4f)
                    lineToRelative(2.5f, -4f)
                    horizontalLineTo(13f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(19f, 5f)
                    verticalLineToRelative(14f)
                    horizontalLineTo(5f)
                    verticalLineTo(5f)
                    horizontalLineTo(19f)
                    moveTo(19f, 3f)
                    horizontalLineTo(5f)
                    curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                    verticalLineToRelative(14f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(14f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(5f)
                    curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                    lineTo(19f, 3f)
                    close()
                    moveTo(10f, 18f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(-2.5f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineTo(8f)
                    curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                    verticalLineTo(14f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(10f)
                    close()
                    moveTo(8.5f, 8.5f)
                    curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
                    reflectiveCurveTo(9.19f, 6f, 8.5f, 6f)
                    reflectiveCurveTo(7.25f, 6.56f, 7.25f, 7.25f)
                    reflectiveCurveTo(7.81f, 8.5f, 8.5f, 8.5f)
                    close()
                    moveTo(18f, 11f)
                    lineToRelative(-2.5f, -4f)
                    lineTo(13f, 11f)
                    horizontalLineTo(18f)
                    close()
                    moveTo(13f, 13f)
                    lineToRelative(2.5f, 4f)
                    lineToRelative(2.5f, -4f)
                    horizontalLineTo(13f)
                    close()
                }
            }
        }.build()
        
        return _Elevator!!
    }

private var _Elevator: ImageVector? = null

