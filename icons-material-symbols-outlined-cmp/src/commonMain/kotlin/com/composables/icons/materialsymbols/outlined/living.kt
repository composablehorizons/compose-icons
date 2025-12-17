package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Living: ImageVector
    get() {
        if (_Living != null) return _Living!!
        
        _Living = ImageVector.Builder(
            name = "living",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(640f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-640f)
                horizontalLineTo(160f)
                verticalLineToRelative(640f)
                close()
                moveToRelative(120f, -80f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(760f, 640f)
                verticalLineToRelative(-140f)
                quadToRelative(0f, -27f, -13.5f, -49.5f)
                reflectiveQuadTo(710f, 414f)
                verticalLineToRelative(-54f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                horizontalLineTo(370f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                verticalLineToRelative(54f)
                quadToRelative(-23f, 14f, -36.5f, 36.5f)
                reflectiveQuadTo(200f, 500f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(280f, 720f)
                close()
                moveToRelative(0f, -60f)
                quadToRelative(-9f, 0f, -14.5f, -5.5f)
                reflectiveQuadTo(260f, 640f)
                verticalLineToRelative(-140f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(300f, 460f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(340f, 500f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(660f, 460f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(700f, 500f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 9f, -5.5f, 14.5f)
                reflectiveQuadTo(680f, 660f)
                horizontalLineTo(280f)
                close()
                moveToRelative(120f, -140f)
                verticalLineToRelative(-20f)
                quadToRelative(0f, -39f, -26f, -67f)
                reflectiveQuadToRelative(-64f, -31f)
                verticalLineToRelative(-42f)
                quadToRelative(0f, -26f, 17f, -43f)
                reflectiveQuadToRelative(43f, -17f)
                horizontalLineToRelative(220f)
                quadToRelative(26f, 0f, 43f, 17f)
                reflectiveQuadToRelative(17f, 43f)
                verticalLineToRelative(42f)
                quadToRelative(-38f, 3f, -64f, 31f)
                reflectiveQuadToRelative(-26f, 67f)
                verticalLineToRelative(20f)
                horizontalLineTo(400f)
                close()
                moveTo(160f, 800f)
                verticalLineToRelative(-640f)
                verticalLineToRelative(640f)
                close()
            }
        }.build()
        
        return _Living!!
    }

private var _Living: ImageVector? = null

