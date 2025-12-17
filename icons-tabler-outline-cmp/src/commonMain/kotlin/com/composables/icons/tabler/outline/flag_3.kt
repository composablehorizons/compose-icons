package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Flag3: ImageVector
    get() {
        if (_Flag3 != null) return _Flag3!!
        
        _Flag3 = ImageVector.Builder(
            name = "flag-3",
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
                moveTo(5f, 14f)
                horizontalLineToRelative(14f)
                lineToRelative(-4.5f, -4.5f)
                lineToRelative(4.5f, -4.5f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(16f)
            }
        }.build()
        
        return _Flag3!!
    }

private var _Flag3: ImageVector? = null

