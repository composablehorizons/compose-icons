package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Security_update_warning: ImageVector
    get() {
        if (_Security_update_warning != null) return _Security_update_warning!!
        
        _Security_update_warning = ImageVector.Builder(
            name = "security_update_warning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 680f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveToRelative(0f, -160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 480f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 320f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 520f)
                close()
                moveTo(280f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 840f)
                verticalLineToRelative(-720f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 40f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 120f)
                verticalLineToRelative(720f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 920f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, -120f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-40f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-480f)
                horizontalLineTo(280f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, -560f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-40f)
                horizontalLineTo(280f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, 640f)
                verticalLineToRelative(40f)
                verticalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _Security_update_warning!!
    }

private var _Security_update_warning: ImageVector? = null

