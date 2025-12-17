package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Udon: ImageVector
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
                moveToRelative(542f, 340f)
                horizontalLineTo(98f)
                quadToRelative(-9f, -29f, -13.5f, -58.5f)
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
                quadToRelative(0f, 32f, -4.5f, 61.5f)
                reflectiveQuadTo(862f, 600f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-112f, 0f, -203.5f, -54.5f)
                reflectiveQuadTo(133f, 680f)
                horizontalLineToRelative(694f)
                quadToRelative(-52f, 91f, -143.5f, 145.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Udon!!
    }

private var _Udon: ImageVector? = null

