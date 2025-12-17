package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.RadiusTopRight: ImageVector
    get() {
        if (_RadiusTopRight != null) return _RadiusTopRight!!
        
        _RadiusTopRight = ImageVector.Builder(
            name = "radius-top-right",
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
                moveTo(5f, 5f)
                horizontalLineToRelative(6f)
                arcToRelative(8f, 8f, 0f, false, true, 8f, 8f)
                verticalLineToRelative(6f)
            }
        }.build()
        
        return _RadiusTopRight!!
    }

private var _RadiusTopRight: ImageVector? = null

