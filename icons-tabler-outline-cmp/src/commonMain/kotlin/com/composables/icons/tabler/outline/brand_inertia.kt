package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandInertia: ImageVector
    get() {
        if (_BrandInertia != null) return _BrandInertia!!
        
        _BrandInertia = ImageVector.Builder(
            name = "brand-inertia",
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
                moveTo(12.5f, 8f)
                lineToRelative(4f, 4f)
                lineToRelative(-4f, 4f)
                horizontalLineToRelative(4.5f)
                lineToRelative(4f, -4f)
                lineToRelative(-4f, -4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.5f, 8f)
                lineToRelative(4f, 4f)
                lineToRelative(-4f, 4f)
                horizontalLineToRelative(4.5f)
                lineToRelative(4f, -4f)
                lineToRelative(-4f, -4f)
                close()
            }
        }.build()
        
        return _BrandInertia!!
    }

private var _BrandInertia: ImageVector? = null

