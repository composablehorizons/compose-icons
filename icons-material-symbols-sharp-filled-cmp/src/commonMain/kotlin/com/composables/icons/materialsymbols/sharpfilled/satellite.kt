package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Satellite: ImageVector
    get() {
        if (_Satellite != null) return _Satellite!!
        
        _Satellite = ImageVector.Builder(
            name = "satellite",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 680f)
                horizontalLineToRelative(480f)
                lineTo(570f, 480f)
                lineTo(450f, 640f)
                lineToRelative(-90f, -120f)
                lineToRelative(-120f, 160f)
                close()
                moveToRelative(0f, -200f)
                quadToRelative(100f, 0f, 170f, -70f)
                reflectiveQuadToRelative(70f, -170f)
                horizontalLineToRelative(-68f)
                quadToRelative(0f, 72f, -50f, 122f)
                reflectiveQuadToRelative(-122f, 50f)
                verticalLineToRelative(68f)
                close()
                moveToRelative(0f, -136f)
                quadToRelative(43f, 0f, 72.5f, -30.5f)
                reflectiveQuadTo(342f, 240f)
                horizontalLineTo(240f)
                verticalLineToRelative(104f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Satellite!!
    }

private var _Satellite: ImageVector? = null

