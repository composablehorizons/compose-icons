package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandUbuntu: ImageVector
    get() {
        if (_BrandUbuntu != null) return _BrandUbuntu!!
        
        _BrandUbuntu = ImageVector.Builder(
            name = "brand-ubuntu",
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
                moveTo(12f, 5f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, true, false, 4f, 0f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.723f, 7.41f)
                arcToRelative(7.992f, 7.992f, 0f, false, false, -3.74f, -2.162f)
                moveToRelative(-3.971f, 0f)
                arcToRelative(7.993f, 7.993f, 0f, false, false, -3.789f, 2.216f)
                moveToRelative(-1.881f, 3.215f)
                arcToRelative(8f, 8f, 0f, false, false, -0.342f, 2.32f)
                curveToRelative(0f, 0.738f, 0.1f, 1.453f, 0.287f, 2.132f)
                moveToRelative(1.96f, 3.428f)
                arcToRelative(7.993f, 7.993f, 0f, false, false, 3.759f, 2.19f)
                moveToRelative(4f, 0f)
                arcToRelative(7.993f, 7.993f, 0f, false, false, 3.747f, -2.186f)
                moveToRelative(1.962f, -3.43f)
                arcToRelative(8.008f, 8.008f, 0f, false, false, 0.287f, -2.131f)
                curveToRelative(0f, -0.764f, -0.107f, -1.503f, -0.307f, -2.203f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 17f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, true, false, 4f, 0f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 17f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, true, false, 4f, 0f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
            }
        }.build()
        
        return _BrandUbuntu!!
    }

private var _BrandUbuntu: ImageVector? = null

