package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Bomb: ImageVector
    get() {
        if (_Bomb != null) return _Bomb!!
        
        _Bomb = ImageVector.Builder(
            name = "bomb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(346f, 912f)
                quadToRelative(-125f, 0f, -212.5f, -88.5f)
                reflectiveQuadTo(46f, 610f)
                quadToRelative(0f, -125f, 86.5f, -211.5f)
                reflectiveQuadTo(344f, 312f)
                horizontalLineToRelative(13f)
                lineToRelative(27f, -47f)
                quadToRelative(12f, -22f, 36f, -28.5f)
                reflectiveQuadToRelative(46f, 6.5f)
                lineToRelative(30f, 17f)
                lineToRelative(5f, -8f)
                quadToRelative(23f, -43f, 72f, -56f)
                reflectiveQuadToRelative(92f, 12f)
                lineToRelative(35f, 20f)
                lineToRelative(-40f, 69f)
                lineToRelative(-35f, -20f)
                quadToRelative(-14f, -8f, -30.5f, -3.5f)
                reflectiveQuadTo(570f, 292f)
                lineToRelative(-5f, 8f)
                lineToRelative(40f, 23f)
                quadToRelative(21f, 12f, 27.5f, 36f)
                reflectiveQuadToRelative(-5.5f, 45f)
                lineToRelative(-27f, 48f)
                quadToRelative(23f, 36f, 34.5f, 76.5f)
                reflectiveQuadTo(646f, 612f)
                quadToRelative(0f, 125f, -87.5f, 212.5f)
                reflectiveQuadTo(346f, 912f)
                close()
                moveToRelative(454f, -560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(800f)
                close()
                moveTo(580f, 132f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(195f, 81f)
                lineToRelative(-56f, -56f)
                lineToRelative(85f, -85f)
                lineToRelative(56f, 56f)
                lineToRelative(-85f, 85f)
                close()
            }
        }.build()
        
        return _Bomb!!
    }

private var _Bomb: ImageVector? = null

