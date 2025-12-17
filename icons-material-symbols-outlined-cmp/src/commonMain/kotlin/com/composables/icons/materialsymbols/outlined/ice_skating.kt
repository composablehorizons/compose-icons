package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Ice_skating: ImageVector
    get() {
        if (_Ice_skating != null) return _Ice_skating!!
        
        _Ice_skating = ImageVector.Builder(
            name = "ice_skating",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(120f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 27f, 16.5f, 49f)
                reflectiveQuadToRelative(42.5f, 29f)
                lineToRelative(105f, 29f)
                quadToRelative(51f, 14f, 83.5f, 56.5f)
                reflectiveQuadTo(760f, 560f)
                verticalLineToRelative(160f)
                horizontalLineTo(640f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(80f)
                close()
                moveToRelative(120f, -240f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -27f, -16.5f, -47.5f)
                reflectiveQuadTo(621f, 484f)
                lineToRelative(-105f, -30f)
                quadToRelative(-36f, -11f, -63f, -35.5f)
                reflectiveQuadTo(412f, 360f)
                horizontalLineToRelative(-72f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                quadToRelative(0f, -8f, 6f, -14f)
                reflectiveQuadToRelative(14f, -6f)
                horizontalLineToRelative(64f)
                quadToRelative(-2f, -12f, -2.5f, -20f)
                reflectiveQuadToRelative(-1.5f, -20f)
                horizontalLineToRelative(-60f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                quadToRelative(0f, -8f, 6f, -14f)
                reflectiveQuadToRelative(14f, -6f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-40f)
                horizontalLineTo(200f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(120f, 160f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                close()
                moveTo(200f, 640f)
                close()
            }
        }.build()
        
        return _Ice_skating!!
    }

private var _Ice_skating: ImageVector? = null

