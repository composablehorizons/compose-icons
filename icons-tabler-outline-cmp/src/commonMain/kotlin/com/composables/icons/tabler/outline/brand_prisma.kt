package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandPrisma: ImageVector
    get() {
        if (_BrandPrisma != null) return _BrandPrisma!!
        
        _BrandPrisma = ImageVector.Builder(
            name = "brand-prisma",
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
                moveTo(4.186f, 16.202f)
                lineToRelative(3.615f, 5.313f)
                curveToRelative(0.265f, 0.39f, 0.754f, 0.57f, 1.215f, 0.447f)
                lineToRelative(10.166f, -2.718f)
                arcToRelative(1.086f, 1.086f, 0f, false, false, 0.713f, -1.511f)
                lineToRelative(-7.505f, -15.483f)
                arcToRelative(0.448f, 0.448f, 0f, false, false, -0.787f, -0.033f)
                lineToRelative(-7.453f, 12.838f)
                arcToRelative(1.07f, 1.07f, 0f, false, false, 0.037f, 1.147f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 22f)
                lineToRelative(3.5f, -20f)
            }
        }.build()
        
        return _BrandPrisma!!
    }

private var _BrandPrisma: ImageVector? = null

