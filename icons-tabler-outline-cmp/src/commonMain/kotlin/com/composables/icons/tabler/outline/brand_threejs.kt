package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandThreejs: ImageVector
    get() {
        if (_BrandThreejs != null) return _BrandThreejs!!
        
        _BrandThreejs = ImageVector.Builder(
            name = "brand-threejs",
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
                moveTo(8f, 22f)
                lineToRelative(-5f, -19f)
                lineToRelative(19f, 5.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.573f, 17.58f)
                lineToRelative(-6.152f, -1.576f)
                lineToRelative(8.796f, -9.466f)
                lineToRelative(1.914f, 6.64f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.573f, 17.58f)
                lineToRelative(-1.573f, -6.58f)
                lineToRelative(6.13f, 2.179f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.527f, 4.893f)
                lineToRelative(1.473f, 6.107f)
                lineToRelative(-6.31f, -1.564f)
                close()
            }
        }.build()
        
        return _BrandThreejs!!
    }

private var _BrandThreejs: ImageVector? = null

