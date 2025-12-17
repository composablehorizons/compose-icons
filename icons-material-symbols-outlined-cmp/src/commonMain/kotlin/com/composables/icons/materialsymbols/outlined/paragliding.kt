package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Paragliding: ImageVector
    get() {
        if (_Paragliding != null) return _Paragliding!!
        
        _Paragliding = ImageVector.Builder(
            name = "paragliding",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 680f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 600f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 520f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 600f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveTo(360f, 960f)
                verticalLineToRelative(-144f)
                quadToRelative(-85f, -29f, -122.5f, -98.5f)
                reflectiveQuadTo(200f, 560f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 101f, 51f, 150.5f)
                reflectiveQuadTo(480f, 760f)
                quadToRelative(98f, 0f, 149f, -49.5f)
                reflectiveQuadTo(680f, 560f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 88f, -37.5f, 157.5f)
                reflectiveQuadTo(600f, 816f)
                verticalLineTo(960f)
                horizontalLineTo(360f)
                close()
                moveTo(200f, 520f)
                lineToRelative(-80f, -188f)
                quadToRelative(-5f, 3f, -17f, 10.5f)
                reflectiveQuadTo(80f, 350f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 310f)
                verticalLineToRelative(-140f)
                quadToRelative(0f, -71f, 129f, -120.5f)
                reflectiveQuadTo(480f, 0f)
                quadToRelative(182f, 0f, 311f, 49.5f)
                reflectiveQuadTo(920f, 170f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 350f)
                quadToRelative(-11f, 0f, -23f, -7.5f)
                reflectiveQuadTo(840f, 332f)
                lineToRelative(-80f, 188f)
                horizontalLineToRelative(-80f)
                lineToRelative(-60f, -251f)
                quadToRelative(-33f, -5f, -68f, -7f)
                reflectiveQuadToRelative(-72f, -2f)
                quadToRelative(-37f, 0f, -72f, 2f)
                reflectiveQuadToRelative(-68f, 7f)
                lineToRelative(-60f, 251f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(35f, -70f)
                lineToRelative(41f, -171f)
                quadToRelative(-28f, 6f, -53f, 13f)
                reflectiveQuadToRelative(-48f, 16f)
                lineToRelative(60f, 142f)
                close()
                moveToRelative(490f, -1f)
                lineToRelative(60f, -141f)
                quadToRelative(-23f, -9f, -48f, -16f)
                reflectiveQuadToRelative(-53f, -13f)
                lineToRelative(41f, 170f)
                close()
                moveTo(120f, 243f)
                quadToRelative(71f, -30f, 163.5f, -46.5f)
                reflectiveQuadTo(480f, 180f)
                quadToRelative(104f, 0f, 196.5f, 16.5f)
                reflectiveQuadTo(840f, 243f)
                verticalLineToRelative(-71f)
                quadToRelative(-5f, -10f, -30.5f, -25.5f)
                reflectiveQuadToRelative(-71f, -30.5f)
                quadToRelative(-45.5f, -15f, -110f, -25.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(-84f, 0f, -148.5f, 10.5f)
                reflectiveQuadToRelative(-110f, 25.5f)
                quadToRelative(-45.5f, 15f, -71f, 30.5f)
                reflectiveQuadTo(120f, 172f)
                verticalLineToRelative(71f)
                close()
                moveToRelative(360f, -163f)
                close()
            }
        }.build()
        
        return _Paragliding!!
    }

private var _Paragliding: ImageVector? = null

