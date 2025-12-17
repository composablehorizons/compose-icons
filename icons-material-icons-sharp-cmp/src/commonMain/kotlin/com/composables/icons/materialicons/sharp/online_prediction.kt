package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Online_prediction: ImageVector
    get() {
        if (_Online_prediction != null) return _Online_prediction!!
        
        _Online_prediction = ImageVector.Builder(
            name = "online_prediction",
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
                    moveTo(15.5f, 11.5f)
                    curveToRelative(0f, 2f, -2.5f, 3.5f, -2.5f, 5f)
                    horizontalLineToRelative(-2f)
                    curveToRelative(0f, -1.5f, -2.5f, -3f, -2.5f, -5f)
                    curveTo(8.5f, 9.57f, 10.07f, 8f, 12f, 8f)
                    reflectiveCurveTo(15.5f, 9.57f, 15.5f, 11.5f)
                    close()
                    moveTo(13f, 17.5f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(19f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(17.5f)
                    close()
                    moveTo(22f, 12f)
                    curveToRelative(0f, -2.76f, -1.12f, -5.26f, -2.93f, -7.07f)
                    lineToRelative(-1.06f, 1.06f)
                    curveTo(19.55f, 7.53f, 20.5f, 9.66f, 20.5f, 12f)
                    curveToRelative(0f, 2.34f, -0.95f, 4.47f, -2.49f, 6.01f)
                    lineToRelative(1.06f, 1.06f)
                    curveTo(20.88f, 17.26f, 22f, 14.76f, 22f, 12f)
                    close()
                    moveTo(3.5f, 12f)
                    curveToRelative(0f, -2.34f, 0.95f, -4.47f, 2.49f, -6.01f)
                    lineTo(4.93f, 4.93f)
                    curveTo(3.12f, 6.74f, 2f, 9.24f, 2f, 12f)
                    curveToRelative(0f, 2.76f, 1.12f, 5.26f, 2.93f, 7.07f)
                    lineToRelative(1.06f, -1.06f)
                    curveTo(4.45f, 16.47f, 3.5f, 14.34f, 3.5f, 12f)
                    close()
                    moveTo(17.5f, 12f)
                    curveToRelative(0f, 1.52f, -0.62f, 2.89f, -1.61f, 3.89f)
                    lineToRelative(1.06f, 1.06f)
                    curveTo(18.22f, 15.68f, 19f, 13.93f, 19f, 12f)
                    curveToRelative(0f, -1.93f, -0.78f, -3.68f, -2.05f, -4.95f)
                    lineToRelative(-1.06f, 1.06f)
                    curveTo(16.88f, 9.11f, 17.5f, 10.48f, 17.5f, 12f)
                    close()
                    moveTo(7.05f, 16.95f)
                    lineToRelative(1.06f, -1.06f)
                    curveToRelative(-1f, -1f, -1.61f, -2.37f, -1.61f, -3.89f)
                    curveToRelative(0f, -1.52f, 0.62f, -2.89f, 1.61f, -3.89f)
                    lineTo(7.05f, 7.05f)
                    curveTo(5.78f, 8.32f, 5f, 10.07f, 5f, 12f)
                    curveTo(5f, 13.93f, 5.78f, 15.68f, 7.05f, 16.95f)
                    close()
                }
            }
        }.build()
        
        return _Online_prediction!!
    }

private var _Online_prediction: ImageVector? = null

