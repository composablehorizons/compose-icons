package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Child_friendly: ImageVector
    get() {
        if (_Child_friendly != null) return _Child_friendly!!
        
        _Child_friendly = ImageVector.Builder(
            name = "child_friendly",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(340f, 880f)
                quadToRelative(-26f, 0f, -43f, -17f)
                reflectiveQuadToRelative(-17f, -43f)
                quadToRelative(0f, -26f, 17f, -43f)
                reflectiveQuadToRelative(43f, -17f)
                quadToRelative(26f, 0f, 43f, 17f)
                reflectiveQuadToRelative(17f, 43f)
                quadToRelative(0f, 26f, -17f, 43f)
                reflectiveQuadToRelative(-43f, 17f)
                close()
                moveToRelative(440f, 0f)
                quadToRelative(-26f, 0f, -43f, -17f)
                reflectiveQuadToRelative(-17f, -43f)
                quadToRelative(0f, -26f, 17f, -43f)
                reflectiveQuadToRelative(43f, -17f)
                quadToRelative(26f, 0f, 43f, 17f)
                reflectiveQuadToRelative(17f, 43f)
                quadToRelative(0f, 26f, -17f, 43f)
                reflectiveQuadToRelative(-43f, 17f)
                close()
                moveTo(540f, 304f)
                lineTo(384f, 116f)
                quadToRelative(36f, -18f, 78f, -27f)
                reflectiveQuadToRelative(90f, -9f)
                quadToRelative(51f, 0f, 97.5f, 14.5f)
                reflectiveQuadTo(732f, 136f)
                lineTo(540f, 304f)
                close()
                moveTo(280f, 720f)
                verticalLineToRelative(-508f)
                lineToRelative(-20f, -24f)
                quadToRelative(-14f, -17f, -23.5f, -22.5f)
                reflectiveQuadTo(216f, 160f)
                quadToRelative(-24f, 0f, -40f, 18f)
                reflectiveQuadToRelative(-16f, 42f)
                horizontalLineTo(80f)
                quadToRelative(0f, -57f, 39.5f, -98.5f)
                reflectiveQuadTo(216f, 80f)
                quadToRelative(30f, 0f, 55f, 14f)
                reflectiveQuadToRelative(51f, 44f)
                lineToRelative(483f, 582f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Child_friendly!!
    }

private var _Child_friendly: ImageVector? = null

