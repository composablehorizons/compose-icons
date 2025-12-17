package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Full_hd: ImageVector
    get() {
        if (_Full_hd != null) return _Full_hd!!
        
        _Full_hd = ImageVector.Builder(
            name = "full_hd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(380f, 600f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(100f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-100f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(220f, 0f)
                horizontalLineToRelative(140f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(780f, 560f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(740f, 360f)
                horizontalLineTo(600f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(60f, -60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(-480f, 60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-60f)
                horizontalLineTo(180f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(-60f, 200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 160f)
                horizontalLineToRelative(720f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 800f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Full_hd!!
    }

private var _Full_hd: ImageVector? = null

