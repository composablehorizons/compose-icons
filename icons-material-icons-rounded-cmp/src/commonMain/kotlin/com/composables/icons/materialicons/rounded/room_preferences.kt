package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Room_preferences: ImageVector
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
                    moveTo(21.75f, 17f)
                    curveToRelative(0f, -0.22f, -0.03f, -0.42f, -0.06f, -0.63f)
                    lineToRelative(0.84f, -0.73f)
                    curveToRelative(0.18f, -0.16f, 0.22f, -0.42f, 0.1f, -0.63f)
                    lineToRelative(-0.59f, -1.02f)
                    curveToRelative(-0.12f, -0.21f, -0.37f, -0.3f, -0.59f, -0.22f)
                    lineToRelative(-1.06f, 0.36f)
                    curveToRelative(-0.32f, -0.27f, -0.68f, -0.48f, -1.08f, -0.63f)
                    lineToRelative(-0.22f, -1.09f)
                    curveToRelative(-0.05f, -0.23f, -0.25f, -0.4f, -0.49f, -0.4f)
                    horizontalLineToRelative(-1.18f)
                    curveToRelative(-0.24f, 0f, -0.44f, 0.17f, -0.49f, 0.4f)
                    lineToRelative(-0.22f, 1.09f)
                    curveToRelative(-0.4f, 0.15f, -0.76f, 0.36f, -1.08f, 0.63f)
                    lineToRelative(-1.06f, -0.36f)
                    curveToRelative(-0.23f, -0.08f, -0.47f, 0.02f, -0.59f, 0.22f)
                    lineToRelative(-0.59f, 1.02f)
                    curveToRelative(-0.12f, 0.21f, -0.08f, 0.47f, 0.1f, 0.63f)
                    lineToRelative(0.84f, 0.73f)
                    curveToRelative(-0.03f, 0.21f, -0.06f, 0.41f, -0.06f, 0.63f)
                    reflectiveCurveToRelative(0.03f, 0.42f, 0.06f, 0.63f)
                    lineToRelative(-0.84f, 0.73f)
                    curveToRelative(-0.18f, 0.16f, -0.22f, 0.42f, -0.1f, 0.63f)
                    lineToRelative(0.59f, 1.02f)
                    curveToRelative(0.12f, 0.21f, 0.37f, 0.3f, 0.59f, 0.22f)
                    lineToRelative(1.06f, -0.36f)
                    curveToRelative(0.32f, 0.27f, 0.68f, 0.48f, 1.08f, 0.63f)
                    lineToRelative(0.22f, 1.09f)
                    curveToRelative(0.05f, 0.23f, 0.25f, 0.4f, 0.49f, 0.4f)
                    horizontalLineToRelative(1.18f)
                    curveToRelative(0.24f, 0f, 0.44f, -0.17f, 0.49f, -0.4f)
                    lineToRelative(0.22f, -1.09f)
                    curveToRelative(0.4f, -0.15f, 0.76f, -0.36f, 1.08f, -0.63f)
                    lineToRelative(1.06f, 0.36f)
                    curveToRelative(0.23f, 0.08f, 0.47f, -0.02f, 0.59f, -0.22f)
                    lineToRelative(0.59f, -1.02f)
                    curveToRelative(0.12f, -0.21f, 0.08f, -0.47f, -0.1f, -0.63f)
                    lineToRelative(-0.84f, -0.73f)
                    curveTo(21.72f, 17.42f, 21.75f, 17.22f, 21.75f, 17f)
                    close()
                    moveTo(18f, 19f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                    reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                    reflectiveCurveTo(19.1f, 19f, 18f, 19f)
                    close()
                    moveTo(14f, 11.26f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(5f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-4f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineTo(6f)
                    curveTo(5.45f, 3f, 5f, 3.45f, 5f, 4f)
                    verticalLineToRelative(15f)
                    horizontalLineTo(4f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(8.26f)
                    curveTo(11.47f, 19.87f, 11f, 18.49f, 11f, 17f)
                    curveTo(11f, 14.62f, 12.19f, 12.53f, 14f, 11.26f)
                    close()
                    moveTo(10f, 12f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    reflectiveCurveTo(10f, 12.55f, 10f, 12f)
                    close()
                }
            }
        }.build()
        
        return _Room_preferences!!
    }

private var _Room_preferences: ImageVector? = null

