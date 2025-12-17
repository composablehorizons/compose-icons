package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandDiscord: ImageVector
    get() {
        if (_BrandDiscord != null) return _BrandDiscord!!
        
        _BrandDiscord = ImageVector.Builder(
            name = "brand-discord",
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
                moveTo(8f, 12f)
                arcToRelative(1f, 1f, 0f, true, false, 2f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -2f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 12f)
                arcToRelative(1f, 1f, 0f, true, false, 2f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -2f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.5f, 17f)
                curveToRelative(0f, 1f, 1.5f, 3f, 2f, 3f)
                curveToRelative(1.5f, 0f, 2.833f, -1.667f, 3.5f, -3f)
                curveToRelative(0.667f, -1.667f, 0.5f, -5.833f, -1.5f, -11.5f)
                curveToRelative(-1.457f, -1.015f, -3f, -1.34f, -4.5f, -1.5f)
                lineToRelative(-0.972f, 1.923f)
                arcToRelative(11.913f, 11.913f, 0f, false, false, -4.053f, 0f)
                lineToRelative(-0.975f, -1.923f)
                curveToRelative(-1.5f, 0.16f, -3.043f, 0.485f, -4.5f, 1.5f)
                curveToRelative(-2f, 5.667f, -2.167f, 9.833f, -1.5f, 11.5f)
                curveToRelative(0.667f, 1.333f, 2f, 3f, 3.5f, 3f)
                curveToRelative(0.5f, 0f, 2f, -2f, 2f, -3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 16.5f)
                curveToRelative(3.5f, 1f, 6.5f, 1f, 10f, 0f)
            }
        }.build()
        
        return _BrandDiscord!!
    }

private var _BrandDiscord: ImageVector? = null

