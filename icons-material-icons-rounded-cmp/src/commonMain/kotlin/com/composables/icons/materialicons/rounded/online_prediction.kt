package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Online_prediction: ImageVector
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
                    verticalLineTo(18f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineTo(17.5f)
                    close()
                    moveTo(22f, 12f)
                    curveToRelative(0f, -2.46f, -0.89f, -4.71f, -2.36f, -6.45f)
                    curveToRelative(-0.29f, -0.34f, -0.8f, -0.38f, -1.12f, -0.06f)
                    lineToRelative(0f, 0f)
                    curveToRelative(-0.27f, 0.27f, -0.3f, 0.71f, -0.06f, 1f)
                    curveTo(19.73f, 7.97f, 20.5f, 9.9f, 20.5f, 12f)
                    curveToRelative(0f, 2.1f, -0.77f, 4.03f, -2.04f, 5.52f)
                    curveToRelative(-0.25f, 0.29f, -0.21f, 0.73f, 0.06f, 1f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.32f, 0.32f, 0.83f, 0.28f, 1.12f, -0.06f)
                    curveTo(21.11f, 16.71f, 22f, 14.46f, 22f, 12f)
                    close()
                    moveTo(3.5f, 12f)
                    curveToRelative(0f, -2.1f, 0.77f, -4.03f, 2.04f, -5.52f)
                    curveToRelative(0.25f, -0.29f, 0.21f, -0.73f, -0.06f, -1f)
                    lineToRelative(0f, 0f)
                    curveTo(5.17f, 5.17f, 4.65f, 5.2f, 4.36f, 5.54f)
                    curveTo(2.89f, 7.29f, 2f, 9.54f, 2f, 12f)
                    curveToRelative(0f, 2.46f, 0.89f, 4.71f, 2.36f, 6.46f)
                    curveToRelative(0.29f, 0.34f, 0.8f, 0.38f, 1.12f, 0.06f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.27f, -0.27f, 0.3f, -0.71f, 0.06f, -1f)
                    curveTo(4.27f, 16.03f, 3.5f, 14.1f, 3.5f, 12f)
                    close()
                    moveTo(17.5f, 12f)
                    curveToRelative(0f, 1.28f, -0.44f, 2.47f, -1.18f, 3.41f)
                    curveToRelative(-0.23f, 0.29f, -0.2f, 0.71f, 0.07f, 0.98f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.32f, 0.32f, 0.85f, 0.29f, 1.13f, -0.07f)
                    curveTo(18.44f, 15.13f, 19f, 13.63f, 19f, 12f)
                    curveToRelative(0f, -1.63f, -0.56f, -3.13f, -1.49f, -4.31f)
                    curveToRelative(-0.28f, -0.36f, -0.81f, -0.39f, -1.13f, -0.07f)
                    lineToRelative(0f, 0f)
                    curveToRelative(-0.26f, 0.26f, -0.3f, 0.68f, -0.07f, 0.98f)
                    curveTo(17.06f, 9.53f, 17.5f, 10.72f, 17.5f, 12f)
                    close()
                    moveTo(7.62f, 16.38f)
                    lineTo(7.62f, 16.38f)
                    curveToRelative(0.26f, -0.26f, 0.3f, -0.68f, 0.07f, -0.98f)
                    curveTo(6.94f, 14.47f, 6.5f, 13.28f, 6.5f, 12f)
                    curveToRelative(0f, -1.28f, 0.44f, -2.47f, 1.18f, -3.41f)
                    curveToRelative(0.23f, -0.29f, 0.2f, -0.71f, -0.07f, -0.98f)
                    lineToRelative(0f, 0f)
                    curveTo(7.3f, 7.3f, 6.77f, 7.33f, 6.49f, 7.68f)
                    curveTo(5.56f, 8.87f, 5f, 10.37f, 5f, 12f)
                    curveToRelative(0f, 1.63f, 0.56f, 3.13f, 1.49f, 4.32f)
                    curveTo(6.77f, 16.67f, 7.3f, 16.7f, 7.62f, 16.38f)
                    close()
                }
            }
        }.build()
        
        return _Online_prediction!!
    }

private var _Online_prediction: ImageVector? = null

