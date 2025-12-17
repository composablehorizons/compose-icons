package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandBluesky: ImageVector
    get() {
        if (_BrandBluesky != null) return _BrandBluesky!!
        
        _BrandBluesky = ImageVector.Builder(
            name = "brand-bluesky",
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
                moveTo(6.335f, 5.144f)
                curveToRelative(-1.654f, -1.199f, -4.335f, -2.127f, -4.335f, 0.826f)
                curveToRelative(0f, 0.59f, 0.35f, 4.953f, 0.556f, 5.661f)
                curveToRelative(0.713f, 2.463f, 3.13f, 2.75f, 5.444f, 2.369f)
                curveToRelative(-4.045f, 0.665f, -4.889f, 3.208f, -2.667f, 5.41f)
                curveToRelative(1.03f, 1.018f, 1.913f, 1.59f, 2.667f, 1.59f)
                curveToRelative(2f, 0f, 3.134f, -2.769f, 3.5f, -3.5f)
                curveToRelative(0.333f, -0.667f, 0.5f, -1.167f, 0.5f, -1.5f)
                curveToRelative(0f, 0.333f, 0.167f, 0.833f, 0.5f, 1.5f)
                curveToRelative(0.366f, 0.731f, 1.5f, 3.5f, 3.5f, 3.5f)
                curveToRelative(0.754f, 0f, 1.637f, -0.571f, 2.667f, -1.59f)
                curveToRelative(2.222f, -2.203f, 1.378f, -4.746f, -2.667f, -5.41f)
                curveToRelative(2.314f, 0.38f, 4.73f, 0.094f, 5.444f, -2.369f)
                curveToRelative(0.206f, -0.708f, 0.556f, -5.072f, 0.556f, -5.661f)
                curveToRelative(0f, -2.953f, -2.68f, -2.025f, -4.335f, -0.826f)
                curveToRelative(-2.293f, 1.662f, -4.76f, 5.048f, -5.665f, 6.856f)
                curveToRelative(-0.905f, -1.808f, -3.372f, -5.194f, -5.665f, -6.856f)
                close()
            }
        }.build()
        
        return _BrandBluesky!!
    }

private var _BrandBluesky: ImageVector? = null

