package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Desktop_cloud: ImageVector
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
                moveToRelative(-40f, 280f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(80f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(560f)
                horizontalLineTo(560f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Desktop_cloud!!
    }

private var _Desktop_cloud: ImageVector? = null

