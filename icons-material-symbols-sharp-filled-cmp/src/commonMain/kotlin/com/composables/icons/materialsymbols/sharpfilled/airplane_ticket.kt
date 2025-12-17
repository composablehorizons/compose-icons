package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Airplane_ticket: ImageVector
    get() {
        if (_Airplane_ticket != null) return _Airplane_ticket!!
        
        _Airplane_ticket = ImageVector.Builder(
            name = "airplane_ticket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-240f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(80f, 400f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(274f, -174f)
                lineToRelative(356f, -94f)
                quadToRelative(15f, -4f, 22.5f, -18.5f)
                reflectiveQuadTo(736f, 484f)
                quadToRelative(-4f, -15f, -17.5f, -22.5f)
                reflectiveQuadTo(690f, 458f)
                lineToRelative(-98f, 26f)
                lineToRelative(-160f, -150f)
                lineToRelative(-56f, 14f)
                lineToRelative(96f, 168f)
                lineToRelative(-96f, 24f)
                lineToRelative(-50f, -38f)
                lineToRelative(-38f, 10f)
                lineToRelative(66f, 114f)
                close()
            }
        }.build()
        
        return _Airplane_ticket!!
    }

private var _Airplane_ticket: ImageVector? = null

