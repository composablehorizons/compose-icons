package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Sdk: ImageVector
    get() {
        if (_Sdk != null) return _Sdk!!
        
        _Sdk = ImageVector.Builder(
            name = "sdk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-500f)
                quadToRelative(0f, -14f, 4.5f, -26.5f)
                reflectiveQuadTo(138f, 210f)
                lineToRelative(56f, -68f)
                quadToRelative(9f, -11f, 20.5f, -16.5f)
                reflectiveQuadTo(240f, 120f)
                horizontalLineToRelative(480f)
                quadToRelative(14f, 0f, 25.5f, 5.5f)
                reflectiveQuadTo(766f, 142f)
                lineToRelative(56f, 68f)
                quadToRelative(9f, 11f, 13.5f, 23.5f)
                reflectiveQuadTo(840f, 260f)
                verticalLineToRelative(500f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(16f, -600f)
                horizontalLineToRelative(528f)
                lineToRelative(-34f, -40f)
                horizontalLineTo(250f)
                lineToRelative(-34f, 40f)
                close()
                moveToRelative(-16f, 520f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-440f)
                horizontalLineTo(200f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(408f, -220f)
                lineToRelative(-55f, 55f)
                quadToRelative(-12f, 12f, -12f, 29f)
                reflectiveQuadToRelative(12f, 29f)
                quadToRelative(12f, 12f, 29f, 12f)
                reflectiveQuadToRelative(29f, -12f)
                lineToRelative(85f, -85f)
                quadToRelative(12f, -12f, 12f, -28f)
                reflectiveQuadToRelative(-12f, -28f)
                lineToRelative(-85f, -85f)
                quadToRelative(-12f, -12f, -29f, -12f)
                reflectiveQuadToRelative(-29f, 12f)
                quadToRelative(-12f, 12f, -12f, 29f)
                reflectiveQuadToRelative(12f, 29f)
                lineToRelative(55f, 55f)
                close()
                moveToRelative(-254f, 0f)
                lineToRelative(55f, -55f)
                quadToRelative(12f, -12f, 12f, -29f)
                reflectiveQuadToRelative(-12f, -29f)
                quadToRelative(-12f, -12f, -29f, -12f)
                reflectiveQuadToRelative(-29f, 12f)
                lineToRelative(-85f, 85f)
                quadToRelative(-12f, 12f, -12f, 28f)
                reflectiveQuadToRelative(12f, 28f)
                lineToRelative(85f, 85f)
                quadToRelative(12f, 12f, 29f, 12f)
                reflectiveQuadToRelative(29f, -12f)
                quadToRelative(12f, -12f, 12f, -29f)
                reflectiveQuadToRelative(-12f, -29f)
                lineToRelative(-55f, -55f)
                close()
                moveTo(200f, 760f)
                verticalLineToRelative(-440f)
                verticalLineToRelative(440f)
                close()
            }
        }.build()
        
        return _Sdk!!
    }

private var _Sdk: ImageVector? = null

