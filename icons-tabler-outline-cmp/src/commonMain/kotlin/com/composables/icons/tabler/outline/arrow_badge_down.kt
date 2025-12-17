package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ArrowBadgeDown: ImageVector
    get() {
        if (_ArrowBadgeDown != null) return _ArrowBadgeDown!!
        
        _ArrowBadgeDown = ImageVector.Builder(
            name = "arrow-badge-down",
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
                moveTo(17f, 13f)
                verticalLineToRelative(-6f)
                lineToRelative(-5f, 4f)
                lineToRelative(-5f, -4f)
                verticalLineToRelative(6f)
                lineToRelative(5f, 4f)
                close()
            }
        }.build()
        
        return _ArrowBadgeDown!!
    }

private var _ArrowBadgeDown: ImageVector? = null

