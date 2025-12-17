package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandSoundcloud: ImageVector
    get() {
        if (_BrandSoundcloud != null) return _BrandSoundcloud!!
        
        _BrandSoundcloud = ImageVector.Builder(
            name = "brand-soundcloud",
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
                moveTo(17f, 11f)
                horizontalLineToRelative(1f)
                curveToRelative(1.38f, 0f, 3f, 1.274f, 3f, 3f)
                curveToRelative(0f, 1.657f, -1.5f, 3f, -3f, 3f)
                lineToRelative(-6f, 0f)
                verticalLineToRelative(-10f)
                curveToRelative(3f, 0f, 4.5f, 1.5f, 5f, 4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 8f)
                lineToRelative(0f, 9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 17f)
                lineToRelative(0f, -7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 16f)
                lineToRelative(0f, -2f)
            }
        }.build()
        
        return _BrandSoundcloud!!
    }

private var _BrandSoundcloud: ImageVector? = null

