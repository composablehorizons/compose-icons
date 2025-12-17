package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CornerUpLeft: ImageVector
    get() {
        if (_CornerUpLeft != null) return _CornerUpLeft!!
        
        _CornerUpLeft = ImageVector.Builder(
            name = "corner-up-left",
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
                moveTo(18f, 18f)
                verticalLineToRelative(-6f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                horizontalLineToRelative(-10f)
                lineToRelative(4f, -4f)
                moveToRelative(0f, 8f)
                lineToRelative(-4f, -4f)
            }
        }.build()
        
        return _CornerUpLeft!!
    }

private var _CornerUpLeft: ImageVector? = null

