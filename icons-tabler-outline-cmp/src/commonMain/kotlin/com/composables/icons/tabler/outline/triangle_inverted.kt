package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.TriangleInverted: ImageVector
    get() {
        if (_TriangleInverted != null) return _TriangleInverted!!
        
        _TriangleInverted = ImageVector.Builder(
            name = "triangle-inverted",
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
                moveTo(10.363f, 20.405f)
                lineToRelative(-8.106f, -13.534f)
                arcToRelative(1.914f, 1.914f, 0f, false, true, 1.636f, -2.871f)
                horizontalLineToRelative(16.214f)
                arcToRelative(1.914f, 1.914f, 0f, false, true, 1.636f, 2.871f)
                lineToRelative(-8.106f, 13.534f)
                arcToRelative(1.914f, 1.914f, 0f, false, true, -3.274f, 0f)
                close()
            }
        }.build()
        
        return _TriangleInverted!!
    }

private var _TriangleInverted: ImageVector? = null

