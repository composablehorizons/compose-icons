package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Beach_access: ImageVector
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
                moveTo(786f, 840f)
                lineTo(532f, 586f)
                lineToRelative(56f, -56f)
                lineToRelative(254f, 254f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(-546f, -28f)
                quadToRelative(-100f, -98f, -117.5f, -230f)
                reflectiveQuadTo(168f, 335f)
                quadToRelative(3f, 34f, 17f, 76.5f)
                reflectiveQuadToRelative(38.5f, 89.5f)
                quadToRelative(24.5f, 47f, 58.5f, 96.5f)
                reflectiveQuadToRelative(75f, 97.5f)
                lineTo(240f, 812f)
                close()
                moveToRelative(172f, -172f)
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
                moveToRelative(286f, -286f)
                quadToRelative(-47f, -41f, -96.5f, -74f)
                reflectiveQuadToRelative(-96f, -58f)
                quadToRelative(-46.5f, -25f, -89f, -39.5f)
                reflectiveQuadTo(340f, 165f)
                quadToRelative(115f, -60f, 246.5f, -41.5f)
                reflectiveQuadTo(814f, 238f)
                lineTo(698f, 354f)
                close()
            }
        }.build()
        
        return _Beach_access!!
    }

private var _Beach_access: ImageVector? = null

