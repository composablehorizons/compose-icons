package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandVscode: ImageVector
    get() {
        if (_BrandVscode != null) return _BrandVscode!!
        
        _BrandVscode = ImageVector.Builder(
            name = "brand-vscode",
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
                moveTo(16f, 3f)
                verticalLineToRelative(18f)
                lineToRelative(4f, -2.5f)
                verticalLineToRelative(-13f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.165f, 13.903f)
                lineToRelative(-4.165f, 3.597f)
                lineToRelative(-2f, -1f)
                lineToRelative(4.333f, -4.5f)
                moveToRelative(1.735f, -1.802f)
                lineToRelative(6.932f, -7.198f)
                verticalLineToRelative(5f)
                lineToRelative(-4.795f, 4.141f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 16.5f)
                lineToRelative(-11f, -10f)
                lineToRelative(-2f, 1f)
                lineToRelative(13f, 13.5f)
            }
        }.build()
        
        return _BrandVscode!!
    }

private var _BrandVscode: ImageVector? = null

