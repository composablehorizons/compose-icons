package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Skillet: ImageVector
    get() {
        if (_Skillet != null) return _Skillet!!
        
        _Skillet = ImageVector.Builder(
            name = "skillet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(177f, 400f)
                quadToRelative(14f, -36f, 4.5f, -64f)
                reflectiveQuadTo(149f, 280f)
                quadToRelative(-33f, -40f, -43.5f, -75.5f)
                reflectiveQuadTo(102f, 120f)
                horizontalLineToRelative(78f)
                quadToRelative(-8f, 38f, -2.5f, 62f)
                reflectiveQuadToRelative(28.5f, 52f)
                quadToRelative(38f, 46f, 48.5f, 81.5f)
                reflectiveQuadToRelative(0.5f, 84.5f)
                horizontalLineToRelative(-78f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(14f, -36f, 5f, -64f)
                reflectiveQuadToRelative(-32f, -56f)
                quadToRelative(-33f, -40f, -44f, -75.5f)
                reflectiveQuadToRelative(-4f, -84.5f)
                horizontalLineToRelative(78f)
                quadToRelative(-8f, 38f, -2.5f, 62f)
                reflectiveQuadToRelative(28.5f, 52f)
                quadToRelative(38f, 46f, 48.5f, 81.5f)
                reflectiveQuadToRelative(0.5f, 84.5f)
                horizontalLineToRelative(-78f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(14f, -36f, 5f, -64f)
                reflectiveQuadToRelative(-32f, -56f)
                quadToRelative(-33f, -40f, -44f, -75.5f)
                reflectiveQuadToRelative(-4f, -84.5f)
                horizontalLineToRelative(78f)
                quadToRelative(-8f, 38f, -2.5f, 62f)
                reflectiveQuadToRelative(28.5f, 52f)
                quadToRelative(38f, 46f, 48.5f, 81.5f)
                reflectiveQuadToRelative(0.5f, 84.5f)
                horizontalLineToRelative(-78f)
                close()
                moveTo(200f, 800f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(561f)
                quadToRelative(5f, -34f, 27f, -59.5f)
                reflectiveQuadToRelative(54f, -36.5f)
                lineToRelative(185f, -62f)
                lineToRelative(25f, 76f)
                lineToRelative(-185f, 62f)
                quadToRelative(-12f, 4f, -19.5f, 14.5f)
                reflectiveQuadTo(720f, 498f)
                verticalLineToRelative(182f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(400f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(640f, 680f)
                verticalLineToRelative(-120f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(200f, 720f)
                close()
                moveToRelative(200f, -80f)
                close()
            }
        }.build()
        
        return _Skillet!!
    }

private var _Skillet: ImageVector? = null

