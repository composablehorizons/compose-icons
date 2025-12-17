package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ArrowBadgeUp: ImageVector
    get() {
        if (_ArrowBadgeUp != null) return _ArrowBadgeUp!!
        
        _ArrowBadgeUp = ImageVector.Builder(
            name = "arrow-badge-up",
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
                moveTo(17f, 11f)
                verticalLineToRelative(6f)
                lineToRelative(-5f, -4f)
                lineToRelative(-5f, 4f)
                verticalLineToRelative(-6f)
                lineToRelative(5f, -4f)
                close()
            }
        }.build()
        
        return _ArrowBadgeUp!!
    }

private var _ArrowBadgeUp: ImageVector? = null

