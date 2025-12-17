package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Sports_tennis: ImageVector
    get() {
        if (_Sports_tennis != null) return _Sports_tennis!!
        
        _Sports_tennis = ImageVector.Builder(
            name = "sports_tennis",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(19.52f, 2.49f)
                    curveToRelative(-2.34f, -2.34f, -6.62f, -1.87f, -9.55f, 1.06f)
                    curveToRelative(-1.6f, 1.6f, -2.52f, 3.87f, -2.54f, 5.46f)
                    curveToRelative(-0.02f, 1.58f, 0.26f, 3.89f, -1.35f, 5.5f)
                    lineToRelative(-4.24f, 4.24f)
                    lineToRelative(1.42f, 1.42f)
                    lineToRelative(4.24f, -4.24f)
                    curveToRelative(1.61f, -1.61f, 3.92f, -1.33f, 5.5f, -1.35f)
                    reflectiveCurveToRelative(3.86f, -0.94f, 5.46f, -2.54f)
                    curveTo(21.38f, 9.11f, 21.86f, 4.83f, 19.52f, 2.49f)
                    close()
                    moveTo(10.32f, 11.68f)
                    curveToRelative(-1.53f, -1.53f, -1.05f, -4.61f, 1.06f, -6.72f)
                    reflectiveCurveToRelative(5.18f, -2.59f, 6.72f, -1.06f)
                    curveToRelative(1.53f, 1.53f, 1.05f, 4.61f, -1.06f, 6.72f)
                    reflectiveCurveTo(11.86f, 13.21f, 10.32f, 11.68f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(18f, 17f)
                    curveToRelative(0.53f, 0f, 1.04f, 0.21f, 1.41f, 0.59f)
                    curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0f, 2.83f)
                    curveTo(19.04f, 20.79f, 18.53f, 21f, 18f, 21f)
                    reflectiveCurveToRelative(-1.04f, -0.21f, -1.41f, -0.59f)
                    curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0f, -2.83f)
                    curveTo(16.96f, 17.21f, 17.47f, 17f, 18f, 17f)
                    moveTo(18f, 15f)
                    curveToRelative(-1.02f, 0f, -2.05f, 0.39f, -2.83f, 1.17f)
                    curveToRelative(-1.56f, 1.56f, -1.56f, 4.09f, 0f, 5.66f)
                    curveTo(15.95f, 22.61f, 16.98f, 23f, 18f, 23f)
                    reflectiveCurveToRelative(2.05f, -0.39f, 2.83f, -1.17f)
                    curveToRelative(1.56f, -1.56f, 1.56f, -4.09f, 0f, -5.66f)
                    curveTo(20.05f, 15.39f, 19.02f, 15f, 18f, 15f)
                    lineTo(18f, 15f)
                    close()
                }
            }
        }.build()
        
        return _Sports_tennis!!
    }

private var _Sports_tennis: ImageVector? = null

