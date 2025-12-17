package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Laptop_chromebook: ImageVector
    get() {
        if (_Laptop_chromebook != null) return _Laptop_chromebook!!
        
        _Laptop_chromebook = ImageVector.Builder(
            name = "laptop_chromebook",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 800f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(600f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(0f)
                close()
                moveToRelative(400f, -80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-40f)
                horizontalLineTo(400f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Laptop_chromebook!!
    }

private var _Laptop_chromebook: ImageVector? = null

