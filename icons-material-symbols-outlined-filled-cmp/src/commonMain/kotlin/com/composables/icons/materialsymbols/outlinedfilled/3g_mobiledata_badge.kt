package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.`3g_mobiledata_badge`: ImageVector
    get() {
        if (_3g_mobiledata_badge != null) return _3g_mobiledata_badge!!
        
        _3g_mobiledata_badge = ImageVector.Builder(
            name = "3g_mobiledata_badge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 120f)
                horizontalLineToRelative(720f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 840f)
                horizontalLineTo(120f)
                close()
                moveToRelative(640f, -400f)
                horizontalLineTo(640f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(80f)
                horizontalLineTo(560f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(200f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(680f, 280f)
                horizontalLineTo(560f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(480f, 360f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(560f, 680f)
                horizontalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(760f, 600f)
                verticalLineToRelative(-160f)
                close()
                moveTo(200f, 680f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(440f, 600f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(380f, 480f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(440f, 420f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(360f, 280f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _3g_mobiledata_badge!!
    }

private var _3g_mobiledata_badge: ImageVector? = null

