package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Award_meal: ImageVector
    get() {
        if (_Award_meal != null) return _Award_meal!!
        
        _Award_meal = ImageVector.Builder(
            name = "award_meal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 932f)
                lineTo(346f, 800f)
                horizontalLineTo(160f)
                verticalLineToRelative(-186f)
                lineTo(28f, 480f)
                lineToRelative(132f, -134f)
                verticalLineToRelative(-186f)
                horizontalLineToRelative(186f)
                lineToRelative(134f, -132f)
                lineToRelative(134f, 132f)
                horizontalLineToRelative(186f)
                verticalLineToRelative(186f)
                lineToRelative(132f, 134f)
                lineToRelative(-132f, 134f)
                verticalLineToRelative(186f)
                horizontalLineTo(614f)
                lineTo(480f, 932f)
                close()
                moveToRelative(0f, -112f)
                lineToRelative(80f, -80f)
                verticalLineToRelative(-148f)
                quadToRelative(-26f, -15f, -43f, -50.5f)
                reflectiveQuadTo(500f, 460f)
                quadToRelative(0f, -58f, 26f, -99f)
                reflectiveQuadToRelative(64f, -41f)
                quadToRelative(37f, 0f, 63.5f, 41f)
                reflectiveQuadToRelative(26.5f, 99f)
                quadToRelative(0f, 47f, -17f, 82.5f)
                reflectiveQuadTo(620f, 592f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-140f)
                lineToRelative(100f, -100f)
                lineToRelative(-100f, -100f)
                verticalLineToRelative(-140f)
                horizontalLineTo(580f)
                lineTo(480f, 140f)
                lineTo(380f, 240f)
                horizontalLineTo(240f)
                verticalLineToRelative(140f)
                lineTo(140f, 480f)
                lineToRelative(100f, 100f)
                verticalLineToRelative(140f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-160f)
                quadToRelative(-26f, -6f, -43f, -27.5f)
                reflectiveQuadTo(280f, 483f)
                verticalLineToRelative(-163f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(151f)
                horizontalLineToRelative(30f)
                verticalLineToRelative(-151f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(151f)
                horizontalLineToRelative(30f)
                verticalLineToRelative(-151f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(163f)
                quadToRelative(0f, 28f, -17f, 49.5f)
                reflectiveQuadTo(400f, 560f)
                verticalLineToRelative(180f)
                lineToRelative(80f, 80f)
                close()
                moveToRelative(0f, -340f)
                close()
            }
        }.build()
        
        return _Award_meal!!
    }

private var _Award_meal: ImageVector? = null

