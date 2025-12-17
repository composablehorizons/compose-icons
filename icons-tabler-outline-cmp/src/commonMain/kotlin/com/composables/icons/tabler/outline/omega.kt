package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Omega: ImageVector
    get() {
        if (_Omega != null) return _Omega!!
        
        _Omega = ImageVector.Builder(
            name = "omega",
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
                moveTo(4f, 19f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-1f)
                arcToRelative(7.35f, 7.35f, 0f, true, true, 6f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5f)
            }
        }.build()
        
        return _Omega!!
    }

private var _Omega: ImageVector? = null

