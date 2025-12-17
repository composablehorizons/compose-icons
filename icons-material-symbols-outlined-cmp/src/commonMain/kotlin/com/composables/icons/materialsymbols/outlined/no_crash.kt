package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.No_crash: ImageVector
    get() {
        if (_No_crash != null) return _No_crash!!
        
        _No_crash = ImageVector.Builder(
            name = "no_crash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 254f)
                lineTo(367f, 142f)
                lineToRelative(56f, -57f)
                lineToRelative(57f, 57f)
                lineToRelative(142f, -142f)
                lineToRelative(56f, 56f)
                lineToRelative(-198f, 198f)
                close()
                moveTo(160f, 960f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 920f)
                verticalLineToRelative(-320f)
                lineToRelative(84f, -240f)
                quadToRelative(6f, -18f, 21.5f, -29f)
                reflectiveQuadToRelative(34.5f, -11f)
                horizontalLineToRelative(440f)
                quadToRelative(19f, 0f, 34.5f, 11f)
                reflectiveQuadToRelative(21.5f, 29f)
                lineToRelative(84f, 240f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 960f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 920f)
                verticalLineToRelative(-40f)
                horizontalLineTo(240f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(200f, 960f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(72f, -440f)
                horizontalLineToRelative(496f)
                lineToRelative(-42f, -120f)
                horizontalLineTo(274f)
                lineToRelative(-42f, 120f)
                close()
                moveToRelative(-32f, 80f)
                verticalLineToRelative(200f)
                verticalLineToRelative(-200f)
                close()
                moveToRelative(100f, 160f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(360f, 700f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(300f, 640f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(240f, 700f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(300f, 760f)
                close()
                moveToRelative(360f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(720f, 700f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(660f, 640f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(600f, 700f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(660f, 760f)
                close()
                moveToRelative(-460f, 40f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-200f)
                horizontalLineTo(200f)
                verticalLineToRelative(200f)
                close()
            }
        }.build()
        
        return _No_crash!!
    }

private var _No_crash: ImageVector? = null

