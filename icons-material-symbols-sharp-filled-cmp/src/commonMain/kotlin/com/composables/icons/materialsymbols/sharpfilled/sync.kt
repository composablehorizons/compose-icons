package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Sync: ImageVector
    get() {
        if (_Sync != null) return _Sync!!
        
        _Sync = ImageVector.Builder(
            name = "sync",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(110f)
                lineToRelative(-16f, -14f)
                quadToRelative(-49f, -49f, -71.5f, -106.5f)
                reflectiveQuadTo(160f, 482f)
                quadToRelative(0f, -111f, 66.5f, -197.5f)
                reflectiveQuadTo(400f, 170f)
                verticalLineToRelative(84f)
                quadToRelative(-72f, 26f, -116f, 88.5f)
                reflectiveQuadTo(240f, 482f)
                quadToRelative(0f, 45f, 17f, 87.5f)
                reflectiveQuadToRelative(53f, 78.5f)
                lineToRelative(10f, 10f)
                verticalLineToRelative(-98f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(160f)
                close()
                moveToRelative(400f, -10f)
                verticalLineToRelative(-84f)
                quadToRelative(72f, -26f, 116f, -88.5f)
                reflectiveQuadTo(720f, 478f)
                quadToRelative(0f, -45f, -17f, -87.5f)
                reflectiveQuadTo(650f, 312f)
                lineToRelative(-10f, -10f)
                verticalLineToRelative(98f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(690f)
                lineToRelative(16f, 14f)
                quadToRelative(49f, 49f, 71.5f, 106.5f)
                reflectiveQuadTo(800f, 478f)
                quadToRelative(0f, 111f, -66.5f, 197.5f)
                reflectiveQuadTo(560f, 790f)
                close()
            }
        }.build()
        
        return _Sync!!
    }

private var _Sync: ImageVector? = null

