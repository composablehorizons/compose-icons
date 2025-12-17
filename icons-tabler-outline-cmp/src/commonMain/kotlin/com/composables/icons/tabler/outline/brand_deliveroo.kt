package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandDeliveroo: ImageVector
    get() {
        if (_BrandDeliveroo != null) return _BrandDeliveroo!!
        
        _BrandDeliveroo = ImageVector.Builder(
            name = "brand-deliveroo",
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
                moveTo(15f, 11f)
                lineToRelative(1f, -9f)
                lineToRelative(5f, 0.5f)
                lineToRelative(-1f, 13.5f)
                lineToRelative(-3f, 6f)
                lineToRelative(-12.5f, -2.5f)
                lineToRelative(-1.5f, -6f)
                lineToRelative(7f, -1.5f)
                lineToRelative(-1.5f, -7.5f)
                lineToRelative(4.5f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.5f, 15.5f)
                arcTo(1f, 1f, 0f, false, true, 15.5f, 16.5f)
                arcTo(1f, 1f, 0f, false, true, 14.5f, 15.5f)
                arcTo(1f, 1f, 0f, false, true, 16.5f, 15.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.5f, 14.5f)
                arcTo(1f, 1f, 0f, false, true, 11.5f, 15.5f)
                arcTo(1f, 1f, 0f, false, true, 10.5f, 14.5f)
                arcTo(1f, 1f, 0f, false, true, 12.5f, 14.5f)
                close()
            }
        }.build()
        
        return _BrandDeliveroo!!
    }

private var _BrandDeliveroo: ImageVector? = null

