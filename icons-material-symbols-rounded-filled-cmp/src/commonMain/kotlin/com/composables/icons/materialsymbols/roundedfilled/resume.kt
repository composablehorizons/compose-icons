package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Resume: ImageVector
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
                quadToRelative(-20f, 12f, -40.5f, 0f)
                reflectiveQuadTo(400f, 649f)
                verticalLineToRelative(-338f)
                quadToRelative(0f, -23f, 20.5f, -35f)
                reflectiveQuadToRelative(40.5f, 0f)
                lineToRelative(282f, 170f)
                quadToRelative(20f, 12f, 20f, 34f)
                reflectiveQuadToRelative(-20f, 34f)
                lineTo(461f, 684f)
                close()
            }
        }.build()
        
        return _Resume!!
    }

private var _Resume: ImageVector? = null

