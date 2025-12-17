package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Routine: ImageVector
    get() {
        if (_Routine != null) return _Routine!!
        
        _Routine = ImageVector.Builder(
            name = "routine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(396f, 564f)
                quadToRelative(-32f, -32f, -58.5f, -67f)
                reflectiveQuadTo(289f, 423f)
                quadToRelative(-5f, 14f, -6.5f, 28.5f)
                reflectiveQuadTo(281f, 480f)
                quadToRelative(0f, 83f, 58f, 141f)
                reflectiveQuadToRelative(141f, 58f)
                quadToRelative(14f, 0f, 28.5f, -2f)
                reflectiveQuadToRelative(28.5f, -6f)
                quadToRelative(-39f, -22f, -74f, -48.5f)
                reflectiveQuadTo(396f, 564f)
                close()
                moveToRelative(57f, -56f)
                quadToRelative(51f, 51f, 114f, 87.5f)
                reflectiveQuadTo(702f, 652f)
                quadToRelative(-40f, 51f, -98f, 79.5f)
                reflectiveQuadTo(481f, 760f)
                quadToRelative(-117f, 0f, -198.5f, -81.5f)
                reflectiveQuadTo(201f, 480f)
                quadToRelative(0f, -65f, 28.5f, -123f)
                reflectiveQuadToRelative(79.5f, -98f)
                quadToRelative(20f, 72f, 56.5f, 135f)
                reflectiveQuadTo(453f, 508f)
                close()
                moveToRelative(290f, 72f)
                quadToRelative(-20f, -5f, -39.5f, -11f)
                reflectiveQuadTo(665f, 555f)
                quadToRelative(8f, -18f, 11.5f, -36.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-20f, 0f, -38.5f, 3.5f)
                reflectiveQuadTo(405f, 295f)
                quadToRelative(-8f, -19f, -13.5f, -38f)
                reflectiveQuadTo(381f, 218f)
                quadToRelative(24f, -9f, 49f, -13.5f)
                reflectiveQuadToRelative(51f, -4.5f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(761f, 480f)
                quadToRelative(0f, 26f, -4.5f, 51f)
                reflectiveQuadTo(743f, 580f)
                close()
                moveTo(440f, 120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, 840f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineTo(960f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(323f, -706f)
                lineToRelative(-57f, -57f)
                lineToRelative(85f, -84f)
                lineToRelative(57f, 56f)
                lineToRelative(-85f, 85f)
                close()
                moveTo(169f, 847f)
                lineToRelative(-57f, -56f)
                lineToRelative(85f, -85f)
                lineToRelative(57f, 57f)
                lineToRelative(-85f, 84f)
                close()
                moveToRelative(671f, -327f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(840f)
                close()
                moveTo(0f, 520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(0f)
                close()
                moveToRelative(791f, 328f)
                lineToRelative(-85f, -85f)
                lineToRelative(57f, -57f)
                lineToRelative(84f, 85f)
                lineToRelative(-56f, 57f)
                close()
                moveTo(197f, 254f)
                lineToRelative(-84f, -85f)
                lineToRelative(56f, -57f)
                lineToRelative(85f, 85f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(199f, 310f)
                close()
            }
        }.build()
        
        return _Routine!!
    }

private var _Routine: ImageVector? = null

