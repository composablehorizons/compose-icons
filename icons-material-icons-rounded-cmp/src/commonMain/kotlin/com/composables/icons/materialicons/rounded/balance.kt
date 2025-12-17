package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Balance: ImageVector
    get() {
        if (_Balance != null) return _Balance!!
        
        _Balance = ImageVector.Builder(
            name = "balance",
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
                    moveTo(13f, 19f)
                    verticalLineTo(7.83f)
                    curveToRelative(0.85f, -0.3f, 1.53f, -0.98f, 1.83f, -1.83f)
                    horizontalLineTo(18f)
                    lineToRelative(-2.78f, 6.49f)
                    curveToRelative(-0.17f, 0.39f, -0.23f, 0.84f, -0.11f, 1.25f)
                    curveToRelative(0.39f, 1.3f, 1.76f, 2.26f, 3.39f, 2.26f)
                    reflectiveCurveToRelative(3.01f, -0.96f, 3.39f, -2.26f)
                    curveToRelative(0.12f, -0.41f, 0.06f, -0.86f, -0.11f, -1.25f)
                    lineTo(19f, 6f)
                    horizontalLineToRelative(1f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-5.17f)
                    curveTo(14.42f, 2.83f, 13.31f, 2f, 12f, 2f)
                    reflectiveCurveTo(9.58f, 2.83f, 9.17f, 4f)
                    lineTo(4f, 4f)
                    curveTo(3.45f, 4f, 3f, 4.45f, 3f, 5f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(1f)
                    lineToRelative(-2.78f, 6.49f)
                    curveToRelative(-0.17f, 0.39f, -0.23f, 0.84f, -0.11f, 1.25f)
                    curveTo(2.49f, 15.04f, 3.87f, 16f, 5.5f, 16f)
                    reflectiveCurveToRelative(3.01f, -0.96f, 3.39f, -2.26f)
                    curveToRelative(0.12f, -0.41f, 0.06f, -0.86f, -0.11f, -1.25f)
                    lineTo(6f, 6f)
                    horizontalLineToRelative(3.17f)
                    curveToRelative(0.3f, 0.85f, 0.98f, 1.53f, 1.83f, 1.83f)
                    verticalLineTo(19f)
                    moveTo(11f, 19f)
                    horizontalLineTo(3f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(18f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-8f)
                    moveTo(20.37f, 13f)
                    horizontalLineToRelative(-3.74f)
                    lineToRelative(1.87f, -4.36f)
                    lineTo(20.37f, 13f)
                    close()
                    moveTo(7.37f, 13f)
                    horizontalLineTo(3.63f)
                    lineTo(5.5f, 8.64f)
                    lineTo(7.37f, 13f)
                    close()
                    moveTo(12f, 6f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    curveTo(13f, 5.55f, 12.55f, 6f, 12f, 6f)
                    close()
                }
            }
        }.build()
        
        return _Balance!!
    }

private var _Balance: ImageVector? = null

