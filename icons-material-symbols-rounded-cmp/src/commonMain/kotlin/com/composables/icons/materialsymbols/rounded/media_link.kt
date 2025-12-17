package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Media_link: ImageVector
    get() {
        if (_Media_link != null) return _Media_link!!
        
        _Media_link = ImageVector.Builder(
            name = "media_link",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(433f, 697f)
                lineToRelative(-102f, 64f)
                quadToRelative(-10f, 6f, -20.5f, 0.5f)
                reflectiveQuadTo(300f, 744f)
                verticalLineToRelative(-128f)
                quadToRelative(0f, -12f, 10.5f, -17.5f)
                reflectiveQuadToRelative(20.5f, 0.5f)
                lineToRelative(102f, 64f)
                quadToRelative(10f, 6f, 10f, 17f)
                reflectiveQuadToRelative(-10f, 17f)
                close()
                moveToRelative(87f, -297f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                horizontalLineToRelative(20f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(570f, 190f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(540f, 220f)
                horizontalLineToRelative(-20f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(460f, 280f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(520f, 340f)
                horizontalLineToRelative(20f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(570f, 370f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(540f, 400f)
                horizontalLineToRelative(-20f)
                close()
                moveToRelative(160f, 0f)
                horizontalLineToRelative(-20f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(630f, 370f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(660f, 340f)
                horizontalLineToRelative(20f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(740f, 280f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(680f, 220f)
                horizontalLineToRelative(-20f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(630f, 190f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(660f, 160f)
                horizontalLineToRelative(20f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(-30f, -90f)
                horizontalLineTo(550f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(520f, 280f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(550f, 250f)
                horizontalLineToRelative(100f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(680f, 280f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(650f, 310f)
                close()
                moveToRelative(-6f, 250f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(196f)
                verticalLineToRelative(-360f)
                horizontalLineTo(360f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(360f, 40f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 120f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 560f)
                horizontalLineTo(644f)
                close()
                moveTo(120f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 840f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 440f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 520f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(600f, 920f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-320f)
                horizontalLineTo(120f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(480f, -540f)
                close()
                moveTo(360f, 680f)
                close()
            }
        }.build()
        
        return _Media_link!!
    }

private var _Media_link: ImageVector? = null

