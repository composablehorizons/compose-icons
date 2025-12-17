package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Flyover: ImageVector
    get() {
        if (_Flyover != null) return _Flyover!!
        
        _Flyover = ImageVector.Builder(
            name = "flyover",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 447f)
                verticalLineToRelative(-83f)
                quadToRelative(99f, -24f, 198.5f, -34f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(102f, 0f, 201.5f, 10f)
                reflectiveQuadTo(880f, 364f)
                verticalLineToRelative(83f)
                quadToRelative(-20f, -5f, -40f, -9f)
                lineToRelative(-40f, -8f)
                verticalLineToRelative(130f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-144f)
                quadToRelative(-60f, -8f, -120f, -12f)
                reflectiveQuadToRelative(-120f, -4f)
                quadToRelative(-60f, 0f, -120f, 3.5f)
                reflectiveQuadTo(240f, 415f)
                verticalLineToRelative(145f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-131f)
                quadToRelative(-20f, 4f, -40f, 8.5f)
                reflectiveQuadTo(80f, 447f)
                close()
                moveToRelative(160f, 393f)
                lineToRelative(58f, -351f)
                quadToRelative(18f, -2f, 41f, -3.5f)
                reflectiveQuadToRelative(41f, -2.5f)
                lineToRelative(-60f, 357f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(120f, -720f)
                horizontalLineToRelative(80f)
                lineToRelative(-20f, 119f)
                quadToRelative(-18f, 1f, -40.5f, 2.5f)
                reflectiveQuadTo(339f, 245f)
                lineToRelative(21f, -125f)
                close()
                moveToRelative(80f, 720f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(0f, -240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-119f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(119f)
                close()
                moveToRelative(80f, -480f)
                horizontalLineToRelative(80f)
                lineToRelative(21f, 125f)
                quadToRelative(-18f, -1f, -40.5f, -3f)
                reflectiveQuadToRelative(-40.5f, -3f)
                lineToRelative(-20f, -119f)
                close()
                moveToRelative(120f, 720f)
                lineToRelative(-60f, -357f)
                quadToRelative(18f, 1f, 41f, 3f)
                reflectiveQuadToRelative(41f, 4f)
                lineToRelative(58f, 350f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Flyover!!
    }

private var _Flyover: ImageVector? = null

