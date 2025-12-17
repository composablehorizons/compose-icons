package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Outbox_alt: ImageVector
    get() {
        if (_Outbox_alt != null) return _Outbox_alt!!
        
        _Outbox_alt = ImageVector.Builder(
            name = "outbox_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(648f, 516f)
                quadToRelative(22f, -11f, 22f, -36f)
                reflectiveQuadToRelative(-22f, -36f)
                lineTo(298f, 269f)
                quadToRelative(-20f, -10f, -39f, 1.5f)
                reflectiveQuadTo(240f, 305f)
                verticalLineToRelative(350f)
                quadToRelative(0f, 23f, 19f, 34.5f)
                reflectiveQuadToRelative(39f, 1.5f)
                lineToRelative(350f, -175f)
                close()
                moveToRelative(-328f, 84f)
                verticalLineToRelative(-80f)
                lineToRelative(120f, -40f)
                lineToRelative(-120f, -40f)
                verticalLineToRelative(-80f)
                lineToRelative(260f, 120f)
                lineToRelative(-260f, 120f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(0f, -560f)
                verticalLineToRelative(560f)
                verticalLineToRelative(-560f)
                close()
            }
        }.build()
        
        return _Outbox_alt!!
    }

private var _Outbox_alt: ImageVector? = null

