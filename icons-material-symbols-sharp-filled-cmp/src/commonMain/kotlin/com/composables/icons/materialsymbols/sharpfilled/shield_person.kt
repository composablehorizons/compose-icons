package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Shield_person: ImageVector
    get() {
        if (_Shield_person != null) return _Shield_person!!
        
        _Shield_person = ImageVector.Builder(
            name = "shield_person",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 520f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                close()
                moveToRelative(0f, 360f)
                quadToRelative(-146f, -37f, -233f, -160f)
                reflectiveQuadToRelative(-87f, -276f)
                verticalLineToRelative(-244f)
                lineToRelative(320f, -120f)
                lineToRelative(320f, 120f)
                verticalLineToRelative(244f)
                quadToRelative(0f, 153f, -87f, 276f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -84f)
                quadToRelative(59f, -19f, 104.5f, -59.5f)
                reflectiveQuadTo(664f, 645f)
                quadToRelative(-43f, -22f, -89.5f, -33.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(-48f, 0f, -94.5f, 11.5f)
                reflectiveQuadTo(296f, 645f)
                quadToRelative(34f, 51f, 79.5f, 91.5f)
                reflectiveQuadTo(480f, 796f)
                close()
            }
        }.build()
        
        return _Shield_person!!
    }

private var _Shield_person: ImageVector? = null

