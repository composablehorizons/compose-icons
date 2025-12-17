package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Kitchen: ImageVector
    get() {
        if (_Kitchen != null) return _Kitchen!!
        
        _Kitchen = ImageVector.Builder(
            name = "kitchen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(0f, 360f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(160f, -200f)
                close()
                moveTo(160f, 880f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(440f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -520f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(280f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Kitchen!!
    }

private var _Kitchen: ImageVector? = null

