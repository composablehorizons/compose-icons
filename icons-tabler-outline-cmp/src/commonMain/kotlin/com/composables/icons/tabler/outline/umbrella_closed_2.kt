package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.UmbrellaClosed2: ImageVector
    get() {
        if (_UmbrellaClosed2 != null) return _UmbrellaClosed2!!
        
        _UmbrellaClosed2 = ImageVector.Builder(
            name = "umbrella-closed-2",
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
                moveTo(6.697f, 12.071f)
                lineToRelative(11.313f, -7.071f)
                lineToRelative(-7.07f, 11.314f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.743f, 14.475f)
                lineToRelative(-2.121f, 2.121f)
                curveToRelative(-1.886f, 1.886f, 0.943f, 4.715f, 2.828f, 2.829f)
            }
        }.build()
        
        return _UmbrellaClosed2!!
    }

private var _UmbrellaClosed2: ImageVector? = null

