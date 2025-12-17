package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.TrianglePlus2: ImageVector
    get() {
        if (_TrianglePlus2 != null) return _TrianglePlus2!!
        
        _TrianglePlus2 = ImageVector.Builder(
            name = "triangle-plus-2",
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
                moveTo(18.69f, 12.027f)
                lineToRelative(-5.054f, -8.437f)
                arcToRelative(1.914f, 1.914f, 0f, false, false, -3.274f, 0f)
                lineToRelative(-8.105f, 13.535f)
                arcToRelative(1.914f, 1.914f, 0f, false, false, 1.636f, 2.871f)
                horizontalLineToRelative(8.107f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 19f)
                horizontalLineToRelative(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 16f)
                verticalLineToRelative(6f)
            }
        }.build()
        
        return _TrianglePlus2!!
    }

private var _TrianglePlus2: ImageVector? = null

