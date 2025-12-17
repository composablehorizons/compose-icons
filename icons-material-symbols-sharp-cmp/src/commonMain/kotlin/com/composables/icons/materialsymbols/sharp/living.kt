package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Living: ImageVector
    get() {
        if (_Living != null) return _Living!!
        
        _Living = ImageVector.Builder(
            name = "living",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(800f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-640f)
                horizontalLineTo(160f)
                verticalLineToRelative(640f)
                close()
                moveToRelative(40f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-306f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(-174f)
                horizontalLineTo(250f)
                verticalLineToRelative(174f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(306f)
                close()
                moveToRelative(60f, -60f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineTo(260f)
                close()
                moveToRelative(140f, -140f)
                verticalLineToRelative(-118f)
                horizontalLineToRelative(-90f)
                verticalLineToRelative(-102f)
                horizontalLineToRelative(340f)
                verticalLineToRelative(102f)
                horizontalLineToRelative(-90f)
                verticalLineToRelative(118f)
                horizontalLineTo(400f)
                close()
                moveTo(160f, 800f)
                verticalLineToRelative(-640f)
                verticalLineToRelative(640f)
                close()
            }
        }.build()
        
        return _Living!!
    }

private var _Living: ImageVector? = null

