package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Exposure0: ImageVector
    get() {
        if (_Exposure0 != null) return _Exposure0!!
        
        _Exposure0 = ImageVector.Builder(
            name = "exposure-0",
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
                moveTo(12f, 19f)
                arcToRelative(4f, 4f, 0f, false, false, 4f, -4f)
                verticalLineToRelative(-6f)
                arcToRelative(4f, 4f, 0f, true, false, -8f, 0f)
                verticalLineToRelative(6f)
                arcToRelative(4f, 4f, 0f, false, false, 4f, 4f)
                close()
            }
        }.build()
        
        return _Exposure0!!
    }

private var _Exposure0: ImageVector? = null

