package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandDrops: ImageVector
    get() {
        if (_BrandDrops != null) return _BrandDrops!!
        
        _BrandDrops = ImageVector.Builder(
            name = "brand-drops",
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
                moveTo(17.637f, 7.416f)
                arcToRelative(7.907f, 7.907f, 0f, false, true, 1.76f, 8.666f)
                arcToRelative(8f, 8f, 0f, false, true, -7.397f, 4.918f)
                arcToRelative(8f, 8f, 0f, false, true, -7.396f, -4.918f)
                arcToRelative(7.907f, 7.907f, 0f, false, true, 1.759f, -8.666f)
                lineToRelative(5.637f, -5.416f)
                lineToRelative(5.637f, 5.416f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.466f, 10.923f)
                arcToRelative(3.595f, 3.595f, 0f, false, true, 0.77f, 3.877f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -3.236f, 2.2f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -3.236f, -2.2f)
                arcToRelative(3.595f, 3.595f, 0f, false, true, 0.77f, -3.877f)
                lineToRelative(2.466f, -2.423f)
                lineToRelative(2.466f, 2.423f)
                close()
            }
        }.build()
        
        return _BrandDrops!!
    }

private var _BrandDrops: ImageVector? = null

