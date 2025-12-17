package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Flyover: ImageVector
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
                moveTo(160f, 560f)
                verticalLineToRelative(-131f)
                quadToRelative(-20f, 4f, -40f, 8.5f)
                reflectiveQuadTo(80f, 447f)
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
                close()
                moveToRelative(179f, -315f)
                lineToRelative(21f, -125f)
                horizontalLineToRelative(240f)
                lineToRelative(21f, 125f)
                quadToRelative(-35f, -2f, -70.5f, -4f)
                reflectiveQuadToRelative(-70.5f, -2f)
                quadToRelative(-35f, 0f, -70.5f, 1.5f)
                reflectiveQuadTo(339f, 245f)
                close()
                moveToRelative(-99f, 595f)
                lineToRelative(58f, -351f)
                quadToRelative(35f, -4f, 71f, -6.5f)
                reflectiveQuadToRelative(71f, -4.5f)
                verticalLineToRelative(122f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-122f)
                quadToRelative(35f, 2f, 71f, 5f)
                reflectiveQuadToRelative(71f, 7f)
                lineToRelative(58f, 350f)
                horizontalLineTo(520f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Flyover!!
    }

private var _Flyover: ImageVector? = null

