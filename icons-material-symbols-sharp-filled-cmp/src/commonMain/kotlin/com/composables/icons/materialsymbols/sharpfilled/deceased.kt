package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Deceased: ImageVector
    get() {
        if (_Deceased != null) return _Deceased!!
        
        _Deceased = ImageVector.Builder(
            name = "deceased",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 880f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadToRelative(-70f, -170f)
                verticalLineToRelative(-80f)
                quadToRelative(71f, -1f, 134f, 29f)
                reflectiveQuadToRelative(106f, 81f)
                verticalLineToRelative(-153f)
                quadToRelative(-86f, -14f, -143f, -80.5f)
                reflectiveQuadTo(240f, 280f)
                verticalLineToRelative(-223f)
                lineToRelative(140f, 121f)
                lineToRelative(100f, -121f)
                lineToRelative(100f, 121f)
                lineToRelative(140f, -121f)
                verticalLineToRelative(223f)
                quadToRelative(0f, 90f, -57f, 156.5f)
                reflectiveQuadTo(520f, 517f)
                verticalLineToRelative(153f)
                quadToRelative(43f, -51f, 106f, -81f)
                reflectiveQuadToRelative(134f, -29f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 100f, -70f, 170f)
                reflectiveQuadTo(520f, 880f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Deceased!!
    }

private var _Deceased: ImageVector? = null

