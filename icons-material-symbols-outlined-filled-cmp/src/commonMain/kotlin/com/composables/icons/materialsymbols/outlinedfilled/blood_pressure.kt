package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Blood_pressure: ImageVector
    get() {
        if (_Blood_pressure != null) return _Blood_pressure!!
        
        _Blood_pressure = ImageVector.Builder(
            name = "blood_pressure",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 880f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 680f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(680f, 880f)
                close()
                moveToRelative(8f, -180f)
                lineToRelative(91f, -91f)
                lineToRelative(-28f, -28f)
                lineToRelative(-91f, 91f)
                lineToRelative(28f, 28f)
                close()
                moveTo(80f, 440f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(244f)
                quadToRelative(-40f, -41f, -91.5f, -62.5f)
                reflectiveQuadTo(680f, 400f)
                quadToRelative(-38f, 0f, -72.5f, 9.5f)
                reflectiveQuadTo(542f, 436f)
                lineToRelative(-66f, -134f)
                quadToRelative(-5f, -10f, -15f, -15f)
                reflectiveQuadToRelative(-21f, -5f)
                quadToRelative(-11f, 0f, -21f, 5f)
                reflectiveQuadToRelative(-15f, 15f)
                lineTo(280f, 551f)
                lineToRelative(-45f, -89f)
                quadToRelative(-5f, -10f, -14.5f, -16f)
                reflectiveQuadToRelative(-20.5f, -6f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, 360f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(95f)
                lineToRelative(69f, 138f)
                quadToRelative(5f, 11f, 14.5f, 16.5f)
                reflectiveQuadTo(280f, 680f)
                quadToRelative(11f, 0f, 20.5f, -5.5f)
                reflectiveQuadTo(315f, 658f)
                lineToRelative(125f, -248f)
                lineToRelative(38f, 76f)
                quadToRelative(-36f, 38f, -57f, 87.5f)
                reflectiveQuadTo(400f, 680f)
                quadToRelative(0f, 31f, 6.5f, 61.5f)
                reflectiveQuadTo(427f, 800f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Blood_pressure!!
    }

private var _Blood_pressure: ImageVector? = null

