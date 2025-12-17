package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Room_preferences: ImageVector
    get() {
        if (_Room_preferences != null) return _Room_preferences!!
        
        _Room_preferences = ImageVector.Builder(
            name = "room_preferences",
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
                    moveTo(14f, 11.26f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(-5f)
                    verticalLineTo(3f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(16f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(9.26f)
                    curveTo(11.47f, 19.87f, 11f, 18.49f, 11f, 17f)
                    curveTo(11f, 14.62f, 12.19f, 12.53f, 14f, 11.26f)
                    close()
                    moveTo(10f, 11f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(11f)
                    close()
                    moveTo(21.69f, 16.37f)
                    lineToRelative(1.14f, -1f)
                    lineToRelative(-1f, -1.73f)
                    lineToRelative(-1.45f, 0.49f)
                    curveToRelative(-0.32f, -0.27f, -0.68f, -0.48f, -1.08f, -0.63f)
                    lineTo(19f, 12f)
                    horizontalLineToRelative(-2f)
                    lineToRelative(-0.3f, 1.49f)
                    curveToRelative(-0.4f, 0.15f, -0.76f, 0.36f, -1.08f, 0.63f)
                    lineToRelative(-1.45f, -0.49f)
                    lineToRelative(-1f, 1.73f)
                    lineToRelative(1.14f, 1f)
                    curveToRelative(-0.08f, 0.5f, -0.08f, 0.76f, 0f, 1.26f)
                    lineToRelative(-1.14f, 1f)
                    lineToRelative(1f, 1.73f)
                    lineToRelative(1.45f, -0.49f)
                    curveToRelative(0.32f, 0.27f, 0.68f, 0.48f, 1.08f, 0.63f)
                    lineTo(17f, 22f)
                    horizontalLineToRelative(2f)
                    lineToRelative(0.3f, -1.49f)
                    curveToRelative(0.4f, -0.15f, 0.76f, -0.36f, 1.08f, -0.63f)
                    lineToRelative(1.45f, 0.49f)
                    lineToRelative(1f, -1.73f)
                    lineToRelative(-1.14f, -1f)
                    curveTo(21.77f, 17.13f, 21.77f, 16.87f, 21.69f, 16.37f)
                    close()
                    moveTo(18f, 19f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                    reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                    reflectiveCurveTo(19.1f, 19f, 18f, 19f)
                    close()
                }
            }
        }.build()
        
        return _Room_preferences!!
    }

private var _Room_preferences: ImageVector? = null

