package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Desktop_cloud: ImageVector
    get() {
        if (_Desktop_cloud != null) return _Desktop_cloud!!
        
        _Desktop_cloud = ImageVector.Builder(
            name = "desktop_cloud",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 560f)
                horizontalLineToRelative(260f)
                quadToRelative(42f, 0f, 71f, -29.5f)
                reflectiveQuadToRelative(29f, -71.5f)
                quadToRelative(0f, -42f, -30f, -71f)
                reflectiveQuadToRelative(-72f, -29f)
                quadToRelative(-8f, -51f, -47f, -85f)
                reflectiveQuadToRelative(-91f, -34f)
                quadToRelative(-41f, 0f, -75f, 22f)
                reflectiveQuadToRelative(-51f, 59f)
                quadToRelative(-48f, 2f, -81f, 36.5f)
                reflectiveQuadTo(240f, 440f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 400f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(-10f)
                quadToRelative(0f, -29f, 20.5f, -49.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(29f, 0f, 49.5f, 20.5f)
                reflectiveQuadTo(550f, 390f)
                verticalLineToRelative(50f)
                horizontalLineToRelative(70f)
                quadToRelative(8f, 0f, 14f, 6f)
                reflectiveQuadToRelative(6f, 14f)
                quadToRelative(0f, 8f, -6f, 14f)
                reflectiveQuadToRelative(-14f, 6f)
                horizontalLineTo(360f)
                close()
                moveToRelative(40f, 280f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 600f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 680f)
                horizontalLineTo(560f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 840f)
                horizontalLineTo(360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 760f)
                horizontalLineToRelative(40f)
                close()
                moveTo(160f, 600f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-400f)
                horizontalLineTo(160f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-400f)
                verticalLineToRelative(400f)
                close()
            }
        }.build()
        
        return _Desktop_cloud!!
    }

private var _Desktop_cloud: ImageVector? = null

