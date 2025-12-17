package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Earthquake: ImageVector
    get() {
        if (_Earthquake != null) return _Earthquake!!
        
        _Earthquake = ImageVector.Builder(
            name = "earthquake",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(361f, 880f)
                quadToRelative(-14f, 0f, -24.5f, -7.5f)
                reflectiveQuadTo(322f, 852f)
                lineTo(220f, 520f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(170f)
                quadToRelative(13f, 0f, 23.5f, 7.5f)
                reflectiveQuadTo(288f, 468f)
                lineToRelative(66f, 215f)
                lineToRelative(127f, -571f)
                quadToRelative(3f, -14f, 14f, -23f)
                reflectiveQuadToRelative(25f, -9f)
                quadToRelative(14f, 0f, 25f, 8.5f)
                reflectiveQuadToRelative(14f, 22.5f)
                lineToRelative(87f, 376f)
                lineToRelative(56f, -179f)
                quadToRelative(4f, -13f, 14.5f, -20.5f)
                reflectiveQuadTo(740f, 280f)
                quadToRelative(13f, 0f, 23f, 7f)
                reflectiveQuadToRelative(15f, 19f)
                lineToRelative(50f, 134f)
                horizontalLineToRelative(52f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                quadToRelative(-13f, 0f, -23f, -7f)
                reflectiveQuadToRelative(-15f, -19f)
                lineToRelative(-19f, -51f)
                lineToRelative(-65f, 209f)
                quadToRelative(-4f, 13f, -15f, 21f)
                reflectiveQuadToRelative(-25f, 7f)
                quadToRelative(-14f, -1f, -24f, -9.5f)
                reflectiveQuadTo(601f, 649f)
                lineToRelative(-81f, -348f)
                lineToRelative(-121f, 548f)
                quadToRelative(-3f, 14f, -13.5f, 22f)
                reflectiveQuadTo(361f, 880f)
                close()
            }
        }.build()
        
        return _Earthquake!!
    }

private var _Earthquake: ImageVector? = null

