package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Award_meal: ImageVector
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
                moveTo(340f, 720f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-160f)
                quadToRelative(26f, -6f, 43f, -27.5f)
                reflectiveQuadToRelative(17f, -49.5f)
                verticalLineToRelative(-163f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(151f)
                horizontalLineToRelative(-30f)
                verticalLineToRelative(-151f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(151f)
                horizontalLineToRelative(-30f)
                verticalLineToRelative(-151f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(163f)
                quadToRelative(0f, 28f, 17f, 49.5f)
                reflectiveQuadToRelative(43f, 27.5f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(220f, 0f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-128f)
                quadToRelative(26f, -14f, 43f, -49.5f)
                reflectiveQuadToRelative(17f, -82.5f)
                quadToRelative(0f, -58f, -26.5f, -99f)
                reflectiveQuadTo(590f, 320f)
                quadToRelative(-38f, 0f, -64f, 41f)
                reflectiveQuadToRelative(-26f, 99f)
                quadToRelative(0f, 46f, 17f, 81.5f)
                reflectiveQuadToRelative(43f, 50.5f)
                verticalLineToRelative(128f)
                close()
            }
        }.build()
        
        return _Award_meal!!
    }

private var _Award_meal: ImageVector? = null

