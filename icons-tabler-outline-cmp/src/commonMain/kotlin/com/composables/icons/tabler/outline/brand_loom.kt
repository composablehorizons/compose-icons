package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandLoom: ImageVector
    get() {
        if (_BrandLoom != null) return _BrandLoom!!
        
        _BrandLoom = ImageVector.Builder(
            name = "brand-loom",
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
                moveTo(17.464f, 6.518f)
                arcToRelative(6f, 6f, 0f, true, false, -3.023f, 7.965f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.482f, 17.464f)
                arcToRelative(6f, 6f, 0f, true, false, -7.965f, -3.023f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.54f, 17.482f)
                arcToRelative(6f, 6f, 0f, true, false, 3.024f, -7.965f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.518f, 6.54f)
                arcToRelative(6f, 6f, 0f, true, false, 7.965f, 3.024f)
            }
        }.build()
        
        return _BrandLoom!!
    }

private var _BrandLoom: ImageVector? = null

