package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Medical_mask: ImageVector
    get() {
        if (_Medical_mask != null) return _Medical_mask!!
        
        _Medical_mask = ImageVector.Builder(
            name = "medical_mask",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 762f)
                quadToRelative(-81f, 0f, -160.5f, -7f)
                reflectiveQuadTo(160f, 735f)
                verticalLineToRelative(-100f)
                quadToRelative(-53f, -14f, -86.5f, -57f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -54f, 33.5f, -97f)
                reflectiveQuadToRelative(86.5f, -57f)
                verticalLineToRelative(-135f)
                quadToRelative(80f, 13f, 159.5f, 20f)
                reflectiveQuadToRelative(160.5f, 7f)
                quadToRelative(81f, 0f, 160.5f, -7f)
                reflectiveQuadTo(800f, 191f)
                verticalLineToRelative(135f)
                quadToRelative(53f, 14f, 86.5f, 56.5f)
                reflectiveQuadTo(920f, 480f)
                quadToRelative(0f, 55f, -33.5f, 97.5f)
                reflectiveQuadTo(800f, 634f)
                verticalLineToRelative(101f)
                quadToRelative(-80f, 13f, -159.5f, 20f)
                reflectiveQuadTo(480f, 762f)
                close()
                moveToRelative(0f, -142f)
                quadToRelative(48f, 0f, 95f, -7f)
                reflectiveQuadToRelative(95f, -19f)
                verticalLineToRelative(-83f)
                quadToRelative(-48f, 13f, -95f, 21f)
                reflectiveQuadToRelative(-95f, 8f)
                quadToRelative(-48f, 0f, -94.5f, -8f)
                reflectiveQuadTo(291f, 511f)
                verticalLineToRelative(83f)
                quadToRelative(48f, 12f, 94.5f, 19f)
                reflectiveQuadToRelative(94.5f, 7f)
                close()
                moveToRelative(-320f, -71f)
                verticalLineToRelative(-137f)
                quadToRelative(-19f, 11f, -29.5f, 29f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, 22f, 10.5f, 40f)
                reflectiveQuadToRelative(29.5f, 29f)
                close()
                moveToRelative(640f, 0f)
                quadToRelative(19f, -11f, 29.5f, -29f)
                reflectiveQuadToRelative(10.5f, -40f)
                quadToRelative(0f, -21f, -11f, -39f)
                reflectiveQuadToRelative(-29f, -29f)
                verticalLineToRelative(137f)
                close()
                moveToRelative(-320f, -89f)
                quadToRelative(48f, 0f, 95f, -7f)
                reflectiveQuadToRelative(95f, -19f)
                verticalLineToRelative(-83f)
                quadToRelative(-48f, 13f, -95f, 21f)
                reflectiveQuadToRelative(-95f, 8f)
                quadToRelative(-48f, 0f, -94.5f, -8f)
                reflectiveQuadTo(291f, 351f)
                verticalLineToRelative(83f)
                quadToRelative(48f, 12f, 94.5f, 19f)
                reflectiveQuadToRelative(94.5f, 7f)
                close()
            }
        }.build()
        
        return _Medical_mask!!
    }

private var _Medical_mask: ImageVector? = null

