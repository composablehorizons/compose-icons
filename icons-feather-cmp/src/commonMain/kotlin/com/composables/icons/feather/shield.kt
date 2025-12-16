package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Shield: ImageVector
    get() {
        if (_Shield != null) return _Shield!!
        
        _Shield = ImageVector.Builder(
            name = "shield",
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
                moveTo(12f, 22f)
                reflectiveCurveToRelative(8f, -4f, 8f, -10f)
                verticalLineTo(5f)
                lineToRelative(-8f, -3f)
                lineToRelative(-8f, 3f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 6f, 8f, 10f, 8f, 10f)
                close()
            }
        }.build()
        
        return _Shield!!
    }

private var _Shield: ImageVector? = null

