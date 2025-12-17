package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Satellite_alt: ImageVector
    get() {
        if (_Satellite_alt != null) return _Satellite_alt!!
        
        _Satellite_alt = ImageVector.Builder(
            name = "satellite_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 928f)
                verticalLineToRelative(-80f)
                quadToRelative(117f, 0f, 198.5f, -81.5f)
                reflectiveQuadTo(840f, 568f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 75f, -28.5f, 140.5f)
                reflectiveQuadToRelative(-77f, 114f)
                quadToRelative(-48.5f, 48.5f, -114f, 77f)
                reflectiveQuadTo(560f, 928f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-80f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(560f, 768f)
                close()
                moveToRelative(-69f, -101f)
                lineTo(384f, 561f)
                lineToRelative(-28f, 28f)
                lineToRelative(107f, 106f)
                lineTo(222f, 936f)
                lineTo(-34f, 681f)
                lineToRelative(242f, -241f)
                lineToRelative(106f, 107f)
                lineToRelative(28f, -28f)
                lineToRelative(-106f, -106f)
                lineToRelative(170f, -170f)
                lineToRelative(106f, 107f)
                lineToRelative(28f, -28f)
                lineToRelative(-106f, -107f)
                lineToRelative(240f, -240f)
                lineToRelative(255f, 255f)
                lineToRelative(-240f, 240f)
                lineToRelative(-107f, -106f)
                lineToRelative(-28f, 28f)
                lineToRelative(106f, 106f)
                lineToRelative(-169f, 169f)
                close()
                moveTo(80f, 682f)
                lineToRelative(142f, 142f)
                lineToRelative(42f, -42f)
                lineToRelative(-142f, -142f)
                lineToRelative(-42f, 42f)
                close()
                moveToRelative(227f, 57f)
                lineToRelative(42f, -42f)
                lineToRelative(-142f, -142f)
                lineToRelative(-42f, 42f)
                lineToRelative(142f, 142f)
                close()
                moveToRelative(240f, -524f)
                lineToRelative(142f, 142f)
                lineToRelative(42f, -42f)
                lineToRelative(-142f, -142f)
                lineToRelative(-42f, 42f)
                close()
                moveToRelative(227f, 57f)
                lineToRelative(42f, -42f)
                lineToRelative(-142f, -142f)
                lineToRelative(-42f, 42f)
                lineToRelative(142f, 142f)
                close()
            }
        }.build()
        
        return _Satellite_alt!!
    }

private var _Satellite_alt: ImageVector? = null

