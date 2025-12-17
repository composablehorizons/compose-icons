package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Attach_file_add: ImageVector
    get() {
        if (_Attach_file_add != null) return _Attach_file_add!!
        
        _Attach_file_add = ImageVector.Builder(
            name = "attach_file_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 440f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(440f, 716f)
                quadToRelative(-35f, -10f, -57.5f, -39f)
                reflectiveQuadTo(360f, 610f)
                verticalLineToRelative(-370f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(476f)
                close()
                moveToRelative(30f, 164f)
                quadToRelative(-104f, 0f, -177f, -73f)
                reflectiveQuadToRelative(-73f, -177f)
                verticalLineToRelative(-370f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(400f, 80f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(580f, 260f)
                verticalLineToRelative(300f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-300f)
                quadToRelative(-1f, -42f, -29.5f, -71f)
                reflectiveQuadTo(400f, 160f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                verticalLineToRelative(370f)
                quadToRelative(-1f, 71f, 49f, 120.5f)
                reflectiveQuadTo(470f, 800f)
                quadToRelative(25f, 0f, 47.5f, -6.5f)
                reflectiveQuadTo(560f, 774f)
                verticalLineToRelative(89f)
                quadToRelative(-21f, 8f, -43.5f, 12.5f)
                reflectiveQuadTo(470f, 880f)
                close()
                moveToRelative(170f, -40f)
                verticalLineToRelative(-120f)
                horizontalLineTo(520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(720f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Attach_file_add!!
    }

private var _Attach_file_add: ImageVector? = null

