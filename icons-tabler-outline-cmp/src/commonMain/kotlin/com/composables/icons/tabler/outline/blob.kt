package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Blob: ImageVector
    get() {
        if (_Blob != null) return _Blob!!
        
        _Blob = ImageVector.Builder(
            name = "blob",
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
                moveTo(5.897f, 20.188f)
                curveToRelative(1.67f, 0.752f, 3.896f, 0.812f, 6.103f, 0.812f)
                reflectiveCurveToRelative(4.434f, -0.059f, 6.104f, -0.812f)
                curveToRelative(0.868f, -0.392f, 1.614f, -0.982f, 2.133f, -1.856f)
                curveToRelative(0.514f, -0.865f, 0.763f, -1.94f, 0.763f, -3.234f)
                curveToRelative(0f, -2.577f, -0.983f, -5.315f, -2.557f, -7.416f)
                curveToRelative(-1.57f, -2.094f, -3.833f, -3.682f, -6.443f, -3.682f)
                reflectiveCurveToRelative(-4.873f, 1.588f, -6.443f, 3.682f)
                curveToRelative(-1.574f, 2.101f, -2.557f, 4.84f, -2.557f, 7.416f)
                curveToRelative(0f, 1.295f, 0.249f, 2.369f, 0.763f, 3.234f)
                curveToRelative(0.519f, 0.874f, 1.265f, 1.464f, 2.134f, 1.856f)
            }
        }.build()
        
        return _Blob!!
    }

private var _Blob: ImageVector? = null

