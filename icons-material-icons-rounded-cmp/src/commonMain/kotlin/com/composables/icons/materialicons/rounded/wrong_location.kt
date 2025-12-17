package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Wrong_location: ImageVector
    get() {
        if (_Wrong_location != null) return _Wrong_location!!
        
        _Wrong_location = ImageVector.Builder(
            name = "wrong_location",
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
                        moveTo(20.42f, 4.5f)
                        lineToRelative(1.38f, -1.38f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        lineTo(19f, 3.08f)
                        lineToRelative(-1.38f, -1.38f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                        lineToRelative(1.38f, 1.38f)
                        lineToRelative(-1.38f, 1.38f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        lineTo(19f, 5.92f)
                        lineToRelative(1.38f, 1.38f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineTo(20.42f, 4.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.67f, 8f)
                        lineTo(19f, 7.33f)
                        lineToRelative(-0.59f, 0.59f)
                        curveToRelative(-0.7f, 0.7f, -1.84f, 0.88f, -2.65f, 0.3f)
                        curveToRelative(-1.03f, -0.74f, -1.12f, -2.19f, -0.26f, -3.05f)
                        lineToRelative(0.67f, -0.67f)
                        lineTo(15.5f, 3.83f)
                        curveToRelative(-0.36f, -0.36f, -0.54f, -0.81f, -0.57f, -1.28f)
                        curveTo(14.01f, 2.19f, 13.02f, 2f, 12f, 2f)
                        curveToRelative(-4.2f, 0f, -8f, 3.22f, -8f, 8.2f)
                        curveToRelative(0f, 3.18f, 2.45f, 6.92f, 7.34f, 11.23f)
                        curveToRelative(0.38f, 0.33f, 0.95f, 0.33f, 1.33f, 0f)
                        curveTo(17.55f, 17.12f, 20f, 13.38f, 20f, 10.2f)
                        curveToRelative(0f, -0.76f, -0.1f, -1.47f, -0.26f, -2.14f)
                        curveTo(19.72f, 8.04f, 19.69f, 8.02f, 19.67f, 8f)
                        close()
                        moveTo(12f, 12f)
                        curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                        reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                        curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                        reflectiveCurveTo(13.1f, 12f, 12f, 12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Wrong_location!!
    }

private var _Wrong_location: ImageVector? = null

