package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Resume: ImageVector
    get() {
        if (_Resume != null) return _Resume!!
        
        _Resume = ImageVector.Builder(
            name = "resume",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 680f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 280f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 720f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 680f)
                close()
                moveToRelative(221f, 4f)
                lineToRelative(282f, -170f)
                quadToRelative(10f, -6f, 14.5f, -15f)
                reflectiveQuadToRelative(4.5f, -19f)
                quadToRelative(0f, -10f, -4.5f, -19f)
                reflectiveQuadTo(743f, 446f)
                lineTo(461f, 276f)
                quadToRelative(-5f, -3f, -10.5f, -4f)
                reflectiveQuadToRelative(-10.5f, -1f)
                quadToRelative(-16f, 0f, -28f, 11.5f)
                reflectiveQuadTo(400f, 311f)
                verticalLineToRelative(338f)
                quadToRelative(0f, 17f, 12f, 28.5f)
                reflectiveQuadToRelative(28f, 11.5f)
                quadToRelative(5f, 0f, 10.5f, -1f)
                reflectiveQuadToRelative(10.5f, -4f)
                close()
                moveToRelative(19f, -105f)
                verticalLineToRelative(-198f)
                lineToRelative(165f, 99f)
                lineToRelative(-165f, 99f)
                close()
                moveToRelative(0f, -99f)
                close()
            }
        }.build()
        
        return _Resume!!
    }

private var _Resume: ImageVector? = null

