package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.View360Arrow: ImageVector
    get() {
        if (_View360Arrow != null) return _View360Arrow!!
        
        _View360Arrow = ImageVector.Builder(
            name = "view-360-arrow",
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
                moveTo(17f, 15.328f)
                curveToRelative(2.414f, -0.718f, 4f, -1.94f, 4f, -3.328f)
                curveToRelative(0f, -2.21f, -4.03f, -4f, -9f, -4f)
                reflectiveCurveToRelative(-9f, 1.79f, -9f, 4f)
                reflectiveCurveToRelative(4.03f, 4f, 9f, 4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 13f)
                lineToRelative(3f, 3f)
                lineToRelative(-3f, 3f)
            }
        }.build()
        
        return _View360Arrow!!
    }

private var _View360Arrow: ImageVector? = null

