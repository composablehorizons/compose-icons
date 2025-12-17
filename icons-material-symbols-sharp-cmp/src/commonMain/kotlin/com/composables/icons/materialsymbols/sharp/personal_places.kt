package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Personal_places: ImageVector
    get() {
        if (_Personal_places != null) return _Personal_places!!
        
        _Personal_places = ImageVector.Builder(
            name = "personal_places",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 840f)
                verticalLineToRelative(-680f)
                horizontalLineToRelative(390f)
                quadToRelative(14f, 0f, 26f, 6.5f)
                reflectiveQuadToRelative(20f, 17.5f)
                lineToRelative(124f, 176f)
                lineToRelative(-124f, 176f)
                quadToRelative(-8f, 11f, -20f, 17.5f)
                reflectiveQuadToRelative(-26f, 6.5f)
                horizontalLineTo(320f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(80f, -360f)
                horizontalLineToRelative(300f)
                lineToRelative(80f, -120f)
                lineToRelative(-80f, -120f)
                horizontalLineTo(320f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-240f)
                verticalLineToRelative(240f)
                close()
            }
        }.build()
        
        return _Personal_places!!
    }

private var _Personal_places: ImageVector? = null

