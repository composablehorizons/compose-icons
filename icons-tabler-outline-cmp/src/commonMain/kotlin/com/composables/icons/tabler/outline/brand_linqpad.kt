package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandLinqpad: ImageVector
    get() {
        if (_BrandLinqpad != null) return _BrandLinqpad!!
        
        _BrandLinqpad = ImageVector.Builder(
            name = "brand-linqpad",
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
                moveTo(5f, 21f)
                horizontalLineToRelative(3.5f)
                lineToRelative(2.5f, -6f)
                lineToRelative(2.5f, -1f)
                lineToRelative(2.5f, 7f)
                horizontalLineToRelative(4f)
                lineToRelative(1f, -4.5f)
                lineToRelative(-2f, -1f)
                lineToRelative(-7f, -12f)
                lineToRelative(-6f, -0.5f)
                lineToRelative(1.5f, 4f)
                lineToRelative(2.5f, 0.5f)
                lineToRelative(1f, 2.5f)
                lineToRelative(-7f, 8f)
                close()
            }
        }.build()
        
        return _BrandLinqpad!!
    }

private var _BrandLinqpad: ImageVector? = null

