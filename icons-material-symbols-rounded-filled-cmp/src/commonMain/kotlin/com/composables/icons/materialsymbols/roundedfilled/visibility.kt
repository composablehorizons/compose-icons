package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Visibility: ImageVector
    get() {
        if (_Visibility != null) return _Visibility!!
        
        _Visibility = ImageVector.Builder(
            name = "visibility",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 640f)
                quadToRelative(75f, 0f, 127.5f, -52.5f)
                reflectiveQuadTo(660f, 460f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-75f, 0f, -127.5f, 52.5f)
                reflectiveQuadTo(300f, 460f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(480f, 640f)
                close()
                moveToRelative(0f, -72f)
                quadToRelative(-45f, 0f, -76.5f, -31.5f)
                reflectiveQuadTo(372f, 460f)
                quadToRelative(0f, -45f, 31.5f, -76.5f)
                reflectiveQuadTo(480f, 352f)
                quadToRelative(45f, 0f, 76.5f, 31.5f)
                reflectiveQuadTo(588f, 460f)
                quadToRelative(0f, 45f, -31.5f, 76.5f)
                reflectiveQuadTo(480f, 568f)
                close()
                moveToRelative(0f, 192f)
                quadToRelative(-134f, 0f, -244.5f, -72f)
                reflectiveQuadTo(61f, 498f)
                quadToRelative(-5f, -9f, -7.5f, -18.5f)
                reflectiveQuadTo(51f, 460f)
                quadToRelative(0f, -10f, 2.5f, -19.5f)
                reflectiveQuadTo(61f, 422f)
                quadToRelative(64f, -118f, 174.5f, -190f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(134f, 0f, 244.5f, 72f)
                reflectiveQuadTo(899f, 422f)
                quadToRelative(5f, 9f, 7.5f, 18.5f)
                reflectiveQuadTo(909f, 460f)
                quadToRelative(0f, 10f, -2.5f, 19.5f)
                reflectiveQuadTo(899f, 498f)
                quadToRelative(-64f, 118f, -174.5f, 190f)
                reflectiveQuadTo(480f, 760f)
                close()
            }
        }.build()
        
        return _Visibility!!
    }

private var _Visibility: ImageVector? = null

