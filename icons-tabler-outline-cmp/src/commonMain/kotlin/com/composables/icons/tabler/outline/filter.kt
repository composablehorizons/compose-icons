package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Filter: ImageVector
    get() {
        if (_Filter != null) return _Filter!!
        
        _Filter = ImageVector.Builder(
            name = "filter",
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
                moveTo(4f, 4f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2.172f)
                arcToRelative(2f, 2f, 0f, false, true, -0.586f, 1.414f)
                lineToRelative(-4.414f, 4.414f)
                verticalLineToRelative(7f)
                lineToRelative(-6f, 2f)
                verticalLineToRelative(-8.5f)
                lineToRelative(-4.48f, -4.928f)
                arcToRelative(2f, 2f, 0f, false, true, -0.52f, -1.345f)
                verticalLineToRelative(-2.227f)
                close()
            }
        }.build()
        
        return _Filter!!
    }

private var _Filter: ImageVector? = null

