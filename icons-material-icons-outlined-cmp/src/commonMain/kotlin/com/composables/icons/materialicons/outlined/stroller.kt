package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Stroller: ImageVector
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
                    moveTo(15f, 8.66f)
                    lineTo(9.6f, 15f)
                    horizontalLineTo(15f)
                    verticalLineTo(8.66f)
                    moveTo(18.65f, 3f)
                    curveTo(20.52f, 3f, 22f, 4.56f, 22f, 6.48f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(6.48f)
                    curveTo(20f, 5.66f, 19.42f, 5f, 18.65f, 5f)
                    curveTo(17.97f, 5f, 17.58f, 5.59f, 17f, 6.27f)
                    verticalLineTo(15f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    horizontalLineTo(7.43f)
                    curveToRelative(-0.85f, 0f, -1.31f, -1f, -0.76f, -1.65f)
                    lineToRelative(8.8f, -10.32f)
                    curveTo(16.11f, 4.27f, 16.99f, 3f, 18.65f, 3f)
                    lineTo(18.65f, 3f)
                    close()
                    moveTo(10f, 5f)
                    curveTo(9.35f, 5f, 8.71f, 5.09f, 8.09f, 5.27f)
                    lineToRelative(1.4f, 1.4f)
                    lineToRelative(1.37f, -1.61f)
                    curveTo(10.58f, 5.02f, 10.29f, 5f, 10f, 5f)
                    moveTo(10f, 3f)
                    curveToRelative(1.56f, 0f, 3.03f, 0.4f, 4.3f, 1.1f)
                    lineToRelative(-4.7f, 5.51f)
                    lineTo(4.72f, 4.72f)
                    curveTo(6.21f, 3.64f, 8.03f, 3f, 10f, 3f)
                    lineTo(10f, 3f)
                    close()
                }
            }
        }.build()
        
        return _Stroller!!
    }

private var _Stroller: ImageVector? = null

