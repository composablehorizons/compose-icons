package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Blinds: ImageVector
    get() {
        if (_Blinds != null) return _Blinds!!
        
        _Blinds = ImageVector.Builder(
            name = "blinds",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(160f, -560f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 320f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(73f)
                quadToRelative(14f, 10f, 22f, 25f)
                reflectiveQuadToRelative(8f, 32f)
                quadToRelative(0f, 29f, -20.5f, 49.5f)
                reflectiveQuadTo(600f, 720f)
                quadToRelative(-29f, 0f, -49.5f, -20.5f)
                reflectiveQuadTo(530f, 650f)
                quadToRelative(0f, -17f, 8f, -32f)
                reflectiveQuadToRelative(22f, -25f)
                verticalLineToRelative(-73f)
                horizontalLineTo(240f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(400f, -480f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Blinds!!
    }

private var _Blinds: ImageVector? = null

