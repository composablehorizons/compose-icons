package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandAuth0: ImageVector
    get() {
        if (_BrandAuth0 != null) return _BrandAuth0!!
        
        _BrandAuth0 = ImageVector.Builder(
            name = "brand-auth0",
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
                moveTo(12f, 14.5f)
                lineToRelative(-5.5f, 3.5f)
                lineToRelative(2f, -6f)
                lineToRelative(-4.5f, -4f)
                horizontalLineToRelative(6f)
                lineToRelative(2f, -5f)
                lineToRelative(2f, 5f)
                horizontalLineToRelative(6f)
                lineToRelative(-4.5f, 4f)
                lineToRelative(2f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.507f, 8.872f)
                lineToRelative(-2.01f, -5.872f)
                horizontalLineToRelative(-12.994f)
                lineToRelative(-2.009f, 5.872f)
                curveToRelative(-1.242f, 3.593f, -0.135f, 7.094f, 3.249f, 9.407f)
                lineToRelative(5.257f, 3.721f)
                lineToRelative(5.257f, -3.721f)
                curveToRelative(3.385f, -2.313f, 4.49f, -5.814f, 3.25f, -9.407f)
                close()
            }
        }.build()
        
        return _BrandAuth0!!
    }

private var _BrandAuth0: ImageVector? = null

