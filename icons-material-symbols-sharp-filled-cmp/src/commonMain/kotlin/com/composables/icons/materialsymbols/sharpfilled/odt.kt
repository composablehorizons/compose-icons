package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Odt: ImageVector
    get() {
        if (_Odt != null) return _Odt!!
        
        _Odt = ImageVector.Builder(
            name = "odt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 600f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-240f)
                horizontalLineTo(200f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(60f, -60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(140f, 60f)
                horizontalLineToRelative(130f)
                lineToRelative(30f, -30f)
                verticalLineToRelative(-180f)
                lineToRelative(-30f, -30f)
                horizontalLineTo(400f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(60f, -60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(190f, 60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(-60f)
                horizontalLineTo(600f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(180f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Odt!!
    }

private var _Odt: ImageVector? = null

