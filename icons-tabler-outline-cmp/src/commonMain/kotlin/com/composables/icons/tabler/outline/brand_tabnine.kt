package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandTabnine: ImageVector
    get() {
        if (_BrandTabnine != null) return _BrandTabnine!!
        
        _BrandTabnine = ImageVector.Builder(
            name = "brand-tabnine",
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
                moveTo(20f, 12f)
                lineToRelative(-12f, 6.75f)
                moveToRelative(12f, -6.75f)
                lineToRelative(-12f, -6.75f)
                moveToRelative(12f, 6.75f)
                verticalLineToRelative(-4.527f)
                lineToRelative(-8f, -4.473f)
                lineToRelative(-4f, 2.25f)
                moveToRelative(12f, 6.75f)
                verticalLineToRelative(4.5f)
                lineToRelative(-8f, 4.5f)
                lineToRelative(-4f, -2.25f)
                moveToRelative(0f, -13.5f)
                lineToRelative(-4f, 2.222f)
                verticalLineToRelative(9.028f)
                lineToRelative(4f, 2.25f)
                close()
            }
        }.build()
        
        return _BrandTabnine!!
    }

private var _BrandTabnine: ImageVector? = null

