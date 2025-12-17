package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandMeetup: ImageVector
    get() {
        if (_BrandMeetup != null) return _BrandMeetup!!
        
        _BrandMeetup = ImageVector.Builder(
            name = "brand-meetup",
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
                moveTo(5.455f, 10.82f)
                curveToRelative(0.935f, -2.163f, 3.045f, -3.82f, 5.545f, -3.82f)
                curveToRelative(2.104f, 0f, 2.844f, 1.915f, 2f, 4f)
                lineToRelative(-2f, 6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.981f, 7f)
                lineToRelative(-3.981f, 9.914f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 11f)
                curveToRelative(0.937f, -2.16f, 3.071f, -3.802f, 5.42f, -3.972f)
                curveToRelative(2.104f, 0f, 3.128f, 1.706f, 2.284f, 3.792f)
                lineToRelative(-2.454f, 6.094f)
                curveToRelative(-0.853f, 1.676f, 0.75f, 2.586f, 2.75f, 2.086f)
            }
        }.build()
        
        return _BrandMeetup!!
    }

private var _BrandMeetup: ImageVector? = null

