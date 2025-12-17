package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandMeta: ImageVector
    get() {
        if (_BrandMeta != null) return _BrandMeta!!
        
        _BrandMeta = ImageVector.Builder(
            name = "brand-meta",
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
                moveTo(12f, 10.174f)
                curveToRelative(1.766f, -2.784f, 3.315f, -4.174f, 4.648f, -4.174f)
                curveToRelative(2f, 0f, 3.263f, 2.213f, 4f, 5.217f)
                curveToRelative(0.704f, 2.869f, 0.5f, 6.783f, -2f, 6.783f)
                curveToRelative(-1.114f, 0f, -2.648f, -1.565f, -4.148f, -3.652f)
                arcToRelative(27.627f, 27.627f, 0f, false, true, -2.5f, -4.174f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 10.174f)
                curveToRelative(-1.766f, -2.784f, -3.315f, -4.174f, -4.648f, -4.174f)
                curveToRelative(-2f, 0f, -3.263f, 2.213f, -4f, 5.217f)
                curveToRelative(-0.704f, 2.869f, -0.5f, 6.783f, 2f, 6.783f)
                curveToRelative(1.114f, 0f, 2.648f, -1.565f, 4.148f, -3.652f)
                curveToRelative(1f, -1.391f, 1.833f, -2.783f, 2.5f, -4.174f)
                close()
            }
        }.build()
        
        return _BrandMeta!!
    }

private var _BrandMeta: ImageVector? = null

