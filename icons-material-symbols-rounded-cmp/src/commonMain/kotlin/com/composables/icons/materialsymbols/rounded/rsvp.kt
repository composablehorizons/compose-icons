package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Rsvp: ImageVector
    get() {
        if (_Rsvp != null) return _Rsvp!!
        
        _Rsvp = ImageVector.Builder(
            name = "rsvp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 570f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(70f, 360f)
                horizontalLineToRelative(110f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(240f, 420f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 18f, -10.5f, 33f)
                reflectiveQuadTo(204f, 516f)
                lineToRelative(20f, 46f)
                quadToRelative(6f, 14f, -2.5f, 26f)
                reflectiveQuadTo(198f, 600f)
                quadToRelative(-8f, 0f, -15f, -4.5f)
                reflectiveQuadTo(173f, 583f)
                lineToRelative(-27f, -63f)
                horizontalLineToRelative(-46f)
                verticalLineToRelative(50f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(70f, 600f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(40f, 570f)
                close()
                moveToRelative(360f, -30f)
                verticalLineToRelative(-30f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 470f)
                verticalLineToRelative(-70f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 360f)
                horizontalLineToRelative(110f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(460f, 390f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(430f, 420f)
                horizontalLineToRelative(-90f)
                verticalLineToRelative(30f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(460f, 490f)
                verticalLineToRelative(70f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(420f, 600f)
                horizontalLineTo(310f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(280f, 570f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(310f, 540f)
                horizontalLineToRelative(90f)
                close()
                moveToRelative(200f, -43f)
                lineToRelative(34f, -116f)
                quadToRelative(3f, -9f, 10.5f, -15f)
                reflectiveQuadToRelative(17.5f, -6f)
                quadToRelative(14f, 0f, 22.5f, 11.5f)
                reflectiveQuadTo(689f, 397f)
                lineToRelative(-53f, 182f)
                quadToRelative(-3f, 9f, -10.5f, 15f)
                reflectiveQuadToRelative(-17.5f, 6f)
                horizontalLineToRelative(-16f)
                quadToRelative(-10f, 0f, -17.5f, -6f)
                reflectiveQuadTo(564f, 579f)
                lineToRelative(-53f, -182f)
                quadToRelative(-4f, -14f, 4.5f, -25.5f)
                reflectiveQuadTo(538f, 360f)
                quadToRelative(10f, 0f, 17.5f, 6f)
                reflectiveQuadToRelative(10.5f, 15f)
                lineToRelative(34f, 116f)
                close()
                moveToRelative(120f, 73f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(750f, 360f)
                horizontalLineToRelative(110f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(920f, 420f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(860f, 520f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(50f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(750f, 600f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(720f, 570f)
                close()
                moveTo(100f, 460f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(680f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Rsvp!!
    }

private var _Rsvp: ImageVector? = null

