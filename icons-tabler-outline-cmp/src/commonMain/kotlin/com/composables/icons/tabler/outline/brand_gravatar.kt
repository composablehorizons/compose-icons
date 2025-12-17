package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandGravatar: ImageVector
    get() {
        if (_BrandGravatar != null) return _BrandGravatar!!
        
        _BrandGravatar = ImageVector.Builder(
            name = "brand-gravatar",
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
                moveTo(5.64f, 5.632f)
                arcToRelative(9f, 9f, 0f, true, false, 6.36f, -2.632f)
                verticalLineToRelative(7.714f)
            }
        }.build()
        
        return _BrandGravatar!!
    }

private var _BrandGravatar: ImageVector? = null

