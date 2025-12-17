package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Cone2: ImageVector
    get() {
        if (_Cone2 != null) return _Cone2!!
        
        _Cone2 = ImageVector.Builder(
            name = "cone-2",
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
                moveTo(21f, 5.002f)
                verticalLineToRelative(0.5f)
                lineToRelative(-8.13f, 14.99f)
                arcToRelative(1f, 1f, 0f, false, true, -1.74f, 0f)
                lineToRelative(-8.13f, -14.989f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.659f, 4.03f, -3.003f, 9f, -3.003f)
                reflectiveCurveToRelative(9f, 1.344f, 9f, 3.002f)
            }
        }.build()
        
        return _Cone2!!
    }

private var _Cone2: ImageVector? = null

