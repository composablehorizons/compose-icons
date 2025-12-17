package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandCoinbase: ImageVector
    get() {
        if (_BrandCoinbase != null) return _BrandCoinbase!!
        
        _BrandCoinbase = ImageVector.Builder(
            name = "brand-coinbase",
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
                moveTo(12.95f, 22f)
                curveToRelative(-4.503f, 0f, -8.445f, -3.04f, -9.61f, -7.413f)
                curveToRelative(-1.165f, -4.373f, 0.737f, -8.988f, 4.638f, -11.25f)
                arcToRelative(9.906f, 9.906f, 0f, false, true, 12.008f, 1.598f)
                lineToRelative(-3.335f, 3.367f)
                arcToRelative(5.185f, 5.185f, 0f, false, false, -7.354f, 0.013f)
                arcToRelative(5.252f, 5.252f, 0f, false, false, 0f, 7.393f)
                arcToRelative(5.185f, 5.185f, 0f, false, false, 7.354f, 0.013f)
                lineToRelative(3.349f, 3.367f)
                arcToRelative(9.887f, 9.887f, 0f, false, true, -7.05f, 2.912f)
                close()
            }
        }.build()
        
        return _BrandCoinbase!!
    }

private var _BrandCoinbase: ImageVector? = null

