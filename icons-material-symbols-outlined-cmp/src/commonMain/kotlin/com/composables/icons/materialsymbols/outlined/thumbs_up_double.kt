package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Thumbs_up_double: ImageVector
    get() {
        if (_Thumbs_up_double != null) return _Thumbs_up_double!!
        
        _Thumbs_up_double = ImageVector.Builder(
            name = "thumbs_up_double",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(713f, 680f)
                lineToRelative(127f, -297f)
                verticalLineToRelative(-23f)
                horizontalLineTo(588f)
                lineToRelative(19f, -134f)
                lineToRelative(-55f, 55f)
                quadToRelative(-8f, -8f, -28f, -28.5f)
                reflectiveQuadTo(496f, 224f)
                lineToRelative(144f, -144f)
                lineToRelative(32f, 32f)
                quadToRelative(14f, 14f, 19.5f, 31.5f)
                reflectiveQuadTo(694f, 180f)
                lineToRelative(-14f, 100f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 360f)
                verticalLineToRelative(23f)
                quadToRelative(0f, 8f, -1.5f, 16f)
                reflectiveQuadToRelative(-4.5f, 16f)
                lineToRelative(-93f, 216f)
                quadToRelative(-10f, 22f, -30f, 35.5f)
                reflectiveQuadTo(747f, 680f)
                horizontalLineToRelative(-34f)
                close()
                moveTo(240f, 840f)
                horizontalLineTo(40f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(267f, 0f)
                horizontalLineTo(160f)
                verticalLineToRelative(-360f)
                lineToRelative(240f, -240f)
                lineToRelative(32f, 32f)
                quadToRelative(14f, 14f, 19.5f, 31.5f)
                reflectiveQuadTo(454f, 340f)
                lineToRelative(-14f, 100f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 520f)
                verticalLineToRelative(24f)
                quadToRelative(0f, 8f, -1.5f, 15.5f)
                reflectiveQuadTo(674f, 575f)
                lineToRelative(-93f, 217f)
                quadToRelative(-10f, 22f, -30f, 35f)
                reflectiveQuadToRelative(-44f, 13f)
                close()
                moveToRelative(0f, -80f)
                lineToRelative(93f, -216f)
                verticalLineToRelative(-24f)
                horizontalLineTo(348f)
                lineToRelative(19f, -134f)
                lineToRelative(-127f, 127f)
                verticalLineToRelative(247f)
                horizontalLineToRelative(267f)
                close()
                moveToRelative(-267f, 0f)
                verticalLineToRelative(-247f)
                verticalLineToRelative(247f)
                close()
            }
        }.build()
        
        return _Thumbs_up_double!!
    }

private var _Thumbs_up_double: ImageVector? = null

