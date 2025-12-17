package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandGoogleHome: ImageVector
    get() {
        if (_BrandGoogleHome != null) return _BrandGoogleHome!!
        
        _BrandGoogleHome = ImageVector.Builder(
            name = "brand-google-home",
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
                moveTo(19.072f, 21f)
                horizontalLineToRelative(-14.144f)
                arcToRelative(1.928f, 1.928f, 0f, false, true, -1.928f, -1.928f)
                verticalLineToRelative(-6.857f)
                curveToRelative(0f, -0.512f, 0.203f, -1f, 0.566f, -1.365f)
                lineToRelative(7.07f, -7.063f)
                arcToRelative(1.928f, 1.928f, 0f, false, true, 2.727f, 0f)
                lineToRelative(7.071f, 7.063f)
                curveToRelative(0.363f, 0.362f, 0.566f, 0.853f, 0.566f, 1.365f)
                verticalLineToRelative(6.857f)
                arcToRelative(1.928f, 1.928f, 0f, false, true, -1.928f, 1.928f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 13f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-4f)
                lineToRelative(-5f, -5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.8f, 5.2f)
                lineToRelative(-11.8f, 11.8f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 17f)
                verticalLineToRelative(4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 17f)
                verticalLineToRelative(4f)
            }
        }.build()
        
        return _BrandGoogleHome!!
    }

private var _BrandGoogleHome: ImageVector? = null

