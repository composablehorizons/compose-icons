package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandPeanut: ImageVector
    get() {
        if (_BrandPeanut != null) return _BrandPeanut!!
        
        _BrandPeanut = ImageVector.Builder(
            name = "brand-peanut",
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
                moveTo(15f, 16.25f)
                lineToRelative(-0.816f, -0.36f)
                lineToRelative(-0.462f, -0.196f)
                curveToRelative(-1.444f, -0.592f, -2f, -0.593f, -3.447f, 0f)
                lineToRelative(-0.462f, 0.195f)
                lineToRelative(-0.817f, 0.359f)
                arcToRelative(4.5f, 4.5f, 0f, true, true, 0f, -8.49f)
                verticalLineToRelative(0f)
                lineToRelative(1.054f, 0.462f)
                lineToRelative(0.434f, 0.178f)
                curveToRelative(1.292f, 0.507f, 1.863f, 0.48f, 3.237f, -0.082f)
                lineToRelative(0.462f, -0.195f)
                lineToRelative(0.817f, -0.359f)
                arcToRelative(4.5f, 4.5f, 0f, true, true, 0f, 8.49f)
            }
        }.build()
        
        return _BrandPeanut!!
    }

private var _BrandPeanut: ImageVector? = null

