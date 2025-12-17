package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Neurology: ImageVector
    get() {
        if (_Neurology != null) return _Neurology!!
        
        _Neurology = ImageVector.Builder(
            name = "neurology",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(570f, 840f)
                quadToRelative(-13f, 0f, -25.5f, -2.5f)
                reflectiveQuadTo(520f, 830f)
                verticalLineToRelative(-700f)
                quadToRelative(12f, -5f, 24.5f, -7.5f)
                reflectiveQuadTo(570f, 120f)
                quadToRelative(52f, 0f, 89.5f, 35f)
                reflectiveQuadToRelative(40.5f, 86f)
                quadToRelative(59f, 8f, 99.5f, 53f)
                reflectiveQuadTo(840f, 400f)
                quadToRelative(0f, 22f, -5.5f, 42f)
                reflectiveQuadTo(818f, 480f)
                quadToRelative(11f, 18f, 16.5f, 38.5f)
                reflectiveQuadTo(840f, 560f)
                quadToRelative(0f, 62f, -40.5f, 106.5f)
                reflectiveQuadTo(699f, 719f)
                quadToRelative(-5f, 50f, -41.5f, 85.5f)
                reflectiveQuadTo(570f, 840f)
                close()
                moveToRelative(-180f, 0f)
                quadToRelative(-51f, 0f, -88f, -35.5f)
                reflectiveQuadTo(260f, 719f)
                quadToRelative(-60f, -8f, -100f, -53f)
                reflectiveQuadToRelative(-40f, -106f)
                quadToRelative(0f, -21f, 5.5f, -41.5f)
                reflectiveQuadTo(142f, 480f)
                quadToRelative(-11f, -18f, -16.5f, -38f)
                reflectiveQuadToRelative(-5.5f, -42f)
                quadToRelative(0f, -61f, 40f, -105.5f)
                reflectiveQuadToRelative(99f, -52.5f)
                quadToRelative(3f, -51f, 41f, -86.5f)
                reflectiveQuadToRelative(90f, -35.5f)
                quadToRelative(13f, 0f, 25.5f, 3f)
                reflectiveQuadToRelative(24.5f, 8f)
                verticalLineToRelative(699f)
                quadToRelative(-12f, 5f, -24.5f, 7.5f)
                reflectiveQuadTo(390f, 840f)
                close()
            }
        }.build()
        
        return _Neurology!!
    }

private var _Neurology: ImageVector? = null

