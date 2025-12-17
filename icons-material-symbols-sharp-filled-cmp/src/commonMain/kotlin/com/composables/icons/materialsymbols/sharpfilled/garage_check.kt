package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Garage_check: ImageVector
    get() {
        if (_Garage_check != null) return _Garage_check!!
        
        _Garage_check = ImageVector.Builder(
            name = "garage_check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(306f, 380f)
                lineToRelative(28f, -80f)
                horizontalLineToRelative(292f)
                lineToRelative(28f, 80f)
                horizontalLineTo(306f)
                close()
                moveToRelative(54f, 180f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 520f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 520f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 560f)
                close()
                moveToRelative(332f, 250f)
                lineToRelative(142f, -142f)
                lineToRelative(-30f, -30f)
                lineToRelative(-112f, 112f)
                lineToRelative(-56f, -56f)
                lineToRelative(-30f, 30f)
                lineToRelative(86f, 86f)
                close()
                moveToRelative(28f, -290f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                close()
                moveTo(491f, 880f)
                horizontalLineTo(80f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(411f)
                quadToRelative(-26f, -19f, -56.5f, -31f)
                reflectiveQuadTo(760f, 443f)
                lineToRelative(-77f, -223f)
                horizontalLineTo(277f)
                lineToRelative(-77f, 224f)
                verticalLineToRelative(296f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(167f)
                quadToRelative(-3f, 14f, -5f, 29f)
                reflectiveQuadToRelative(-2f, 31f)
                quadToRelative(0f, 45f, 13.5f, 85.5f)
                reflectiveQuadTo(491f, 880f)
                close()
            }
        }.build()
        
        return _Garage_check!!
    }

private var _Garage_check: ImageVector? = null

