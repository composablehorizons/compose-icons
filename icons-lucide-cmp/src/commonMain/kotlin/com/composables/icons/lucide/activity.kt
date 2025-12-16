package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Activity: ImageVector
    get() {
        if (_Activity != null) return _Activity!!
        
        _Activity = ImageVector.Builder(
            name = "activity",
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
                moveTo(22f, 12f)
                horizontalLineToRelative(-2.48f)
                arcToRelative(2f, 2f, 0f, false, false, -1.93f, 1.46f)
                lineToRelative(-2.35f, 8.36f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.48f, 0f)
                lineTo(9.24f, 2.18f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.48f, 0f)
                lineToRelative(-2.35f, 8.36f)
                arcTo(2f, 2f, 0f, false, true, 4.49f, 12f)
                horizontalLineTo(2f)
            }
        }.build()
        
        return _Activity!!
    }

private var _Activity: ImageVector? = null

