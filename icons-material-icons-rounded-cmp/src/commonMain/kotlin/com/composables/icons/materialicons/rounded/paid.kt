package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Paid: ImageVector
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
                    moveTo(12.88f, 17.76f)
                    verticalLineToRelative(0.36f)
                    curveToRelative(0f, 0.48f, -0.39f, 0.88f, -0.88f, 0.88f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.48f, 0f, -0.88f, -0.39f, -0.88f, -0.88f)
                    verticalLineToRelative(-0.42f)
                    curveToRelative(-0.63f, -0.15f, -1.93f, -0.61f, -2.69f, -2.1f)
                    curveToRelative(-0.23f, -0.44f, -0.01f, -0.99f, 0.45f, -1.18f)
                    lineToRelative(0.07f, -0.03f)
                    curveToRelative(0.41f, -0.17f, 0.87f, 0f, 1.08f, 0.39f)
                    curveToRelative(0.32f, 0.61f, 0.95f, 1.37f, 2.12f, 1.37f)
                    curveToRelative(0.93f, 0f, 1.98f, -0.48f, 1.98f, -1.61f)
                    curveToRelative(0f, -0.96f, -0.7f, -1.46f, -2.28f, -2.03f)
                    curveToRelative(-1.1f, -0.39f, -3.35f, -1.03f, -3.35f, -3.31f)
                    curveToRelative(0f, -0.1f, 0.01f, -2.4f, 2.62f, -2.96f)
                    verticalLineTo(5.88f)
                    curveTo(11.12f, 5.39f, 11.52f, 5f, 12f, 5f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.48f, 0f, 0.88f, 0.39f, 0.88f, 0.88f)
                    verticalLineToRelative(0.37f)
                    curveToRelative(1.07f, 0.19f, 1.75f, 0.76f, 2.16f, 1.3f)
                    curveToRelative(0.34f, 0.44f, 0.16f, 1.08f, -0.36f, 1.3f)
                    lineToRelative(0f, 0f)
                    curveTo(14.32f, 9f, 13.9f, 8.88f, 13.66f, 8.57f)
                    curveToRelative(-0.28f, -0.38f, -0.78f, -0.77f, -1.6f, -0.77f)
                    curveToRelative(-0.7f, 0f, -1.81f, 0.37f, -1.81f, 1.39f)
                    curveToRelative(0f, 0.95f, 0.86f, 1.31f, 2.64f, 1.9f)
                    curveToRelative(2.4f, 0.83f, 3.01f, 2.05f, 3.01f, 3.45f)
                    curveTo(15.9f, 17.17f, 13.4f, 17.67f, 12.88f, 17.76f)
                    close()
                }
            }
        }.build()
        
        return _Paid!!
    }

private var _Paid: ImageVector? = null

