package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.PanoramaVertical: ImageVector
    get() {
        if (_PanoramaVertical != null) return _PanoramaVertical!!
        
        _PanoramaVertical = ImageVector.Builder(
            name = "panorama-vertical",
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
                moveTo(18.463f, 4.338f)
                curveToRelative(-1.932f, 5.106f, -1.932f, 10.211f, 0f, 15.317f)
                arcToRelative(1f, 1f, 0f, false, true, -0.934f, 1.345f)
                horizontalLineToRelative(-11f)
                curveToRelative(-0.692f, 0f, -1.208f, -0.692f, -0.962f, -1.34f)
                curveToRelative(1.932f, -5.107f, 1.932f, -10.214f, 0f, -15.321f)
                curveToRelative(-0.246f, -0.648f, 0.243f, -1.339f, 0.935f, -1.339f)
                horizontalLineToRelative(11.028f)
                curveToRelative(0.693f, 0f, 1.18f, 0.691f, 0.935f, 1.338f)
                close()
            }
        }.build()
        
        return _PanoramaVertical!!
    }

private var _PanoramaVertical: ImageVector? = null

