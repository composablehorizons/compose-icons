package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Beach_access: ImageVector
    get() {
        if (_Beach_access != null) return _Beach_access!!
        
        _Beach_access = ImageVector.Builder(
            name = "beach_access",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(758f, 812f)
                lineTo(560f, 614f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(198f, 198f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
                moveToRelative(-453f, -65f)
                quadToRelative(-28f, 28f, -65.5f, 26.5f)
                reflectiveQuadTo(182f, 741f)
                quadToRelative(-60f, -93f, -63.5f, -201.5f)
                reflectiveQuadTo(168f, 335f)
                quadToRelative(3f, 34f, 17f, 76.5f)
                reflectiveQuadToRelative(38.5f, 89.5f)
                quadToRelative(24.5f, 47f, 58.5f, 96.5f)
                reflectiveQuadToRelative(75f, 97.5f)
                lineToRelative(-52f, 52f)
                close()
                moveToRelative(107f, -107f)
                quadToRelative(-48f, -48f, -84f, -104.5f)
                reflectiveQuadTo(271.5f, 426f)
                quadToRelative(-20.5f, -53f, -23f, -96.5f)
                reflectiveQuadTo(267f, 265f)
                quadToRelative(21f, -22f, 64.5f, -20f)
                reflectiveQuadToRelative(97f, 22.5f)
                quadToRelative(53.5f, 20.5f, 110f, 57f)
                reflectiveQuadTo(643f, 409f)
                lineTo(412f, 640f)
                close()
                moveToRelative(330f, -459f)
                quadToRelative(31f, 20f, 33f, 57f)
                reflectiveQuadToRelative(-26f, 65f)
                lineToRelative(-51f, 51f)
                quadToRelative(-47f, -41f, -96.5f, -74f)
                reflectiveQuadToRelative(-96f, -58f)
                quadToRelative(-46.5f, -25f, -89f, -39.5f)
                reflectiveQuadTo(340f, 165f)
                quadToRelative(95f, -49f, 203f, -45f)
                reflectiveQuadToRelative(199f, 61f)
                close()
            }
        }.build()
        
        return _Beach_access!!
    }

private var _Beach_access: ImageVector? = null

