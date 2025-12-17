package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.No_stroller: ImageVector
    get() {
        if (_No_stroller != null) return _No_stroller!!
        
        _No_stroller = ImageVector.Builder(
            name = "no_stroller",
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
                    moveTo(10.91f, 8.08f)
                    lineTo(6.53f, 3.7f)
                    curveTo(7.6f, 3.25f, 8.77f, 3f, 10f, 3f)
                    curveToRelative(1.56f, 0f, 3.03f, 0.4f, 4.3f, 1.1f)
                    lineTo(10.91f, 8.08f)
                    close()
                    moveTo(21.19f, 21.19f)
                    lineToRelative(-4.78f, -4.78f)
                    lineToRelative(-5.75f, -5.75f)
                    lineTo(2.81f, 2.81f)
                    lineTo(1.39f, 4.22f)
                    lineToRelative(7.97f, 7.97f)
                    lineTo(5.27f, 17f)
                    horizontalLineToRelative(8.9f)
                    lineToRelative(1.13f, 1.13f)
                    curveToRelative(-0.88f, 0.33f, -1.47f, 1.25f, -1.26f, 2.28f)
                    curveToRelative(0.15f, 0.76f, 0.78f, 1.39f, 1.54f, 1.54f)
                    curveToRelative(1.03f, 0.21f, 1.95f, -0.38f, 2.28f, -1.26f)
                    lineToRelative(1.91f, 1.91f)
                    lineTo(21.19f, 21.19f)
                    close()
                    moveTo(6f, 18f)
                    curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                    reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                    reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                    reflectiveCurveTo(7.1f, 18f, 6f, 18f)
                    close()
                    moveTo(17f, 6.27f)
                    curveTo(17.58f, 5.59f, 17.97f, 5f, 18.65f, 5f)
                    curveTo(19.42f, 5f, 20f, 5.66f, 20f, 6.48f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(6.48f)
                    curveTo(22f, 4.56f, 20.52f, 3f, 18.65f, 3f)
                    curveToRelative(-1.66f, 0f, -2.54f, 1.27f, -3.18f, 2.03f)
                    lineToRelative(-3.5f, 4.11f)
                    lineTo(17f, 14.17f)
                    verticalLineTo(6.27f)
                    close()
                }
            }
        }.build()
        
        return _No_stroller!!
    }

private var _No_stroller: ImageVector? = null

