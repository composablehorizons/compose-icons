package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BorderCornerRounded: ImageVector
    get() {
        if (_BorderCornerRounded != null) return _BorderCornerRounded!!
        
        _BorderCornerRounded = ImageVector.Builder(
            name = "border-corner-rounded",
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
                moveTo(4f, 20f)
                verticalLineToRelative(-10f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, -6f)
                horizontalLineToRelative(10f)
            }
        }.build()
        
        return _BorderCornerRounded!!
    }

private var _BorderCornerRounded: ImageVector? = null

