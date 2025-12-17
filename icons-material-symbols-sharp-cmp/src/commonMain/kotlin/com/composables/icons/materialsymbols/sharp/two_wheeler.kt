package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Two_wheeler: ImageVector
    get() {
        if (_Two_wheeler != null) return _Two_wheeler!!
        
        _Two_wheeler = ImageVector.Builder(
            name = "two_wheeler",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 760f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadTo(0f, 600f)
                quadToRelative(0f, -57f, 36.5f, -101f)
                reflectiveQuadToRelative(93.5f, -55f)
                lineToRelative(-28f, -24f)
                horizontalLineTo(0f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(180f)
                lineToRelative(100f, 60f)
                lineToRelative(160f, -60f)
                horizontalLineToRelative(126f)
                lineToRelative(-62f, -80f)
                horizontalLineTo(400f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(142f)
                lineToRelative(84f, 108f)
                lineToRelative(134f, -68f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-92f)
                lineToRelative(70f, 92f)
                quadToRelative(15f, -6f, 30.5f, -9f)
                reflectiveQuadToRelative(31.5f, -3f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -27f, 9.5f, -52.5f)
                reflectiveQuadTo(676f, 500f)
                lineToRelative(-20f, -24f)
                lineToRelative(-136f, 204f)
                horizontalLineTo(400f)
                lineToRelative(-80f, -70f)
                quadToRelative(-5f, 63f, -51f, 106.5f)
                reflectiveQuadTo(160f, 760f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(240f, 600f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(160f, 520f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(80f, 600f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(160f, 680f)
                close()
                moveToRelative(294f, -240f)
                lineToRelative(-144f, 54f)
                lineToRelative(144f, -54f)
                horizontalLineToRelative(130f)
                horizontalLineToRelative(-130f)
                close()
                moveToRelative(346f, 240f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(880f, 600f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(800f, 520f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(720f, 600f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(800f, 680f)
                close()
                moveToRelative(-322f, -80f)
                lineToRelative(106f, -160f)
                horizontalLineTo(454f)
                lineToRelative(-144f, 54f)
                lineToRelative(120f, 106f)
                horizontalLineToRelative(48f)
                close()
            }
        }.build()
        
        return _Two_wheeler!!
    }

private var _Two_wheeler: ImageVector? = null

