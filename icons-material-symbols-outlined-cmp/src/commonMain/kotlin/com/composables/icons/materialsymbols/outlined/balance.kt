package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Balance: ImageVector
    get() {
        if (_Balance != null) return _Balance!!
        
        _Balance = ImageVector.Builder(
            name = "balance",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-447f)
                quadToRelative(-26f, -9f, -45f, -28f)
                reflectiveQuadToRelative(-28f, -45f)
                horizontalLineTo(240f)
                lineToRelative(120f, 280f)
                quadToRelative(0f, 50f, -41f, 85f)
                reflectiveQuadToRelative(-99f, 35f)
                quadToRelative(-58f, 0f, -99f, -35f)
                reflectiveQuadToRelative(-41f, -85f)
                lineToRelative(120f, -280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(247f)
                quadToRelative(12f, -35f, 43f, -57.5f)
                reflectiveQuadToRelative(70f, -22.5f)
                quadToRelative(39f, 0f, 70f, 22.5f)
                reflectiveQuadToRelative(43f, 57.5f)
                horizontalLineToRelative(247f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                lineToRelative(120f, 280f)
                quadToRelative(0f, 50f, -41f, 85f)
                reflectiveQuadToRelative(-99f, 35f)
                quadToRelative(-58f, 0f, -99f, -35f)
                reflectiveQuadToRelative(-41f, -85f)
                lineToRelative(120f, -280f)
                horizontalLineTo(593f)
                quadToRelative(-9f, 26f, -28f, 45f)
                reflectiveQuadToRelative(-45f, 28f)
                verticalLineToRelative(447f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(585f, -320f)
                horizontalLineToRelative(150f)
                lineToRelative(-75f, -174f)
                lineToRelative(-75f, 174f)
                close()
                moveToRelative(-520f, 0f)
                horizontalLineToRelative(150f)
                lineToRelative(-75f, -174f)
                lineToRelative(-75f, 174f)
                close()
                moveToRelative(335f, -280f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 200f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 240f)
                close()
            }
        }.build()
        
        return _Balance!!
    }

private var _Balance: ImageVector? = null

