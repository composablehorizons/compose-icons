package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandCtemplar: ImageVector
    get() {
        if (_BrandCtemplar != null) return _BrandCtemplar!!
        
        _BrandCtemplar = ImageVector.Builder(
            name = "brand-ctemplar",
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
                moveTo(6.04f, 14.831f)
                lineToRelative(4.46f, -4.331f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.555f, 20.82f)
                curveToRelative(4.55f, -3.456f, 7.582f, -8.639f, 8.426f, -14.405f)
                arcToRelative(1.668f, 1.668f, 0f, false, false, -0.934f, -1.767f)
                arcToRelative(19.647f, 19.647f, 0f, false, false, -8.047f, -1.648f)
                arcToRelative(19.647f, 19.647f, 0f, false, false, -8.047f, 1.647f)
                arcToRelative(1.668f, 1.668f, 0f, false, false, -0.934f, 1.767f)
                curveToRelative(0.844f, 5.766f, 3.875f, 10.95f, 8.426f, 14.406f)
                arcToRelative(0.948f, 0.948f, 0f, false, false, 1.11f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 5f)
                curveToRelative(-2f, 0f, -4.37f, 3.304f, -8f, 6.644f)
                curveToRelative(-3.63f, -3.34f, -6f, -6.644f, -8f, -6.644f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.738f, 15f)
                lineToRelative(-4.238f, -4.5f)
            }
        }.build()
        
        return _BrandCtemplar!!
    }

private var _BrandCtemplar: ImageVector? = null

