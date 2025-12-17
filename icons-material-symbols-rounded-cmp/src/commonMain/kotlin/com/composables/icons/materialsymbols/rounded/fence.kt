package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Fence: ImageVector
    get() {
        if (_Fence != null) return _Fence!!
        
        _Fence = ImageVector.Builder(
            name = "fence",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 760f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 600f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 560f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 400f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-103f)
                quadToRelative(0f, -8f, 3f, -15.5f)
                reflectiveQuadToRelative(9f, -13.5f)
                lineToRelative(80f, -80f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(52f, 52f)
                lineToRelative(52f, -52f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(52f, 52f)
                lineToRelative(51f, -52f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(80f, 80f)
                quadToRelative(6f, 6f, 9f, 13.5f)
                reflectiveQuadToRelative(3f, 15.5f)
                verticalLineToRelative(103f)
                horizontalLineToRelative(39f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 480f)
                horizontalLineToRelative(-39f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(39f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 600f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 640f)
                horizontalLineToRelative(-39f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(721f, 800f)
                horizontalLineTo(240f)
                close()
                moveToRelative(40f, -400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-87f)
                lineToRelative(-40f, -40f)
                lineToRelative(-40f, 40f)
                verticalLineToRelative(87f)
                close()
                moveToRelative(160f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-87f)
                lineToRelative(-40f, -40f)
                lineToRelative(-40f, 40f)
                verticalLineToRelative(87f)
                close()
                moveToRelative(161f, 0f)
                horizontalLineToRelative(79f)
                verticalLineToRelative(-87f)
                lineToRelative(-40f, -40f)
                lineToRelative(-39f, 39f)
                verticalLineToRelative(88f)
                close()
                moveTo(280f, 560f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(160f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(161f, 0f)
                horizontalLineToRelative(79f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-79f)
                verticalLineToRelative(80f)
                close()
                moveTo(280f, 720f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(160f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(161f, 0f)
                horizontalLineToRelative(79f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-79f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Fence!!
    }

private var _Fence: ImageVector? = null

