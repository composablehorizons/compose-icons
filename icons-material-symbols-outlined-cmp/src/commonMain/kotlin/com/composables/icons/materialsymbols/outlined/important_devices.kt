package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Important_devices: ImageVector
    get() {
        if (_Important_devices != null) return _Important_devices!!
        
        _Important_devices = ImageVector.Builder(
            name = "important_devices",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 800f)
                verticalLineToRelative(-318f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 442f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 482f)
                verticalLineToRelative(318f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 840f)
                horizontalLineTo(680f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-238f)
                horizontalLineTo(680f)
                verticalLineToRelative(238f)
                close()
                moveToRelative(-360f, 80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 600f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 200f)
                verticalLineToRelative(162f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-162f)
                horizontalLineTo(160f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                close()
                moveToRelative(28f, -290f)
                lineToRelative(92f, -70f)
                lineToRelative(92f, 70f)
                lineToRelative(-34f, -114f)
                lineToRelative(92f, -74f)
                horizontalLineTo(476f)
                lineToRelative(-36f, -112f)
                lineToRelative(-36f, 112f)
                horizontalLineTo(290f)
                lineToRelative(92f, 74f)
                lineToRelative(-34f, 114f)
                close()
                moveToRelative(92f, -150f)
                close()
            }
        }.build()
        
        return _Important_devices!!
    }

private var _Important_devices: ImageVector? = null

