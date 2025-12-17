package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.WaveSine: ImageVector
    get() {
        if (_WaveSine != null) return _WaveSine!!
        
        _WaveSine = ImageVector.Builder(
            name = "wave-sine",
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
                moveTo(21f, 12f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.894f, 0f, -1.662f, -0.857f, -1.761f, -2f)
                curveToRelative(-0.296f, -3.45f, -0.749f, -6f, -2.749f, -6f)
                reflectiveCurveToRelative(-2.5f, 3.582f, -2.5f, 8f)
                reflectiveCurveToRelative(-0.5f, 8f, -2.5f, 8f)
                reflectiveCurveToRelative(-2.452f, -2.547f, -2.749f, -6f)
                curveToRelative(-0.1f, -1.147f, -0.867f, -2f, -1.763f, -2f)
                horizontalLineToRelative(-2f)
            }
        }.build()
        
        return _WaveSine!!
    }

private var _WaveSine: ImageVector? = null

