package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CornerLeftUp: ImageVector
    get() {
        if (_CornerLeftUp != null) return _CornerLeftUp!!
        
        _CornerLeftUp = ImageVector.Builder(
            name = "corner-left-up",
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
                horizontalLineToRelative(-6f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-10f)
                lineToRelative(-4f, 4f)
                moveToRelative(8f, 0f)
                lineToRelative(-4f, -4f)
            }
        }.build()
        
        return _CornerLeftUp!!
    }

private var _CornerLeftUp: ImageVector? = null

