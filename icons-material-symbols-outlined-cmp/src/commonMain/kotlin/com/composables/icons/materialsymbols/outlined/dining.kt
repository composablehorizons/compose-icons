package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Dining: ImageVector
    get() {
        if (_Dining != null) return _Dining!!
        
        _Dining = ImageVector.Builder(
            name = "dining",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 760f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-270f)
                quadToRelative(26f, -8f, 43f, -28.5f)
                reflectiveQuadToRelative(17f, -49.5f)
                verticalLineToRelative(-152f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(100f)
                horizontalLineToRelative(-30f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(100f)
                horizontalLineToRelative(-30f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(152f)
                quadToRelative(0f, 29f, 17f, 49.5f)
                reflectiveQuadToRelative(43f, 28.5f)
                verticalLineToRelative(270f)
                close()
                moveToRelative(240f, 0f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-254f)
                quadToRelative(33f, -16f, 51.5f, -51f)
                reflectiveQuadToRelative(18.5f, -82f)
                quadToRelative(0f, -57f, -28.5f, -95f)
                reflectiveQuadTo(590f, 240f)
                quadToRelative(-43f, 0f, -71.5f, 38f)
                reflectiveQuadTo(490f, 373f)
                quadToRelative(0f, 47f, 18.5f, 82f)
                reflectiveQuadToRelative(51.5f, 51f)
                verticalLineToRelative(254f)
                close()
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(640f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-640f)
                horizontalLineTo(160f)
                verticalLineToRelative(640f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-640f)
                verticalLineToRelative(640f)
                close()
            }
        }.build()
        
        return _Dining!!
    }

private var _Dining: ImageVector? = null

