package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Local_shipping: ImageVector
    get() {
        if (_Local_shipping != null) return _Local_shipping!!
        
        _Local_shipping = ImageVector.Builder(
            name = "local_shipping",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 800f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                horizontalLineTo(40f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 160f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(120f)
                lineToRelative(120f, 160f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                horizontalLineTo(360f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(280f, 680f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(240f, 640f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(200f, 680f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(240f, 720f)
                close()
                moveTo(120f, 600f)
                horizontalLineToRelative(32f)
                quadToRelative(17f, -18f, 39f, -29f)
                reflectiveQuadToRelative(49f, -11f)
                quadToRelative(27f, 0f, 49f, 11f)
                reflectiveQuadToRelative(39f, 29f)
                horizontalLineToRelative(272f)
                verticalLineToRelative(-360f)
                horizontalLineTo(120f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(600f, 120f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(760f, 680f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(720f, 640f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(680f, 680f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(720f, 720f)
                close()
                moveToRelative(-40f, -200f)
                horizontalLineToRelative(170f)
                lineToRelative(-90f, -120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                close()
                moveTo(360f, 420f)
                close()
            }
        }.build()
        
        return _Local_shipping!!
    }

private var _Local_shipping: ImageVector? = null

