package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Triangles: ImageVector
    get() {
        if (_Triangles != null) return _Triangles!!
        
        _Triangles = ImageVector.Builder(
            name = "triangles",
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
                moveTo(9.974f, 21f)
                horizontalLineToRelative(8.052f)
                arcToRelative(0.975f, 0.975f, 0f, false, false, 0.81f, -1.517f)
                lineToRelative(-4.025f, -6.048f)
                arcToRelative(0.973f, 0.973f, 0f, false, false, -1.622f, 0f)
                lineToRelative(-4.025f, 6.048f)
                arcToRelative(0.977f, 0.977f, 0f, false, false, 0.81f, 1.517f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.98f, 16f)
                horizontalLineToRelative(14.04f)
                curveToRelative(0.542f, 0f, 0.98f, -0.443f, 0.98f, -0.989f)
                arcToRelative(1f, 1f, 0f, false, false, -0.156f, -0.534f)
                lineToRelative(-7.02f, -11.023f)
                arcToRelative(0.974f, 0.974f, 0f, false, false, -1.648f, 0f)
                lineToRelative(-7.02f, 11.023f)
                arcToRelative(1f, 1f, 0f, false, false, 0.294f, 1.366f)
                arcToRelative(0.973f, 0.973f, 0f, false, false, 0.53f, 0.157f)
                close()
            }
        }.build()
        
        return _Triangles!!
    }

private var _Triangles: ImageVector? = null

