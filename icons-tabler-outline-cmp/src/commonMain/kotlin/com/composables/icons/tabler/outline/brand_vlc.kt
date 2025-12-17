package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandVlc: ImageVector
    get() {
        if (_BrandVlc != null) return _BrandVlc!!
        
        _BrandVlc = ImageVector.Builder(
            name = "brand-vlc",
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
                moveTo(13.79f, 4.337f)
                lineToRelative(3.101f, 9.305f)
                curveToRelative(0.33f, 0.985f, -0.113f, 2.07f, -1.02f, 2.499f)
                arcToRelative(9.148f, 9.148f, 0f, false, true, -7.742f, 0f)
                curveToRelative(-0.907f, -0.428f, -1.35f, -1.514f, -1.02f, -2.499f)
                lineToRelative(3.1f, -9.305f)
                curveToRelative(0.267f, -0.8f, 0.985f, -1.337f, 1.791f, -1.337f)
                curveToRelative(0.807f, 0f, 1.525f, 0.537f, 1.79f, 1.337f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 14f)
                horizontalLineToRelative(-1.429f)
                arcToRelative(2f, 2f, 0f, false, false, -1.923f, 1.45f)
                lineToRelative(-0.571f, 2f)
                arcToRelative(2f, 2f, 0f, false, false, 1.923f, 2.55f)
                horizontalLineToRelative(13.998f)
                arcToRelative(2f, 2f, 0f, false, false, 1.923f, -2.55f)
                lineToRelative(-0.572f, -2f)
                arcToRelative(2f, 2f, 0f, false, false, -1.923f, -1.45f)
                horizontalLineToRelative(-1.426f)
            }
        }.build()
        
        return _BrandVlc!!
    }

private var _BrandVlc: ImageVector? = null

