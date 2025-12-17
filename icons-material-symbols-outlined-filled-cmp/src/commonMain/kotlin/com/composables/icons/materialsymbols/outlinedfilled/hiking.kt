package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Hiking: ImageVector
    get() {
        if (_Hiking != null) return _Hiking!!
        
        _Hiking = ImageVector.Builder(
            name = "hiking",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 920f)
                lineToRelative(123f, -622f)
                quadToRelative(6f, -29f, 27f, -43.5f)
                reflectiveQuadToRelative(44f, -14.5f)
                quadToRelative(23f, 0f, 42.5f, 10f)
                reflectiveQuadToRelative(31.5f, 30f)
                lineToRelative(40f, 64f)
                quadToRelative(18f, 29f, 46.5f, 52.5f)
                reflectiveQuadTo(700f, 431f)
                verticalLineToRelative(-71f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-406f)
                quadToRelative(-48f, -11f, -89f, -35f)
                reflectiveQuadToRelative(-71f, -59f)
                lineToRelative(-24f, 120f)
                lineToRelative(84f, 80f)
                verticalLineToRelative(300f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                lineToRelative(-84f, -80f)
                lineToRelative(-72f, 320f)
                horizontalLineToRelative(-84f)
                close()
                moveToRelative(17f, -395f)
                lineToRelative(-85f, -16f)
                quadToRelative(-16f, -3f, -25f, -16.5f)
                reflectiveQuadToRelative(-6f, -30.5f)
                lineToRelative(30f, -157f)
                quadToRelative(6f, -32f, 34f, -50.5f)
                reflectiveQuadToRelative(60f, -12.5f)
                lineToRelative(46f, 9f)
                lineToRelative(-54f, 274f)
                close()
                moveToRelative(243f, -305f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(460f, 140f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(540f, 60f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(620f, 140f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(540f, 220f)
                close()
            }
        }.build()
        
        return _Hiking!!
    }

private var _Hiking: ImageVector? = null

