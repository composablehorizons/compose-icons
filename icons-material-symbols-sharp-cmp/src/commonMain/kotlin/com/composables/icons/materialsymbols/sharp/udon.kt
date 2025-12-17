package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Udon: ImageVector
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
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-320f)
                lineToRelative(720f, -80f)
                verticalLineToRelative(60f)
                lineToRelative(-460f, 52f)
                verticalLineToRelative(68f)
                horizontalLineToRelative(460f)
                verticalLineToRelative(60f)
                horizontalLineTo(420f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(460f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
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

