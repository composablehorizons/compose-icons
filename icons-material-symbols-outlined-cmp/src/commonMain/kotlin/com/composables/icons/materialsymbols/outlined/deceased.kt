package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Deceased: ImageVector
    get() {
        if (_Deceased != null) return _Deceased!!
        
        _Deceased = ImageVector.Builder(
            name = "deceased",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(426f, 800f)
                quadToRelative(-9f, -26f, -23f, -48f)
                reflectiveQuadToRelative(-33f, -41f)
                quadToRelative(-19f, -19f, -41f, -33.5f)
                reflectiveQuadTo(281f, 654f)
                quadToRelative(2f, 29f, 14f, 54f)
                reflectiveQuadToRelative(32f, 45f)
                quadToRelative(20f, 20f, 45f, 32.5f)
                reflectiveQuadToRelative(54f, 14.5f)
                close()
                moveToRelative(108f, 0f)
                quadToRelative(29f, -3f, 54f, -15f)
                reflectiveQuadToRelative(45f, -32f)
                quadToRelative(20f, -20f, 32f, -45f)
                reflectiveQuadToRelative(15f, -54f)
                quadToRelative(-26f, 9f, -48.5f, 23f)
                reflectiveQuadTo(590f, 710f)
                quadToRelative(-19f, 19f, -33f, 41.5f)
                reflectiveQuadTo(534f, 800f)
                close()
                moveToRelative(-54f, -360f)
                quadToRelative(66f, 0f, 113f, -47f)
                reflectiveQuadToRelative(47f, -113f)
                verticalLineToRelative(-48f)
                lineToRelative(-70f, 59f)
                lineToRelative(-90f, -109f)
                lineToRelative(-90f, 109f)
                lineToRelative(-70f, -59f)
                verticalLineToRelative(48f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                close()
                moveTo(440f, 880f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadToRelative(-70f, -170f)
                verticalLineToRelative(-80f)
                quadToRelative(71f, -1f, 134f, 29f)
                reflectiveQuadToRelative(106f, 81f)
                verticalLineToRelative(-153f)
                quadToRelative(-86f, -14f, -143f, -80.5f)
                reflectiveQuadTo(240f, 280f)
                verticalLineToRelative(-136f)
                quadToRelative(0f, -26f, 23f, -36.5f)
                reflectiveQuadToRelative(43f, 6.5f)
                lineToRelative(74f, 64f)
                lineToRelative(69f, -84f)
                quadToRelative(12f, -14f, 31f, -14f)
                reflectiveQuadToRelative(31f, 14f)
                lineToRelative(69f, 84f)
                lineToRelative(74f, -64f)
                quadToRelative(20f, -17f, 43f, -6.5f)
                reflectiveQuadToRelative(23f, 36.5f)
                verticalLineToRelative(136f)
                quadToRelative(0f, 90f, -57f, 156.5f)
                reflectiveQuadTo(520f, 517f)
                verticalLineToRelative(153f)
                quadToRelative(43f, -51f, 106f, -81f)
                reflectiveQuadToRelative(134f, -29f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 100f, -70f, 170f)
                reflectiveQuadTo(520f, 880f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(40f, -569f)
                close()
                moveToRelative(127f, 416f)
                close()
                moveToRelative(-253f, 0f)
                close()
            }
        }.build()
        
        return _Deceased!!
    }

private var _Deceased: ImageVector? = null

