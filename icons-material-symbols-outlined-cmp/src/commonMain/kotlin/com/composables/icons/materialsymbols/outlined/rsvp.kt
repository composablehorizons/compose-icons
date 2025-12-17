package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Rsvp: ImageVector
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
                moveTo(40f, 600f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(140f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(240f, 420f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 18f, -10.5f, 33f)
                reflectiveQuadTo(204f, 516f)
                lineToRelative(36f, 84f)
                horizontalLineToRelative(-60f)
                lineToRelative(-34f, -80f)
                horizontalLineToRelative(-46f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-30f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 470f)
                verticalLineToRelative(-70f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 360f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(60f)
                horizontalLineTo(340f)
                verticalLineToRelative(30f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(460f, 490f)
                verticalLineToRelative(70f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(420f, 600f)
                horizontalLineTo(280f)
                close()
                moveToRelative(290f, 0f)
                lineToRelative(-70f, -240f)
                horizontalLineToRelative(60f)
                lineToRelative(40f, 137f)
                lineToRelative(40f, -137f)
                horizontalLineToRelative(60f)
                lineToRelative(-70f, 240f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(150f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(140f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(920f, 420f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(860f, 520f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
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

