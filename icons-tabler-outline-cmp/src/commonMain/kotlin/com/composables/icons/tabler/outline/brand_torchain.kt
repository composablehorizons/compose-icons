package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandTorchain: ImageVector
    get() {
        if (_BrandTorchain != null) return _BrandTorchain!!
        
        _BrandTorchain = ImageVector.Builder(
            name = "brand-torchain",
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
                moveTo(15.588f, 15.537f)
                lineToRelative(-3.553f, -3.537f)
                lineToRelative(-7.742f, 8.18f)
                curveToRelative(-0.791f, 0.85f, 0.153f, 2.18f, 1.238f, 1.73f)
                lineToRelative(9.616f, -4.096f)
                arcToRelative(1.398f, 1.398f, 0f, false, false, 0.44f, -2.277f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.412f, 8.464f)
                lineToRelative(3.553f, 3.536f)
                lineToRelative(7.742f, -8.18f)
                curveToRelative(0.791f, -0.85f, -0.153f, -2.18f, -1.238f, -1.73f)
                lineToRelative(-9.616f, 4.098f)
                arcToRelative(1.398f, 1.398f, 0f, false, false, -0.44f, 2.277f)
                close()
            }
        }.build()
        
        return _BrandTorchain!!
    }

private var _BrandTorchain: ImageVector? = null

