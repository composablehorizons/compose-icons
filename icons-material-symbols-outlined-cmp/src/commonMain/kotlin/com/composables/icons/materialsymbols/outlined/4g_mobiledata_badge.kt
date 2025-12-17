package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.`4g_mobiledata_badge`: ImageVector
    get() {
        if (_4g_mobiledata_badge != null) return _4g_mobiledata_badge!!
        
        _4g_mobiledata_badge = ImageVector.Builder(
            name = "4g_mobiledata_badge",
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
                moveToRelative(0f, -80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(-560f)
                horizontalLineTo(120f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(680f, -320f)
                horizontalLineTo(660f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(80f)
                horizontalLineTo(600f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(200f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(720f, 280f)
                horizontalLineTo(600f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(520f, 360f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(600f, 680f)
                horizontalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(800f, 600f)
                verticalLineToRelative(-160f)
                close()
                moveTo(320f, 680f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _4g_mobiledata_badge!!
    }

private var _4g_mobiledata_badge: ImageVector? = null

