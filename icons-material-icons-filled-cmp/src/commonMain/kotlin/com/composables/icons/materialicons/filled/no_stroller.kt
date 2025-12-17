package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.No_stroller: ImageVector
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
                    moveTo(6f, 18f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                    reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                    reflectiveCurveTo(4.9f, 18f, 6f, 18f)
                    close()
                    moveTo(18.65f, 3f)
                    curveToRelative(-1.66f, 0f, -2.54f, 1.27f, -3.18f, 2.03f)
                    lineToRelative(-3.5f, 4.11f)
                    lineTo(17f, 14.17f)
                    verticalLineToRelative(-7.9f)
                    curveTo(17.58f, 5.59f, 17.97f, 5f, 18.65f, 5f)
                    curveTo(19.42f, 5f, 20f, 5.66f, 20f, 6.48f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(6.48f)
                    curveTo(22f, 4.56f, 20.52f, 3f, 18.65f, 3f)
                    close()
                    moveTo(10.67f, 10.67f)
                    lineTo(2.81f, 2.81f)
                    lineTo(1.39f, 4.22f)
                    lineToRelative(7.97f, 7.97f)
                    lineTo(6.7f, 15.31f)
                    curveToRelative(-0.55f, 0.65f, -0.09f, 1.65f, 0.76f, 1.65f)
                    horizontalLineToRelative(6.66f)
                    lineToRelative(1.17f, 1.17f)
                    curveTo(14.54f, 18.42f, 14f, 19.14f, 14f, 20f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    curveToRelative(0.86f, 0f, 1.58f, -0.54f, 1.87f, -1.3f)
                    lineToRelative(1.91f, 1.91f)
                    lineToRelative(1.41f, -1.41f)
                    lineToRelative(-4.8f, -4.8f)
                    lineTo(10.67f, 10.67f)
                    close()
                    moveTo(13.47f, 5.03f)
                    curveToRelative(0.27f, -0.32f, 0.58f, -0.72f, 0.98f, -1.09f)
                    curveToRelative(-2.46f, -1.19f, -5.32f, -1.22f, -7.81f, -0.13f)
                    lineToRelative(4.25f, 4.25f)
                    lineTo(13.47f, 5.03f)
                    close()
                }
            }
        }.build()
        
        return _No_stroller!!
    }

private var _No_stroller: ImageVector? = null

