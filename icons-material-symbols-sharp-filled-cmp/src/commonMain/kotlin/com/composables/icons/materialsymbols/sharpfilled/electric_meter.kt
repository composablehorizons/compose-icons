package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Electric_meter: ImageVector
    get() {
        if (_Electric_meter != null) return _Electric_meter!!
        
        _Electric_meter = ImageVector.Builder(
            name = "electric_meter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 878f)
                verticalLineToRelative(-100f)
                quadToRelative(-106f, -37f, -173f, -129.5f)
                reflectiveQuadTo(120f, 438f)
                quadToRelative(0f, -75f, 28.5f, -140.5f)
                reflectiveQuadToRelative(77f, -114f)
                quadToRelative(48.5f, -48.5f, 114f, -77f)
                reflectiveQuadTo(479f, 78f)
                quadToRelative(74f, 0f, 140f, 28.5f)
                reflectiveQuadToRelative(115f, 77f)
                quadToRelative(49f, 48.5f, 77.5f, 114f)
                reflectiveQuadTo(840f, 438f)
                quadToRelative(0f, 118f, -67.5f, 209.5f)
                reflectiveQuadTo(600f, 777f)
                verticalLineToRelative(101f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-82f)
                quadToRelative(-10f, 2f, -20f, 2f)
                horizontalLineToRelative(-21f)
                quadToRelative(-10f, 0f, -19.5f, -0.5f)
                reflectiveQuadTo(440f, 796f)
                verticalLineToRelative(82f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-40f, -518f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(130f, 320f)
                lineToRelative(120f, -120f)
                lineToRelative(-50f, -50f)
                lineToRelative(50f, -50f)
                lineToRelative(-60f, -60f)
                lineToRelative(-120f, 120f)
                lineToRelative(50f, 50f)
                lineToRelative(-50f, 50f)
                lineToRelative(60f, 60f)
                close()
            }
        }.build()
        
        return _Electric_meter!!
    }

private var _Electric_meter: ImageVector? = null

