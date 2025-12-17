package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandJavascript: ImageVector
    get() {
        if (_BrandJavascript != null) return _BrandJavascript!!
        
        _BrandJavascript = ImageVector.Builder(
            name = "brand-javascript",
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
                moveTo(20f, 4f)
                lineToRelative(-2f, 14.5f)
                lineToRelative(-6f, 2f)
                lineToRelative(-6f, -2f)
                lineToRelative(-2f, -14.5f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.5f, 8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(8f)
                lineToRelative(-2f, -1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.5f, 8f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(1.423f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.495f, 0.57f)
                lineToRelative(-0.418f, 2.93f)
                lineToRelative(-2f, 0.5f)
            }
        }.build()
        
        return _BrandJavascript!!
    }

private var _BrandJavascript: ImageVector? = null

