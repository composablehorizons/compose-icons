package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandPolymer: ImageVector
    get() {
        if (_BrandPolymer != null) return _BrandPolymer!!
        
        _BrandPolymer = ImageVector.Builder(
            name = "brand-polymer",
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
                moveTo(6.706f, 6f)
                lineToRelative(-3.706f, 6f)
                lineToRelative(3.706f, 6f)
                horizontalLineToRelative(1.059f)
                lineToRelative(8.47f, -12f)
                horizontalLineToRelative(1.06f)
                lineToRelative(3.705f, 6f)
                lineToRelative(-3.706f, 6f)
            }
        }.build()
        
        return _BrandPolymer!!
    }

private var _BrandPolymer: ImageVector? = null

