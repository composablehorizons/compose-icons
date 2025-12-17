package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandStrava: ImageVector
    get() {
        if (_BrandStrava != null) return _BrandStrava!!
        
        _BrandStrava = ImageVector.Builder(
            name = "brand-strava",
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
                moveTo(15f, 13f)
                lineToRelative(-5f, -10f)
                lineToRelative(-5f, 10f)
                moveToRelative(6f, 0f)
                lineToRelative(4f, 8f)
                lineToRelative(4f, -8f)
            }
        }.build()
        
        return _BrandStrava!!
    }

private var _BrandStrava: ImageVector? = null

