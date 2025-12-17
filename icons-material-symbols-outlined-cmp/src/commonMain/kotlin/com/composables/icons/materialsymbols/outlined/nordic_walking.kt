package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Nordic_walking: ImageVector
    get() {
        if (_Nordic_walking != null) return _Nordic_walking!!
        
        _Nordic_walking = ImageVector.Builder(
            name = "nordic_walking",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 920f)
                lineToRelative(80f, -360f)
                horizontalLineToRelative(61f)
                lineTo(221f, 920f)
                horizontalLineToRelative(-61f)
                close()
                moveToRelative(120f, 0f)
                lineToRelative(112f, -564f)
                lineToRelative(-72f, 28f)
                verticalLineToRelative(136f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-188f)
                lineToRelative(202f, -86f)
                quadToRelative(29f, -12f, 59f, -2.5f)
                reflectiveQuadToRelative(47f, 36.5f)
                lineToRelative(40f, 64f)
                quadToRelative(26f, 42f, 70.5f, 69f)
                reflectiveQuadTo(760f, 440f)
                verticalLineToRelative(80f)
                quadToRelative(-66f, 0f, -123.5f, -27.5f)
                reflectiveQuadTo(540f, 420f)
                lineToRelative(-24f, 120f)
                lineToRelative(84f, 80f)
                verticalLineToRelative(300f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                lineToRelative(-84f, -80f)
                lineToRelative(-72f, 320f)
                horizontalLineToRelative(-84f)
                close()
                moveToRelative(260f, -700f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(460f, 140f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(540f, 60f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(620f, 140f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(540f, 220f)
                close()
                moveTo(700f, 920f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(-60f)
                close()
            }
        }.build()
        
        return _Nordic_walking!!
    }

private var _Nordic_walking: ImageVector? = null

