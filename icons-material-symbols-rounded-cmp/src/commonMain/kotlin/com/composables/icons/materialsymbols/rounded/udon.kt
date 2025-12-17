package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Udon: ImageVector
    get() {
        if (_Udon != null) return _Udon!!
        
        _Udon = ImageVector.Builder(
            name = "udon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-154f, 0f, -266.5f, -101f)
                reflectiveQuadTo(83f, 529f)
                quadToRelative(-2f, -20f, 11.5f, -34.5f)
                reflectiveQuadTo(128f, 480f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(-284f)
                quadToRelative(0f, -15f, 10.5f, -26.5f)
                reflectiveQuadTo(196f, 156f)
                lineToRelative(651f, -72f)
                quadToRelative(14f, -2f, 23.5f, 6.5f)
                reflectiveQuadTo(880f, 113f)
                quadToRelative(0f, 11f, -7.5f, 19.5f)
                reflectiveQuadTo(854f, 143f)
                lineToRelative(-434f, 49f)
                verticalLineToRelative(68f)
                horizontalLineToRelative(430f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(880f, 290f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(850f, 320f)
                horizontalLineTo(420f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(412f)
                quadToRelative(20f, 0f, 33.5f, 14.5f)
                reflectiveQuadTo(877f, 529f)
                quadToRelative(-18f, 149f, -130.5f, 250f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveTo(220f, 480f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(0f, -220f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-50f)
                lineToRelative(-40f, 4f)
                verticalLineToRelative(46f)
                close()
                moveToRelative(100f, 220f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(0f, -220f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-62f)
                lineToRelative(-40f, 5f)
                verticalLineToRelative(57f)
                close()
                moveTo(185f, 600f)
                horizontalLineToRelative(590f)
                quadToRelative(4f, -10f, 7f, -19.5f)
                reflectiveQuadToRelative(6f, -20.5f)
                horizontalLineTo(171f)
                quadToRelative(3f, 11f, 6.5f, 20.5f)
                reflectiveQuadTo(185f, 600f)
                close()
                moveToRelative(295f, 200f)
                quadToRelative(75f, 0f, 139f, -32.5f)
                reflectiveQuadTo(728f, 680f)
                horizontalLineTo(232f)
                quadToRelative(45f, 55f, 109f, 87.5f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveToRelative(0f, -120f)
                close()
                moveToRelative(0f, -80f)
                close()
                moveToRelative(0f, 80f)
                verticalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Udon!!
    }

private var _Udon: ImageVector? = null

