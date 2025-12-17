package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Elevator: ImageVector
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
                    moveTo(19f, 3f)
                    horizontalLineTo(5f)
                    curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                    verticalLineToRelative(14f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(14f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(5f)
                    curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                    close()
                    moveTo(8.5f, 6f)
                    curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
                    curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                    reflectiveCurveTo(7.25f, 7.94f, 7.25f, 7.25f)
                    curveTo(7.25f, 6.56f, 7.81f, 6f, 8.5f, 6f)
                    close()
                    moveTo(11f, 14f)
                    horizontalLineToRelative(-1f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(-4f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(-2.5f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    horizontalLineToRelative(1f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    verticalLineTo(14f)
                    close()
                    moveTo(15.5f, 17f)
                    lineTo(13f, 13f)
                    horizontalLineToRelative(5f)
                    lineTo(15.5f, 17f)
                    close()
                    moveTo(13f, 11f)
                    lineToRelative(2.5f, -4f)
                    lineToRelative(2.5f, 4f)
                    horizontalLineTo(13f)
                    close()
                }
            }
        }.build()
        
        return _Elevator!!
    }

private var _Elevator: ImageVector? = null

