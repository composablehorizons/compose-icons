package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.RadiusBottomLeft: ImageVector
    get() {
        if (_RadiusBottomLeft != null) return _RadiusBottomLeft!!
        
        _RadiusBottomLeft = ImageVector.Builder(
            name = "radius-bottom-left",
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
                moveTo(19f, 19f)
                horizontalLineToRelative(-6f)
                arcToRelative(8f, 8f, 0f, false, true, -8f, -8f)
                verticalLineToRelative(-6f)
            }
        }.build()
        
        return _RadiusBottomLeft!!
    }

private var _RadiusBottomLeft: ImageVector? = null

