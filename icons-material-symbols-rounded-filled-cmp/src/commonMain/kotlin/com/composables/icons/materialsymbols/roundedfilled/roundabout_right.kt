package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Roundabout_right: ImageVector
    get() {
        if (_Roundabout_right != null) return _Roundabout_right!!
        
        _Roundabout_right = ImageVector.Builder(
            name = "roundabout_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 800f)
                verticalLineToRelative(-203f)
                quadToRelative(-88f, -14f, -144f, -81.5f)
                reflectiveQuadTo(80f, 360f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(88f, 0f, 155.5f, 56f)
                reflectiveQuadTo(557f, 320f)
                horizontalLineToRelative(170f)
                lineToRelative(-36f, -36f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(104f, 104f)
                quadToRelative(6f, 6f, 8.5f, 13f)
                reflectiveQuadToRelative(2.5f, 15f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineTo(748f, 492f)
                quadToRelative(-11f, 11f, -27.5f, 11f)
                reflectiveQuadTo(692f, 492f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(35f, -35f)
                horizontalLineTo(556f)
                quadToRelative(-29f, 0f, -51f, -19f)
                reflectiveQuadToRelative(-27f, -48f)
                quadToRelative(-10f, -58f, -54.5f, -95.5f)
                reflectiveQuadTo(320f, 200f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                quadToRelative(0f, 59f, 37.5f, 103.5f)
                reflectiveQuadTo(293f, 518f)
                quadToRelative(29f, 5f, 48f, 27f)
                reflectiveQuadToRelative(19f, 51f)
                verticalLineToRelative(204f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 800f)
                close()
            }
        }.build()
        
        return _Roundabout_right!!
    }

private var _Roundabout_right: ImageVector? = null

