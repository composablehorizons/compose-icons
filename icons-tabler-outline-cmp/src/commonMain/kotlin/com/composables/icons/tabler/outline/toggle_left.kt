package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ToggleLeft: ImageVector
    get() {
        if (_ToggleLeft != null) return _ToggleLeft!!
        
        _ToggleLeft = ImageVector.Builder(
            name = "toggle-left",
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
                moveTo(8f, 12f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, true, false, 4f, 0f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 6f)
                moveToRelative(0f, 6f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, -6f)
                horizontalLineToRelative(8f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, 6f)
                verticalLineToRelative(0f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, 6f)
                horizontalLineToRelative(-8f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, -6f)
                close()
            }
        }.build()
        
        return _ToggleLeft!!
    }

private var _ToggleLeft: ImageVector? = null

