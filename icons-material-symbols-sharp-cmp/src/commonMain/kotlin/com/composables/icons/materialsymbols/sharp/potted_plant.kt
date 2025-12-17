package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Potted_plant: ImageVector
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
                moveTo(342f, 800f)
                horizontalLineToRelative(276f)
                lineToRelative(40f, -160f)
                horizontalLineTo(302f)
                lineToRelative(40f, 160f)
                close()
                moveToRelative(-62f, 80f)
                lineToRelative(-60f, -240f)
                horizontalLineToRelative(520f)
                lineTo(680f, 880f)
                horizontalLineTo(280f)
                close()
                moveToRelative(-80f, -320f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(280f, -240f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(0f, 90f, -57f, 156f)
                reflectiveQuadToRelative(-143f, 80f)
                verticalLineToRelative(84f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(240f)
                horizontalLineTo(120f)
                verticalLineToRelative(-240f)
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

