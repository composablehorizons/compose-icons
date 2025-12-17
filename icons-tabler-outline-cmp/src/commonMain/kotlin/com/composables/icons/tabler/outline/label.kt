package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Label: ImageVector
    get() {
        if (_Label != null) return _Label!!
        
        _Label = ImageVector.Builder(
            name = "label",
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
                moveTo(16.52f, 7f)
                horizontalLineToRelative(-10.52f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(10.52f)
                arcToRelative(1f, 1f, 0f, false, false, 0.78f, -0.375f)
                lineToRelative(3.7f, -4.625f)
                lineToRelative(-3.7f, -4.625f)
                arcToRelative(1f, 1f, 0f, false, false, -0.78f, -0.375f)
            }
        }.build()
        
        return _Label!!
    }

private var _Label: ImageVector? = null

