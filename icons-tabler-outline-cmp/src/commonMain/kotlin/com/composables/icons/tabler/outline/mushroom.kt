package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Mushroom: ImageVector
    get() {
        if (_Mushroom != null) return _Mushroom!!
        
        _Mushroom = ImageVector.Builder(
            name = "mushroom",
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
                moveTo(20f, 11.1f)
                curveToRelative(0f, -4.474f, -3.582f, -8.1f, -8f, -8.1f)
                reflectiveCurveToRelative(-8f, 3.626f, -8f, 8.1f)
                arcToRelative(0.9f, 0.9f, 0f, false, false, 0.9f, 0.9f)
                horizontalLineToRelative(14.2f)
                arcToRelative(0.9f, 0.9f, 0f, false, false, 0.9f, -0.9f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 12f)
                verticalLineToRelative(7f)
                arcToRelative(2f, 2f, 0f, true, false, 4f, 0f)
                verticalLineToRelative(-7f)
            }
        }.build()
        
        return _Mushroom!!
    }

private var _Mushroom: ImageVector? = null

