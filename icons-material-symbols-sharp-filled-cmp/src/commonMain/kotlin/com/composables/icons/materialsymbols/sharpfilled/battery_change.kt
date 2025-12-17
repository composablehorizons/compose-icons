package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Battery_change: ImageVector
    get() {
        if (_Battery_change != null) return _Battery_change!!
        
        _Battery_change = ImageVector.Builder(
            name = "battery_change",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 880f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(720f)
                horizontalLineTo(280f)
                close()
                moveToRelative(190f, -174f)
                lineToRelative(57f, -56f)
                lineToRelative(-38f, -38f)
                quadToRelative(-5f, -5f, -7f, -10.5f)
                reflectiveQuadToRelative(-2f, -11.5f)
                quadToRelative(0f, -7f, 2f, -12.5f)
                reflectiveQuadToRelative(7f, -10.5f)
                lineToRelative(38f, -38f)
                quadToRelative(16f, -16f, 24.5f, -36f)
                reflectiveQuadToRelative(8.5f, -42f)
                quadToRelative(0f, -23f, -8.5f, -43.5f)
                reflectiveQuadTo(527f, 371f)
                lineToRelative(-38f, -38f)
                lineToRelative(-56f, 57f)
                lineToRelative(37f, 37f)
                quadToRelative(5f, 5f, 7.5f, 10.5f)
                reflectiveQuadTo(480f, 450f)
                quadToRelative(0f, 6f, -2.5f, 11.5f)
                reflectiveQuadTo(470f, 472f)
                lineToRelative(-37f, 38f)
                quadToRelative(-16f, 16f, -24.5f, 36f)
                reflectiveQuadToRelative(-8.5f, 43f)
                quadToRelative(0f, 23f, 8.5f, 43.5f)
                reflectiveQuadTo(433f, 669f)
                lineToRelative(37f, 37f)
                close()
            }
        }.build()
        
        return _Battery_change!!
    }

private var _Battery_change: ImageVector? = null

