package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Bomb: ImageVector
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
                lineToRelative(57f, -99f)
                lineToRelative(82f, 47f)
                lineToRelative(5f, -8f)
                quadToRelative(23f, -43f, 72f, -56f)
                reflectiveQuadToRelative(92f, 12f)
                lineToRelative(35f, 20f)
                lineToRelative(-40f, 69f)
                lineToRelative(-35f, -20f)
                quadToRelative(-14f, -8f, -30.5f, -3.5f)
                reflectiveQuadTo(570f, 292f)
                lineToRelative(-5f, 8f)
                lineToRelative(91f, 52f)
                lineToRelative(-56f, 100f)
                quadToRelative(23f, 36f, 34.5f, 76.5f)
                reflectiveQuadTo(646f, 612f)
                quadToRelative(0f, 125f, -87.5f, 212.5f)
                reflectiveQuadTo(346f, 912f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(91f, 0f, 155.5f, -64.5f)
                reflectiveQuadTo(566f, 612f)
                quadToRelative(0f, -31f, -8.5f, -61f)
                reflectiveQuadTo(532f, 494f)
                lineToRelative(-26f, -41f)
                lineToRelative(42f, -72f)
                lineToRelative(-104f, -60f)
                lineToRelative(-42f, 72f)
                horizontalLineToRelative(-44f)
                quadToRelative(-94f, 0f, -163.5f, 60f)
                reflectiveQuadTo(125f, 610f)
                quadToRelative(0f, 92f, 64.5f, 157f)
                reflectiveQuadTo(346f, 832f)
                close()
                moveToRelative(0f, -220f)
                close()
                moveToRelative(454f, -260f)
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

