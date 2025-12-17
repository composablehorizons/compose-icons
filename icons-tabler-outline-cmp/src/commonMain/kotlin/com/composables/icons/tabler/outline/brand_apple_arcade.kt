package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandAppleArcade: ImageVector
    get() {
        if (_BrandAppleArcade != null) return _BrandAppleArcade!!
        
        _BrandAppleArcade = ImageVector.Builder(
            name = "brand-apple-arcade",
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
                moveTo(20f, 12.5f)
                verticalLineToRelative(4.75f)
                arcToRelative(0.734f, 0.734f, 0f, false, true, -0.055f, 0.325f)
                arcToRelative(0.704f, 0.704f, 0f, false, true, -0.348f, 0.366f)
                lineToRelative(-5.462f, 2.58f)
                arcToRelative(5f, 5f, 0f, false, true, -4.27f, 0f)
                lineToRelative(-5.462f, -2.58f)
                arcToRelative(0.705f, 0.705f, 0f, false, true, -0.401f, -0.691f)
                lineToRelative(0f, -4.75f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.431f, 12.216f)
                lineToRelative(5.634f, -2.332f)
                arcToRelative(5.065f, 5.065f, 0f, false, true, 3.87f, 0f)
                lineToRelative(5.634f, 2.332f)
                arcToRelative(0.692f, 0.692f, 0f, false, true, 0.028f, 1.269f)
                lineToRelative(-5.462f, 2.543f)
                arcToRelative(5.064f, 5.064f, 0f, false, true, -4.27f, 0f)
                lineToRelative(-5.462f, -2.543f)
                arcToRelative(0.691f, 0.691f, 0f, false, true, 0.028f, -1.27f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 7f)
                lineToRelative(0f, 6f)
            }
        }.build()
        
        return _BrandAppleArcade!!
    }

private var _BrandAppleArcade: ImageVector? = null

