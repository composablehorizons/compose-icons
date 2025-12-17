package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.General_device: ImageVector
    get() {
        if (_General_device != null) return _General_device!!
        
        _General_device = ImageVector.Builder(
            name = "general_device",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 720f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 680f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(400f, 120f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(640f, 200f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 720f)
                horizontalLineTo(360f)
                close()
                moveToRelative(40f, -80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-440f)
                horizontalLineTo(400f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(-40f, 120f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 840f)
                horizontalLineTo(360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 760f)
                close()
                moveToRelative(40f, -120f)
                horizontalLineToRelative(160f)
                horizontalLineToRelative(-160f)
                close()
            }
        }.build()
        
        return _General_device!!
    }

private var _General_device: ImageVector? = null

