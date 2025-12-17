package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Home_storage: ImageVector
    get() {
        if (_Home_storage != null) return _Home_storage!!
        
        _Home_storage = ImageVector.Builder(
            name = "home_storage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(268f, 840f)
                quadToRelative(-29f, 0f, -51.5f, -19f)
                reflectiveQuadTo(189f, 773f)
                lineToRelative(-61f, -366f)
                quadToRelative(-3f, -18f, 8.5f, -32.5f)
                reflectiveQuadTo(167f, 360f)
                horizontalLineToRelative(626f)
                quadToRelative(19f, 0f, 30.5f, 14.5f)
                reflectiveQuadTo(832f, 407f)
                lineToRelative(-61f, 366f)
                quadToRelative(-5f, 29f, -27.5f, 48f)
                reflectiveQuadTo(692f, 840f)
                horizontalLineTo(268f)
                close()
                moveToRelative(132f, -240f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(600f, 560f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(560f, 520f)
                horizontalLineTo(400f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(360f, 560f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(400f, 600f)
                close()
                moveTo(240f, 320f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 280f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 240f)
                horizontalLineToRelative(480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 280f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 320f)
                horizontalLineTo(240f)
                close()
                moveToRelative(80f, -120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 120f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 200f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Home_storage!!
    }

private var _Home_storage: ImageVector? = null

