package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Add_business: ImageVector
    get() {
        if (_Add_business != null) return _Add_business!!
        
        _Add_business = ImageVector.Builder(
            name = "add_business",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 920f)
                verticalLineToRelative(-120f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(800f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-240f)
                horizontalLineTo(40f)
                verticalLineToRelative(-80f)
                lineToRelative(40f, -200f)
                horizontalLineToRelative(600f)
                lineToRelative(40f, 200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-120f)
                horizontalLineTo(440f)
                verticalLineToRelative(240f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-160f)
                horizontalLineTo(160f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(-38f, -240f)
                horizontalLineToRelative(516f)
                horizontalLineToRelative(-516f)
                close()
                moveTo(80f, 240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(42f, 240f)
                horizontalLineToRelative(516f)
                lineToRelative(-24f, -120f)
                horizontalLineTo(146f)
                lineToRelative(-24f, 120f)
                close()
            }
        }.build()
        
        return _Add_business!!
    }

private var _Add_business: ImageVector? = null

