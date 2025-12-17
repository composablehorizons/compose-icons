package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Plane_contrails: ImageVector
    get() {
        if (_Plane_contrails != null) return _Plane_contrails!!
        
        _Plane_contrails = ImageVector.Builder(
            name = "plane_contrails",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(377f, 880f)
                lineToRelative(-57f, -57f)
                lineToRelative(184f, -183f)
                lineToRelative(56f, 56f)
                lineTo(377f, 880f)
                close()
                moveToRelative(199f, 0f)
                lineToRelative(-56f, -57f)
                lineToRelative(163f, -163f)
                lineToRelative(57f, 56f)
                lineTo(576f, 880f)
                close()
                moveTo(137f, 440f)
                lineToRelative(-57f, -56f)
                lineToRelative(164f, -164f)
                lineToRelative(56f, 57f)
                lineToRelative(-163f, 163f)
                close()
                moveToRelative(0f, 200f)
                lineToRelative(-57f, -57f)
                lineToRelative(184f, -183f)
                lineToRelative(56f, 56f)
                lineToRelative(-183f, 184f)
                close()
                moveToRelative(623f, -21f)
                lineToRelative(-96f, -239f)
                lineToRelative(-78f, 78f)
                lineToRelative(19f, 94f)
                lineToRelative(-47f, 48f)
                lineToRelative(-71f, -128f)
                lineToRelative(-127f, -70f)
                lineToRelative(47f, -48f)
                lineToRelative(94f, 19f)
                lineToRelative(78f, -78f)
                lineToRelative(-239f, -95f)
                lineToRelative(60f, -57f)
                lineToRelative(287f, 45f)
                lineToRelative(91f, -90f)
                quadToRelative(9f, -9f, 20f, -13.5f)
                reflectiveQuadToRelative(22f, -4.5f)
                quadToRelative(11f, 0f, 22f, 4.5f)
                reflectiveQuadToRelative(20f, 13.5f)
                quadToRelative(9f, 8f, 13.5f, 19f)
                reflectiveQuadToRelative(4.5f, 22f)
                quadToRelative(0f, 11f, -4.5f, 22.5f)
                reflectiveQuadTo(862f, 182f)
                lineToRelative(-91f, 90f)
                lineToRelative(45f, 287f)
                lineToRelative(-56f, 60f)
                close()
            }
        }.build()
        
        return _Plane_contrails!!
    }

private var _Plane_contrails: ImageVector? = null

