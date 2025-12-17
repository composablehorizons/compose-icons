package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandGoogleOne: ImageVector
    get() {
        if (_BrandGoogleOne != null) return _BrandGoogleOne!!
        
        _BrandGoogleOne = ImageVector.Builder(
            name = "brand-google-one",
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
                moveTo(11f, 5f)
                verticalLineToRelative(13.982f)
                arcToRelative(2f, 2f, 0f, false, false, 4f, 0f)
                verticalLineToRelative(-13.982f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.63f, 8.407f)
                arcToRelative(2.125f, 2.125f, 0f, false, false, -0.074f, 2.944f)
                curveToRelative(0.77f, 0.834f, 2.051f, 0.869f, 2.862f, 0.077f)
                lineToRelative(4.95f, -4.834f)
                curveToRelative(0.812f, -0.792f, 0.846f, -2.11f, 0.076f, -2.945f)
                arcToRelative(1.984f, 1.984f, 0f, false, false, -2.861f, -0.077f)
                lineToRelative(-4.953f, 4.835f)
                close()
            }
        }.build()
        
        return _BrandGoogleOne!!
    }

private var _BrandGoogleOne: ImageVector? = null

