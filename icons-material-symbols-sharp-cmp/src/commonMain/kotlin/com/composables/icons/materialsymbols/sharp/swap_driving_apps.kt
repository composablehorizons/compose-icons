package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Swap_driving_apps: ImageVector
    get() {
        if (_Swap_driving_apps != null) return _Swap_driving_apps!!
        
        _Swap_driving_apps = ImageVector.Builder(
            name = "swap_driving_apps",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(620f, 300f)
                lineToRelative(-58f, -56f)
                lineToRelative(44f, -44f)
                horizontalLineTo(318f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(288f)
                lineToRelative(-44f, -44f)
                lineToRelative(56f, -58f)
                lineToRelative(142f, 142f)
                lineToRelative(-140f, 140f)
                close()
                moveTo(200f, 760f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-200f)
                horizontalLineTo(200f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(100f, -40f)
                quadToRelative(26f, 0f, 43f, -17f)
                reflectiveQuadToRelative(17f, -43f)
                quadToRelative(0f, -26f, -17f, -43f)
                reflectiveQuadToRelative(-43f, -17f)
                quadToRelative(-26f, 0f, -43f, 17f)
                reflectiveQuadToRelative(-17f, 43f)
                quadToRelative(0f, 26f, 17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
                close()
                moveToRelative(360f, 0f)
                quadToRelative(26f, 0f, 43f, -17f)
                reflectiveQuadToRelative(17f, -43f)
                quadToRelative(0f, -26f, -17f, -43f)
                reflectiveQuadToRelative(-43f, -17f)
                quadToRelative(-26f, 0f, -43f, 17f)
                reflectiveQuadToRelative(-17f, 43f)
                quadToRelative(0f, 26f, 17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
                close()
                moveTo(120f, 480f)
                horizontalLineToRelative(608f)
                lineToRelative(-42f, -120f)
                horizontalLineTo(274f)
                lineToRelative(44f, 44f)
                lineToRelative(-56f, 58f)
                lineToRelative(-142f, -142f)
                lineToRelative(142f, -142f)
                lineToRelative(56f, 58f)
                lineToRelative(-44f, 44f)
                horizontalLineToRelative(468f)
                lineToRelative(98f, 280f)
                verticalLineToRelative(360f)
                horizontalLineTo(720f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                verticalLineToRelative(-440f)
                close()
                moveToRelative(80f, 80f)
                verticalLineToRelative(200f)
                verticalLineToRelative(-200f)
                close()
            }
        }.build()
        
        return _Swap_driving_apps!!
    }

private var _Swap_driving_apps: ImageVector? = null

