package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Hanami_dango: ImageVector
    get() {
        if (_Hanami_dango != null) return _Hanami_dango!!
        
        _Hanami_dango = ImageVector.Builder(
            name = "hanami_dango",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(758f, 815f)
                quadToRelative(-49f, 30f, -107f, 24f)
                reflectiveQuadToRelative(-101f, -49f)
                quadToRelative(-29f, -29f, -41f, -66.5f)
                reflectiveQuadToRelative(-7f, -75.5f)
                quadToRelative(-38f, 5f, -75.5f, -7f)
                reflectiveQuadTo(360f, 600f)
                quadToRelative(-29f, -29f, -41f, -66.5f)
                reflectiveQuadToRelative(-7f, -75.5f)
                quadToRelative(-38f, 5f, -75.5f, -7f)
                reflectiveQuadTo(170f, 410f)
                quadToRelative(-43f, -43f, -49f, -101.5f)
                reflectiveQuadTo(145f, 201f)
                lineToRelative(-57f, -56f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(88f, 88f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(57f, 57f)
                quadToRelative(49f, -30f, 107f, -24f)
                reflectiveQuadToRelative(101f, 49f)
                quadToRelative(29f, 29f, 41f, 66f)
                reflectiveQuadToRelative(7f, 75f)
                quadToRelative(38f, -5f, 75.5f, 7.5f)
                reflectiveQuadTo(600f, 360f)
                quadToRelative(29f, 29f, 41f, 66f)
                reflectiveQuadToRelative(7f, 75f)
                quadToRelative(38f, -5f, 75.5f, 7.5f)
                reflectiveQuadTo(790f, 550f)
                quadToRelative(43f, 43f, 49f, 101f)
                reflectiveQuadToRelative(-24f, 107f)
                lineToRelative(57f, 57f)
                quadToRelative(11f, 12f, 11f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineToRelative(-57f, -56f)
                close()
            }
        }.build()
        
        return _Hanami_dango!!
    }

private var _Hanami_dango: ImageVector? = null

