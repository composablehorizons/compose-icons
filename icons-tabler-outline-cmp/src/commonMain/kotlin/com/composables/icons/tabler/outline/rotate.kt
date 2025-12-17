package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Rotate: ImageVector
    get() {
        if (_Rotate != null) return _Rotate!!
        
        _Rotate = ImageVector.Builder(
            name = "rotate",
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
                moveTo(19.95f, 11f)
                arcToRelative(8f, 8f, 0f, true, false, -0.5f, 4f)
                moveToRelative(0.5f, 5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-5f)
            }
        }.build()
        
        return _Rotate!!
    }

private var _Rotate: ImageVector? = null

