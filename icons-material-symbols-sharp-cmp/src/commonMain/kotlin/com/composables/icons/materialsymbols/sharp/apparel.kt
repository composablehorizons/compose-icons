package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Apparel: ImageVector
    get() {
        if (_Apparel != null) return _Apparel!!
        
        _Apparel = ImageVector.Builder(
            name = "apparel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 438f)
                lineToRelative(-75f, 41f)
                lineTo(46f, 271f)
                lineToRelative(264f, -151f)
                horizontalLineToRelative(90f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 160f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(90f)
                lineToRelative(264f, 151f)
                lineToRelative(-118f, 206f)
                lineToRelative(-76f, -38f)
                verticalLineToRelative(401f)
                horizontalLineTo(240f)
                verticalLineToRelative(-402f)
                close()
                moveToRelative(80f, -134f)
                verticalLineToRelative(456f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-456f)
                lineToRelative(124f, 68f)
                lineToRelative(42f, -70f)
                lineToRelative(-172f, -100f)
                quadToRelative(-15f, 51f, -56.5f, 84.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-56f, 0f, -97.5f, -33.5f)
                reflectiveQuadTo(326f, 202f)
                lineTo(154f, 302f)
                lineToRelative(42f, 70f)
                lineToRelative(124f, -68f)
                close()
                moveToRelative(160f, 177f)
                close()
            }
        }.build()
        
        return _Apparel!!
    }

private var _Apparel: ImageVector? = null

