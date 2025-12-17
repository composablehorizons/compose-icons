package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Cast_warning: ImageVector
    get() {
        if (_Cast_warning != null) return _Cast_warning!!
        
        _Cast_warning = ImageVector.Builder(
            name = "cast_warning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 480f)
                close()
                moveTo(80f, 680f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                horizontalLineTo(80f)
                verticalLineToRelative(-120f)
                close()
                moveToRelative(0f, -160f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(360f, 800f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(80f, 600f)
                verticalLineToRelative(-80f)
                close()
                moveToRelative(0f, -160f)
                quadToRelative(91f, 0f, 171f, 34.5f)
                reflectiveQuadTo(391f, 489f)
                quadToRelative(60f, 60f, 94.5f, 140f)
                reflectiveQuadTo(520f, 800f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, -75f, -28.5f, -140.5f)
                reflectiveQuadToRelative(-77f, -114f)
                quadToRelative(-48.5f, -48.5f, -114f, -77f)
                reflectiveQuadTo(80f, 440f)
                verticalLineToRelative(-80f)
                close()
                moveToRelative(720f, 440f)
                horizontalLineTo(600f)
                quadToRelative(0f, -20f, -1.5f, -40f)
                reflectiveQuadToRelative(-4.5f, -40f)
                horizontalLineToRelative(206f)
                verticalLineToRelative(-212f)
                quadToRelative(22f, -7f, 42f, -16.5f)
                reflectiveQuadToRelative(38f, -22.5f)
                verticalLineToRelative(251f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                close()
                moveTo(80f, 280f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(292f)
                quadToRelative(-6f, 19f, -9f, 39f)
                reflectiveQuadToRelative(-3f, 41f)
                horizontalLineTo(160f)
                verticalLineToRelative(46f)
                quadToRelative(-20f, -3f, -40f, -4.5f)
                reflectiveQuadTo(80f, 280f)
                close()
                moveToRelative(640f, 160f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 240f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 40f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 240f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 440f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
                moveToRelative(-20f, -80f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Cast_warning!!
    }

private var _Cast_warning: ImageVector? = null

