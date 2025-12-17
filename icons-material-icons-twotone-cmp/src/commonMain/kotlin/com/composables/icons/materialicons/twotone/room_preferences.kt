package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Room_preferences: ImageVector
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
                    moveTo(13f, 12.11f)
                    verticalLineTo(5f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(14f)
                    horizontalLineToRelative(4.29f)
                    curveTo(11.1f, 18.37f, 11f, 17.7f, 11f, 17f)
                    curveTo(11f, 15.09f, 11.76f, 13.37f, 13f, 12.11f)
                    close()
                    moveTo(10f, 11f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(11f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 13f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(13f)
                    close()
                    moveTo(7f, 19f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(6f)
                    verticalLineToRelative(7.11f)
                    curveToRelative(0.57f, -0.59f, 1.25f, -1.07f, 2f, -1.42f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(1f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(-4f)
                    verticalLineTo(3f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(16f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(9.26f)
                    curveToRelative(-0.42f, -0.6f, -0.75f, -1.28f, -0.97f, -2f)
                    horizontalLineTo(7f)
                    close()
                    moveTo(21.69f, 17.63f)
                    lineToRelative(1.14f, 1f)
                    lineToRelative(-1f, 1.73f)
                    lineToRelative(-1.45f, -0.49f)
                    curveToRelative(-0.32f, 0.27f, -0.68f, 0.48f, -1.08f, 0.63f)
                    lineTo(19f, 22f)
                    horizontalLineToRelative(-2f)
                    lineToRelative(-0.3f, -1.49f)
                    curveToRelative(-0.4f, -0.15f, -0.76f, -0.36f, -1.08f, -0.63f)
                    lineToRelative(-1.45f, 0.49f)
                    lineToRelative(-1f, -1.73f)
                    lineToRelative(1.14f, -1f)
                    curveToRelative(-0.08f, -0.5f, -0.08f, -0.76f, 0f, -1.26f)
                    lineToRelative(-1.14f, -1f)
                    lineToRelative(1f, -1.73f)
                    lineToRelative(1.45f, 0.49f)
                    curveToRelative(0.32f, -0.27f, 0.68f, -0.48f, 1.08f, -0.63f)
                    lineTo(17f, 12f)
                    horizontalLineToRelative(2f)
                    lineToRelative(0.3f, 1.49f)
                    curveToRelative(0.4f, 0.15f, 0.76f, 0.36f, 1.08f, 0.63f)
                    lineToRelative(1.45f, -0.49f)
                    lineToRelative(1f, 1.73f)
                    lineToRelative(-1.14f, 1f)
                    curveTo(21.77f, 16.87f, 21.77f, 17.13f, 21.69f, 17.63f)
                    close()
                    moveTo(20f, 17f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                    reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                    reflectiveCurveTo(20f, 18.1f, 20f, 17f)
                    close()
                }
            }
        }.build()
        
        return _Room_preferences!!
    }

private var _Room_preferences: ImageVector? = null

