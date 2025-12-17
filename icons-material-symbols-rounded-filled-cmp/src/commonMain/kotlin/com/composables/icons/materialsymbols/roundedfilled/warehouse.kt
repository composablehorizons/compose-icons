package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Warehouse: ImageVector
    get() {
        if (_Warehouse != null) return _Warehouse!!
        
        _Warehouse = ImageVector.Builder(
            name = "warehouse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 760f)
                verticalLineToRelative(-426f)
                quadToRelative(0f, -25f, 13.5f, -45f)
                reflectiveQuadToRelative(36.5f, -29f)
                lineToRelative(320f, -128f)
                quadToRelative(14f, -6f, 30f, -6f)
                reflectiveQuadToRelative(30f, 6f)
                lineToRelative(320f, 128f)
                quadToRelative(23f, 9f, 36.5f, 29f)
                reflectiveQuadToRelative(13.5f, 45f)
                verticalLineToRelative(426f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 840f)
                horizontalLineTo(640f)
                verticalLineToRelative(-320f)
                horizontalLineTo(320f)
                verticalLineToRelative(320f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                close()
                moveToRelative(280f, 80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(80f, -120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(80f, 120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Warehouse!!
    }

private var _Warehouse: ImageVector? = null

