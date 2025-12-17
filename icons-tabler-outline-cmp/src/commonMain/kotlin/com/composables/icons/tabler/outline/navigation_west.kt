package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.NavigationWest: ImageVector
    get() {
        if (_NavigationWest != null) return _NavigationWest!!
        
        _NavigationWest = ImageVector.Builder(
            name = "navigation-west",
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
                moveTo(9f, 3f)
                lineToRelative(1f, 6f)
                lineToRelative(2f, -3.75f)
                lineToRelative(2f, 3.75f)
                lineToRelative(1f, -6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 21f)
                lineToRelative(-4f, -8f)
                lineToRelative(-4f, 8f)
                lineToRelative(4f, -2f)
                close()
            }
        }.build()
        
        return _NavigationWest!!
    }

private var _NavigationWest: ImageVector? = null

