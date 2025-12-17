package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Potted_plant: ImageVector
    get() {
        if (_Potted_plant != null) return _Potted_plant!!
        
        _Potted_plant = ImageVector.Builder(
            name = "potted_plant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(342f, 880f)
                quadToRelative(-28f, 0f, -49f, -17f)
                reflectiveQuadToRelative(-28f, -44f)
                lineToRelative(-45f, -179f)
                horizontalLineToRelative(520f)
                lineToRelative(-45f, 179f)
                quadToRelative(-7f, 27f, -28f, 44f)
                reflectiveQuadToRelative(-49f, 17f)
                horizontalLineTo(342f)
                close()
                moveToRelative(138f, -560f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(0f, 90f, -57f, 156f)
                reflectiveQuadToRelative(-143f, 80f)
                verticalLineToRelative(84f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 600f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 520f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-84f)
                quadToRelative(-86f, -14f, -143f, -80f)
                reflectiveQuadToRelative(-57f, -156f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                close()
            }
        }.build()
        
        return _Potted_plant!!
    }

private var _Potted_plant: ImageVector? = null

