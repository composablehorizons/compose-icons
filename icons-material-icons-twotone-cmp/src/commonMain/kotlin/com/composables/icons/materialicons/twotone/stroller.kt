package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Stroller: ImageVector
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
                    moveTo(10f, 5f)
                    curveToRelative(0.29f, 0f, 0.58f, 0.02f, 0.86f, 0.05f)
                    lineTo(9.49f, 6.66f)
                    lineToRelative(-1.4f, -1.4f)
                    curveTo(8.71f, 5.09f, 9.35f, 5f, 10f, 5f)
                    moveTo(15f, 8.66f)
                    verticalLineTo(15f)
                    horizontalLineTo(9.6f)
                    lineTo(15f, 8.66f)
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(10f, 5f)
                    curveToRelative(0.29f, 0f, 0.58f, 0.02f, 0.86f, 0.05f)
                    lineTo(9.49f, 6.66f)
                    lineToRelative(-1.4f, -1.4f)
                    curveTo(8.71f, 5.09f, 9.35f, 5f, 10f, 5f)
                    moveTo(15f, 8.66f)
                    verticalLineTo(15f)
                    horizontalLineTo(9.6f)
                    lineTo(15f, 8.66f)
                    moveTo(18.65f, 3f)
                    curveToRelative(-1.66f, 0f, -2.54f, 1.27f, -3.18f, 2.03f)
                    lineToRelative(-8.8f, 10.32f)
                    curveTo(6.12f, 16f, 6.58f, 17f, 7.43f, 17f)
                    horizontalLineTo(15f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(6.27f)
                    curveTo(17.58f, 5.59f, 17.97f, 5f, 18.65f, 5f)
                    curveTo(19.42f, 5f, 20f, 5.66f, 20f, 6.48f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(6.48f)
                    curveTo(22f, 4.56f, 20.52f, 3f, 18.65f, 3f)
                    lineTo(18.65f, 3f)
                    close()
                    moveTo(10f, 3f)
                    curveTo(8.03f, 3f, 6.21f, 3.64f, 4.72f, 4.72f)
                    lineToRelative(4.89f, 4.89f)
                    lineToRelative(4.7f, -5.51f)
                    curveTo(13.03f, 3.4f, 11.56f, 3f, 10f, 3f)
                    lineTo(10f, 3f)
                    close()
                    moveTo(16f, 18f)
                    curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                    reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                    reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                    reflectiveCurveTo(17.1f, 18f, 16f, 18f)
                    lineTo(16f, 18f)
                    close()
                    moveTo(6f, 18f)
                    curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                    reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                    reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                    reflectiveCurveTo(7.1f, 18f, 6f, 18f)
                    lineTo(6f, 18f)
                    close()
                }
            }
        }.build()
        
        return _Stroller!!
    }

private var _Stroller: ImageVector? = null

