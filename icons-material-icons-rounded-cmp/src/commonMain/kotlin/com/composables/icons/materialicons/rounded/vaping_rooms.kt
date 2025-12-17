package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Vaping_rooms: ImageVector
    get() {
        if (_Vaping_rooms != null) return _Vaping_rooms!!
        
        _Vaping_rooms = ImageVector.Builder(
            name = "vaping_rooms",
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
                    moveTo(22f, 17.5f)
                    curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(-3f)
                    horizontalLineToRelative(12.5f)
                    curveTo(21.33f, 16f, 22f, 16.67f, 22f, 17.5f)
                    close()
                    moveTo(10.5f, 17f)
                    curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                    reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                    reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                    reflectiveCurveTo(10.78f, 17f, 10.5f, 17f)
                    close()
                    moveTo(18.85f, 7.73f)
                    curveToRelative(0.62f, -0.61f, 1f, -1.45f, 1f, -2.38f)
                    curveToRelative(0f, -1.51f, -1f, -2.79f, -2.38f, -3.21f)
                    curveTo(16.99f, 2f, 16.5f, 2.36f, 16.5f, 2.86f)
                    curveToRelative(0f, 0.33f, 0.21f, 0.62f, 0.52f, 0.71f)
                    curveToRelative(0.77f, 0.23f, 1.33f, 0.94f, 1.33f, 1.78f)
                    curveToRelative(0f, 0.82f, -0.53f, 1.51f, -1.27f, 1.76f)
                    curveTo(16.75f, 7.22f, 16.5f, 7.5f, 16.5f, 7.85f)
                    verticalLineTo(8f)
                    curveToRelative(0f, 0.37f, 0.27f, 0.69f, 0.64f, 0.75f)
                    curveToRelative(1.93f, 0.31f, 3.36f, 2f, 3.36f, 4.02f)
                    verticalLineToRelative(1.48f)
                    curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                    reflectiveCurveTo(22f, 14.66f, 22f, 14.25f)
                    verticalLineToRelative(-1.49f)
                    curveTo(22f, 10.54f, 20.72f, 8.62f, 18.85f, 7.73f)
                    close()
                    moveTo(18.76f, 15f)
                    curveToRelative(0.41f, 0f, 0.75f, -0.33f, 0.75f, -0.75f)
                    verticalLineToRelative(-0.89f)
                    curveToRelative(-0.01f, -1.81f, -1.61f, -3.16f, -3.48f, -3.16f)
                    horizontalLineToRelative(-1.3f)
                    curveToRelative(-1.02f, 0f, -1.94f, -0.73f, -2.07f, -1.75f)
                    curveToRelative(-0.12f, -0.95f, 0.46f, -1.7f, 1.3f, -1.93f)
                    curveToRelative(0.32f, -0.09f, 0.54f, -0.38f, 0.54f, -0.72f)
                    curveToRelative(0f, -0.49f, -0.46f, -0.86f, -0.93f, -0.72f)
                    curveToRelative(-1.42f, 0.41f, -2.45f, 1.73f, -2.42f, 3.28f)
                    curveToRelative(0.03f, 1.84f, 1.62f, 3.29f, 3.46f, 3.29f)
                    horizontalLineToRelative(1.42f)
                    curveToRelative(1.05f, 0f, 1.97f, 0.74f, 1.97f, 2.05f)
                    verticalLineToRelative(0.55f)
                    curveTo(18f, 14.66f, 18.34f, 15f, 18.76f, 15f)
                    close()
                    moveTo(3f, 18.5f)
                    curveToRelative(1.33f, 0f, 2.71f, 0.18f, 4f, 0.5f)
                    verticalLineToRelative(-3f)
                    curveToRelative(-1.29f, 0.32f, -2.67f, 0.5f, -4f, 0.5f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    reflectiveCurveTo(2.45f, 18.5f, 3f, 18.5f)
                    close()
                }
            }
        }.build()
        
        return _Vaping_rooms!!
    }

private var _Vaping_rooms: ImageVector? = null

