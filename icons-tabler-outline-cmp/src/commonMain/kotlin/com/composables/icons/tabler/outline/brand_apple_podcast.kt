package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandApplePodcast: ImageVector
    get() {
        if (_BrandApplePodcast != null) return _BrandApplePodcast!!
        
        _BrandApplePodcast = ImageVector.Builder(
            name = "brand-apple-podcast",
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
                moveTo(18.364f, 18.364f)
                arcToRelative(9f, 9f, 0f, true, false, -12.728f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.766f, 22f)
                horizontalLineToRelative(0.468f)
                arcToRelative(2f, 2f, 0f, false, false, 1.985f, -1.752f)
                lineToRelative(0.5f, -4f)
                arcToRelative(2f, 2f, 0f, false, false, -1.985f, -2.248f)
                horizontalLineToRelative(-1.468f)
                arcToRelative(2f, 2f, 0f, false, false, -1.985f, 2.248f)
                lineToRelative(0.5f, 4f)
                arcToRelative(2f, 2f, 0f, false, false, 1.985f, 1.752f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 9f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, true, false, 4f, 0f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
            }
        }.build()
        
        return _BrandApplePodcast!!
    }

private var _BrandApplePodcast: ImageVector? = null

