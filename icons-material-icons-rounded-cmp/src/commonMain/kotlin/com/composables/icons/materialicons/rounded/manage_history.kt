package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Manage_history: ImageVector
    get() {
        if (_Manage_history != null) return _Manage_history!!
        
        _Manage_history = ImageVector.Builder(
            name = "manage_history",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(22.75f, 19f)
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
                    curveTo(22.72f, 19.42f, 22.75f, 19.22f, 22.75f, 19f)
                    close()
                    moveTo(19f, 21f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                    reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                    reflectiveCurveTo(20.1f, 21f, 19f, 21f)
                    close()
                    moveTo(12f, 7f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(4f)
                    curveToRelative(0f, 0.27f, 0.11f, 0.52f, 0.29f, 0.71f)
                    lineToRelative(2.07f, 2.07f)
                    lineToRelative(1.04f, -1.79f)
                    lineTo(13f, 11.59f)
                    verticalLineTo(8f)
                    curveTo(13f, 7.45f, 12.55f, 7f, 12f, 7f)
                    close()
                    moveTo(4.26f, 13f)
                    curveToRelative(-0.65f, 0f, -1.14f, 0.61f, -0.98f, 1.24f)
                    curveTo(4.28f, 18.13f, 7.8f, 21f, 12f, 21f)
                    curveToRelative(0.02f, 0f, 0.05f, 0f, 0.07f, 0f)
                    lineToRelative(-1.21f, -2.09f)
                    curveToRelative(-2.75f, -0.45f, -4.96f, -2.51f, -5.64f, -5.18f)
                    curveTo(5.11f, 13.29f, 4.71f, 13f, 4.26f, 13f)
                    close()
                    moveTo(4f, 10f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineTo(5f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(1.36f)
                    curveTo(6.65f, 4.32f, 9.17f, 3f, 12f, 3f)
                    curveToRelative(4.97f, 0f, 9f, 4.03f, 9f, 9f)
                    horizontalLineToRelative(-2f)
                    curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                    curveTo(9.63f, 5f, 7.53f, 6.19f, 6.26f, 8f)
                    horizontalLineTo(8f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                    horizontalLineTo(4f)
                    close()
                }
            }
        }.build()
        
        return _Manage_history!!
    }

private var _Manage_history: ImageVector? = null

