package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Credit_score: ImageVector
    get() {
        if (_Credit_score != null) return _Credit_score!!
        
        _Credit_score = ImageVector.Builder(
            name = "credit_score",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(20f, 4f)
                    horizontalLineTo(4f)
                    curveTo(2.89f, 4f, 2.01f, 4.89f, 2.01f, 6f)
                    lineTo(2f, 18f)
                    curveToRelative(0f, 1.11f, 0.89f, 2f, 2f, 2f)
                    horizontalLineToRelative(5f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(-6f)
                    horizontalLineToRelative(18f)
                    verticalLineTo(6f)
                    curveTo(22f, 4.89f, 21.11f, 4f, 20f, 4f)
                    close()
                    moveTo(20f, 8f)
                    horizontalLineTo(4f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(8f)
                    close()
                    moveTo(14.93f, 19.17f)
                    lineToRelative(-2.83f, -2.83f)
                    lineToRelative(-1.41f, 1.41f)
                    lineTo(14.93f, 22f)
                    lineTo(22f, 14.93f)
                    lineToRelative(-1.41f, -1.41f)
                    lineTo(14.93f, 19.17f)
                    close()
                }
            }
        }.build()
        
        return _Credit_score!!
    }

private var _Credit_score: ImageVector? = null

