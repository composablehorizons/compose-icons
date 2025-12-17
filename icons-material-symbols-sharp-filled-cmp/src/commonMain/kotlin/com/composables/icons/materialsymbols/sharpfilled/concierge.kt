package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Concierge: ImageVector
    get() {
        if (_Concierge != null) return _Concierge!!
        
        _Concierge = ImageVector.Builder(
            name = "concierge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 520f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-440f)
                horizontalLineTo(40f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(240f, 0f)
                horizontalLineToRelative(79f)
                lineToRelative(321f, -120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(520f)
                lineToRelative(-70f, 27f)
                lineToRelative(-14f, -37f)
                lineToRelative(84f, -30f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-80f)
                lineTo(560f, 80f)
                lineToRelative(-280f, 79f)
                verticalLineToRelative(361f)
                close()
                moveTo(400f, 880f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(-80f)
                horizontalLineTo(400f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(40f, -120f)
                horizontalLineToRelative(440f)
                quadToRelative(0f, -81f, -51.5f, -141.5f)
                reflectiveQuadTo(700f, 544f)
                verticalLineToRelative(-65f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(65f)
                quadToRelative(-78f, 14f, -129f, 74.5f)
                reflectiveQuadTo(440f, 760f)
                close()
            }
        }.build()
        
        return _Concierge!!
    }

private var _Concierge: ImageVector? = null

