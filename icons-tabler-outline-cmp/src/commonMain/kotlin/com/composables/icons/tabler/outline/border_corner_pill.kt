package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BorderCornerPill: ImageVector
    get() {
        if (_BorderCornerPill != null) return _BorderCornerPill!!
        
        _BorderCornerPill = ImageVector.Builder(
            name = "border-corner-pill",
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
                moveTo(4f, 20f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -6.075f, 4.925f, -11f, 11f, -11f)
                horizontalLineToRelative(5f)
            }
        }.build()
        
        return _BorderCornerPill!!
    }

private var _BorderCornerPill: ImageVector? = null

