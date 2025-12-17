package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Balance: ImageVector
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
                    moveTo(13f, 5f)
                    arcTo(1f, 1f, 0f, false, true, 12f, 6f)
                    arcTo(1f, 1f, 0f, false, true, 11f, 5f)
                    arcTo(1f, 1f, 0f, false, true, 13f, 5f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(13f, 7.83f)
                    curveToRelative(0.85f, -0.3f, 1.53f, -0.98f, 1.83f, -1.83f)
                    horizontalLineTo(18f)
                    lineToRelative(-3f, 7f)
                    curveToRelative(0f, 1.66f, 1.57f, 3f, 3.5f, 3f)
                    reflectiveCurveToRelative(3.5f, -1.34f, 3.5f, -3f)
                    lineToRelative(-3f, -7f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(-6.17f)
                    curveTo(14.42f, 2.83f, 13.31f, 2f, 12f, 2f)
                    reflectiveCurveTo(9.58f, 2.83f, 9.17f, 4f)
                    lineTo(3f, 4f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    lineToRelative(-3f, 7f)
                    curveToRelative(0f, 1.66f, 1.57f, 3f, 3.5f, 3f)
                    reflectiveCurveTo(9f, 14.66f, 9f, 13f)
                    lineTo(6f, 6f)
                    horizontalLineToRelative(3.17f)
                    curveToRelative(0.3f, 0.85f, 0.98f, 1.53f, 1.83f, 1.83f)
                    verticalLineTo(19f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(20f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-9f)
                    verticalLineTo(7.83f)
                    close()
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

