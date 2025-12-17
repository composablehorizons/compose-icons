package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Psychiatry: ImageVector
    get() {
        if (_Psychiatry != null) return _Psychiatry!!
        
        _Psychiatry = ImageVector.Builder(
            name = "psychiatry",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 840f)
                verticalLineToRelative(-319f)
                quadToRelative(-64f, 0f, -123f, -24.5f)
                reflectiveQuadTo(213f, 427f)
                quadToRelative(-45f, -45f, -69f, -104f)
                reflectiveQuadToRelative(-24f, -123f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                quadToRelative(63f, 0f, 122f, 24.5f)
                reflectiveQuadTo(426f, 214f)
                quadToRelative(31f, 31f, 51.5f, 68f)
                reflectiveQuadToRelative(31.5f, 79f)
                quadToRelative(5f, -7f, 11f, -13.5f)
                reflectiveQuadToRelative(13f, -13.5f)
                quadToRelative(45f, -45f, 104f, -69.5f)
                reflectiveQuadTo(760f, 240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 64f, -24.5f, 123f)
                reflectiveQuadTo(746f, 547f)
                quadToRelative(-45f, 45f, -103.5f, 69f)
                reflectiveQuadTo(520f, 640f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Psychiatry!!
    }

private var _Psychiatry: ImageVector? = null

