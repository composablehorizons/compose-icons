package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandFilezilla: ImageVector
    get() {
        if (_BrandFilezilla != null) return _BrandFilezilla!!
        
        _BrandFilezilla = ImageVector.Builder(
            name = "brand-filezilla",
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
                moveTo(16f, 15.824f)
                arcToRelative(4.062f, 4.062f, 0f, false, true, -2.25f, 0.033f)
                curveToRelative(-0.738f, -0.201f, -2.018f, -0.08f, -2.75f, 0.143f)
                lineToRelative(4.583f, -5f)
                horizontalLineToRelative(-6.583f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                moveToRelative(-9f, 0f)
                arcToRelative(9f, 9f, 0f, true, false, 18f, 0f)
                arcToRelative(9f, 9f, 0f, true, false, -18f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 15f)
                lineToRelative(2f, -8f)
                horizontalLineToRelative(5f)
            }
        }.build()
        
        return _BrandFilezilla!!
    }

private var _BrandFilezilla: ImageVector? = null

