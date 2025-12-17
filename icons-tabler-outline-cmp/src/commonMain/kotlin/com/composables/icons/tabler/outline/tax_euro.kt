package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.TaxEuro: ImageVector
    get() {
        if (_TaxEuro != null) return _TaxEuro!!
        
        _TaxEuro = ImageVector.Builder(
            name = "tax-euro",
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
                moveTo(8.487f, 21f)
                horizontalLineToRelative(7.026f)
                arcToRelative(4f, 4f, 0f, false, false, 3.808f, -5.224f)
                lineToRelative(-1.706f, -5.306f)
                arcToRelative(5f, 5f, 0f, false, false, -4.76f, -3.47f)
                horizontalLineToRelative(-1.71f)
                arcToRelative(5f, 5f, 0f, false, false, -4.76f, 3.47f)
                lineToRelative(-1.706f, 5.306f)
                arcToRelative(4f, 4f, 0f, false, false, 3.808f, 5.224f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 3f)
                quadToRelative(-1f, 4f, -3f, 4f)
                reflectiveQuadToRelative(-3f, -4f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 14f)
                horizontalLineToRelative(-3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 11.172f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, 5.656f)
            }
        }.build()
        
        return _TaxEuro!!
    }

private var _TaxEuro: ImageVector? = null

