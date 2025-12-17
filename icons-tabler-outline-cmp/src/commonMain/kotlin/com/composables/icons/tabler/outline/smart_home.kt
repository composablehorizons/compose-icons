package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.SmartHome: ImageVector
    get() {
        if (_SmartHome != null) return _SmartHome!!
        
        _SmartHome = ImageVector.Builder(
            name = "smart-home",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 8.71f)
                lineToRelative(-5.333f, -4.148f)
                arcToRelative(2.666f, 2.666f, 0f, false, false, -3.274f, 0f)
                lineToRelative(-5.334f, 4.148f)
                arcToRelative(2.665f, 2.665f, 0f, false, false, -1.029f, 2.105f)
                verticalLineToRelative(7.2f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-7.2f)
                curveToRelative(0f, -0.823f, -0.38f, -1.6f, -1.03f, -2.105f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 15f)
                curveToRelative(-2.21f, 1.333f, -5.792f, 1.333f, -8f, 0f)
            }
        }.build()
        
        return _SmartHome!!
    }

private var _SmartHome: ImageVector? = null

