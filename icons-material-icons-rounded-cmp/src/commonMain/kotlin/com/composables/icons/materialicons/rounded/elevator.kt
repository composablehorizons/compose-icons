package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Elevator: ImageVector
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
                    moveTo(11f, 13f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    verticalLineToRelative(3f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineTo(8f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-3f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-1.5f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    horizontalLineToRelative(1f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    verticalLineTo(13f)
                    close()
                    moveTo(17.52f, 13.76f)
                    lineToRelative(-1.6f, 2.56f)
                    curveToRelative(-0.2f, 0.31f, -0.65f, 0.31f, -0.85f, 0f)
                    lineToRelative(-1.6f, -2.56f)
                    curveTo(13.27f, 13.43f, 13.51f, 13f, 13.9f, 13f)
                    horizontalLineToRelative(3.2f)
                    curveTo(17.49f, 13f, 17.73f, 13.43f, 17.52f, 13.76f)
                    close()
                    moveTo(17.1f, 11f)
                    horizontalLineToRelative(-3.2f)
                    curveToRelative(-0.39f, 0f, -0.63f, -0.43f, -0.42f, -0.77f)
                    lineToRelative(1.6f, -2.56f)
                    curveToRelative(0.2f, -0.31f, 0.65f, -0.31f, 0.85f, 0f)
                    lineToRelative(1.6f, 2.56f)
                    curveTo(17.73f, 10.57f, 17.49f, 11f, 17.1f, 11f)
                    close()
                }
            }
        }.build()
        
        return _Elevator!!
    }

private var _Elevator: ImageVector? = null

