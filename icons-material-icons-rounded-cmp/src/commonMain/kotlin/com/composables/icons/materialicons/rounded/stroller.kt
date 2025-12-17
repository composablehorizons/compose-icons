package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Stroller: ImageVector
    get() {
        if (_Stroller != null) return _Stroller!!
        
        _Stroller = ImageVector.Builder(
            name = "stroller",
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
                    moveTo(18f, 20f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                    reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                    reflectiveCurveTo(18f, 18.9f, 18f, 20f)
                    close()
                    moveTo(6f, 18f)
                    curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                    reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                    reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                    reflectiveCurveTo(7.1f, 18f, 6f, 18f)
                    close()
                    moveTo(14.3f, 4.1f)
                    curveTo(13.03f, 3.4f, 11.56f, 3f, 10f, 3f)
                    curveTo(8.49f, 3f, 7.07f, 3.38f, 5.83f, 4.03f)
                    curveTo(5.24f, 4.34f, 5.15f, 5.15f, 5.61f, 5.61f)
                    lineToRelative(3.99f, 3.99f)
                    lineTo(14.3f, 4.1f)
                    close()
                    moveTo(21.94f, 5.83f)
                    curveTo(21.65f, 4.22f, 20.3f, 3f, 18.65f, 3f)
                    curveToRelative(-1.66f, 0f, -2.54f, 1.27f, -3.18f, 2.03f)
                    lineTo(6.71f, 15.31f)
                    curveToRelative(-0.55f, 0.65f, -0.09f, 1.65f, 0.76f, 1.65f)
                    horizontalLineTo(15f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(6.27f)
                    curveTo(17.58f, 5.59f, 17.97f, 5f, 18.65f, 5f)
                    curveToRelative(0.68f, 0f, 1.22f, 0.52f, 1.33f, 1.21f)
                    lineToRelative(0f, 0f)
                    curveTo(20.08f, 6.66f, 20.48f, 7f, 20.96f, 7f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    curveTo(21.96f, 5.94f, 21.95f, 5.89f, 21.94f, 5.83f)
                    lineTo(21.94f, 5.83f)
                    close()
                }
            }
        }.build()
        
        return _Stroller!!
    }

private var _Stroller: ImageVector? = null

