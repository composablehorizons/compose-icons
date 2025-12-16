package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Bell: ImageVector
    get() {
        if (_Bell != null) return _Bell!!
        
        _Bell = ImageVector.Builder(
            name = "bell",
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
                moveTo(18f, 8f)
                arcTo(6f, 6f, 0f, false, false, 6f, 8f)
                curveToRelative(0f, 7f, -3f, 9f, -3f, 9f)
                horizontalLineToRelative(18f)
                reflectiveCurveToRelative(-3f, -2f, -3f, -9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.73f, 21f)
                arcToRelative(2f, 2f, 0f, false, true, -3.46f, 0f)
            }
        }.build()
        
        return _Bell!!
    }

private var _Bell: ImageVector? = null

