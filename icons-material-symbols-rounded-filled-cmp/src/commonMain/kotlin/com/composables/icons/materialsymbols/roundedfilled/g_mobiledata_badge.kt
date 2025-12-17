package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.G_mobiledata_badge: ImageVector
    get() {
        if (_G_mobiledata_badge != null) return _G_mobiledata_badge!!
        
        _G_mobiledata_badge = ImageVector.Builder(
            name = "g_mobiledata_badge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(200f, -160f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(640f, 600f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 440f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(520f, 520f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(80f)
                horizontalLineTo(400f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(560f, 280f)
                horizontalLineTo(400f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(320f, 360f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(400f, 680f)
                close()
            }
        }.build()
        
        return _G_mobiledata_badge!!
    }

private var _G_mobiledata_badge: ImageVector? = null

