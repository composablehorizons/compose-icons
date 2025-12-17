package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Beenhere: ImageVector
    get() {
        if (_Beenhere != null) return _Beenhere!!
        
        _Beenhere = ImageVector.Builder(
            name = "beenhere",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 900f)
                quadToRelative(-13f, 0f, -25f, -4f)
                reflectiveQuadToRelative(-23f, -12f)
                lineTo(192f, 704f)
                quadToRelative(-15f, -11f, -23.5f, -28f)
                reflectiveQuadToRelative(-8.5f, -36f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 160f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 19f, -8.5f, 36f)
                reflectiveQuadTo(768f, 704f)
                lineTo(528f, 884f)
                quadToRelative(-11f, 8f, -23f, 12f)
                reflectiveQuadToRelative(-25f, 4f)
                close()
                moveToRelative(-42f, -414f)
                lineToRelative(-56f, -56f)
                quadToRelative(-12f, -12f, -28f, -11.5f)
                reflectiveQuadTo(326f, 430f)
                quadToRelative(-12f, 12f, -12.5f, 28.5f)
                reflectiveQuadTo(325f, 487f)
                lineToRelative(85f, 85f)
                quadToRelative(12f, 12f, 28f, 12f)
                reflectiveQuadToRelative(28f, -12f)
                lineToRelative(170f, -170f)
                quadToRelative(12f, -12f, 11.5f, -28f)
                reflectiveQuadTo(636f, 346f)
                quadToRelative(-12f, -12f, -28.5f, -12.5f)
                reflectiveQuadTo(579f, 345f)
                lineTo(438f, 486f)
                close()
            }
        }.build()
        
        return _Beenhere!!
    }

private var _Beenhere: ImageVector? = null

