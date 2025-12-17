package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Instant_mix: ImageVector
    get() {
        if (_Instant_mix != null) return _Instant_mix!!
        
        _Instant_mix = ImageVector.Builder(
            name = "instant_mix",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 800f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, -440f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                close()
                moveToRelative(80f, 440f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, -280f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Instant_mix!!
    }

private var _Instant_mix: ImageVector? = null

