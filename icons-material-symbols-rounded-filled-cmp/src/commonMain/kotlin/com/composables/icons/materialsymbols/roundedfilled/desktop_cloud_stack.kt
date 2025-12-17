package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Desktop_cloud_stack: ImageVector
    get() {
        if (_Desktop_cloud_stack != null) return _Desktop_cloud_stack!!
        
        _Desktop_cloud_stack = ImageVector.Builder(
            name = "desktop_cloud_stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 640f)
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
                reflectiveQuadTo(160f, 520f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveToRelative(120f, -160f)
                close()
                moveTo(320f, 920f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 880f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 840f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-80f)
                horizontalLineTo(120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 680f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 200f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 280f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 760f)
                horizontalLineTo(460f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(20f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 880f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 920f)
                horizontalLineTo(320f)
                close()
                moveToRelative(520f, -400f)
                verticalLineToRelative(-400f)
                horizontalLineTo(240f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 40f)
                horizontalLineToRelative(600f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 120f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(840f, 520f)
                close()
            }
        }.build()
        
        return _Desktop_cloud_stack!!
    }

private var _Desktop_cloud_stack: ImageVector? = null

