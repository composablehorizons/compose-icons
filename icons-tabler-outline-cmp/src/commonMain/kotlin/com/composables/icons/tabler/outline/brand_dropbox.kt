package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandDropbox: ImageVector
    get() {
        if (_BrandDropbox != null) return _BrandDropbox!!
        
        _BrandDropbox = ImageVector.Builder(
            name = "brand-dropbox",
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
                moveTo(7.5f, 10.625f)
                lineToRelative(-4.5f, -2.813f)
                lineToRelative(4.5f, -2.812f)
                lineToRelative(4.5f, 2.813f)
                moveToRelative(-4.5f, 2.812f)
                lineToRelative(4.5f, -2.813f)
                moveToRelative(-4.5f, 2.813f)
                lineToRelative(-4.5f, 2.823f)
                lineToRelative(4.5f, 2.802f)
                moveToRelative(0f, -5.625f)
                lineToRelative(4.5f, 2.823f)
                moveToRelative(0f, -5.636f)
                lineToRelative(4.5f, 2.791f)
                lineToRelative(4.5f, -2.812f)
                lineToRelative(-4.5f, -2.791f)
                lineToRelative(-4.5f, 2.813f)
                close()
                moveToRelative(-4.5f, 8.438f)
                lineToRelative(4.5f, -2.802f)
                moveToRelative(-4.5f, 2.802f)
                verticalLineToRelative(1.123f)
                lineToRelative(4.5f, 2.627f)
                lineToRelative(4.5f, -2.627f)
                verticalLineToRelative(-1.123f)
                moveToRelative(-4.5f, -2.802f)
                lineToRelative(4.5f, -2.823f)
                lineToRelative(4.5f, 2.823f)
                lineToRelative(-4.5f, 2.802f)
                moveToRelative(-4.5f, -2.802f)
                lineToRelative(4.5f, 2.802f)
            }
        }.build()
        
        return _BrandDropbox!!
    }

private var _BrandDropbox: ImageVector? = null

