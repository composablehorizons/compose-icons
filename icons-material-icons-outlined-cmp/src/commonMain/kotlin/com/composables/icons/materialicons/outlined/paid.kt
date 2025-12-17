package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Paid: ImageVector
    get() {
        if (_Paid != null) return _Paid!!
        
        _Paid = ImageVector.Builder(
            name = "paid",
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
                    moveTo(12f, 2f)
                    curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                    reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                    reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                    reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                    close()
                    moveTo(12f, 20f)
                    curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                    curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                    reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                    curveTo(20f, 16.41f, 16.41f, 20f, 12f, 20f)
                    close()
                    moveTo(12.89f, 11.1f)
                    curveToRelative(-1.78f, -0.59f, -2.64f, -0.96f, -2.64f, -1.9f)
                    curveToRelative(0f, -1.02f, 1.11f, -1.39f, 1.81f, -1.39f)
                    curveToRelative(1.31f, 0f, 1.79f, 0.99f, 1.9f, 1.34f)
                    lineToRelative(1.58f, -0.67f)
                    curveToRelative(-0.15f, -0.44f, -0.82f, -1.91f, -2.66f, -2.23f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(-1.75f)
                    verticalLineToRelative(1.26f)
                    curveToRelative(-2.6f, 0.56f, -2.62f, 2.85f, -2.62f, 2.96f)
                    curveToRelative(0f, 2.27f, 2.25f, 2.91f, 3.35f, 3.31f)
                    curveToRelative(1.58f, 0.56f, 2.28f, 1.07f, 2.28f, 2.03f)
                    curveToRelative(0f, 1.13f, -1.05f, 1.61f, -1.98f, 1.61f)
                    curveToRelative(-1.82f, 0f, -2.34f, -1.87f, -2.4f, -2.09f)
                    lineTo(8.1f, 14.75f)
                    curveToRelative(0.63f, 2.19f, 2.28f, 2.78f, 3.02f, 2.96f)
                    verticalLineTo(19f)
                    horizontalLineToRelative(1.75f)
                    verticalLineToRelative(-1.24f)
                    curveToRelative(0.52f, -0.09f, 3.02f, -0.59f, 3.02f, -3.22f)
                    curveTo(15.9f, 13.15f, 15.29f, 11.93f, 12.89f, 11.1f)
                    close()
                }
            }
        }.build()
        
        return _Paid!!
    }

private var _Paid: ImageVector? = null

