package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CornerRightUp: ImageVector
    get() {
        if (_CornerRightUp != null) return _CornerRightUp!!
        
        _CornerRightUp = ImageVector.Builder(
            name = "corner-right-up",
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
                moveTo(6f, 18f)
                horizontalLineToRelative(6f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                verticalLineToRelative(-10f)
                lineToRelative(-4f, 4f)
                moveToRelative(8f, 0f)
                lineToRelative(-4f, -4f)
            }
        }.build()
        
        return _CornerRightUp!!
    }

private var _CornerRightUp: ImageVector? = null

