package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Do_not_step: ImageVector
    get() {
        if (_Do_not_step != null) return _Do_not_step!!
        
        _Do_not_step = ImageVector.Builder(
            name = "do_not_step",
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
                    moveTo(1.39f, 4.22f)
                    lineToRelative(7.9f, 7.9f)
                    curveToRelative(0.18f, 0.2f, 0.18f, 0.5f, -0.01f, 0.7f)
                    curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                    reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                    lineTo(6.87f, 11.1f)
                    curveToRelative(-0.11f, 0.4f, -0.26f, 0.78f, -0.45f, 1.12f)
                    lineToRelative(1.4f, 1.4f)
                    curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                    curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                    reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                    lineToRelative(-1.27f, -1.27f)
                    curveToRelative(-0.24f, 0.29f, -0.5f, 0.56f, -0.77f, 0.8f)
                    lineToRelative(1.28f, 1.28f)
                    curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                    curveTo(6.26f, 15.95f, 6.13f, 16f, 6f, 16f)
                    reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                    lineToRelative(-1.38f, -1.38f)
                    curveToRelative(-0.69f, 0.46f, -1.39f, 0.79f, -1.97f, 1.02f)
                    curveTo(1.52f, 15.8f, 1f, 16.53f, 1f, 17.37f)
                    verticalLineTo(20f)
                    horizontalLineToRelative(9.5f)
                    lineToRelative(3.33f, -3.33f)
                    lineToRelative(5.94f, 5.94f)
                    lineToRelative(1.41f, -1.41f)
                    lineTo(2.81f, 2.81f)
                    lineTo(1.39f, 4.22f)
                    close()
                    moveTo(18.51f, 15.68f)
                    lineToRelative(-1.41f, -1.41f)
                    lineToRelative(4.48f, -4.48f)
                    lineTo(23f, 11.2f)
                    lineTo(18.51f, 15.68f)
                    close()
                    moveTo(20.88f, 9.08f)
                    lineToRelative(-4.48f, 4.48f)
                    lineTo(9.3f, 6.47f)
                    lineTo(13.8f, 2f)
                    lineTo(20.88f, 9.08f)
                    close()
                }
            }
        }.build()
        
        return _Do_not_step!!
    }

private var _Do_not_step: ImageVector? = null

