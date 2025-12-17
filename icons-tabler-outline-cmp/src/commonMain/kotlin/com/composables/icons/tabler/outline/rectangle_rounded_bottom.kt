package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.RectangleRoundedBottom: ImageVector
    get() {
        if (_RectangleRoundedBottom != null) return _RectangleRoundedBottom!!
        
        _RectangleRoundedBottom = ImageVector.Builder(
            name = "rectangle-rounded-bottom",
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
                moveTo(9f, 18f)
                horizontalLineToRelative(6f)
                arcToRelative(6f, 6f, 0f, false, false, 6f, -6f)
                verticalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-16f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(5f)
                arcToRelative(6f, 6f, 0f, false, false, 6f, 6f)
                close()
            }
        }.build()
        
        return _RectangleRoundedBottom!!
    }

private var _RectangleRoundedBottom: ImageVector? = null

