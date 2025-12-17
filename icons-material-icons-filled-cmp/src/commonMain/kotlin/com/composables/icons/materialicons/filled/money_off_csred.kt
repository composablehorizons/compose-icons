package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Money_off_csred: ImageVector
    get() {
        if (_Money_off_csred != null) return _Money_off_csred!!
        
        _Money_off_csred = ImageVector.Builder(
            name = "money_off_csred",
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
                    moveTo(10.53f, 7.43f)
                    curveToRelative(0.42f, -0.31f, 0.93f, -0.47f, 1.54f, -0.47f)
                    reflectiveCurveToRelative(1.11f, 0.16f, 1.5f, 0.49f)
                    curveToRelative(0.39f, 0.32f, 0.65f, 0.7f, 0.79f, 1.12f)
                    lineToRelative(1.89f, -0.8f)
                    curveToRelative(-0.24f, -0.71f, -0.71f, -1.35f, -1.4f, -1.92f)
                    curveToRelative(-0.5f, -0.4f, -1.12f, -0.65f, -1.85f, -0.77f)
                    verticalLineTo(3f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2.11f)
                    curveToRelative(-0.41f, 0.08f, -0.79f, 0.21f, -1.14f, 0.39f)
                    curveToRelative(-0.35f, 0.18f, -0.64f, 0.39f, -0.9f, 0.63f)
                    lineToRelative(1.43f, 1.43f)
                    curveTo(10.43f, 7.52f, 10.48f, 7.47f, 10.53f, 7.43f)
                    close()
                    moveTo(2.81f, 2.81f)
                    lineTo(1.39f, 4.22f)
                    lineToRelative(12.35f, 12.35f)
                    curveTo(13.31f, 16.85f, 12.79f, 17f, 12.19f, 17f)
                    curveToRelative(-0.71f, 0f, -1.32f, -0.23f, -1.83f, -0.7f)
                    curveToRelative(-0.5f, -0.47f, -0.86f, -1.07f, -1.06f, -1.81f)
                    lineToRelative(-1.98f, 0.8f)
                    curveToRelative(0.34f, 1.17f, 0.95f, 2.08f, 1.83f, 2.73f)
                    curveToRelative(0.57f, 0.42f, 1.19f, 0.68f, 1.85f, 0.83f)
                    verticalLineTo(21f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-2.08f)
                    curveToRelative(0.44f, -0.07f, 0.87f, -0.17f, 1.29f, -0.35f)
                    curveToRelative(0.34f, -0.14f, 0.64f, -0.32f, 0.92f, -0.53f)
                    lineToRelative(4.57f, 4.57f)
                    lineToRelative(1.41f, -1.41f)
                    lineTo(2.81f, 2.81f)
                    close()
                }
            }
        }.build()
        
        return _Money_off_csred!!
    }

private var _Money_off_csred: ImageVector? = null

