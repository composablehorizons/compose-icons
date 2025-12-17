package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Unsubscribe: ImageVector
    get() {
        if (_Unsubscribe != null) return _Unsubscribe!!
        
        _Unsubscribe = ImageVector.Builder(
            name = "unsubscribe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 520f)
                lineTo(160f, 320f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(320f)
                quadToRelative(0f, 21f, 3f, 40.5f)
                reflectiveQuadToRelative(9f, 39.5f)
                horizontalLineTo(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(308f)
                quadToRelative(-18f, -9f, -38.5f, -15f)
                reflectiveQuadToRelative(-41.5f, -9f)
                verticalLineToRelative(-124f)
                lineTo(480f, 520f)
                close()
                moveToRelative(0f, -80f)
                lineToRelative(320f, -200f)
                horizontalLineTo(160f)
                lineToRelative(320f, 200f)
                close()
                moveTo(760f, 920f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(560f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(760f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(960f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(760f, 920f)
                close()
                moveTo(640f, 740f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-40f)
                horizontalLineTo(640f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(-480f, -20f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Unsubscribe!!
    }

private var _Unsubscribe: ImageVector? = null

