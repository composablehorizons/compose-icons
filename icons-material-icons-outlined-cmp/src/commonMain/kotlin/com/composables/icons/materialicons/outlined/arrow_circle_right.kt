package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Arrow_circle_right: ImageVector
    get() {
        if (_Arrow_circle_right != null) return _Arrow_circle_right!!
        
        _Arrow_circle_right = ImageVector.Builder(
            name = "arrow_circle_right",
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
                    moveTo(22f, 12f)
                    curveToRelative(0f, -5.52f, -4.48f, -10f, -10f, -10f)
                    curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                    reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                    curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                    close()
                    moveTo(4f, 12f)
                    curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                    curveToRelative(4.42f, 0f, 8f, 3.58f, 8f, 8f)
                    reflectiveCurveToRelative(-3.58f, 8f, -8f, 8f)
                    curveTo(7.58f, 20f, 4f, 16.42f, 4f, 12f)
                    close()
                    moveTo(16f, 12f)
                    lineToRelative(-4f, 4f)
                    lineToRelative(-1.41f, -1.41f)
                    lineTo(12.17f, 13f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(4.17f)
                    lineToRelative(-1.59f, -1.59f)
                    lineTo(12f, 8f)
                    lineTo(16f, 12f)
                    close()
                }
            }
        }.build()
        
        return _Arrow_circle_right!!
    }

private var _Arrow_circle_right: ImageVector? = null

