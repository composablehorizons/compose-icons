package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Flag2: ImageVector
    get() {
        if (_Flag2 != null) return _Flag2!!
        
        _Flag2 = ImageVector.Builder(
            name = "flag-2",
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
                moveTo(5f, 14f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(16f)
            }
        }.build()
        
        return _Flag2!!
    }

private var _Flag2: ImageVector? = null

