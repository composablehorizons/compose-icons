package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandShopee: ImageVector
    get() {
        if (_BrandShopee != null) return _BrandShopee!!
        
        _BrandShopee = ImageVector.Builder(
            name = "brand-shopee",
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
                moveTo(4f, 7f)
                lineToRelative(0.867f, 12.143f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 1.857f)
                horizontalLineToRelative(10.276f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -1.857f)
                lineToRelative(0.867f, -12.143f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 7f)
                curveToRelative(0f, -1.653f, 1.5f, -4f, 3.5f, -4f)
                reflectiveCurveToRelative(3.5f, 2.347f, 3.5f, 4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 17f)
                curveToRelative(0.413f, 0.462f, 1f, 1f, 2.5f, 1f)
                reflectiveCurveToRelative(2.5f, -0.897f, 2.5f, -2f)
                reflectiveCurveToRelative(-1f, -1.5f, -2.5f, -2f)
                reflectiveCurveToRelative(-2f, -1.47f, -2f, -2f)
                curveToRelative(0f, -1.104f, 1f, -2f, 2f, -2f)
                reflectiveCurveToRelative(1.5f, 0f, 2.5f, 1f)
            }
        }.build()
        
        return _BrandShopee!!
    }

private var _BrandShopee: ImageVector? = null

