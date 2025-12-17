package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Front_loader: ImageVector
    get() {
        if (_Front_loader != null) return _Front_loader!!
        
        _Front_loader = ImageVector.Builder(
            name = "front_loader",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(159f, 791f)
                quadToRelative(-50f, 0f, -84.5f, -35f)
                reflectiveQuadTo(40f, 671f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(200f)
                lineToRelative(120f, 120f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(39f)
                verticalLineToRelative(-80f)
                lineToRelative(101f, -100f)
                lineToRelative(179f, 340f)
                horizontalLineTo(679f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-39f)
                verticalLineToRelative(70f)
                quadToRelative(20f, 17f, 30f, 40.5f)
                reflectiveQuadToRelative(10f, 49.5f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                quadToRelative(-38f, 0f, -69f, -22f)
                reflectiveQuadToRelative(-45f, -58f)
                horizontalLineTo(273f)
                quadToRelative(-14f, 36f, -45f, 58f)
                reflectiveQuadToRelative(-69f, 22f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(17f, 0f, 29f, -11.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(160f, 631f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(120f, 671f)
                quadToRelative(0f, 17f, 11f, 28.5f)
                reflectiveQuadToRelative(28f, 11.5f)
                close()
                moveToRelative(401f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(600f, 671f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(560f, 631f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(520f, 671f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(560f, 711f)
                close()
                moveToRelative(267f, -200f)
                lineToRelative(-67f, -127f)
                verticalLineToRelative(127f)
                horizontalLineToRelative(67f)
                close()
                moveToRelative(-427f, -80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-127f)
                lineToRelative(-74f, -73f)
                horizontalLineToRelative(-86f)
                verticalLineToRelative(200f)
                close()
            }
        }.build()
        
        return _Front_loader!!
    }

private var _Front_loader: ImageVector? = null

