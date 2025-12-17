package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Pepper: ImageVector
    get() {
        if (_Pepper != null) return _Pepper!!
        
        _Pepper = ImageVector.Builder(
            name = "pepper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 11f)
                curveToRelative(0f, 2.21f, -2.239f, 4f, -5f, 4f)
                reflectiveCurveToRelative(-5f, -1.79f, -5f, -4f)
                arcToRelative(8f, 8f, 0f, true, false, 16f, 0f)
                arcToRelative(3f, 3f, 0f, false, false, -6f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 8f)
                curveToRelative(0f, -2f, 2f, -4f, 4f, -4f)
            }
        }.build()
        
        return _Pepper!!
    }

private var _Pepper: ImageVector? = null

