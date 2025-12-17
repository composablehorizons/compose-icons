package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Atom: ImageVector
    get() {
        if (_Atom != null) return _Atom!!
        
        _Atom = ImageVector.Builder(
            name = "atom",
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
                moveTo(12f, 12f)
                verticalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.071f, 4.929f)
                curveToRelative(-1.562f, -1.562f, -6f, 0.337f, -9.9f, 4.243f)
                curveToRelative(-3.905f, 3.905f, -5.804f, 8.337f, -4.242f, 9.9f)
                curveToRelative(1.562f, 1.561f, 6f, -0.338f, 9.9f, -4.244f)
                curveToRelative(3.905f, -3.905f, 5.804f, -8.337f, 4.242f, -9.9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.929f, 4.929f)
                curveToRelative(-1.562f, 1.562f, 0.337f, 6f, 4.243f, 9.9f)
                curveToRelative(3.905f, 3.905f, 8.337f, 5.804f, 9.9f, 4.242f)
                curveToRelative(1.561f, -1.562f, -0.338f, -6f, -4.244f, -9.9f)
                curveToRelative(-3.905f, -3.905f, -8.337f, -5.804f, -9.9f, -4.242f)
            }
        }.build()
        
        return _Atom!!
    }

private var _Atom: ImageVector? = null

