package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Do_not_touch: ImageVector
    get() {
        if (_Do_not_touch != null) return _Do_not_touch!!
        
        _Do_not_touch = ImageVector.Builder(
            name = "do_not_touch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(840f, 726f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-446f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(526f)
                close()
                moveTo(360f, 246f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-6f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 160f)
                verticalLineToRelative(86f)
                close()
                moveToRelative(160f, 160f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-246f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 80f)
                verticalLineToRelative(326f)
                close()
                moveToRelative(160f, 81f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-367f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 120f)
                verticalLineToRelative(367f)
                close()
                moveToRelative(37f, 343f)
                lineTo(360f, 473f)
                verticalLineToRelative(224f)
                lineTo(212f, 593f)
                lineToRelative(157f, 229f)
                quadToRelative(5f, 8f, 14f, 13f)
                reflectiveQuadToRelative(19f, 5f)
                horizontalLineToRelative(278f)
                quadToRelative(10f, 0f, 19.5f, -2.5f)
                reflectiveQuadTo(717f, 830f)
                close()
                moveTo(402f, 920f)
                quadToRelative(-30f, 0f, -56f, -13.5f)
                reflectiveQuadTo(303f, 868f)
                lineTo(48f, 495f)
                lineToRelative(24f, -23f)
                quadToRelative(19f, -19f, 45f, -22f)
                reflectiveQuadToRelative(47f, 12f)
                lineToRelative(116f, 81f)
                verticalLineToRelative(-150f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                lineToRelative(-44f, -44f)
                quadToRelative(-20f, 15f, -44f, 23.5f)
                reflectiveQuadTo(680f, 920f)
                horizontalLineTo(402f)
                close()
                moveToRelative(137f, -268f)
                close()
                moveToRelative(61f, -165f)
                close()
            }
        }.build()
        
        return _Do_not_touch!!
    }

private var _Do_not_touch: ImageVector? = null

