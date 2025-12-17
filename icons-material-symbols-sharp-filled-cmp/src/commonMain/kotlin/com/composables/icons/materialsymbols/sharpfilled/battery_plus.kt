package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Battery_plus: ImageVector
    get() {
        if (_Battery_plus != null) return _Battery_plus!!
        
        _Battery_plus = ImageVector.Builder(
            name = "battery_plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 880f)
                verticalLineToRelative(-120f)
                horizontalLineTo(520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(720f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-360f, 0f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(320f)
                quadToRelative(-8f, 0f, -16f, 0.5f)
                reflectiveQuadToRelative(-16f, 1.5f)
                quadToRelative(-88f, 12f, -148f, 79f)
                reflectiveQuadToRelative(-60f, 159f)
                quadToRelative(0f, 45f, 16f, 86f)
                reflectiveQuadToRelative(45f, 74f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Battery_plus!!
    }

private var _Battery_plus: ImageVector? = null

