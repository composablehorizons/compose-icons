package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mobile_layout: ImageVector
    get() {
        if (_Mobile_layout != null) return _Mobile_layout!!
        
        _Mobile_layout = ImageVector.Builder(
            name = "mobile_layout",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 840f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(240f)
                horizontalLineTo(40f)
                close()
                moveToRelative(480f, 0f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(720f)
                horizontalLineTo(520f)
                close()
                moveToRelative(-400f, -80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                horizontalLineTo(120f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(480f, 0f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-560f)
                horizontalLineTo(600f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(120f, -40f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(760f, 680f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(720f, 640f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(680f, 680f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(720f, 720f)
                close()
                moveTo(40f, 520f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(400f)
                horizontalLineTo(40f)
                close()
                moveToRelative(240f, -200f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(320f, 280f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(280f, 240f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 280f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 320f)
                close()
                moveTo(120f, 427f)
                lineToRelative(80f, -107f)
                lineToRelative(90f, 120f)
                horizontalLineToRelative(70f)
                verticalLineToRelative(-240f)
                horizontalLineTo(120f)
                verticalLineToRelative(227f)
                close()
                moveToRelative(120f, 293f)
                close()
                moveToRelative(480f, -240f)
                close()
                moveTo(240f, 320f)
                close()
            }
        }.build()
        
        return _Mobile_layout!!
    }

private var _Mobile_layout: ImageVector? = null

