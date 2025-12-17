package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandComedyCentral: ImageVector
    get() {
        if (_BrandComedyCentral != null) return _BrandComedyCentral!!
        
        _BrandComedyCentral = ImageVector.Builder(
            name = "brand-comedy-central",
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
                moveTo(5.343f, 17.657f)
                arcToRelative(8f, 8f, 0f, true, false, 0f, -11.314f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.828f, 9.172f)
                arcToRelative(4f, 4f, 0f, true, false, 0f, 5.656f)
            }
        }.build()
        
        return _BrandComedyCentral!!
    }

private var _BrandComedyCentral: ImageVector? = null

